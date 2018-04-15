package com.hqs.springboot.service;

import com.hqs.springboot.entity.Test;
import com.hqs.springboot.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * 使用的service服务
 * @Author huangqingshi
 * @Date 2018.04.11
 */
@Service("testService")
public class TestService {
    @Resource
    private TestMapper testMapper;


    public Test findTestById (int id) {
        Test test = testMapper.findTestById(id);
        return test;
    }

    public int add(Test test) {
        int addCount = testMapper.add(test);
        return addCount;
    }

    public int deleteById(int id) {
        int deleteId = testMapper.deleteById(id);
        return deleteId;
    }

    public int updateTest(Test test) {
        int id = testMapper.updateByID(test);
        return id;
    }

    public List<Test> findByName(String name) {
        List<Test> test = testMapper.findByName(name);
        return test;
    }

}
