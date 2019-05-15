package com.icangjinge.bank.springboot.base.integrate.redis;

import com.icangjinge.bank.springboot.base.integrate.redis.model.Cif;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisApplicationTest {
    @Autowired
    private RedisTemplate redisTemplate;

    /**
    /**
     *场景1：银行风险控制,如发现某客户在某段时间交易异常，在一段时间内进行增强检验等操作。
     *
     * @throws Exception
     */
    @Test
    public void testRedisString() throws Exception {

        String cifNo = "10001";
        String key = String.format("Rule_Limit_%s", cifNo);
        String rule = "xxxxxx";//规则1
        ValueOperations ops = redisTemplate.opsForValue();
        redisTemplate.delete(key);
        ops.set(key, rule, 5, TimeUnit.SECONDS);//有效期5秒
        System.out.println(ops.get(key));
        Assert.assertEquals(rule,ops.get(key));
        Thread.sleep(6000);
        Assert.assertEquals(null,ops.get(key));
    }

    /**
     *场景：获取商户属性配置，管理端更改商户属性实时生效
     * @throws Exception
     */
    @Test
    public void testRedisHashMap() throws Exception {
        HashOperations hashOperations = redisTemplate.opsForHash();
        String merchantNo = "10001";
        String key = String.format("Rule_Merchant_%s",merchantNo);
        Map mercahntMap = new HashMap();
        mercahntMap.put("属性1","xxxxxx1");
        mercahntMap.put("属性2","xxxxxx2");
        mercahntMap.put("属性3","xxxxxx3");


        hashOperations.putAll(key,mercahntMap);

        Map resultMerchantNo = hashOperations.entries(key);
        Assert.assertEquals(mercahntMap.size(),resultMerchantNo.size());
        System.out.println(resultMerchantNo.toString());
        redisTemplate.delete(key);
    }


    /**
     *简单队列
     * @throws Exception
     */
    @Test
    public void testRedisList() throws Exception {
        ListOperations listOperations = redisTemplate.opsForList();
        Map data = new HashMap();
        String key = "List_key";
        redisTemplate.delete(key);
        listOperations.rightPush(key,"data1");
        listOperations.rightPush(key,"data2");
        Assert.assertEquals((String)listOperations.leftPop(key),"data1");
        Assert.assertEquals((String)listOperations.leftPop(key),"data2");
        redisTemplate.delete(key);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testRedisSet() throws Exception {
        SetOperations setOperations = redisTemplate.opsForSet();
        Map data = new HashMap();
        String key = "Set_key";
        redisTemplate.delete(key);
        setOperations.add(key,"A");
        setOperations.add(key,"A");
        setOperations.add(key,"B");
        setOperations.add(key,"C");
        Assert.assertEquals(setOperations.size(key),Long.valueOf(3));
        redisTemplate.delete(key);
    }


    /**
     * 存储对象
     * @throws Exception
     */
    @Test
    public void testRedisObject() throws Exception {
        ValueOperations ops = redisTemplate.opsForValue();
        String key = "Object_key";

        Cif cif = new Cif();
        cif.setCifName("用户测试");
        cif.setCifNo("1111");
        cif.setOpenTime(new Date());
        ops.set(key,cif,1000,TimeUnit.SECONDS);
        Cif redisCif = (Cif)ops.get(key);
        Assert.assertEquals(redisCif.getCifName(),redisCif.getCifName());
        redisTemplate.delete(key);
    }

}