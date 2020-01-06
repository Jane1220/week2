/**
 * 
 */
package com.wangxinyu.mapper;

import java.util.List;

import com.wangxinyu.domain.Column;
import com.wangxinyu.vo.Vo;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
public interface ColumnMapper {

	/**
	 * @param vo
	 * @return
	 */
	List<Column> getColumnList(Vo vo);

	/**
	 * @param columnlist
	 * @return
	 */
	int insert(List<Column> columnlist);
	
	
}
