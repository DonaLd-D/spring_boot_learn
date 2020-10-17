package com.imooc.springbootlearn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {
    @Value("${school.grade}")
    Integer grade;
    @Value("${school.classnum}")
    Integer classnum;

    @GetMapping("/gradeclass")
    public String gradeClass(){
        return "年纪："+grade+"班级："+classnum;
    }
}
