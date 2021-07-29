import java.util.*; 
import java.lang.*; 
class Main 
{ 


 public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        float a, b, c, x1, x2, discriminant, realPart, imaginaryPart;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        discriminant = b*b - 4*a*c;
        
        if (discriminant > 0) {
        x1 = (-b + (float)Math.sqrt(discriminant)) / (2*a);
        x2 = (-b - (float)Math.sqrt(discriminant)) / (2*a);
        System.out.printf("root1 = %.2f  ",x1);
        System.out.printf("root2 = %.2f",x2);
        }
        else if (discriminant == 0) {
        x1 = (-b + (float)Math.sqrt(discriminant)) / (2*a);
        System.out.printf("root1 = %.2f  ",x1);
        System.out.printf("root2 = %.2f ",x1);
    }
    else {
        realPart = -b/(2*a);
        imaginaryPart =(float)Math.sqrt(-discriminant)/(2*a); 
        System.out.printf("root1 = %.2f + %.2fi  ",realPart,imaginaryPart);
        System.out.printf("root2 = %.2f - %.2fi",realPart,imaginaryPart);
    }


    } 
} 