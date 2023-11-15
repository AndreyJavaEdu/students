package edu.javacourse.student.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Table(name = "sr_faculty")
@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")
    private Long facultyId;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "university_id")
    private University university;
    @Column(name = "faculty_name")
    private String facultyName;

    public University getUniversity() {
        return university;
    }
}
