package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:54:22
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

