/**
 * 
 */
package com.wangxinyu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.Column;
import com.wangxinyu.mapper.ColumnMapper;
import com.wangxinyu.service.ColumnService;
import com.wangxinyu.vo.Vo;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
@Service
public class ColumnServiceImpl implements ColumnService {

	@Autowired
	private ColumnMapper mapper;

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.ColumnService#getColumnList(int, com.wangxinyu.vo.Vo)
	 */
	@Override
	public PageInfo getColumnList(int pageNum, Vo vo) {
		
		PageHelper.startPage(pageNum, 5);
		List<Column> list = mapper.getColumnList(vo);
		PageInfo info = new PageInfo(list);
		
		return info;
	}

	/* (non-Javadoc)
	 * @see com.wangxinyu.service.ColumnService#insert(java.util.List)
	 */
	@Override
	public int insert(List<Column> columnlist) {
		// TODO Auto-generated method stub
		return mapper.insert(columnlist);
	}
	
	
	
	
}
