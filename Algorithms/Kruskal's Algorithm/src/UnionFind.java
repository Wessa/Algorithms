
public class UnionFind {

	private int[] parent ;
	private int[] rank ;
	private int size ;
	
	public UnionFind ( int n ){
		
		size = n ;
		parent = new int[size] ;
		rank = new int[size] ;
		
		for ( int i=0 ; i<n ; i++ ){
			
			parent[i] = i ;
			rank[i] = 0 ;
		}
	}
	
	public int find ( int i ){
		
		if ( parent[i] == i ){
			
			return i ;
		}
		
		int res = find ( parent[i] ) ;
		
		parent[i] = res ;
		
		return res ;
	}
	
	public int union ( int i , int j ){
		
		int idx , jdx , irank , jrank ;
		
		idx = find( i ) ;
		jdx = find( j ) ;
		
		irank = rank[idx] ;
		jrank = rank[jdx] ;
		
		if ( idx == jdx ){
			
			return idx;
		}
		else if ( irank < jrank ){
			
			parent[idx] = jdx ;
			return jdx ;
		}
		else if ( jrank < irank ){
			
			parent[jdx] = idx ;
			return idx ;
		}
		else {
			
			parent[idx] = jdx ;
			rank[jdx] ++ ;
			return idx ;
		}
	}
	
	public void print(){
		
		
	} 
}
