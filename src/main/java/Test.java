
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int end=arr.length;
		
		System.out.println("original array");
		for(int i=0; i<end; i++){
		System.out.println(arr[i]);
		}
		
		System.out.println("Reversing Array");
		for(int j=0; j<end; j++){
			if(j<end-j){
			int temp=arr[j];
			arr[j]=arr[end-1-j];
			arr[end-1-j]=temp;
			}
			System.out.println(arr[j]);			
		}
	}
}
