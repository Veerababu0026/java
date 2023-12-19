import java.util.Scanner;
class Subarray 
{
    public static void main(String[] args) 
	{
        Scanner s= new Scanner(System.in);
	System.out.println("length of the array:");
        int n= s.nextInt();
	int[] a=new int[n];
	System.out.println("elements of the array:");
	for (int i=0;i<n;i++) 
	{
            a[i]=s.nextInt();
        }
	int largest=array[0];
        int m = 0, l = 0;
	for (int i = 0; i <n; i++) 
	{
            int sum = 0;
            for (int j = i; j < n; j++) 
		{
                sum += a[j];
                if (sum > largest) {
                    m = i;
                    l = j;
                    largest = sum;
                }
            }
        }

        System.out.println("\nThe largest contiguous subarray is:");

        for (int z = m; z <= l; z++) {
            System.out.print(a[z] + " ");
        }

        System.out.println("\nThe sum of the largest contiguous subarray is: " + largest);
    }
}