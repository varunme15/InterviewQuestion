package effectiveJava;

import java.sql.Date;
import java.sql.Time;
import java.util.Timer;

public class BoxedPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		//System.out.println(d.getTime());
		long sum = 0L;
		for(int i=0;i<Integer.MAX_VALUE;i++){
			sum +=i;
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis()-start);
	}

}
