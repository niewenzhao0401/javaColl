package nie.java.collection.day3;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private int num;
    protected String name;

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return num == student.num &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

/*

//当hash值出现重复 叫用equal  进行内容判断,效率低,安全
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return num == student.num &&
//                Objects.equals(name, student.name);
//    }



    //重写object类中的hashcode()  来自己根据对象中包含的内容计算hash值
    //效率高会出现重复
//    @Override
//    public int hashCode() {
//        return Objects.hash(num, name);
//    }



*/

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
    重写 添加元素 比较元素大小
    //用哪个属性比较 那个属性不能重复
     */
    @Override
    public int compareTo(Student o) {
        return this.num - o.num;
    }


    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
