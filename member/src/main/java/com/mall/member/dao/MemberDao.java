package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yolanda
 * @email yolanda@gmail.com
 * @date 2021-05-09 20:56:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
