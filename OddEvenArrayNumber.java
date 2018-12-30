package assignmentPrograms;

public class OddEvenArrayNumber {

	public static void main(String args[]) {
/*
		int a[] = { 3, 6, 7, 12, 4 };
		// System.out.println("odd numbers are:");
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 != 0) {
				System.out.println("The odd number is:" + a[i]);
				for (int i = 0; i < a.length; i++)
					if (a[i] % 2 == 0)
						System.out.println("the even number is:" + a[i]);

			}*/
		 int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 91};
         System.out.println("Given array elements:");
         for (int i=0; i<arr.length; i++ )
         {
                 System.out.print(arr[i]+" ");
         }
         System.out.println("\n=======================");
         System.out.println("\nEven number of the array:");
         for (int i = 0;i<arr.length ;i++ )
         {
                 if (arr[i]%2 == 0)
                 {
                         System.out.print(arr[i]+" ");
                 }
         }
         System.out.println("\n==============");
         System.out.println("\nOdd number of the array:");
         for (int i = 0;i<arr.length ;i++ )
         {
                 if (arr[i] % 2 != 0)
                 {
                  System.out.print(arr[i]+" ");
                 }
         }
         System.out.println("\n==============");
 }
}