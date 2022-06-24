public class Person {
    String Name;
    int Age;


    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public void SayHi(){
        System.out.println("Hello mazafaka");
    }

    public int Pensia(int age){
        int p  = 65 - age;
        return p;
    }

    public void sayBye(){
        System.out.println("Good Buy");
    }

}
