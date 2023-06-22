package OnetoOne.Mapping.Service;

import OnetoOne.Mapping.Table.Student;

public interface StudentService {
	public Student saveStudent(Student Student);

	public Student findbyStudentId(int StudentId);

}
