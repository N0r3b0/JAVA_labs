package wyklad_09_11;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student alexey = new Student();
        alexey.nazwisko = "Ćwiklińska";
        alexey.dataUr = "1800-04-12";

        Student wiktor = new Student();
        wiktor.nazwisko = "Ćwiklińska";


        ArrayList<Student> listaStudentow = new ArrayList<>();
        listaStudentow.add(alexey);
        listaStudentow.add(wiktor);
        listaStudentow.add(new Student());
        listaStudentow.get(1).średnia=4.99;
        for (int i=0; i<listaStudentow.size(); i++) {
            System.out.println(listaStudentow.get(i));
        }
        System.out.println("=============================");
        listaStudentow.sort(Student.comp);
        for (int i=0; i<listaStudentow.size(); i++) {
            System.out.println(listaStudentow.get(i));
        }
    }
}