/**
 * 
 */
package com.wangxinyu.service.impl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bobo.common.utils.DateUtil;
import com.bobo.common.utils.StreamUtil;
import com.bobo.common.utils.StringUtil;
import com.wangxinyu.domain.Column;
import com.wangxinyu.service.ColumnService;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class ColumnServiceImplTest {
	
	@Autowired
	private ColumnService service;

	
	@Test
	public void insert() throws IOException {
		List<Column> columnlist = new ArrayList<>();
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		 for (String str : read) {
			 Column c = new Column();
			 String[] s = str.split(",");
			 
//			 id值要使用isNumber()工具方法判断是不是数字
			if(StringUtil.isNumber(s[0])) {
				 c.setId(Integer.parseInt(s[0]));
			}
//			keywords	、description、公司名称、主营产品、地址要使用
//			hasText()方法判断有没有值
			if(StringUtil.hasText(s[1])) {
				 c.setGj(s[1]);
			}
			
			if(StringUtil.hasText(s[2])) {
				 c.setMs(s[2]);
			}
			
			if(StringUtil.hasText(s[3])) {
				c.setName(s[3]);
			}
			
			if(StringUtil.hasText(s[4])) {
				 c.setBrand(s[4]);
			}
			
			if(StringUtil.hasText(s[5])) {
				c.setAddress(s[5]);
			}
//			注册资本要使用hasText()方法判断有没有值，并使用
//			isNumber()判断是不是数字
			if(StringUtil.hasText(s[6]) && StringUtil.isNumber(s[6])) {
				c.setPrice(Double.parseDouble(s[6]));
			}
			
			if(StringUtil.hasText(s[7])) {
				 c.setStarttime(s[7]);
			}
			
			 c.setNjtime(s[8]);
			 c.setStatus(s[9]);
			 c.setBz(s[10]);
			 columnlist.add(c);
			 
		}
		
		 service.insert(columnlist);
		 
	}	

}
