package Questions;
public class scopeofvariables {
    static int i;//initialization of globle variable
    public static void main(String[] args) {
        i=4;
        System.out.println(i);//globle variable
        int i=3;//local variable of main function
        System.out.println(i);//local variable
        scope();
    }
    public static void scope(){
        System.out.println(i);//globle variable
        int i=2;//local variable of scope function
        System.out.println(i);//local variable
    }
}