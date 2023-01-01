package com.masai.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Collage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int collageId;
    private String collageName;
    private String collageAdrress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "collage")
    private Set<Student> studentSet = new HashSet<>();

    public Collage(){

    }
    public Collage(int collageId, String collageName, String collageAdrress, Set<Student> studentSet) {
        this.collageId = collageId;
        this.collageName = collageName;
        this.collageAdrress = collageAdrress;
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId=" + collageId +
                ", collageName='" + collageName + '\'' +
                ", collageAdrress='" + collageAdrress + '\'' +
                ", studentSet=" + studentSet +
                '}';
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageAdrress() {
        return collageAdrress;
    }

    public void setCollageAdrress(String collageAdrress) {
        this.collageAdrress = collageAdrress;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
}
