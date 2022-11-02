package com.hds.digitalonboarding.oracel.service;

import java.util.List;

import com.hds.digitalonboarding.oracel.entity.ResultProcedures;

public interface TestService {
	public List<ResultProcedures> findProcedures(String contracts);
}
