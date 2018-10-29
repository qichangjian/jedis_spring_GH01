package com.qcj.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * spring使用jedis
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JedisSpring {

    //自动注入jedispool
    @Autowired
    JedisPool pool;

    @Test
    public void testSpringJedis(){
        Jedis jedis = pool.getResource();
        String k1 = jedis.get("k1");
        System.out.println(k1);
        jedis.close();
    }



}
