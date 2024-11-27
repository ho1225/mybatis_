package com.schh.mapper;

import com.schh.pojo.Brand;
import com.schh.pojo.User;

import java.util.List;

public interface BrandMapper {

    List<Brand> selectAll();

    Brand selectById(int id);
}
