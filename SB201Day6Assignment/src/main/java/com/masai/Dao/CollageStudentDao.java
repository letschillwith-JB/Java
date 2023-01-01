package com.masai.Dao;

import com.masai.exception.CollageStudentException;
import com.masai.models.Collage;
import com.masai.models.Student;

import java.util.List;

public interface CollageStudentDao {

    String addCollageStudent(Collage collage1, Collage collage2);

    public List<Student> getStudentByCollageId(int collageId)throws CollageStudentException;

    public Collage getCollageByStudentRoll(int roll)throws CollageStudentException;
}
