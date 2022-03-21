package com.hcl.model2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	private int empId;
	private String empName;
	private String empDept;

}
