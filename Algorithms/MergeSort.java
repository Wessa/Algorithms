import java.util.ArrayList;

public class MergeSort {

	public static void main(String[] args) {
		
		 ArrayList<Integer> arr = new ArrayList<Integer>() ;
		 ArrayList<Integer> brr = new ArrayList<Integer>() ;
		 
		 arr.add(1) ;
		 arr.add(0) ;
		 arr.add(2) ;
		 arr.add(5) ;
		 arr.add(4) ;
		 arr.add(6) ;

		 arr = sort ( arr , 0 , 5 ) ;
		 
		 for ( int i=0 ; i<arr.size() ; i++ ){
			 
			 System.out.print( arr.get(i) ) ;
		 }
		 
		 System.out.println() ;
	}
	
	public static ArrayList<Integer> merge ( ArrayList<Integer> a , ArrayList<Integer> b ){
		
		ArrayList<Integer> res = new ArrayList<Integer>() ;
		
		int i = 0 , j = 0 ;
		
		while ( i < a.size() || j < b.size() ){
			
			if ( i == a.size() ){
				
				res.add ( b.get(j) ) ;
				j ++ ; 
			}
			else if ( j == b.size() ){
				
				res.add ( a.get(i) ) ;
				i ++ ; 
			}
			else if ( a.get(i) < b.get(j) ){
				
				res.add ( a.get(i) ) ;
				i ++ ; 
			}
			else {
				
				res.add ( b.get(j) ) ;
				j ++ ; 
			}
			
		}
		
		return res ;
	}

	public static ArrayList<Integer> sort ( ArrayList<Integer> a , int low , int high ){
		
		int mid = ( low + high )/2 ;
		
		ArrayList<Integer> b = new ArrayList<Integer>() ;
		ArrayList<Integer> c = new ArrayList<Integer>() ;
		ArrayList<Integer> res = new ArrayList<Integer>() ;
		
		if ( low == high ){
			
			res.add ( a.get(low) ) ;
			return res ;
		}

		b = sort ( a , low , mid ) ;
		c = sort ( a , mid + 1 , high ) ;
		
		res = merge ( b , c );
		
		return res ;

	}
}
