public class Main {

	public static void main(String[] args) {
	
		int[] A = new int[] {3,1,2,4,3};
		System.out.print(solution(A));
	}
	
	public static int solution(int[] A) {
		
		int c=0;
		int temp=0;
		int temp2=0;
		int res=0;
		for(int i=0;i<A.length;i++) {
			c++;
		}
		
		int[] arr = new int[c-1];
		
		for(int i=0;i<A.length;i++) {
			temp2=0;
			temp += A[i];
			for(int j=i+1;j<A.length;j++) {
				temp2 += A[j];
			}
			if(i<arr.length) {
			res=temp-temp2;
				if(res<0) {
					res=res*(-1);
				}
			arr[i]=res;
			}
		}
		temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[0];
	}

}
