import java.util.*;
public class Trace {
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of matrix");
            int m = sc.nextInt();
            int A1[][] = new int[m][m];
            double sum = 0;

            System.out.println("Enter elements in matrix");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A1[i][j] = sc.nextInt();
                }
            }

            System.out.println("The Trace of the above matrix is ");
            for(int i = 0; i < m; i++)
            {  
                    for(int j = 0; j < m; j++)
                    {
                        if(i == j)
                        {
                            sum = sum + (A1[i][j]);
                        }
                    }
            }
            System.out.println(sum); 
        }
    }