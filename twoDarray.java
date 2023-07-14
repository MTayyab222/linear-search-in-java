import java.util.Scanner;
public class twoDarray {
    static String search(int arr[][], int search, int row, int col)
    {
      int r1=-1;int c1=-1;
        for (int r=0;r<row;r++)
        {
        for (int c=0;c<col;c++)
        {
            if(arr[r][c]==search)
            {
                r1=r;
                c1=c;
            }
        }

        }if (r1!=-1 && c1!=-1)
        {
            System.out.println("The value is at row "+r1+" and column "+c1);

        }

       return "The value not found";
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int [][]arr;
       int row,column,srch;
        System.out.println("Enter the rows: ");
        row=s.nextInt();
        System.out.println("Enter the columns: ");
        column=s.nextInt();
        arr=new int [row][column];

        System.out.println("Enter the values: ");
        for(int r=0;r<row;r++)
        {
            for (int c=0;c<column;c++)
            {
                arr[r][c]=s.nextInt();
            }
        }

        System.out.println("Values stored in the array: ");
        for (int[]ar:arr)
        {
            for (int element:ar)
            {
                System.out.print(" "+element);
            }
            System.out.println();
        }
        System.out.println("Enter the number you want to print: ");
        srch=s.nextInt();
        String result;
        result=search(arr,srch,row,column);

        //System.out.println("The number is at index: "+search(arr,srch,row,column));
        //demo.linearSearch(arr,srch,row,column);
        //System.out.println(search(arr,srch,row,column);
    }
}
