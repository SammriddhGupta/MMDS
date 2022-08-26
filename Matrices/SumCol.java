import java.util.*;
public class SumCol {
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

            int rows = A1.length;
            int cols = A1[0].length;
            int sumCol;
            
            for(int i = 0; i < cols; i++)
            {    
                sumCol = 0;    
                for(int j = 0; j < rows; j++){    
                  sumCol = sumCol + A1[j][i];    
                }    
                System.out.println("Sum of " + (i+1) +" Column: " + sumCol);    
            }    
        }
    }
    