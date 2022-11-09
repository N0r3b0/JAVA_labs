package wyklad_26_10;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Person andrew1 = new Person("Andrew", "Linkoln", "31-10-2009");
        Student andrew = new Student("GMU", "30-09-2022", 2.0);
        andrew.name = "Andrew"; andrew.lastname = "Lincoln"; andrew.birthDate = "31-10-2006";
        System.out.println(andrew);
    }
}
class Person
{
    String name = "default name";
    String lastname = "default last name";
    String birthDate = "00-00-1900";
    static ArrayList<Person> personList = new ArrayList<>();

    public Person (String name, String lastname, String birthDate)
    {
        this.name = name;
        this.lastname = lastname;
        this.birthDate = birthDate;
        personList.add(this);
    }
    public Person(){personList.add(this);}

    @Override
    public String toString()
    {
        return "Name: " + this.name + "\nLast name: " + lastname + "\nBorn: " + birthDate;
    }
}

class Student extends Person
{
    String university = "default university";
    String startingDate = "01-10-2022";
    double avarageGrade = 2;
    ArrayList<Student> listOfStudents = new ArrayList<>();
    public Student(String university, String startingDate, double avarageGrade)
    {
        this.university = university;
        this.startingDate = startingDate;
        this.avarageGrade = avarageGrade;
        listOfStudents.add(this);
    }
    public Student()
    {
        listOfStudents.add(this);
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nUniversity: " + university + "\nDate of start: " + startingDate + "\nAvarage grade " + avarageGrade;
    }
}
