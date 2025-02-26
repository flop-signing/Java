package com.Java.DCB.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotEmpty(message = "Department name can't be null.")
    private String departmentName;


/*    @Length(min = 2,max = 10)
    @Size(min = 2,max = 10)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @NotBlank
    @Future
    @FutureOrPresent
    @FutureOrPresent
    @Past
    @PastOrPresent    // this are the different annotation for validating fields
    */
    private String departmentAddress;
    private String departmentCode;




}
