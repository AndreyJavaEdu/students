package edu.javacourse.student.view;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class StudentResponse
{
    private String documentNumber;
    @JsonSerialize(converter = LocalDateStringConverter.class)
    @JsonDeserialize(converter = StringLocalDateConverter.class)
    private LocalDate documentDate;
    @JsonSerialize(converter = LocalDateStringConverter.class)
    @JsonDeserialize(converter = StringLocalDateConverter.class)
    private LocalDate expireDate;
    private String facultyName;
    private String universityName;
    private String educationForm;
}
