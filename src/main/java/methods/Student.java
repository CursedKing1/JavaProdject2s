package methods;

public class Student {
    private String faculty;
    private int facultyNumber;
    private static String univercity;


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public Student(int facultyNumber){
        this.facultyNumber = facultyNumber;
    }
    public Student(String faculty){
        this.faculty = faculty;
    }

    public Student(String faculty, int facultyNumber){
        this.faculty = faculty;
        this.facultyNumber = facultyNumber;
    }

    public String takeExam(boolean successCriteria) {
        String result;
        if (successCriteria) {
            result = "Successfully taken the exams ";
        } else {
            result = "I am sad/mad!";

        }
        return result;
    }
    public int getNumberOfSubject(){
        return 12;

    }

    public static String getUnivercity() {
        return univercity;
    }

    public static void setUnivercity(String univercity) {
        Student.univercity = univercity;
    }
    public void setLectureDay(WeekDays dayOfTheWeek){
        switch (dayOfTheWeek){
            case MON -> System.out.println("You have selected Monday. ");
            case THU -> System.out.println("You have selected Tuesday. ");


        }
    }
}