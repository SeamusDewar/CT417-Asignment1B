import java.util.ArrayList;
import org.joda.time.DateTime;
import org.example.*;


public class CoursePopulator {
    public static void main(String[] args) {
        DateTime start = new DateTime("2022-09-05");
        DateTime end = new DateTime("2023-09-05");

        Student student1 = new Student("James Duggan", "10/04/2001", 21, 203948324);
        Student student2 = new Student("Jack Sullivan", "25/05/2000", 22, 234234432);
        Student student3 = new Student("John Cunningham", "16/06/2001", 21, 33756543);
        Student student4 = new Student("Christina Heaney", "18/01/2001", 21, 34656562);
        Student student5 = new Student("Jade Harnette", "15/04/1998", 24, 25626565);
        Student student6 = new Student("Mairead Dewar", "11/07/2000", 22, 652366654);

        ArrayList<Student> lawStudents = new ArrayList<>();
        lawStudents.add(student1);
        lawStudents.add(student4);
        lawStudents.add(student6);

        ArrayList<Student> itStudents = new ArrayList<>();
        itStudents.add(student2);
        itStudents.add(student3);
        itStudents.add(student5);

        ArrayList<Student> geoStudents = new ArrayList<>();
        itStudents.add(student1);
        itStudents.add(student2);
        itStudents.add(student4);
        itStudents.add(student5);
        itStudents.add(student6);

        ArrayList<Student> allStudents = new ArrayList<>();
        itStudents.add(student1);
        itStudents.add(student2);
        itStudents.add(student3);
        itStudents.add(student4);
        itStudents.add(student5);
        itStudents.add(student6);

        Lecturer lecturer1 = new Lecturer("Dick Chaney", "16/06/1970", 52, 42354235);
        Lecturer lecturer2 = new Lecturer("Jack McGrath", "04/05/1980", 42, 4566566);
        Lecturer lecturer3 = new Lecturer("James Franco", "07/10/1990", 32, 45656655);

        //String a1 = s1.getUsername();
        //s2.getUsername();
        //s3.getUsername();

        //l1.getUsername();
        //l3.getUsername();

        Module lawModule = new Module("Law", "BA234", lecturer1, lawStudents);
        Module itModule = new Module("IT", "BA756", lecturer2, itStudents);
        Module geoModule = new Module("Geography", "BA485", lecturer3, geoStudents);

        ArrayList<Module> artsModules = new ArrayList<>();
        modules.add(lawModule);
        modules.add(itModule);
        modules.add(geoModule);

        Course arts = new Course("Arts", artsModules, allStudents, start, end);

        System.out.println(arts);
    }
}