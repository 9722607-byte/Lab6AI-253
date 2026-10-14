package ua.opnu.list;

import java.util.Comparator;

public class SurnameSorter implements Comparator<Student> {
    private boolean ascending = true;

    public void toggleDirection() {
        this.ascending = !this.ascending;
    }

    @Override
    public int compare(Student s1, Student s2) {
        int result = s1.getLastName().compareTo(s2.getLastName());
        return ascending ? result : -result;
    }
}