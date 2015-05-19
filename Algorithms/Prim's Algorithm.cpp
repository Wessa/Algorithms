//#include <iostream>
//#include <vector>
//#include <algorithm>
//#include <stdio.h>
//#include <functional>
//#include <queue>  
//
//using namespace std;
//
//vector < pair < int , int > > prim ( vector < vector < int > > & graph ){
//
//	int n = graph.size() , minDist , minNode ;
//
//	priority_queue < pair < int , int > , vector < pair < int , int > > , greater < pair < int , int > > > min_queue ;
//
//	vector < pair < int , int > > mst ( n , make_pair ( 1000000 , -1 ) ) ;
//
//	vector < bool > visited ( n , false ) ;
//
//	mst[0].first = 0 ;
//	min_queue.push ( make_pair( 0 , 0 ) ) ;
//
//	for ( int i=0 ; i<n ; i++ ){
//
//		// get the node of minimum distance and the node with minimum distance
//
//		minDist = min_queue.top().first ;
//		minNode = min_queue.top().second ;
//		min_queue.pop() ;
//
//		// calculate minimum distance from minNode to node "i" if "i" is not visited
//
//		for ( int j=0 ; j<n ; j++ ){
//		
//			if ( graph[minNode][j] < mst[j].first && !visited[j] ){ 
//
//				min_queue.push ( make_pair ( graph[minNode][j] , j ) ) ;
//				mst[j].first = graph[minNode][j] ;
//				mst[j].second = minNode ;
//			}
//		}
//
//		// set visited of minNode to true
//
//		visited[minNode] = true ;
//	}
//
//	return mst ;
//}
//
//int main(){
//
//    freopen ( "in.txt" , "rt" , stdin ) ;
//
//    int n , minSum = 0 ;
//    cin >> n ;
//
//    vector < vector < int > > graph ( n , vector < int > ( n , 0 ) ) ;
//	vector < pair < int , int > > mst ;
//
//	for (int i = 0; i < n; i++)
//		for (int j = 0; j < n; j++)
//			cin >> graph[i][j];
//	
//	mst = prim ( graph ) ;
//
//	for ( int i=0 ; i<mst.size() ; i++ ){
//	 
//		cout << "Cost of node # " << i << " = " << mst[i].first << " & parent = node # " << mst[i].second << endl ;
//		minSum += mst[i].first ;
//	}
//
//	cout << "Minimum Spaning Tree Cost = " << minSum << endl ;
//
//	return 0 ;
//}
