package com.lgy.spring_14_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_14_1.domain.SampleVO;

//@Controller
@RestController // pom.xml 설정되어야 사용 가능
@RequestMapping("/sample")
public class SampleController {

//	@GetMapping(value = "/getSample")
	// xml이나 jsom 데이터 안 나올 때 추가
	@GetMapping(value = "/getSample", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_ATOM_XML_VALUE })
	public SampleVO getSample() {
		return new SampleVO(112, "스타", "로드");
	}

	@GetMapping(value = "/getList")
	public List<SampleVO> getList() {
		// 스트림, 람다식은 프로젝트 설정에서 java comiler version 확인
		return IntStream.range(1, 10).mapToObj(i -> new SampleVO(i, i + "First", i + "Last"))
				.collect(Collectors.toList());
	}

	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<String, SampleVO>();
		map.put("First", new SampleVO(111, "그루트", "주니어"));

		return map;
	}
	
	@GetMapping(value = "/check")
//	ResponseEntity : 데이터 + http 상태 코드를 전달
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		SampleVO vo = new SampleVO(0, ""+height, ""+weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height<150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		
		return result;
	}
}
