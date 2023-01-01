package com.masai.usecases;

import com.masai.Dao.CollageStudentDaoImpl;
import com.masai.models.Collage;
import com.masai.models.Student;
import com.masai.utility.ProvideConnection;

import javax.persistence.EntityManager;

public class AddCollageWithStudent {

    public static void main(String[] args) {
        //creating collage1
        Collage c1 = new Collage();
        c1.setCollageName("Collage1");
        c1.setCollageAdrress("Agra");


        Student s1 = new Student("Student1","9988776655","S1@gmail.com");
        s1.setCollage(c1);
        Student s2 = new Student("Student2","9988776655","S2@gmail.com");
        s2.setCollage(c1);
        Student s3 = new Student("Student3","9988776655","S3@gmail.com");
        s3.setCollage(c1);
        Student s4 = new Student("Student4","9988776655","S4@gmail.com");
        s4.setCollage(c1);

        c1.getStudentSet().add(s1);
        c1.getStudentSet().add(s2);
        c1.getStudentSet().add(s3);
        c1.getStudentSet().add(s4);

        //creating collage2
        Collage c2 = new Collage();
        c2.setCollageName("Collage2");
        c2.setCollageAdrress("Delhi");

        Student s5 = new Student("Student 5","778835346","S5@gmail.com");
        s5.setCollage(c2);
        Student s6 = new Student("Student 6","778835346","S6@gmail.com");
        s6.setCollage(c2);
        Student s7 = new Student("Student 7","778835346","S7@gmail.com");
        s7.setCollage(c2);
        Student s8 = new Student("Student 8","778835346","S8@gmail.com");
        s8.setCollage(c2);

        c2.getStudentSet().add(s5);
        c2.getStudentSet().add(s6);
        c2.getStudentSet().add(s7);
        c2.getStudentSet().add(s8);

        CollageStudentDaoImpl collageStudentDao = new CollageStudentDaoImpl();
        System.out.println(collageStudentDao.addCollageStudent(c1,c2));
    }
}
