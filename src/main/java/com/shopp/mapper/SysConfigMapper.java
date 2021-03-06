package com.shopp.mapper;

import com.shopp.entity.SysConfig;
import java.util.List;

public interface SysConfigMapper {
    int deleteByPrimaryKey(String variable);

    int insert(SysConfig record);

    SysConfig selectByPrimaryKey(String variable);

    List<SysConfig> selectAll();

    int updateByPrimaryKey(SysConfig record);
}