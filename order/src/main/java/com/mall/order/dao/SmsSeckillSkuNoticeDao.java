package com.mall.order.dao;

import com.mall.order.entity.SmsSeckillSkuNoticeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 19:47:44
 */
@Mapper
public interface SmsSeckillSkuNoticeDao extends BaseMapper<SmsSeckillSkuNoticeEntity> {
	
}
