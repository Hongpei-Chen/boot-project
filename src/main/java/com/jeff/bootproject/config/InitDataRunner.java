package com.jeff.bootproject.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * {@link org.springframework.boot.SpringApplication}启动时如果您需要运行一些特定的代码，
 * 就可以实现{@link ApplicationRunner}或{@link CommandLineRunner}接口。
 * 两个接口都以相同的方式工作，并提供一个单独的运行方法，
 * 这将在SpringApplication.run（…）完成之前调用。
 * @author jeff
 * <p>Date 2018/3/11</p>
 */
@Slf4j
@Component
public class InitDataRunner implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        log.info("==============<陈鸿培>==================");
    }
}
