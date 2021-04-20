package tobinary.integer;

public class Converter {
	
	public static String toBinary(int x) {
		String res = "";
		int n=x; int r;
		do {
			r = n%2;
			res += r;
			n = (n-r)/2;		
		} while (n != 0);
		return res;
	}

}


