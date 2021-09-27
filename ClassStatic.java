public class ClassStatic{
    
    static int counter =0;
    static int count(){
        return counter;
    }
    private String name;

    public ClassStatic(String name){
        counter++;
        this.name = name;
    }

    public static void sayHi(){
        System.out.print("Hi");
    } 

    public static void main(String[] args) {
        System.out.print(ClassStatic.count());// #1 call

        ClassStatic a1 = new ClassStatic("a1");

        System.out.print(a1.count());//#2 call

        ClassStatic a2 = new ClassStatic("a3");

        System.out.print(ClassStatic.count());//#3 call
    }
}

class Hello{

    public static String message="hello world";
    public static void sayHi( String msg){
        System.out.print(msg);
    }
    
    public static void main(String[] args) {
        Hello.sayHi("hi");
        System.out.print(Hello.message);
    }
}