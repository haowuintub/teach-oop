package ii_error_handling.cc_mathErrors;
import java.io.* ;

class Test {

	public static void main( String[] args ) 
	{

		int cc=-22 ;
//		try {
			int aa = 21 ;
			int bb = 0 ;
			cc = aa/bb ;
//		} catch ( ArithmeticException ee ) {
//			ee.printStackTrace() ;
//		}
		System.err.println( " cc: " + cc ) ;

//		double aaa = 0 ;
//		double bbb = 0 ;
//		double ccc = aaa/bbb ;
//		System.err.println ( " ccc: " + ccc ) ;
//
//		double result = Math.sqrt(-1) ;
//		System.err.println ( " result: " + result ) ;

		System.err.println ( " here" ) ;
	}

}
