package webEmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	repo repo;
     public repo getRepo() {
		return repo;
	}
     @Autowired
	public void setRepo(repo repo) {
		this.repo = repo;
	}
	@RequestMapping("/addNewEmployee")
	public  ModelAndView addNewEmployee() {
		return new ModelAndView("AddNewEmployee");
	}
     @RequestMapping("/Home")
     public  ModelAndView Home() {
    	 return new ModelAndView("index");
     }
     @RequestMapping("/saveEmployee")
     public  ModelAndView saveEmployee(@ModelAttribute  Employee emp  ) {
    	 
    	 repo.AddEmployee(emp);
    	 
    	 return new ModelAndView("sucess");
     }
     @RequestMapping("/displayEmployee")
 	public ModelAndView displayEmployees()
 	{
 		List<Employee>emplist=repo.getEmployees();
 		
 		return new ModelAndView("displayEmployee","emplist",emplist);
 	}
     @RequestMapping("/deleteEmployee")
     public ModelAndView delete() {
    	 return new  ModelAndView("deletedpage");
     }
     @RequestMapping("/deleted")
     public ModelAndView deleteEmp(Long id) {
    	 repo.deleteEmployee(id);
    	 return new  ModelAndView("deleted");
     }
     @RequestMapping("/update")
     public ModelAndView upadte() {
    	 return new  ModelAndView("updatepage");
     }
     @RequestMapping("/updatepag")
     public ModelAndView upadtepag(Employee emp) {
    	 repo.Update(emp);
    	 return new  ModelAndView("update");
     }
     
}
