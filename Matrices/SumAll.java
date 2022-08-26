import java.util.*;
public class SumAll {
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of matrix");
            int m = sc.nextInt();
            int A1[][] = new int[m][m];

            System.out.println("Enter elements in matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A1[i][j] = sc.nextInt();
                }
            }
            
            int sum=0;

            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    sum += A1[i][j];
                }
            }

            System.out.println("The sum of all elements in the matrix is: "+sum);

        }
    } 