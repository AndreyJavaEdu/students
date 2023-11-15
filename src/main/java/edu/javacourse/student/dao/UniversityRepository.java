package edu.javacourse.student.dao;

import edu.javacourse.student.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {
@Query(name = "University.findAllWithFaculties",
        value = "select u from University u " +
                "LEFT JOIN fetch u.faculties ")
    public List<University> findFullList();
}
