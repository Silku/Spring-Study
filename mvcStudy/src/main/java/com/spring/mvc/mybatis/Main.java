package com.spring.mvc.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.spring.mvc.model.study.Student;

public class Main {

	public static void main(String[] args) throws IOException {
		selectStudent();

	}
	
	public static void selectStudent() throws IOException {
		Reader reader = Resources.getResourceAsReader("com/spring/mvc/mybatis/mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		
		List<Student> list = session.selectList("Student.getStudentList");
		///StudentMapper.xml에서의 namespace.select id 의 값을 가져오는것임.
		for(Student s : list)
			System.out.println("DB에 저장된 데이터 :" + s);
	}
}
