import java.util.Arrays;


public class UniqueString {

	public UniqueString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "santosh";
		String s1 = s.toLowerCase();
		char[] strArr = s1.toCharArray();
		Arrays.sort(strArr);
		char prevChar = strArr[0];
		boolean isUnique = true;
		for (int i = 1; i < strArr.length; i++) {
			if (prevChar == strArr[i]) {
				isUnique = false;
				break;
			}
			prevChar = strArr[i];
		}
		if (isUnique) {
			System.out.println("String is unique");
		} else {
			System.out.println("String is not unique");
		}
	}
}
