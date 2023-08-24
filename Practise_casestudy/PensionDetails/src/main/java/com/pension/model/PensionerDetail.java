package com.pension.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="pensioner_detail")
public class PensionerDetail {

	@Id
	private String aadhar;
	private String name;
	private String DOB;
	private String Pan;
	private Double salary;
	private Double allowance;
	private String pension_class;
	@Embedded
	@Column(name="bank")
	private Bank bank;
	
	@Override
	public String toString() {
		return "PensionerDetail [aadhar=" + aadhar + ", name=" + name + ", DOB=" + DOB + ", Pan=" + Pan + ", salary="
				+ salary + ", allowance=" + allowance + ", pension_class=" + pension_class + ", bank=" + bank + "]";
	}
	
	
	
}
