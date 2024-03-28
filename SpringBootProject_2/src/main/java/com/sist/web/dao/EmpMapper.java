package com.sist.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sist.web.vo.EmpVO;

import java.util.*;

@Mapper
public interface EmpMapper {
	public List<EmpVO> empListData();
}
