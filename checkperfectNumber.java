import java.util.Scanner;

public class checkperfectNumber {
    public static void main(String[] args) {
        

        // here when any number divide the that number then and sum will be equal then it will be Perfect Number....
        int num , i , sum=0;

        System.out.println("Enter number --");
        Scanner sc =new Scanner(System.in);

        num = sc.nextInt();

        for(i = 1 ; i<num ; i++){
            if(num % i ==0){
                sum = sum+i;
            }
        }
        if(sum == num){
            System.out.println(num + " "+ "This number is perfect number");
        }
        else{
            System.out.println(num + " "+ "This number is not perfect number");
        }

    }
}
