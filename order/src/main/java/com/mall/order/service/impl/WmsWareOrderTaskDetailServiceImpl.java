package com.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.common.utils.PageUtils;
import com.mall.common.utils.Query;

import com.mall.order.dao.WmsWareOrderTaskDetailDao;
import com.mall.order.entity.WmsWareOrderTaskDetailEntity;
import com.mall.order.service.WmsWareOrderTaskDetailService;


@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl extends ServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetailEntity> implements WmsWareOrderTaskDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WmsWareOrderTaskDetailEntity> page = this.page(
                new Query<WmsWareOrderTaskDetailEntity>().getPage(params),
                new QueryWrapper<WmsWareOrderTaskDetailEntity>()
        );

        return new PageUtils(page);
    }

}