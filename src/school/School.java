package school;

public class School {
 
    public static void main(String[] args) {
        Person charlie = Person.addPerson("Charlie", Person.Gender.Male, 150);
        Person jojo = Person.addPerson("Jojo", Person.Gender.Male, 140);
        Person john = Person.addPerson("John", Person.Gender.Male, 180);
        john.setName("Chris");
        Person clare = Person.addPerson("Clare", Person.Gender.Female, 130);
        Person bob = Person.addPerson("Bob", Person.Gender.Male, 180);
        System.out.println(jojo.getWeight());
        
        Person.printNames();
        Person.printNames(Person.Gender.Male);
        System.out.println(jojo);
                
    }
}
