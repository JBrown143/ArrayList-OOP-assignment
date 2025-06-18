import java.util.ArrayList;

public class Classroom {

    private String className;
    private String instructorName;
    private ArrayList<String> students;

    public Classroom(String classname, String instructorName) {
        this.className = classname;
        this.instructorName = instructorName;
        this.students = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

        public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }
    public void addstudent(String student){
        this.students.add(student);
    }
}