package com.cclx.controller;

import com.cclx.model.Course;
import com.cclx.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TopController {

    @Autowired
    private CourseService courseService;

    /**
     * 获取课程简介信息
     * @return
     */
    @RequestMapping("/getCourseMes")
    @ResponseBody
    public Course getCourseMes(){

        System.out.println("哈哈哈哈哈哈哈哈");

        Course course = courseService.getCourseMesPage1();
        return course;
    }
}
