package spring_ex_3_9;

public class EvenNumber {
	public void process(int num) {
		int result = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				result += i;
		}
		
		System.out.println(num+"까지의 짝수들의 합계 : " + result);
	}
}
