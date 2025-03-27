import java.util.Scanner;
public class PerfectSquare{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double numSqrt = Math.sqrt(num);
        if(num==numSqrt*numSqrt){
            System.out.println("It is a perfect square number");
        } else{
            System.out.println("It is not a perfect square number");
        }
    }
}
