
import java.util.Scanner;


public class Spiral_Printing 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int r=sc.nextInt();
        System.out.println("Enter column size:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int rowno=0;
        int colno=0;
        while(rowno < r && colno < c)
        {
            for(int i=colno;i<c;i++)
            {
                System.out.print(a[rowno][i]+" ");
            }
            rowno++;
            for(int i=rowno;i<r;i++)
            {
                System.out.print(a[i][c-1]+" ");
            }
            c--;
            if(rowno < r)
            {
                for(int i=c-1;i>=colno;i--)
                {
                    System.out.print(a[r-1][i]+" ");
                }
                r--;
            }
            if(colno < c)
            {
                for(int i=r-1;i>=rowno;i--)
                {
                    System.out.print(a[i][colno]+" ");
                }
                colno++;
            }
        }
    }
    
}
