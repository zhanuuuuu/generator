package com.generator.dao;

import com.generator.entity.pos_SaleSheetDetail;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pos_SaleSheetDetailMapper {
    int deleteByPrimaryKey(@Param("cSaleSheetno") String cSaleSheetno, @Param("iSeed") Integer iSeed);

    int insert(pos_SaleSheetDetail record);

    pos_SaleSheetDetail selectByPrimaryKey(@Param("cSaleSheetno") String cSaleSheetno, @Param("iSeed") Integer iSeed);

    List<pos_SaleSheetDetail> selectAll();

    int updateByPrimaryKey(pos_SaleSheetDetail record);
}