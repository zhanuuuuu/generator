package com.generator.dao;

import com.generator.entity.pos_Goods;
import java.util.List;

public interface pos_GoodsMapper {
    int deleteByPrimaryKey(String cGoodsNo);

    int insert(pos_Goods record);

    pos_Goods selectByPrimaryKey(String cGoodsNo);

    List<pos_Goods> selectAll();

    int updateByPrimaryKey(pos_Goods record);
}