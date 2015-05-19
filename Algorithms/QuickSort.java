import java.util.ArrayList;

public class QuickSort {
	
	static int res = 0 ;

	public static void main(String[] args) {
		

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add( 1 ) ;
		arr.add( 4 ) ;
		arr.add( 2 ) ;
		arr.add( 3 ) ;
	
		
		arr = sort( arr , 0 , arr.size()-1 );
		
		System.out.println( res );
		
	}
	
	public static int partition ( ArrayList<Integer> arr , int l , int h ){
		
		int p = arr.get( l ) ;
		int i = l + 1 ;
		int temp ;
		
		for ( int j=i ; j<arr.size() ; j++ ){
			
			if ( arr.get(j) < p ){
				
				temp = arr.get(i) ;
				arr.set( i , arr.get(j) ) ;
				arr.set( j , temp) ;
				i ++ ;
				res ++ ;
			}
		}
		
		temp = arr.get(l) ;
		arr.set( l , arr.get(i-1) ) ;
		arr.set( i-1 , temp ) ;
		
		return i - 1 ;
	}
	
	public static ArrayList<Integer> sort( ArrayList<Integer> arr , int l , int h ){
		
		if ( l < h ){
			
			int pos = partition ( arr , l , h ) ;
			sort ( arr , l , pos - 1 ) ;
			sort ( arr , pos + 1 , h ) ;
		}
		
		return arr ;
	}
	
}
