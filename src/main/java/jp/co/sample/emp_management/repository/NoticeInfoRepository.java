//package jp.co.sample.emp_management.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import jp.co.sample.emp_management.domain.Employee;
//
//public interface NoticeInfoRepository extends JpaRepository<Employee,Integer>{
//
//	@Query("SELECT id,name,image,gender,hire_date,mail_address,zip_code,address,telephone,salary,characteristics,dependents_count FROM employees")
//	List<Employee> findAll();
//}
