package webEmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class repo {
	
HashMap<Long,Employee> employees=new HashMap<Long, Employee>();
	
	public void AddEmployee(Employee emp)
	{
		employees.put((long) emp.getId(), emp);
	}
	
	public List<Employee> getEmployees()
	{
		return new ArrayList<Employee>(employees.values());
	}
	
	
	public  void deleteEmployee(Long id) {
         
		 employees.remove(employees.remove(id));
	}
	public void Update(Employee emp) {
		
		employees.replace((long) emp.getId(), emp);
		
		
	}
}
