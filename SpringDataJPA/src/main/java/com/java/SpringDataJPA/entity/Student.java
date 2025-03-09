package com.java.SpringDataJPA.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
//@Data it's adding all getter,setter, toString(), HashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Table(
        name = "T_STUDENTS",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "email_address"
        )
)
public class Student {


    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(name = "student_id")
    private Long studentId;


    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(
            name = "email_address",
            nullable = false
    )
    private String email;


    @Embedded
    private Guardian guardian;







}
