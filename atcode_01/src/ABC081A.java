import java.util.*; 
public class ABC081A {
    public static void main(String[] args) throws Exception {
        Scanner sca =new Scanner(System.in);
        String input_a = sca .next();
        System.out.println(input_a);
        char[] arrayA = input_a.toCharArray();
        int count = 0;
        for (int i=0; i<input_a.length();i++){
            System.out.println(arrayA[i]);
            if (arrayA[i] == '1'){
                System.out.println(arrayA[i]);
                count = count+1;
            }
        }
        System.out.println(count);    
        }
        
}
