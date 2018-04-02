package priv.cl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.cl.demo.interfaces.IRedisRepository;

/**
 * Copyright (C), XXX有限公司
 * FileName: TestController
 * Author:   chenlu
 * Date:     2018/4/2 11:52
 * Email:  1768245095@qq.com
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class TestController {
    @Autowired
    IRedisRepository redisRepository;
    @RequestMapping("/set")
    public int test(){
        redisRepository.set("AAAAAA",90);
       return 0;
    }
    @RequestMapping("/get")
    public int get(){
        return (int)redisRepository.get("AAAAAA");
    }
}
