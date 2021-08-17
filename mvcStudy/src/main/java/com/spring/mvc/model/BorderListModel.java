package com.spring.mvc.model;

import java.util.ArrayList;

import com.spring.mvc.model.beans.BorderBean;

public class BorderListModel {
//넘어와야될것 : 리스트와 페이지, 총 페이지 index
	private int page;
	private int totalPage;
	private int pageStart;
	private int pageEnd;
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}

	private ArrayList<BorderBean> borderList;

	public ArrayList<BorderBean> getBorderList() {
		return borderList;
	}

	public void setBorderList(ArrayList<BorderBean> borderList) {
		this.borderList = borderList;
	}
	
	
}
