
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = 37.9;
		double d2 = 1004.128;
		int i1 = 12;
		int i2 = 18;
System.out.println( 57.2 * (i1 / i2) + 1);
/*The Value should be 1.0 because the double is there, the paranthese is 0,
 * multiply by 0 is zero, so reasult is 1.0
 */
System.out.println(57.2 * ((double) i1 / i2) + 1);
//39.13333333333333
System.out.println(15 - i1 * (d1 * 3) + 4);
//-1345.3999999999
System.out.println(15 - i1 * (int)(d1 * 3) + 4);
//-1313
System.out.println(15 - i1 * ((int) d1 * 3) + 4);
//-1313
	}

}
