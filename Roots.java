import java.io.*;
import java.util.*;

class Roots{
    public static void main (String args[]){
        double a,b,c,d;
        System.out.println("Enter values of a,b,c in the form aX^2 + bX + c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = (b*b) - (4 * a * c);

        if (d == 0){
            double root;
            root = -b/(2*a);
            System.out.println("Roots are same and are :"+root+" ,"+root);
        }
        else if (d > 0){
            double root1, root2;
            root1 = ((-b + Math.sqrt(d))/(2*a));
            root2 = ((-b - Math.sqrt(d))/(2*a));

            System.out.println("Roots are distinct and are :"+root1+" ," + root2);
        }
        else{
            double r,i;
            r = -b/(a*2);
            i = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are imaginary and are :"+r+ "+" +i+"i ,"+r+"-"+i+"i");
        }
    }
}