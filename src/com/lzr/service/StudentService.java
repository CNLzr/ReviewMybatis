package com.lzr.service;

import com.lzr.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentService {
    public static void main(String[] args) throws IOException {
        //1.获取mybatis配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.将输入流传入SqlSession工厂，获取工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.使用工厂对象创建session会话对象
        SqlSession session = sqlSessionFactory.openSession();
        List<Student> list = session.selectList("com.lzr.mapper.StudentMapper.getAll");
        System.out.println(list);

    }
}
