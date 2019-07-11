package com.generator.dao;

import com.generator.entity.Pos_Config;
import java.util.List;

public interface Pos_ConfigMapper {
    int deleteByPrimaryKey(String cID);

    int insert(Pos_Config record);

    Pos_Config selectByPrimaryKey(String cID);

    List<Pos_Config> selectAll();

    int updateByPrimaryKey(Pos_Config record);
}