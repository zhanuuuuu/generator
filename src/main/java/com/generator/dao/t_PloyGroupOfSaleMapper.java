package com.generator.dao;

import com.generator.entity.t_PloyGroupOfSale;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface t_PloyGroupOfSaleMapper {
    int deleteByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsNo") String cGoodsNo, @Param("cGroupNo") String cGroupNo);

    int insert(t_PloyGroupOfSale record);

    t_PloyGroupOfSale selectByPrimaryKey(@Param("cPloyNo") String cPloyNo, @Param("cGoodsNo") String cGoodsNo, @Param("cGroupNo") String cGroupNo);

    List<t_PloyGroupOfSale> selectAll();

    int updateByPrimaryKey(t_PloyGroupOfSale record);
}