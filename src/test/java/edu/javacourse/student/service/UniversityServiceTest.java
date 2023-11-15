package edu.javacourse.student.service;

import edu.javacourse.student.domain.Faculty;
import edu.javacourse.student.domain.University;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UniversityServiceTest {

    @Autowired
    private UniversityService service;
    @Autowired
    private  FascultyService fascultyService;

    @Test
    public void findAllUniversities() {
        List<University> listOfAllUniversities = service.findAllUniversities(); //транзакция закончилась
        System.out.println("OK!");
        listOfAllUniversities.forEach(u-> System.out.println(
                u.getUniversityId()+ ": "+ u.getUniversityName() + u.getFaculties().size()));
    }

    @Test
    public void findFaculties(){
        List<Faculty> list = fascultyService.findAllFaculties();
        System.out.println("OK!");
        list.forEach(f -> System.out.println(f.getFacultyId()+ ": "+ f.getUniversity().getUniversityName()));
    }

    @Test
    public void getFuculty(){
        Faculty faculty = fascultyService.getFaculty(1L);
        System.out.println(faculty.getUniversity().getUniversityName());
    }

    @Test
    public void getFullUniversity(){
        List<University> list = service.findFullUniversity();
    }
}