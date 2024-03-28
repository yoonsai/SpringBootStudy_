package com.sist.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.sist.web.vo.*;
import com.sist.web.dao.*;
import java.util.*;

@Service
@Primary
public class EmpServiceImpl implements EmpService{
	@Autowired
	private EmpMapper mapper;

	@Override
	public List<EmpVO> empListData() {
		// TODO Auto-generated method stub
		return mapper.empListData();
	}
	
	
	
}
