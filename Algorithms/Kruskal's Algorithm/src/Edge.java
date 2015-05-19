
public class Edge {
	
	public int cost ;
	public int i ;
	public int j ;
	
	public Edge ( int cost , int i , int j ){
		
		this.cost = cost ;
		this.i = i ;
		this.j = j ;
	}
	
	public String toString(){
		
		return cost + " " + i + " " + j ;
	}
}
