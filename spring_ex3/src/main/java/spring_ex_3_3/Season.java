package spring_ex_3_3;

public class Season {
	public void rsltSeason(int num) {
		String str1 = "dafault";
		
		switch (num) {
		case 3: case 4: case 5:
			str1 = "봄";
			break;
		case 6: case 7: case 8:
			str1 = "여름";
			break;
		case 9: case 10: case 11:
			str1 = "가을";
			break;
		case 12: case 1: case 2:
			str1 = "겨울";
			break;

		default:
			System.out.println("?");
			break;
		}
		System.out.println("입력된 정수가 " + num + "은 계절이 " + str1);
	}
}
