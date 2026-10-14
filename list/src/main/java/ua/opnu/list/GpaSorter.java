package ua.opnu.list;

import java.util.Comparator;

public class GpaSorter implements Comparator<Student> {
    private boolean ascending = true;

    public void toggleDirection() {
        this.ascending = !this.ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = Double.compare(s1.getAvgMark(), s2.getAvgMark());
        return ascending ? result : -result;
    }
}