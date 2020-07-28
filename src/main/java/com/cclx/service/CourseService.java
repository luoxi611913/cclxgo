package com.cclx.service;

import com.cclx.dao.CourseInfoDao;
import com.cclx.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 课程用Service
 */
@Service("courseService")
public class CourseService {

    @Autowired
    private CourseInfoDao courseInfoDao;

    public Course getCourseMesPage1(){

        return courseInfoDao.getCourseInfoPage1();
    }


}
