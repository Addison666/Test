package com.example.demo.service.Impl;

/**
 * @author THLiu i531384
 */

import com.example.demo.config.InitialConfiguration;
import com.example.demo.entity.User;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private InitialConfiguration dao;

    @Override
    public User getDemo(String key) {

        return dao.maps.get(key);
    }
}
