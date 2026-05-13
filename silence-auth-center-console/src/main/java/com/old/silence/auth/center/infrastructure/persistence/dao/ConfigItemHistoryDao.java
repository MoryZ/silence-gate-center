package com.old.silence.auth.center.infrastructure.persistence.dao;


import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.old.silence.auth.center.domain.model.ConfigItemHistory;


@Mapper
public interface ConfigItemHistoryDao extends BaseMapper<ConfigItemHistory> {

}