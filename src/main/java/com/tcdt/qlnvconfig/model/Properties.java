/**
 * 
 */
package com.tcdt.qlnvconfig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author hoanglb
 *
 */
@Entity
@Table(name = "SERVICE_CONFIG")
@Data
public class Properties {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICE_CONFIG_SEQ")
	@SequenceGenerator(name = "SERVICE_CONFIG_SEQ", sequenceName = "SERVICE_CONFIG_SEQ", allocationSize = 1)
	private Long id;
	private String application;
	private String profile;
	private String label;
	private String key;
	private String value;
	private String enable;
}
