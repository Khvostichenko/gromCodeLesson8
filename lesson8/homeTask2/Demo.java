package lesson8.homeTask2;

public class Demo {

    Course[] courses = {};

    public Student createHighestParent(){
        Student student = new Student("Stive", "Jobs",5,courses);

        return student;
    }

    public SpecialStudent createLowestChild(){
        SpecialStudent specialStudent = new SpecialStudent("Stive","Vozniak",10,courses,34543543,"wonderfulStive");

        return specialStudent;
    }
}
