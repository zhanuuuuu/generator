package com.generator.dao;

import com.generator.entity.BLBGoodsInfo;
import java.util.List;

public interface BLBGoodsInfoMapper {
    int deleteByPrimaryKey(Long lineId);

    int insert(BLBGoodsInfo record);

    BLBGoodsInfo selectByPrimaryKey(Long lineId);

    List<BLBGoodsInfo> selectAll();

    int updateByPrimaryKey(BLBGoodsInfo record);
}