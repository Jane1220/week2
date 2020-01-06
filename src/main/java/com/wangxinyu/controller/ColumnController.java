/**
 * 
 */
package com.wangxinyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wangxinyu.service.ColumnService;
import com.wangxinyu.vo.Vo;

/**
 * @作者： 王新宇
 * @时间：2020年1月6日
 */
@Controller
public class ColumnController {

	@Autowired
	private ColumnService service;
	
	@RequestMapping("list")
	public String getColumnList(Model model,@RequestParam(defaultValue="1")int pageNum,Vo vo) {
		
		PageInfo info = service.getColumnList(pageNum,vo);
		model.addAttribute("info", info);
		model.addAttribute("vo", vo);
		
		return "list";
	}
	
	
	
	
}
