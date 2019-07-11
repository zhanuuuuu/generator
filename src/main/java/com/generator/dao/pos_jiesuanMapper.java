package com.generator.dao;

import com.generator.entity.pos_jiesuan;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pos_jiesuanMapper {
    int deleteByPrimaryKey(@Param("sheetno") String sheetno, @Param("jstype") String jstype);

    int insert(pos_jiesuan record);

    pos_jiesuan selectByPrimaryKey(@Param("sheetno") String sheetno, @Param("jstype") String jstype);

    List<pos_jiesuan> selectAll();

    int updateByPrimaryKey(pos_jiesuan record);
}