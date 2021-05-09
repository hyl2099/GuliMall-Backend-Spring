package com.mall.order.dao;

import com.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:54:22
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
