
public class ZeroFlipArray {

	public ZeroFlipArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
//		String str ="1100101110111";
		String str = "110111101110110";
		char[] strArr = str.toCharArray();
		int left = -1;
		int curr = -1;
		int right = -1;
		int maxLength = 0, flipPos = -1;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i] == '0') {
				curr = i;
				while (i < strArr.length-1 &&
						strArr[i+1] != '0') {
					i++;
				}
				right = i;
				int length  = right - left;
				if (length > maxLength) {
					maxLength = length;
					flipPos = curr;
				}
				System.out.println("The length for " + curr +
						" is " + length);
				left = curr;
			}
		}
		System.out.println("The flip position is: " + flipPos);
	}
}
