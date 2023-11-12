package edu.javacourse.student.view;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
@Setter
@Getter
public class StudentRequest {
    private String lastName;
    private String firstName;
    private String middleName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate dateOfBirth;
    private String passportSeria;
    private String passportNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate passportDate;
}
