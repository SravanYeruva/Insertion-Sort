import java.util.Scanner;  //This code created by Sravan Yeruva
class InsertionSort { 
	void sort(int array[]) 
	{ 
		int n = array.length; 
    //This code created by Sravan Yeruva
		for (int i = 1; i < n; ++i) { 
			int key = array[i]; 
			int j = i - 1;   //This code created by Sravan Yeruva
			while (j >= 0 && array[j] > key) {   //This code created by Sravan Yeruva
				array[j + 1] = array[j]; 
				j = j - 1; 
			} 
			array[j + 1] = key; 
      //This code created by Sravan Yeruva
		}   //This code created by Sravan Yeruvav  //This code created by Sravan Yeruva
	} 
public static void main(String args[]) 
{ 
int k;
System.out.println("Please enter the size of the array:");
Scanner inputobject = new Scanner(System.in);
int Size = inputobject.nextInt();
//This code created by Sravan Yeruva
int array[] =new int[Size] ;
System.out.println("Please enter "+Size+ " no.of elements:" );
		for( k = 0; k < Size;k++)
{  //This code created by Sravan Yeruva
int w = inputobject.nextInt();
array[k] = w;
}  //This code created by Sravan Yeruva

		InsertionSort ob = new InsertionSort(); 
		ob.sort(array);   //This code created by Sravan Yeruva
System.out.println("Array after performing Insertion Sort:");
		for (int i = 0; i < Size; i++) 
			System.out.print(array[i] + " ");   //This code created by Sravan Yeruva

		System.out.println(); 

	} 
}
