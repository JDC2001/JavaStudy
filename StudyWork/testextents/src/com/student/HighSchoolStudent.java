package com.student;
class Student {
    public String name;
    public int age;
    public char gender;
    public double score;
    public String className;

    public Student(String name, int age, char gender, double score, String className) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.score = score;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void queryInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("成绩：" + score);
        System.out.println("班级：" + className);
    }
}




public class HighSchoolStudent extends Student {
    private int gradeLevel;

    public HighSchoolStudent(String name) {
        super(name, age, gender, score, className);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void queryInfo() {
        super.queryInfo();
        System.out.println("年级：" + gradeLevel);
    }


}

class Test {
    public static void main(String[] args) {
        HighSchoolStudent student = new HighSchoolStudent("金");
        student.queryInfo();
    }
}





