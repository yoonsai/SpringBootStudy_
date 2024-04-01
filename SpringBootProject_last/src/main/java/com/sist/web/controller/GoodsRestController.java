package com.sist.web.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.dao.GoodsDAO;
import com.sist.web.entity.GoodsAll;

@RestController
@CrossOrigin(origins="*")
public class GoodsRestController {
	@Autowired
	private GoodsDAO gDao;
	
	@GetMapping("/goods/list/{page}")
	public ResponseEntity<Map> goods_list(@PathVariable("page") int page)
	{
		Map map=new HashMap();
		try {
			int rowSize=20;
			int start=(rowSize*page)-rowSize;
			int count=(int)gDao.count();
			List<GoodsAll> list=gDao.goodsAllData(start);
			map.put("gList", list);
			map.put("count", count);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
		
	}
	
	@GetMapping("/goods/find/{page}/{fd}")
	public ResponseEntity<Map> goods_find(@PathVariable("page") int page, @PathVariable("fd") String fd)
	{
		Map map=new HashMap();
		try {
			int rowSize=20;
			int start=(rowSize*page)-rowSize;
			int count=gDao.goodsFindCount(fd);
			List<GoodsAll> list=gDao.goodsFindData(start, fd);
			map.put("gList", list);
			map.put("count", count);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
	@GetMapping("/goods/detail/{no}")
	public ResponseEntity<GoodsAll> goods_detail(@PathVariable("no") int no)
	{
		GoodsAll goods=new GoodsAll();
		try {
		   goods=gDao.findByNo(no);	
		   
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return new ResponseEntity<GoodsAll>(goods,HttpStatus.OK);
	}
}
