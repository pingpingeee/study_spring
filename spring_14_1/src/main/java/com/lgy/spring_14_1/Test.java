package com.lgy.spring_14_1;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j // 로그처리
@Slf4j
public class Test {
	public static void main(String[] args) {
		System.out.println("test01");
		log.debug("test02");
		log.info("test03");
	}
}
