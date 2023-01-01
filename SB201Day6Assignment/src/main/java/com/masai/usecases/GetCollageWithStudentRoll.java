package com.masai.usecases;

import com.masai.Dao.CollageStudentDaoImpl;
import com.masai.exception.CollageStudentException;
import com.masai.models.Collage;

public class GetCollageWithStudentRoll {
    public static void main(String[] args) {
        CollageStudentDaoImpl collageStudentDao = new CollageStudentDaoImpl();
        try {
            Collage collage = collageStudentDao.getCollageByStudentRoll(7);
            System.out.println(collage);

        } catch (CollageStudentException e) {
            throw new RuntimeException(e);
        }
    }
}
