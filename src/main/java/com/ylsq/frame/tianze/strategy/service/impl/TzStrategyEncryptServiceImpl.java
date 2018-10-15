package com.ylsq.frame.tianze.strategy.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ylsq.frame.common.annotation.BaseService;
import com.ylsq.frame.common.base.BaseServiceImpl;
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyEncryptMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncryptExample;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.service.TzStrategyEncryptService;
import com.ylsq.frame.tianze.strategy.service.TzStrategyWatermarkService;

/**
* TzStrategyEncryptService实现
* Created by harper
*/
@Service
@Transactional
@BaseService
public class TzStrategyEncryptServiceImpl extends BaseServiceImpl<TzStrategyEncryptMapper, TzStrategyEncrypt, TzStrategyEncryptExample> implements TzStrategyEncryptService {

    private static final Logger log = LoggerFactory.getLogger(TzStrategyEncryptServiceImpl.class);

    @Autowired
    TzStrategyEncryptMapper tzStrategyEncryptMapper;
    
    @Autowired
    TzStrategyWatermarkService watermarkService;

	@Override
	public int insert(TzStrategyEncrypt strategy, TzStrategyWatermark watermark) {
		// TODO Auto-generated method stub
		int total = 0;
		total += this.insert(strategy);
		if(1 == strategy.getWatermark()) {
			total += watermarkService.insert(watermark);
		}
		return total;
	}

	@Override
	public int update(TzStrategyEncrypt strategy, TzStrategyWatermark watermark) {
		// TODO Auto-generated method stub
		int total = 0;
		total += this.updateByPrimaryKey(strategy);
		if(1 == strategy.getWatermark()) {
			TzStrategyWatermark idmodel = watermarkService.selectByStrategyId(strategy.getId());
			if(idmodel == null) {
				watermarkService.insert(watermark);
			}
			else {
				watermark.setId(idmodel.getId());
				total += watermarkService.updateByPrimaryKey(watermark);
			}
		}
		return total;
	}

}