package lesson8.homeTask2;

public class Demo {
    public Student createHighestParent(){
        Student student = new Student("Stive", "Jobs",5,null);

        return student;
    }

    public SpecialStudent createLowestChild(){
        SpecialStudent specialStudent = new SpecialStudent("Stive","Vozniak",10,null,34543543,"wonderfulStive");

        return specialStudent;
    }
}
