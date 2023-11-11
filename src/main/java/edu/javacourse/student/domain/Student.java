package edu.javacourse.student.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@Table(name = "sr_student")
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "passport_seria")
    private String passportSeria;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "passport_date")
    private LocalDate passportDate;
    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY,
    mappedBy = "student")
    private List<StudentDocument> documents;
}
