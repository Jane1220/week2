/**
 * 
 */
package com.wangxinyu.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wangxinyu.domain.Column;
import com.wangxinyu.vo.Vo;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
public interface ColumnService {

	/**
	 * @param pageNum
	 * @param vo
	 * @return
	 */
	PageInfo getColumnList(int pageNum, Vo vo);

	/**
	 * @param columnlist
	 */
	int insert(List<Column> columnlist);

}
