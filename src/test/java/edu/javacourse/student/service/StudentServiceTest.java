package edu.javacourse.student.service;


import edu.javacourse.student.rest.StudentController;
import edu.javacourse.student.view.StudentRequest;
import edu.javacourse.student.view.StudentResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceTest.class);

    @Autowired
    private StudentController controller;

    @Test
    public void studentInfo(){
        StudentRequest req = new StudentRequest();
        req.setDateOfBirth(LocalDate.of(1990,1,23));
        req.setFirstName("First");
        req.setLastName("Last");
        req.setMiddleName("Middle");
        req.setPassportDate(LocalDate.of(2004, 1, 23));
        req.setPassportNumber("1111");
        req.setPassportSeria("222222");
        List<StudentResponse> info = controller.getStudentInfo(req);
        Assert.assertTrue(info.size()>0);


    }
}