package OnetoOne.Mapping.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import OnetoOne.Mapping.Table.Laptopdetails;

public interface LaptopRepository extends JpaRepository<Laptopdetails, Integer>{

}
