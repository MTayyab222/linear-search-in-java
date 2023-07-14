import java.util.Scanner;
public class demo{
     static int linearSearch(int[]arr,int srch,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==srch){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int []arr1={1,2,3,3,5};
        int search;
        int start,end;

        System.out.println("Enter the starting index:");
        start=s.nextInt();
        System.out.println("Enter the ending index: ");
        end=s.nextInt();
        //demo.linearSearch(arr1,search);
        System.out.println("Enter the number you want to Search: ");
        search=s.nextInt();
        System.out.println(search+" :Key is found at the index "+linearSearch(arr1,search,start,end));
    }
}