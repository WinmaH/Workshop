/**
 * Created by acer on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hi I'm Winma");
        Main main = new Main();
        Person person = new Person();
        person.setName("winma");
        person.setE_mail("winma2014al@gmail.com");
        //System.out.println(person);
        System.out.println(main.savePerson(person));
        //System.out.println(person.getName());
    }
    public Person savePerson(Person p){
        if (p==null){
            throw new IllegalArgumentException();
        } else{
            p.setId("p100");
           // return p;
        }
        return p;
    }
}
