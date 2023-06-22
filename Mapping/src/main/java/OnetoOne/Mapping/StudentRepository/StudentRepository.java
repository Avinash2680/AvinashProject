package OnetoOne.Mapping.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OnetoOne.Mapping.Table.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
