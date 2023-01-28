import java.util.*;
public class ABC286_B {
        public static void  main(String[] args) {
            Scanner sca = new Scanner(System.in);
            int input_N=sca.nextInt();
            String input_S=sca.next(); 
            String[] array=new String[input_N+2];
            String array_A;
            for (int p=0;p<input_N;p++){
                array_A=String.valueOf(input_S.charAt(p));
                array[p]=array_A;
            }

            for (int i = 1;i<input_N;i++){
                if ((array[i-1].equals("n"))&&(array[i].equals("a"))){
                    array[i-1]="ny";
            }
        }
            StringBuilder kai=new StringBuilder();
            for (int p = 0; p<input_N;p++){
            kai.append(array[p]);
        }   
        System.out.println(kai);    
        sca.close();
        }
        }
