import java.util.ArrayList;
import java.util.List;

public class Runtime_database
{
    private List<Student> StudentList = new ArrayList<>();
    private List<Teacher> _teachers = new ArrayList<Teacher>();

    public void addStudent(Student student)
    {
        StudentList.add(student);
    }

    public void updateStudent(int inputID, Student updatedInfo)
    {
        StudentList.replaceAll( e -> e.getUserID() == inputID? updatedInfo : e);
    }

    public void removeStudent(int inputID)
    {
        StudentList.removeIf(e -> e.getUserID() == inputID);
    }

    public void displayStudentList()
    {
        for (Student studentEntry : StudentList)
        {
            studentEntry.displayStudentInfo();
        }
    }

    public void addTeacher(Teacher teacher)
    {
        _teachers.add(teacher);
    }

    public void updateTeacher(int ID, Teacher entry)
    {
        _teachers.replaceAll(e -> e.getUserID() == ID ? entry : e);
    }

    public void deleteTeacher(int Id) {
        _teachers.removeIf(entry -> entry.getUserID() == Id);
    }

    public void viewAllTeachers() {
        for (Teacher entry : _teachers) {
            entry.DisplayEntry();
        }
    }
}
