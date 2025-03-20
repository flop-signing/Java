package com.java.SpringDataJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )
    private Long courseId;
    private String courseTitle;
    private Integer credit;

    @OneToOne(mappedBy = "course")
    private CourseMaterial courseMaterial;

    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacherId",
            referencedColumnName = "teacherId"
    )
    private Teacher teacher;

    // @ManyToMany
//    @JoinTable(
//            name = "student-course-mapping",
//            joinColumns = @JoinColumn(
//                    name = "course_id",
//                    referencedColumnName = "courseId"
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "student_id",
//                    referencedColumnName = "studentId"
//            )
//    )

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id") // Must match Student's column
    )
    private List<Student> students;


    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }
        students.add(student);
    }
}
