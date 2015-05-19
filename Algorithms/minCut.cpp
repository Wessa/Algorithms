//#include <iostream>
//#include <algorithm>
//#include <vector>
//#include <time.h>  
//
//using namespace std ;
//
//int minCut ( vector < vector < int > > G ){
//
//	srand (time(NULL));
//
//	int nodeX , nodeY , x , y ;
//	vector < int > remainingNodes ;
//
//	for ( int i=0 ; i<G.size() ; i++ ){
//
//		remainingNodes.push_back ( i ) ;
//	}
//
//	while ( remainingNodes.size() > 2 ){
//
//		x = remainingNodes[ rand() % remainingNodes.size() ] ; // random node index 
//		y = remainingNodes[ rand() % remainingNodes.size() ] ; // random node index 
//
//		while ( x == y ){
//
//			x = remainingNodes[ rand() % remainingNodes.size() ] ;
//			y = remainingNodes[ rand() % remainingNodes.size() ] ;
//		}
//		
//		nodeX = remainingNodes[x] ; // random node
//		nodeY = remainingNodes[y] ; // random node
//
//		if ( G[ nodeX ][ nodeY ] > 1 ){
//
//			G[ nodeX ][ nodeY ] -= 1 ;
//			G[ nodeY ][ nodeX ] -= 1 ;
//		}
//
//		else {
//
//			for ( int i=0 ; i<G.size() ; i++ ){
//			
//				G[ nodeX ][i] += G[ nodeY ][i] ;
//				G[i][ nodeX ] += G[i][ nodeY ] ;
//
//				G[i][ nodeY ] = G[ nodeY ][i] = 0 ;
//			}
//
//			G[ nodeX ][ nodeX ] = 0 ;
//
//			remainingNodes.erase( remainingNodes.begin() + nodeY ) ;
//		}
//	}
//
//	return G[ remainingNodes[0] ][ remainingNodes[1] ] ;
//}
//
//int main (){
//
//	vector < vector < int > > G ( 3 );
//
//	G[0].push_back(0);
//	G[0].push_back(2);
//	G[0].push_back(1);
//
//	G[1].push_back(2);
//	G[1].push_back(0);
//	G[1].push_back(1);
//
//	G[2].push_back(1);
//	G[2].push_back(1);
//	G[2].push_back(0);
//
//	
//	cout << minCut ( G ) << endl ;
//
//return 0 ;
//}