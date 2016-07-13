package prob2;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		String result = "";
		for (int i = 0; i < str.length; i++) {
			result = result.concat(str[i]);
		}
		return result;
	}

	public static void main(String args[]) {
		String[] strArr = { "SuperMan", "BatMan", "SpiderMan" };
		String resultStr = concatenate(strArr);
		System.out.println("결과 문자열 : " + resultStr);
	}
}