import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number Of Choclates: ");
        int M=sc.nextInt();
        System.out.print("Enter the Number of Friends: ");
        int N=sc.nextInt();
        if(M%N==0){
            System.out.println("The "+ M/N +" choclates are divided equally to the friends");
        }else{
            System.out.println("No Choclates are not sufficient to divide equally");
        }
    }
}
