package _1006.studentlist;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        this.students.add("최아영");
    }

    public List<String> getStudents() {
        return students;
    }
}
