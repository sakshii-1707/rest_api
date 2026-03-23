package aml3a.redt_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import aml3a.redt_api.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}