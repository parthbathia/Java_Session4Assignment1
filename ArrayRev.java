import java.io.*;

public class ArrayRev {

	public static void main(String[] args) throws Exception {
		
		int[] a = new int[5];
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.print("Enter 5 numbers : ");
		
		for(int i=0; i<5; i++){
			
			a[i] = Integer.parseInt(br.readLine());
			
		}
		System.out.println("Entered Array is : ");
		for(int i=0; i<a.length; i++){
			
			System.out.println(a[i]);
			
		}
		System.out.println("Reverse of the Array is");
		for(int i=a.length-1; i>=0; i--){
			
			System.out.println(a[i]);
			
		}

	}

}
