
public class KaratsubaMultiplication {

	public static void main(String[] args) {

		
		
		String a , b ;
		
		a = "15" ;
		b = "2" ;
		
		System.out.println( multiply( a , b ) );

	}
	
	public static String shift ( String num , int amount ){
		
		boolean zero = true ;
		
		for ( int i=0 ; i<num.length(); i++ ){
			
			if ( num.charAt(i) != '0' )
				zero = false ;
		}
		
		if ( zero )
			return num ;
		
		for ( int i=0 ; i<amount ; i++ ){
			
			num += '0' ;
		}
		
		return num ;
	}
	
	public static String sub( String num1 , String num2 ){
		
		String res = "" ;
		int x , y , z , borrow = 0 ;
		StringBuilder temp = new StringBuilder ( num1 ) ;
		
		while ( num1.length() < num2.length() ){
			
			num1 = '0' + num1 ;
		}
		
		while ( num2.length() < num1.length() ){
			
			num2 = '0' + num2 ;
		}
		
		for ( int i=num1.length()-1 ; i>=0 ; i-- ){
			
			x = num1.charAt(i) - '0' + borrow ;
			y = num2.charAt(i) - '0' ;
			
			if ( x < y ){
				
				z = ( x + 10 ) - y ;
				res = (char)( z + '0' ) + res ;
				borrow = -1 ;
			}
			else {
				
				z = x - y ;
				res = (char)( z + '0' ) + res ;
				borrow = 0 ;
			}
		
		}
		
		temp = new StringBuilder ( res ) ;
		
		while ( temp.length() > 1 && temp.charAt(0) == '0' ){
			
			temp.deleteCharAt(0) ;
		}
		
		return temp.toString() ;
	}

	public static String add ( String num1 , String num2 ){
		
		int carry = 0 , x , y , z;
		String res = "" ;
		
		while ( num1.length() < num2.length() ){
			
			num1 = '0' + num1 ;
		}
		
		while ( num2.length() < num1.length() ){
			
			num2 = '0' + num2 ;
		}
		
		for ( int i=num1.length()-1 ; i>=0 ; i-- ){
			
			 x = num1.charAt(i) - '0' ;
			 y = num2.charAt(i) - '0' ;
			 z = x + y + carry ;
			
			if ( z > 9  ){
				
				z -= 10 ;
				res = (char)( z + '0' ) + res ;
				carry = 1 ;
			}
			else {
				
				res = (char)( z + '0' ) + res ;
				carry = 0 ;
			}
			
		}
		
		if ( carry == 1 ){
			
			res = '1' + res ;
		} 
		
		return res ;
	} 

	public static String multiply ( String num1 , String num2 ){
		
		if ( num1.length() == 0 ){
			
			return "" ;
	    }
		
		if ( num1.length() == 1 ){
			
			return Integer.toString ( ( num1.charAt(0) - '0' ) * ( Integer.parseInt(num2) ) ) ;
		}
		
		while ( num1.length() < num2.length() ){
			
			num1 = '0' + num1 ;
		}
		
		while ( num2.length() < num1.length() ){
			
			num2 = '0' + num2 ;
		}
		
		if ( num1.length() % 2 != 0 ){
			
			num1 = '0' + num1 ;
			num2 = '0' + num2 ;
		}
		
		int mid = num1.length()/2 ;
		String a , b , c , d , res1 , res2 , res3 ;
		
		a = num1.substring( 0 , mid ) ;
		b = num1.substring( mid , num1.length()  ) ;
			
		c = num2.substring( 0 , mid ) ;
		d = num2.substring( mid , num1.length() ) ;
			
		res1 = multiply ( a , c ) ;
		res2 = multiply ( b , d ) ;
		res3 = multiply ( add ( a , b ) , add ( c , d ) ) ;
		
		res3 = sub ( res3 , add ( res1 , res2 ) ) ;
		res1 = shift ( res1 , num1.length() ) ;
		res3 = shift ( res3 , mid ) ;
		
		return add ( res1 , add( res2 , res3 ) ) ;
	}
}

// 0 + 5 + ( 5 + 0 )*10^1
// ( 1 + 1 )*( 0 + 5 ) = 0 + 0 + 5 + 5