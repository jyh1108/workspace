
public class trst1 {

	public static void main(String[] args) {
		String[] dic = { "moos", "dzx", "smm", "sunmmo", "som" };
		String[] spell = { "s", "o", "m", "d" };
		int answer = 2;

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
//		System.out.println(answer);
			ArrayList<Character>[] ArrayL1 = new ArrayList[dic.length];
			for (int i = 0; i < dic.length; i++) {
				ArrayL1[i] = new ArrayList<>();
				for (int j = 0; j < dic[i].length(); j++) {
					ArrayL1[i].add(dic[i].charAt(j));
				}
			}

			for (int k = 0; k < ArrayL1.length; k++) {
				int yes = 0;
				for (int u = 0; u < ArrayL1[k].size(); u++) {
					for (int s = 0; s < spell.length; s++) {
//						System.out.print(svg[s]);
//						System.out.println(ArrayL1[k].get(u).charValue());
						if (spell[s] == (ArrayL1[k].get(u).charValue())) {
							yes++;
//							System.out.println("더하기1");
						}
					}
				}
				if (yes == ArrayL1[k].size()) {
					answer = 1;
					break;
				} else {
//					System.out.println(yes);
				}
			}
	}
}
