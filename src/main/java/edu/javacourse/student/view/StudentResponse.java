package edu.javacourse.student.view;

import edu.javacourse.student.domain.Faculty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentResponse
{
    private String documentNumber;
    private LocalDate documentDate;
    private LocalDate expireDate;
    private String facultyName;
    private String universityName;
    private String educationForm;
}
