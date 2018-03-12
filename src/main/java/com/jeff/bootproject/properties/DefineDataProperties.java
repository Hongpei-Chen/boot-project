package com.jeff.bootproject.properties;

import com.jeff.bootproject.bean.Pepole;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author jeff
 * <p>Date 2018/3/12 11:35</p>
 */
@Configuration
@ConfigurationProperties(prefix = "define")
@Data
public class DefineDataProperties {

    private String name;
    private List<Pepole> list;
}
