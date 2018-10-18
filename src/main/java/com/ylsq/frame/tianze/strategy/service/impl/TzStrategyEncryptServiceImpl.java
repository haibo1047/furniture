package com.ylsq.frame.tianze.strategy.service.impl;

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
import com.ylsq.frame.tianze.strategy.dao.mapper.TzStrategyEncryptMapper;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncryptExample;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;
import com.ylsq.frame.tianze.strategy.service.TzStrategyEncryptService;
import com.ylsq.frame.tianze.strategy.service.TzStrategySoftwareService;
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
    
    @Autowired
    TzStrategySoftwareService softwareService;

	@Override
	public int insert(TzStrategyEncrypt strategy, TzStrategyWatermark watermark, List<TzStrategySoftware> softwares) {
		// TODO Auto-generated method stub
		int total = 0;
		total += this.insert(strategy);
		if(1 == strategy.getWatermark()) {
			total += watermarkService.insert(watermark);
		}
		for(TzStrategySoftware tss : softwares) {
			total += softwareService.insert(tss);
		}
		return total;
	}

	@Override
	public int update(TzStrategyEncrypt strategy, TzStrategyWatermark watermark, List<TzStrategySoftware> softwares) {
		// TODO Auto-generated method stub
		int total = 0;
		total += this.updateByPrimaryKey(strategy);
		
		TzStrategyWatermark idmodel = watermarkService.selectByStrategyId(strategy.getId());
		if(idmodel == null) {
			watermarkService.insert(watermark);
		}
		else {
			watermark.setId(idmodel.getId());
			total += watermarkService.updateByPrimaryKey(watermark);
		}
		
		List<TzStrategySoftware> existing = softwareService.selectByStrategyName(strategy.getStrategyName());
		Map<String,TzStrategySoftware> map = new HashMap<>();
		for(TzStrategySoftware one : existing)
			map.put(one.getSoftwareCode(), one);
		for(TzStrategySoftware one : softwares) {
			if(map.keySet().contains(one.getSoftwareCode())) {
				map.put(one.getSoftwareCode(), null);
				continue;
			}
			softwareService.insert(one);
		}
		for(TzStrategySoftware one : map.values()) {
			if(one == null)
				continue;
			softwareService.deleteByPrimaryKey(one.getId());
		}
		return total;
	}

}