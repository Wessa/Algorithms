//#include <iostream>
//#include <vector>
//
//using namespace std ;
//
//void BFS ( vector < vector < int > > G , int S ){
//	
//	vector < bool > visited ( G.size() , false ) ;
//	vector < int > queue ;
//
//	queue.push_back ( S ) ;
//	visited[S] = true ;
//
//	while ( queue.size() != 0 ){
//		
//		int tempNode = queue[0] ;
//		queue.erase ( queue.begin() + 0 ) ;
//
//		for ( int i=0 ; i<G.size() ; i++ ){
//			
//			if ( G[tempNode][i] == 1 ){
//				
//				visited[i] == true ;
//				queue.push_back ( i ) ;
//			}
//		}
//	}
//}
//
//int main(){
//
//
//}