import java.util.*;
public class NumDude{
    public static boolean nonRepeat(int n){//To check if the number is repeating or not
        int arr[]=new int [10];
        while(n!=0){
            int d;
            d=n%10;
            arr[d]++;
            n=n/10;
        }
        int num=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=2){
                num=1;
            }
        }
        return (num!=1);
    }
    public static boolean Unique(int n){
        return(nonRepeat(n));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max");
        int m=sc.nextInt();
        System.out.println("Enter min");
        int n=sc.nextInt();
        int c=0;
        System.out.println("THE UNIQUE-DIGIT INTEGERS ARE:");
        for(int i=n;i<=m;i++){
            if(Unique(i)){
                System.out.print(" "+i);
                c++;
            }
        }
        System.out.println();
        if (c!=0)
        System.out.println("THE UNIQUE-DIGIT INTEGERS ARE: "+c);
        else
        System.out.println("THE UNIQUE-DIGIT INTEGERS ARE: Nil");
    }
}
