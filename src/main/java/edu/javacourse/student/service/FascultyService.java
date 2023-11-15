package edu.javacourse.student.service;

import edu.javacourse.student.dao.FacultyRepository;
import edu.javacourse.student.dao.UniversityRepository;
import edu.javacourse.student.domain.Faculty;
import edu.javacourse.student.domain.University;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class FascultyService {
    @Autowired
    private FacultyRepository facultyRepository;
    @Transactional(readOnly = true)
    public List<Faculty> findAllFaculties(){
        List<Faculty> all = facultyRepository.findAll();

//        for (Faculty fac : all) {
//            University university = fac.getUniversity();
//            Hibernate.initialize(university);
//        }

        return all;
    }

    @Transactional
    public Faculty getFaculty (Long id){
        Optional<Faculty> f = facultyRepository.findById(id);
        Faculty faculty = f.get();
        Hibernate.initialize(faculty.getUniversity());
        return  faculty;
    }
}

