package hus.oop.midterm.students;

public class AverageComparison implements StudentComparator {
    @Override
    public int compare(Student first, Student second) {
        return Double.compare(first.average, second.average);
    }
}
