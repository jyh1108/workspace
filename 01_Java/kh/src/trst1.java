
public class trst1 {

	public static void main(String[] args) {
//		
//	사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 
//	사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 
//	예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의
//	그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 
//	다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고
//	["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점, 55점]]이고,
//"tony"는 그리움 점수가 없을 때, 
//이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.
//
//	그리워하는 사람의 이름을 담은 문자열 배열 name,
//	각 사람별 그리움 점수를 담은 정수 배열 yearning,
//	각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 
//	매개변수로 주어질 때,
//	사진들의 추억 점수를 photo에 주어진 순서대로
//	배열에 담아 return하는 solution 함수를 완성해주세요.
		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" },
				{ "kon", "kain", "may", "coni" } };
		int[] answer = new int[photo.length];

		for (int i = 0; i < photo.length; i++) {// photo [i][]; 각각의 사진을 의미한다
			int sum = 0;
			for (int j = 0; j < photo[i].length; j++) {// 각 배열의 인물
				for (int f = 0; f < name.length; f++) {
					if (name[f].equals(photo[i][j])) {
						sum += yearning[f];
						break;
					}
				}
			}
			answer[i] = sum;
		}
	}
}
//		-----------------------------------------------
//		
//		머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때,
//		7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
//		int[] array = { 7, 77, 17 };
//		int result = 0;
//
//		for (int i = 0; i < array.length; i++) { 
//			String num = Integer.toString(array[i]);
//			String[] arr = num.split("");
//
//			for (int f = 0; f < arr.length; f++) {
//				if(arr[f].equals("7")) {
//					 result++;
//				}
//			}
//		}
//		System.out.println(result);
//		---------------------------------------------
//		int [] array = {7, 77 , 17};
//		int answer =0;
//		int arrayCK = 7;
// --------------------------------------------
//		String[] dic = { "moos", "dzx", "smm", "sunmmo", "som" };
//		String[] spell = { "s", "o", "m", "d" };
//		int answer = 2;
//		for (int i = 0; i < dic.length; i++) {
//			int count = 0;
//			int err =0;
//			for (int j = 0; j < spell.length; j++) {
//				if (dic[i].contains(spell[j])) {
//					count++;
//				}else{
//					err++;
//				}
//			}
//			if (count == dic[i].length()&&err==0) {
//				answer = 1;
//			}
//		} 

//		--------------------------------------
//		System.out.println(answer);
//			ArrayList<Character>[] ArrayL1 = new ArrayList[dic.length]; //정적배열 
//			for (int i = 0; i < dic.length; i++) {
//				ArrayL1[i] = new ArrayList<>(); //동적 배열 
//				for (int j = 0; j < dic[i].length(); j++) {
//					ArrayL1[i].add(dic[i].charAt(j));
//				}
//			}
//
//			for (int k = 0; k < ArrayL1.length; k++) {
//				int yes = 0;
//				for (int u = 0; u < ArrayL1[k].size(); u++) {
//					for (int s = 0; s < spell.length; s++) {
////						System.out.print(svg[s]);
////						System.out.println(ArrayL1[k].get(u).charValue());
//						if (spell[s] == (ArrayL1[k].get(u).charValue())) {
//							yes++;
////							System.out.println("더하기1");
//						}
//					}
//				}
//				if (yes == ArrayL1[k].size()) {
//					answer = 1;
//					break;
//				} else {
////					System.out.println(yes);
//				}
//			}
