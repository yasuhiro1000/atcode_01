import java.util.*;
public class ABC086A {
    public static void main(String[] args) throws Exception {
        Scanner sca =new Scanner(System.in);
        int input_a = sca .nextInt();
        System.out.println(input_a);
        int input_b = sca.nextInt();
        if (input_a * input_b % 2 == 0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");    
        }
        }
}
