package com.cf.demos.myDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/5/6.
 *
 *  Spring官方建议非官方Starter命名应遵循{name}-spring-boot-starter的格式。
 */
@RestController
public class TController {
    @GetMapping("/loginsss")
    public String mA(){
        return "success";
    }
}
