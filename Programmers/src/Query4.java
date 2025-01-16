// https://school.programmers.co.kr/learn/courses/30/lessons/181922

public class Query4 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,3};
    	int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        int[] answer = arr;
        for(int[] query : queries){
            int n1 = query[0];
            int n2 = query[1];
            int k  = query[2];
            
            for(int i=n1; i<=n2; i++){
                if(arr[i]%k==0){
                    arr[i]++;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(arr[i]);        	
        }
	}
	
}
