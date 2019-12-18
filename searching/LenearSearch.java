package searching;

import java.util.Scanner;

public class LenearSearch {
	public static void main(String[] args) {
		int[] arr= {100,101,1,2,3,4,8,6};
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		int i;
		for (i = 0; i < arr.length-1; i++) {
			if(arr[i]==ele)
			{
				System.out.println(ele+" "+"is found");
				break;
				
			}
		}
		if(arr[i]!=ele)
		{
			System.out.println(ele+" "+"is not found");
		}
		sc.close();
	}
}
