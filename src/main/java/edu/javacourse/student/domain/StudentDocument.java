package edu.javacourse.student.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Setter
@Getter
@Table(name = "sr_student_document")
@Entity
public class StudentDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long documentId;
    @Column(name = "document_number")
    private String documentNumber;
    @Column(name = "document_date")
    private LocalDate documentDate;
    @Column(name = "expire_date")
    private LocalDate expireDate;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "faculty_id")
    private Faculty faculty;
    @Column(name = "education_form")
    @Enumerated
    private EducationForm educationForm;
}
