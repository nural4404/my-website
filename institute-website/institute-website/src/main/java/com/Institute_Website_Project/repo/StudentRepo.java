package com.Institute_Website_Project.repo;

import com.Institute_Website_Project.entity.Student_Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student_Register, Integer> {
}
