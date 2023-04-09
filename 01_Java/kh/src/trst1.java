import java.util.Arrays;

public class trst1 {

public static void main(String[] args) {
		int [] [] number =	{{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int [] svg = new int[number.length];
		int[] answer = new int[svg.length];
		int a =0;
		
		for(int i =0; i<number.length; i++) {
			svg[i] = ((number[i][0]+number[i][1])/2);
		}
		for(int j=0; j<svg.length; j++) {
			for(int y =0; y<j; y++) {
				if(a<svg[y]) {
					a=svg[y];
				}
			}answer[i]
		}
		System.out.println(Arrays.toString(svg));
		System.out.println(Arrays.toString(answer));

	}

}
