import java.util.*;

public class practise_4_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a year");
        int year = scan.nextInt();
        if(year%4 == 0){
            System.out.println(year + " is a leap year");
}

else{
    System.out.println(year + " is not a leap year");
}

scan.close();
    }
    
}
