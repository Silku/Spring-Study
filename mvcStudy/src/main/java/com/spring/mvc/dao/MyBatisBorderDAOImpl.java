package com.spring.mvc.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc.model.beans.BorderBean;

public class MyBatisBorderDAOImpl implements MyBatisBorderDAO{
	
	@Autowired
	private SqlSession session;
	//servlet-context.xml의 sqlsessionTemplate를 통해 여기 있는 sqlsession이 구현되고 있다.
	private static final String NAME_SPACE = "com.spring.mvc.dao.MyBatisBorderDAO";
	@Override
	public List<BorderBean> getBorderList() {
		return session.selectList(NAME_SPACE + ".getBordeList");
	}
	@Override
	public BorderBean getBorderDtl(int border_code) {
		return session.selectOne(NAME_SPACE + "getBorderList",border_code) ;
	}
}
