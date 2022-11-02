package com.hds.digitalonboarding.oracel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class Users {
	
	@Id
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	
}
