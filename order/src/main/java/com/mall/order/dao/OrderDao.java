package com.mall.order.dao;

import com.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:54:22
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
