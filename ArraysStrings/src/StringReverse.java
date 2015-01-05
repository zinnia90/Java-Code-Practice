
public class StringReverse {

	public StringReverse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shreya";
		char[] strArr = s.toCharArray();
		int len = strArr.length;
		for (int i=0, j = len - 1; i < j; i++, j--) {
			char temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
		}
		System.out.println(strArr);
	}

}
