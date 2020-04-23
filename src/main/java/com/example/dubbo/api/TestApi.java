package com.example.dubbo.api;

import com.example.dubbo.entity.TestMybatis;

import java.util.List;

/**
 * @author Administrator
 */
public interface TestApi {

        List<TestMybatis> list();
        boolean update();
        boolean insert();

}
