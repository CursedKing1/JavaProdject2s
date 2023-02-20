package methods;

public class test {
    public static void main(String[] args){
        Student ivo = new Student("KST",8);
        ivo.setFaculty("KST");
        ivo.setFacultyNumber(7);

        System.out.println(ivo.getFaculty());
        System.out.println(ivo.getFacultyNumber());

        System.out.println(ivo.takeExam(true));
        if (ivo.getNumberOfSubject() > 5){
            System.out.println("You have no free time ;( ");
        }else{
            System.out.println("You can sign up for some more subjects");
        }


        Student.setUnivercity("Sofia University");
        System.out.println(Student.getUnivercity());

        Student facultyOnly= new Student("Engineer");
        Student facultyNumberOnly= new Student(123) ;

        ivo.setLectureDay(WeekDays.MON);

        //method
        //Student::setUnivercity("Sofia University");

        sum(average(2,3),average(5,10));
        System.out.println();

    }
    public static int average (int a, int b){
        return 20;
    }
    public static int sum(int a,int b){
        return 10;
    }
}

