import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
	
	public static ArrayList < Edge > kruskal ( ArrayList < ArrayList < Integer > > graph ){
		
		ArrayList < Edge > edges = new ArrayList<>();
		ArrayList < Edge > mst = new ArrayList<>();
		
		UnionFind uf = new UnionFind( graph.size() ) ;
		
		for ( int i=0 ; i<graph.size() ; i++ ){
			
			for ( int j=0 ; j<graph.get(i).size() ; j++ ){
				
				if ( (graph.get(i)).get(j) != 100000 ){
					
					Edge e = new Edge ( (graph.get(i)).get(j) , i , j ) ;
					edges.add ( e ) ;
				}
			}
		}
		
		Collections.sort( edges, new Comparator<Edge>(){
			
	        public int compare(Edge x, Edge y) {
	        	
	        	return x.cost - y.cost ;
	        }
	    });
		
		for ( int i=0 ; i<edges.size() ; i++ ){
			
			if ( uf.find( edges.get(i).i ) != uf.find( edges.get(i).j ) ){
				
				uf.union( edges.get(i).i , edges.get(i).j ) ;
				mst.add( edges.get(i) ) ;
			}
		}
		
		return mst ;
	}
	
	public static void main ( String[] args ){
		
		ArrayList < ArrayList < Integer > > graph = new ArrayList<>() ;
		ArrayList < Edge > mst = new ArrayList<>();
		
		int n , num , minCost = 0 ;
		
		Scanner in = new Scanner ( System.in ) ;
		n = in.nextInt() ;
		
		for ( int i=0 ; i<n ; i++ ){
			
			ArrayList < Integer > temp = new ArrayList<>() ;
			
			for ( int j=0 ; j<n ; j++ ){
				
				temp.add( in.nextInt() ) ;
			}
			graph.add ( temp ) ;
		}
		
		mst = kruskal( graph ) ;
		
		System.out.println ( mst ) ;
		
		for ( int i=0 ; i<mst.size() ; i++ ){
			
			minCost += mst.get(i).cost ;
		}
		
		System.out.println( "Minimum Spanning Tree Cost = " + minCost );
	}

}
