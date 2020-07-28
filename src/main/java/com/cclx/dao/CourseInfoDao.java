package com.cclx.dao;

import com.cclx.model.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 课程信息用
 */
@Repository
public interface CourseInfoDao {

    /*
    获取课程 索引:1 的简介信息
     */
    @Select("SELECT index1mess as courseMes FROM cclxtop")
    public Course getCourseInfoPage1();
}
