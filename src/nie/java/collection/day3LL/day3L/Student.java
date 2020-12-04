package nie.java.collection.day3LL.day3L;

public abstract class Student {
    private int num;
    private String nume;

    public Student(int num, String nume) {
        this.num = num;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", nume='" + nume + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
