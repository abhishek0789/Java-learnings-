import java.util.*;
public class practise_5_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int fac = 1;
        int i = num;
        while(i>0){
          fac *= i;
          i--;
        }
        System.out.println(fac);


    }

    
}
