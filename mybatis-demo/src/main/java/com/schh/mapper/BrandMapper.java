package com.schh.mapper;

import com.schh.pojo.Brand;


import java.util.List;
import java.util.Map;

public interface BrandMapper {

    List<Brand> selectAll();


    Brand selectById(int id);

    /**
     * conditional query
     * 1. seperated
     * 2. object
     * 3. map

     */
//    List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

//    List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    List<Brand> selectByConditionSingle(Brand brand);

    void addBrand(Brand brand);

    int update(Brand brand);
}
