package cn.linter.learning.course;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 课程服务启动类
 *
 * @author wangxiaoyang
 * @since 2021/02/16
 */
@SpringCloudApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }

}