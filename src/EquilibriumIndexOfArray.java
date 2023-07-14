import java.util.Scanner;
public class EquilibriumIndexOfArray {
    static int findEquilibriumIndex(int[] array,int size){
        int index=Integer.MAX_VALUE;
        int count=0;
        int p[]=new int[size];
        p[0]=array[0];
        for(int i=1;i<size;i++)
        {
            p[i]=p[i-1]+array[i];
        }
        for(int i=1;i<size;i++)
        {
            if(p[i-1]==(p[size-1]-p[i]))
            {
                count++;
                if(index>i) {
                    index = i;
                }
            }
        }
        if(count==0) {
            return -1;
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int index=findEquilibriumIndex(A,n);
        System.out.println(index);
    }
}

