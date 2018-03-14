package com.jeff.bootproject;

import com.jeff.bootproject.domain.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.lang.Nullable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootProjectApplicationTests {

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;


	@Test
	public void contextLoads() {
        List<com.jeff.bootproject.domain.Test> all = testRepository.findAll();
        System.out.println(all.size());
    }


}
