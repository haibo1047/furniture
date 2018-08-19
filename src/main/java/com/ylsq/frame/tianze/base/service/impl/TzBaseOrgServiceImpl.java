package com.ylsq.frame.tianze.base.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.base.TianzeConstant;
import com.ylsq.frame.tianze.base.custobj.CustOrg;
import com.ylsq.frame.tianze.base.dao.mapper.TzBaseOrgMapper;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrg;
import com.ylsq.frame.tianze.base.dao.model.TzBaseOrgExample;
import com.ylsq.frame.tianze.base.service.TzBaseOrgService;

/**
* TzBaseOrgService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzBaseOrgServiceImpl extends BaseServiceImpl<TzBaseOrgMapper, TzBaseOrg, TzBaseOrgExample> implements TzBaseOrgService {

    private static final Logger log = LoggerFactory.getLogger(TzBaseOrgServiceImpl.class);

    @Autowired
    TzBaseOrgMapper tzBaseOrgMapper;

	@Override
	public TzBaseOrg selectByName(String orgName) {
		// TODO Auto-generated method stub
		TzBaseOrgExample example = new TzBaseOrgExample();
		example.createCriteria().andOrgNameEqualTo(orgName);
		List<TzBaseOrg> list = selectByExample(example);
		if(list.size() >= 1)
			return list.get(0);
		return null;
	}

	@Override
	public List<TzBaseOrg> selectByParentId(long parentId) {
		// TODO Auto-generated method stub
		TzBaseOrgExample example = new TzBaseOrgExample();
		example.createCriteria().andParentIdEqualTo(parentId);
		return selectByExample(example);
	}

	@Override
	public List<CustOrg> buildCustomOrgs(List<TzBaseOrg> list) {
		// TODO Auto-generated method stub
		List<CustOrg> orgList = new ArrayList<>();
		
		Map<Long,Long> pMap = new HashMap<>();
		Map<Long,CustOrg> orgMap = new HashMap<>();
		
		for(TzBaseOrg e : list) {
			CustOrg org = new CustOrg(e);
			orgMap.put(e.getId(), org);
			if(TianzeConstant.Root_Org_Id == e.getParentId()) {
				orgList.add(org);
			}
			else {
				pMap.put(e.getId(), e.getParentId());
			}
		}
		for(Long id : pMap.keySet()) {
			Long pid = pMap.get(id);
			CustOrg pOrg = orgMap.get(pid);
			List<CustOrg> subs = pOrg.getSubOrgs();
			if(subs == null) {
				subs = new ArrayList<>();
				pOrg.setSubOrgs(subs);
			}
			subs.add(orgMap.get(id));
		}
		log.debug("top organization size: " + orgList.size());
		return orgList;
	}

}