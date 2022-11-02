package com.hds.digitalonboarding.oracel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "findProcedures", procedureName = "SGVFDB05.P_CONTRACT_STATUS_SEARCH", resultClasses = ResultProcedures.class, 
			parameters = {
					@StoredProcedureParameter(mode = ParameterMode.IN, name = "P_CONTRACT", type = String.class),
					@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "P_REF_OUT", type = void.class)
			})
})
@Entity
public class ResultProcedures {

	@Id
	@Column(name = "CONTRACT")
	private String contract;
	
	@Column(name = "STATUS")
	private String status;
	
}
