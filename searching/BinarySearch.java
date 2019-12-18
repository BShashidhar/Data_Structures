package searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr= {99,2,6,9,5,7,9,100};
		int high=arr.length-1,low=0,mid=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Element : ");
		int ele=sc.nextInt();
		while(low<=high){
			if(arr[mid]==ele)
			{
				System.out.println(ele+" element is found");
				break;
			}
			else if (arr[mid]<ele) {
				low=mid+1;
				
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if (arr[mid]!=ele) {
			System.out.println(ele+" is element is not found");
		}
		sc.close();

	}

}
