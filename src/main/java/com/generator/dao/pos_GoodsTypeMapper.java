package com.generator.dao;

import com.generator.entity.pos_GoodsType;
import java.util.List;

public interface pos_GoodsTypeMapper {
    int deleteByPrimaryKey(String cGoodsTypeno);

    int insert(pos_GoodsType record);

    pos_GoodsType selectByPrimaryKey(String cGoodsTypeno);

    List<pos_GoodsType> selectAll();

    int updateByPrimaryKey(pos_GoodsType record);
}