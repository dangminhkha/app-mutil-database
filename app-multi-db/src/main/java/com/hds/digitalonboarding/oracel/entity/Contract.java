package com.hds.digitalonboarding.oracel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contract")
public class Contract {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
}
