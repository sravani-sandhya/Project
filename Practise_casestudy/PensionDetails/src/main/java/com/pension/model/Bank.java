package com.pension.model;



import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Bank {
	
	private String bank_name;
	private long acc_num;
	private String bank_type;
	@Override
	public String toString() {
		return "Bank [bank_name=" + bank_name + ", acc_num=" + acc_num + ", bank_type=" + bank_type + "]";
	}

	
	
}
