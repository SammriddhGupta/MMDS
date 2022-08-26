import java.util.*;
public class SumDiag {
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

            int sumOfDiagonal1=0;
            for (int i = 0, j =0; i< m && j < m; i++, j++) 
            {
                sumOfDiagonal1= sumOfDiagonal1 + A1[i][j];               
            }
           
           int sumOfDiagonal2=0;
           for (int i=0,j=m-1 ; i<m && j>=0 ; i++, j--) 
           {
                  sumOfDiagonal2= sumOfDiagonal2 + A1[i][j];
                  
           }
            System.out.println("The Sum of both diagonals of the above matrix is "+(sumOfDiagonal1+ sumOfDiagonal2));
        }
    }