package com.student.copart.model;

public class Student {
    private int id;
    private String name;
    private String rollnumber;
    private int marks;
    public Student(){}
    public Student(int id,String name,String rollnumber,int marks){
        this.id=id;
        this.name=name;
        this.rollnumber=rollnumber;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
