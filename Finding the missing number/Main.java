import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++){
            arr[idx] = sc.nextInt();
        }
        int missing_val = 0;
       
        for(int val = 1; val <= n; val++)
        {
            boolean is_found = true;
            for(int indx = 0; indx <= n - 1; indx++){
                if(arr[indx] == val)
                {
                    is_found = false;
                    break;
                }
            }
            if(is_found == true){
                missing_val = val;
                break;
            }
        }
        System.out.print(missing_val);
    }
} 
