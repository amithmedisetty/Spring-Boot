package com.copart.JPA.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id        //marking id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //to auto_increment the id values
    @Column(name = "id")
    private int id;
    @Column(name="name")       //if fields here and column names in database are not matched
    private String name;
    private String rollnumber;
    private int marks;
    Student(){}                            //instead of this use @NoArgsConstructor, @AllArgsConstructor
    Student(int id,String name,String rollnumber,int marks){
        this.id=id;
        this.name=name;
        this.rollnumber=rollnumber;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
