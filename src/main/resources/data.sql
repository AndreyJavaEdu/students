INSERT INTO sr_university (universityName) VALUES ('University one');

INSERT INTO sr_faculty (university_id, facultyName) VALUES (1, 'IT');

INSERT INTO sr_student (last_name, first_name, middle_name, date_of_birth,
                        passport_seria, passport_number, passport_date)
VALUES ('Last', 'First', 'Middle', '1990-1-23', '222222', '1111', '2004-01-23');

INSERT INTO sr_student_document (document_number, document_date, expire_date,
                                 student_id, faculty_id, education_form)
VALUES ('123456', '2018-01-01', '2024-01-01', 1, 1, 0);
