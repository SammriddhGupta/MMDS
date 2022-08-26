    import java.util.*;
    public class Add
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of matrix 1");
            int m = sc.nextInt();
            int A1[][] = new int[m][m];

            System.out.println("Enter elements in matrix 1 ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    A1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter size of matrix 2");
            int n = sc.nextInt();
            int A2[][] = new int[n][n];

            System.out.println("Enter elements in matrix 2 ");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    A2[i][j] = sc.nextInt();
                }
            }
            
            int A3[][] = new int[m][n];

            System.out.println("Sum of both matrices is");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    A3[i][j] = A1[i][j]+A2[i][j];
                    System.out.print(A3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
