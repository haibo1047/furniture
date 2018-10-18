package com.ylsq.frame.tianze.strategy.service;

import java.util.List;

import com.ylsq.frame.common.base.BaseService;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncrypt;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyEncryptExample;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategySoftware;
import com.ylsq.frame.tianze.strategy.dao.model.TzStrategyWatermark;

/**
* TzStrategyEncryptService接口
* Created by harper
*/
public interface TzStrategyEncryptService extends BaseService<TzStrategyEncrypt, TzStrategyEncryptExample> {

	/**
	 * 插入策略内容及水印
	 * @param strategy
	 * @param watermark
	 * @return
	 */
	public int insert(TzStrategyEncrypt strategy, TzStrategyWatermark watermark, List<TzStrategySoftware> softwares);
	
	/**
	 * 更新策略及水印
	 * @param strategy
	 * @param watermark
	 * @return
	 */
	public int update(TzStrategyEncrypt strategy, TzStrategyWatermark watermark, List<TzStrategySoftware> softwares);
}