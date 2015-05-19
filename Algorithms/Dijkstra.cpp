//#include <iostream>
//#include <vector>
//#include <algorithm>
//#include <stdio.h>
//
//using namespace std;
//
//int dijkstra ( vector < vector < int > > & graph , int src , int dest ){
//
//	int n = graph.size() ;
//	int MAX = 1000000 , mini = 1000000 , minIdx = -1 ;
//
//	vector <int> distance ( n , MAX ) ;
//	vector <bool> visited ( n , false ) ;
//
//	distance[src] = 0 ;
//
//	while ( src != dest ){
//
//		mini = 1000000 , minIdx = -1 ;
//		
//		// get node number of minimum distance 
//		for ( int i=0 ; i<n ; i++ ){
//			
//			if ( !visited[i] && distance[i] < mini ){
//				
//				minIdx = i ;
//				mini = distance[i] ;
//			}
//		}
//		
//		// update distance of each node
//		for ( int i=0 ; i<n ; i++ ){
//		
//			distance[i] = min ( mini + graph[minIdx][i] , distance[i] ) ;
//		}
//		
//		visited[minIdx] = true ; // set visisted of minimum node to true
//		src = minIdx ;			 // set src to minimum node
//	}
//
//	return distance[dest] ;
//}
//
//int main(){
//
//     freopen("in.txt", "rt", stdin);
//
//     int n;
//     cin >> n;
//
//     vector<vector<int> > graph ( n, vector<int>(n,0) );
//
//     for (int i = 0; i < n; i++)
//          for (int j = 0; j < n; j++)
//               cin >> graph[i][j];
//	
//	 int res = dijkstra ( graph , 1 , 3 ) ;
//
//	 cout << "Shortest Path = " << res << endl ;
//
//}
