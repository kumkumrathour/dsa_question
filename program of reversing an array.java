// class searchmax {
// public static void main ( String [] args) 
// {
// }
// }


//problem no. 2 
 import java.util.Scanner;
class arrryExq {
    public static void main (String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( " how many element you want ? ");
        int n = sc.nextInt();
        int[] elt =new int [n];
        for ( int i=0; i<n; i++)
        {
        System.out.println(" enter array element " +(i+1) );
        elt[i]=sc.nextInt();
        }
        System.out.println( " original element are: ") ;
        for(int i=0; i<n;i++)
        {System.out.println(elt[i]+ " ");
        }
        System.out.println( " reversing element are: ") ;
        for(int i=n-1 ; i>=0 ;i--)
        {System.out.println(elt[i]+ " ");
        }}
    public static void method2(){
        int[] a = { 4,5,6,7,8,10,4,3};
        int max = a[0];
        for (int i = 1; i<=a.length; i++ )
        {
        if(max<a[i])
        {
        max=a[i];
        }
        }
        System.out.println(" maximum element is "+max);

    }
}