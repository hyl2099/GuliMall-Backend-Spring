package com.mall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.ware.dao.UmsMemberCollectSubjectDao;
import com.mall.ware.entity.UmsMemberCollectSubjectEntity;
import com.mall.ware.service.UmsMemberCollectSubjectService;


@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl extends ServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubjectEntity> implements UmsMemberCollectSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberCollectSubjectEntity> page = this.page(
                new Query<UmsMemberCollectSubjectEntity>().getPage(params),
                new QueryWrapper<UmsMemberCollectSubjectEntity>()
        );

        return new PageUtils(page);
    }

}