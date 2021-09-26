public class Subject {

    private String Name;
    
    public void display(){
        System.out.println("Hello this is Subjec.java");
    }
    
    public void doSomeThings(int n) {
        System.out.println("This is void doSomeThings with input is int");
    }
    public void doSomeThings(int n, int a) {
        System.out.println("This is void doSomeThings with 2 input");
    }
    public void doSomeThings(String s) {
        System.out.println("This is void doSomeThings with input is String");
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public Subject(Subject a){
        this.Name = a.Name;
    }
    public Subject(){
        setName("Car");
    }
    public Subject(String a){
        setName(a);
    }
    public static void main(String[] args) {
        Subject mySubject = new Subject();
        mySubject.display();
        mySubject.doSomeThings("Hello World");
        mySubject.doSomeThings(5);
        mySubject.doSomeThings(3, 1);
    }
}
