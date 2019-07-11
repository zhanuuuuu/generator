package com.generator.dao;

import com.generator.entity.posstation;
import java.util.List;

public interface posstationMapper {
    int insert(posstation record);

    List<posstation> selectAll();
}