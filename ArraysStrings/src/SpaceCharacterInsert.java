
public class SpaceCharacterInsert {

	public SpaceCharacterInsert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mr. John Smith        ";
		int trueLength = 14;
		char[] strArr = s.toCharArray();
//		System.out.println(strArr.length);
		int spaces = 0;
		int j = trueLength - 1;
		for (int i = 0; i <= j; i++) {
			if (strArr[i] == ' ') {
				spaces++;
			}
		}
		int endpoint = j + spaces*2;
		for (int i = endpoint; i >= 0; i--) {
			if (strArr[j] == ' ') {
				strArr[i--] = '0';
				strArr[i--] = '2';
				strArr[i] = '%';
			} else {
				strArr[i] = strArr[j];
			}
			j--;
		}
		for (char c: strArr) {
			System.out.print(c);
		}
	}
}
