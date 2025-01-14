
package cn.van.order.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTestController {

    @GetMapping("/httpHello")
    public JSONObject httpHello() {
        return new JSONObject().fluentPut("msg", "hello");
    }
}