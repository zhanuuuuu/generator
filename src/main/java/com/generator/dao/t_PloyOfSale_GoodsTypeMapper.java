package com.generator.dao;

import com.generator.entity.t_PloyOfSale_GoodsType;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_PloyOfSale_GoodsTypeMapper {
    int deleteByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsTypeNo") String cGoodsTypeNo);

    int insert(t_PloyOfSale_GoodsType record);

    t_PloyOfSale_GoodsType selectByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsTypeNo") String cGoodsTypeNo);

    List<t_PloyOfSale_GoodsType> selectAll();

    int updateByPrimaryKey(t_PloyOfSale_GoodsType record);
}