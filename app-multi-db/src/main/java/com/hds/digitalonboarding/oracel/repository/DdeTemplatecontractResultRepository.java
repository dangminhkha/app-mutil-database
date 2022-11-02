package com.hds.digitalonboarding.oracel.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hds.digitalonboarding.oracel.entity.ResultProcedures;

@Repository
public interface DdeTemplatecontractResultRepository extends JpaRepository<ResultProcedures, Serializable>{

	@Procedure(name = "findProcedures")
	public List<ResultProcedures> findProcedures(@Param("P_CONTRACT") String contracts);
}
