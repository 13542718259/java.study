package wangdao;

import java.util.Scanner;

import static wangdao.ArrayTool.*;


public class ArrayTool_5_22 {
    public static void main(String[] args) {
        int[] arr={0,1,4,6,8,10,10};
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入需要查找的值");
        int n=sc.nextInt();
        System.out.println("数组中最大值为"+max(arr));
        System.out.println("数组中的最小值为"+min(arr));
        Traversing(arr);
        Inverts(arr);
        System.out.println("第一个为n的元素下标为"+seek1(arr,n));
        System.out.println("最后一个为n的元素下标为"+seek2(arr,n));
    }
}
class ArrayTool{
        public static  int max(int[] a)
        {
            int i=0;
            int max=a[i];
            for(i=0;i<a.length;i++) {
                if (max < a[i])
                    max = a[i];
            }
            return max;
        }

        public static int min(int [] a)
        {
            int i=0;
            int min=a[i];
            for(i=0;i<a.length;i++) {
                if (min > a[i])
                    min = a[i];
            }
            return min;
        }

        public static void Traversing(int[] a)
        {
            int i;
            for(i=0;i<a.length;i++)
            {
                System.out.print(" "+a[i]);
            }
        }

        public static void Inverts(int[] a)
        {
            int[] b = new int[a.length];
            for(int i=a.length-1;i>=0;i--) {
                int j = 0;
                b[j] = a[i];
                System.out.print(" "+b[j]);
                j++;
            }
        }

        public static int seek1(int[] a,int j)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==j)
                    return i;
            }
            return -1;
        }

        public static int seek2(int[] a,int j)
         {
             int k=-1;
            for(int i=0;i<a.length;i++)
             {
                    if(a[i]==j)
                        k=i;
             }
            return k;
        }
}
