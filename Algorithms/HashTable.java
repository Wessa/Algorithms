import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HashTable {

	private Integer[] table ;
	private int a , b , m , p ;
	
	public HashTable ( int capacity ){
		
		this.m = capacity ;
		
		Random random = new Random();
		
		int i = 0 ;
		
		Integer primes[] = { 2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 
				, 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 , 101 , 103 , 107 , 109 , 113 , 127 , 131 
				, 137 , 139 , 149 , 151 , 157 , 163 , 167 ,  173 , 179 , 181 , 191 , 193 , 197 , 199 
				, 211 , 223 , 227 , 229 , 233 , 239 , 241 , 251 , 257 , 263 , 269 , 271 , 277 , 281 , 283 
				, 293 , 307 , 311 , 313 , 317 , 331 , 337 , 347 , 349 , 353 , 359 , 367 , 373 , 379 , 383 
				, 389 , 397 , 401 };
		
		do {
			i = random.nextInt( primes.length - 1 ) ;
		}
		while ( primes[i] <= m ) ;
		
		p = primes[i] ;
		
		a = random.nextInt ( p - 1 ) + 1 ;
		b = random.nextInt ( p - 1 ) ;
		
		table = new Integer[capacity] ;
	}

	private int hash ( int key , int i ){
		
		return ( ( ( (a * key) + b ) % p ) + i ) % m ;
	}
	
	public int insert ( int key ){ 
		
		int i = 0 ;

		while ( i < m ){

			int j = hash ( key , i ) ;
			
			//System.out.println( j );
			
			if ( this.table[j] == null ){

				table[j] = key ;
				return j ;
			}

			i ++ ;
		}

		return -1 ;
	}
	
	public int search ( int key ){

		int i = 0 , j ;

		do {
			
			j = hash ( key , i ) ;

			if ( table[j] == key ){
	
				return j ;
			}

			i ++ ;
		} 
		while ( i < m ) ;

		return -1 ;
	}
	
	public boolean delete ( int key ){
		
		int idx = search ( key ) ;
		
		if ( idx != -1 ){
			
			table[idx] = null ;
			return true ;
		}
		
		return false ;
	}
	
	public String toString (){
		
		return Arrays.toString ( table ) ;
	}
	
}
