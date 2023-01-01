package com.masai.usecases;

import com.masai.Dao.CollageStudentDaoImpl;
import com.masai.exception.CollageStudentException;
import com.masai.models.Student;

import java.util.List;

public class GetStudentByCollageId {
    public static void main(String[] args) {
        CollageStudentDaoImpl collageStudentDao = new CollageStudentDaoImpl();
        try {
            List<Student> list= collageStudentDao.getStudentByCollageId(1);
            for (Student student : list) {
                System.out.println("Student name: "+student.getStudentName()+" "+
                                    "Student roll: "+student.getStudentRoll()
                );
            }
        } catch (CollageStudentException e) {
            System.out.println(e.getMessage());
        }
    }
}
