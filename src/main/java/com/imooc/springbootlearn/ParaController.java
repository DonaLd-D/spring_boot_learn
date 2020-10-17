package com.imooc.springbootlearn;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prefix")
public class ParaController {
    @GetMapping({"/firstrequest"})
    public String firstRequest(){
        return "第一个Spring Boot接口";
    }

    @GetMapping({"/requestpara"})
    public String requestPara(@RequestParam Integer num){
        return "para from request:"+num;
    }

    @GetMapping({"/para/{num}"})
    public String pathPara(@PathVariable Integer num){
        return "para from path:"+num;
    }

    @GetMapping({"/multiurl1","/multiurl2"})
    public String multiUrl(@RequestParam Integer num){
        return "para from path:"+num;
    }

    @GetMapping({"/required"})
    public String required(@RequestParam(required = false,defaultValue = "0") Integer num){
        return "para from request:"+num;
    }
}
