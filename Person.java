public class Person{
    
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate){
        this.name= name;
        this.birthDate= birthDate;
    }
    public String toString(){
        return "Name: " + name + " birthday: " + birthDate.toString();
    }
    public static void main(String[] args){
        Date NamBirthday= new Date(1,12,1997);
        Person Nam = new Person("Nam", NamBirthday);
        System.out.print(Nam.toString());
    }
}