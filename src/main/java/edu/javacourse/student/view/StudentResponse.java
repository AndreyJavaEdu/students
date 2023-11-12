package edu.javacourse.student.view;

import edu.javacourse.student.domain.Faculty;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@Setter
@Getter
public class StudentResponse
{
    private String documentNumber;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate documentDate;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    private LocalDate expireDate;
    private String facultyName;
    private String universityName;
    private String educationForm;
}
