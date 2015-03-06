package miteshQuestion;

import java.util.HashMap;

public class Q1 {

	public static void checkFinal(final HashMap<String,String> m){
		m.put("String","String");
		System.out.println(m);
	}
	public static void main(String[] args) {
		final HashMap<String,String> param = new HashMap<String, String>();
		checkFinal(param);	
	}

}
