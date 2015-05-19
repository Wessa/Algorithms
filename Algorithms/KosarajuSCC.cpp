//#include <iostream>
//#include <vector>
//
//using namespace std;
//
//vector < vector < int > > ReverseGraph ( vector < vector < int > > & graph ){
//
//     vector < vector < int > > reversed_graph = graph;
//
//     for ( int i = 0; i < graph.size(); i++ ){
//          for ( int j = i+1; j < graph.size(); j++ ){
//              
//			  swap ( reversed_graph[i][j] , reversed_graph[j][i] ) ; //swap every edge going from i to j, to an edge from j to i
//          }
//     }
//     return reversed_graph;
//}
//
//vector<int> finishing_time; //finishing_time[i] = t; finishing time of node number i
//vector<int> label_nodes;  //label_nodes[i] = j; if j is a node number, i is the new number of the node. Needed to rename the nodes before the second DFS
//
//vector<int> leader; //leader[i] = the leader node in the component containing the node i
//vector<bool> visited; //visited[node] = true, if node is already visited or explored
//int leader_node , current_time;
//
//void DFS ( vector < vector < int > > & graph , int node ){
//
//     visited[node] = true;
//     leader[node] = leader_node;
//
//     for (int i = 0 ; i<graph[node].size() ; i++ ){ // exploring all neighbor nodes of "node"
//          
//		 if ( graph[node][i] == 0 ){
//
//			 continue;
//		 }
//          
//		 int next_node = i;
//          
//		 if ( visited[next_node] == false ){
//              DFS ( graph , next_node );
//         }
//     }
//
//     finishing_time[node] = current_time ++ ; //setting the finishing time of "node" with the current time and incremeting the current time
//}
//
//void DFSLoop ( vector < vector < int > > & graph ){
//	 
//	 int n = graph.size();
//     current_time = 0;
//     visited = vector<bool>( n , false ); //initially, all nodes are not visited yet
//
//     for ( int i = n-1 ; i>=0 ; i-- ){
//          int current_node = label_nodes[i]; //iterating over all nodes in descending order
//
//          if ( visited[current_node] == false ) {
//               // if current node is not visited, mark it as leader node and start exploring from it
//               leader_node = current_node ;
//               DFS ( graph , current_node ) ;
//          }
//     }
//}
//
//vector < vector < int > > KosarajuSCC ( vector < vector < int > > & graph ){
//
//	int n = graph.size() ;
//
//	vector < vector < int > > res ;
//
//	finishing_time = vector <int>(n,0) ;
//	label_nodes = vector <int>(n) ;
//	leader = vector <int>(n,0) ;
//
//	for ( int i=0 ; i<n ; i++ ){
//		label_nodes[i] = i ;
//	}
//
//	vector < vector < int > > reversed_graph = ReverseGraph ( graph ) ;
//
//	DFSLoop ( reversed_graph ) ;
//	DFSLoop ( graph ) ;
//
//	for ( int i=0 ; i<leader.size() ; i++ ){
//
//		vector < int > component ;
//		int temp = leader[i] ;
//
//		for ( int j=i ; j<leader.size() ; j++ ){
//
//			if ( leader[j] != -1 && leader[j] == temp ){
//				
//				component.push_back(j+1) ;
//				leader[j] = -1 ;
//			}
//		}
//
//		if ( component.size() > 0 ){
//
//			res.push_back(component) ;
//		}
//	}
//
//	return res ;
//}
//
//int main(){
//
//     //freopen("in.txt", "rt", stdin);
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
//     vector < vector <int> > res = KosarajuSCC( graph );
//     
//	 for (int i = 0; i <res.size(); i++ ){
//		  
//		 cout << "Component #" << i + 1 << " : " ;
//
//         for (int j = 0; j <res[i].size(); j++){
//              cout << res[i][j] << " " ;
//		 }
//		 cout << endl ;
//	 }
//}
