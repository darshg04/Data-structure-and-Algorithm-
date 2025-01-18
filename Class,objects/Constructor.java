import java.util.Scanner;//Packages

class calculator{//class
    double a;
    double b;
    calculator(double x,double y){// declaring Constructor of class
        a=x;
        b=y;
    }

    double add(){//methods
        return a+b;
    }

    double sub(){
        return a-b;
    }

    double  div(){
        return a/b;
    }

    double multi(){
        return a*b;
    }

    double modulo(){
        return a%b;
    }
    
}

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number:");
        double a = sc.nextDouble();
        System.out.println("Enter the Second number:");
        double b = sc.nextDouble();
        System.out.println();

        calculator obj1 = new calculator(a,b);//Object

        System.out.println("The addition of "+a+" and "+b+" is "+obj1.add());
        System.out.println("The subtraction of "+a+" and "+b+" is "+obj1.sub());
        System.out.println("The divison of "+a+" and "+b+" is "+obj1.div());
        System.out.println("The multiplication of "+a+" and "+b+" is "+obj1.multi());
        System.out.println("The modulation of "+a+" and "+b+" is "+obj1.modulo());

    }
}