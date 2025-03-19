package com.java.SpringDataJPA.repository;

import com.java.SpringDataJPA.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Create Custom Method

    public List<Student> findByFirstName(String firstName);


    public List<Student> findByFirstNameContaining(String firstName);

    public List<Student> findByLastNameNotNull();


    // based on guardian name
    public List<Student> findByGuardianName(String guardianName);

    // Sometimes creating method name is not enough and at that time you have to specify different query as well
    // And based on that query i wanna get the data and for these particular case we use @Query annotation

    // These JPQL is created Based on the class name(here Student Class) not table on the DB
    @Query("select s from Student s where s.email = ?1")
    public Student getStudentByEmailAddress(String email);

//
//    // Get the first name of the student
//
//    @Query("select s.firstName from Student s where s.email = ?1")
//    public String getStudentFirstNameByEmailAddress(String email);


    // Suppose there is a very complex object and   that can't define through JPQL so on that case
    // we should use native SQL Query


    //

/*    @Query(
                value = "SELECT * FROM t_students where s.email_address = ?1",
            nativeQuery = true
    )
    Student getStudentByEmailAddressNative(String email);*/


    // Through Parameter
//
//    @Query(
//            value = "SELECT * FROM t_students where s.email_address = :email",
//            nativeQuery = true
//    )
//    public Student getStudentByEmailAddressNativeNamedParam(@Param("email") String email);


//    @Transactional
//    @Modifying
//    @Query(
//            value = "update tbl.t_students set first_name =? where email_address =?2",
//            nativeQuery = true
//
//    )
//    int updateStudentNameByEmailId(String firstName, String email);

}
