package com.lgy.member_jdbc_oracle.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class MemDTO {
	private String MemUid;
	private String MemPwd;
	private String MemName;
}
