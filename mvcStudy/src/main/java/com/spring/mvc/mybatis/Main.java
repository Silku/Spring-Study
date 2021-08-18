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
		//커밋이랑 롤백들의 crud와의 차이 : 셀렉트할떄 쓰는 건아니고, insert,update,delete할떄는 마지막에 commit붙여줘야되고
		//롤백 : 잘못된 데이터가 들어왔을때 잘못된데이터가 들어오지않게끔 기존데이터로 롤백
		List<Student> list = session.selectList("Student.getStudentList");
		///Student.getStudentList = StudentMapper.xml에서의 namespace.select id
		List<Integer> seqList = session.selectList("Student.getStudentSeq");
		String name = session.selectOne("Student.getStudentNameOne", 2);
		for(Student s : list) {
			System.out.println("DB에 저장된 데이터 :" + s );
		}
		for(Integer i : seqList) {
			System.out.println(i);
		}
		System.out.println("학생이름 : " + name);
	}
}
