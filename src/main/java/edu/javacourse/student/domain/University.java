package edu.javacourse.student.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@Table(name = "sr_university")
@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private Long universityId;
    @Column(name = "university_name")
    private Long universityName;

    @OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY,
    mappedBy = "university")
    private List<Faculty> faculties;

}
