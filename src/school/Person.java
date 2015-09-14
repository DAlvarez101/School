package school;
import java.util.ArrayList;
public class Person {
    
//    public static int numPeople=10;
//    private static int currentPropleIndex=0;
//    private static Person people[]=new Person[numPeople];
    private static ArrayList<Person> people = new ArrayList<Person>();
    
    enum Gender{
        Male,Female
    }
    private Gender gender;
    private String name;
    private int weight;
    
    
    
    Person()
    {
        name= "No name";
        weight = 150;
        gender = Gender.Male;
    }
    
    Person(String _name,Gender _gender,int _weight)
    {
        name = _name;
        weight = _weight;
        gender = _gender;
    }
    public static Person addPerson(String _name,Gender _gender, int _weight){
        Person temp = new Person(_name,_gender,_weight);
       // people[currentPropleIndex++]= temp;
        people.add(temp);
        return(temp);
    }
    public static void printNames(){
        System.out.println("=====Print Names======");
        for (Person temp: people)
        {
            System.out.println(temp.getName());
        }
    }
    public static void printNames(Gender _gender){
        
        for (Person p: people)
        {
            if (p.getGender()== Gender.Male)
                System.out.println(p.getName());
        }
    }
    public String toString()
    {
        return(name + " || Gender: " + gender+ " || Weight: " + weight);
    }
    public void setName(String _name){
        name=_name;
    }
    public String getName(){
        return(name);
    }
    public void setWeight(int _weight){
        weight=_weight;
    }
    public int getWeight(){
        return(weight);
    }
    public void setGender(Gender _gender){
        gender=_gender;
    }
    public Gender getGender(){
        return(gender);
    }        
}
