package com.hds.digitalonboarding.oracel.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hds.digitalonboarding.config.BeanIds;
import com.hds.digitalonboarding.oracel.entity.ResultProcedures;
import com.hds.digitalonboarding.oracel.repository.DdeTemplatecontractResultRepository;
import com.hds.digitalonboarding.oracel.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private DdeTemplatecontractResultRepository ddeTemplatecontractResultRepository;
	
	@Override
	@Transactional(transactionManager = BeanIds.TRANSACTION_MANAGER_ORACLE, readOnly = true, rollbackFor = Exception.class)
	public List<ResultProcedures> findProcedures(String contracts) {
		return ddeTemplatecontractResultRepository.findProcedures(contracts);
	}

}
