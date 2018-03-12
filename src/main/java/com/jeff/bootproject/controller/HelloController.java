package com.jeff.bootproject.controller;

import com.jeff.bootproject.bean.Pepole;
import com.jeff.bootproject.properties.DefineDataProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jeff
 * <p>Date 2018/3/8</p>
 */
@Slf4j
@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private DefineDataProperties defineDataProperties;

    @GetMapping("/hello")
    public String hello(){
        List<Pepole> pepoles = defineDataProperties.getList();
        if (pepoles != null){
            log.info(pepoles.toString());
        }
        return "hello";
    }

}
