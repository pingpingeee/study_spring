package com.lgy.spring_14_1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 필드 전체를 참조하는 생성자
@Data // 여러가지 메소드를 포함
public class SampleVO {
	private int mno;
	private String firstName;
	private String lastName;	
}
