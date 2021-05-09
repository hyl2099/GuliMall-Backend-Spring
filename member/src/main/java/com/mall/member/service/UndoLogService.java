package com.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mall.common.utils.PageUtils;
import com.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:56:50
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

