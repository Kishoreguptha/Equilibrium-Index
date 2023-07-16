import java.util.Scanner;

public class Array_equilibrium {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for (int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int pre_array[]=pre_sum(array);
        int val=eqiui(pre_array);
        System.out.println(val);
    }
    public static int []pre_sum(int array[])
    {
        int i;
        int pre_array[]=new int[array.length];
        pre_array[0]=array[0];
        for( i=1;i<array.length;i++);
        {
            pre_array[i]=pre_array[i-1]+array[i];
        }
        return pre_array;
    }
    public static int eqiui(int []array)
    {
        int per_array[]=new int[array.length];
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<array.length;i++)
        {
            if(array[i-1]==array[array.length-1]-array[i])
            {
                count=count+1;
                if(min>i)
                {
                    min=i;
                }
            }
        }
        if(count==0)
        {
            return -1;
        }
        return min;
    }

}