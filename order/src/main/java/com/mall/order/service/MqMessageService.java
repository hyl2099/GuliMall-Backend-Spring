package com.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:54:22
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

