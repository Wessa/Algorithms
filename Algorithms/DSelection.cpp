//#include <iostream>
//#include <algorithm>
//
//using namespace std;
//
//int partition ( int arr[] , int len , int pivot ){
//	
//	int pivIdx = 0 ;
//
//	for ( int i=0 ; i<len ; i++ ){
//		
//		if ( arr[i] == pivot ){
//			
//			int pivIdx = i ;
//			break ;
//		}
//	}
//
//	swap ( arr[0] , arr[pivIdx] ) ;
//
//	int i = 1 ;
//
//	for ( int j=i ; j<len ; j++ ){
//		
//		if ( arr[j] < pivot ){
//			
//			swap ( arr[j] , arr[i] ) ;
//			i ++ ;
//		}
//	}
//
//	swap ( arr[0] , arr[i-1] ) ;
//
//	return i - 1 ;
//}
//
//int dSelect ( int arr[] , int len , int i ){
//
//	if ( len <= 5 ){
//		
//		sort ( arr , arr + len ) ;
//		return arr[i] ;
//	}
//
//	int medians_len = ( len + 4 ) / 5 ;
//	int * medians = new int [ medians_len ] ;
//	int mini ;
//
//	for ( int i=0 , j=0 ; i<len ; i += 5 , j++ ){
//		
//		mini = min ( 5 , len - i ) ;
//		medians[j] = dSelect ( arr + i , mini , mini/2 ) ;
//	}
//
//	int pivIdx = dSelect ( medians , medians_len , medians_len/2 ) ;
//
//	if ( pivIdx == i ){
//
//		return arr[i] ;
//	}
//	else if ( pivIdx > i ){
//		
//		return dSelect ( arr + pivIdx , len - pivIdx , i - pivIdx ) ;
//	}
//	else {
//		
//		return dSelect ( arr , pivIdx - 1 , i ) ;
//	}
//
//}
//
//int main(){
//	
//	int arr[5] = { 13 , 0 , 65 , 6 , 10 } ;
//	int i ;
//
//	cout << "i = " ;
//	cin >> i ;
//
//	cout << i << "th element = " << dSelect ( arr , 5 , i - 1 ) << endl ;
//
//	return 0;
//}
