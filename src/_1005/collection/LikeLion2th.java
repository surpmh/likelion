package _1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    private List<String> students = new ArrayList<>();

    public LikeLion2th() {
        Names names = new Names();
        this.students = names.names();
    }

    // 학생들의 이름이 들어있는 list를 retur하는 메소드
    public List<String> getStudentList() {
        return this.students;
    }
}

