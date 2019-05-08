import java.lang.*;

public class Tan {
	public static void main(String args[]) {	
		var x = Math.atan(Double.parseDouble(args[0]));
		System.out.println("tan x = " + Math.tan(x));
		System.out.println("x = " + x);
	}
}