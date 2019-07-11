package com.generator.dao;

import com.generator.entity.pos_PloyOfSale;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pos_PloyOfSaleMapper {
    int deleteByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsNo") String cGoodsNo, @Param("iLineNo") Integer iLineNo);

    int insert(pos_PloyOfSale record);

    pos_PloyOfSale selectByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsNo") String cGoodsNo, @Param("iLineNo") Integer iLineNo);

    List<pos_PloyOfSale> selectAll();

    int updateByPrimaryKey(pos_PloyOfSale record);
}