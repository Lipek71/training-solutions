package week12.d05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFilter {
    public List<Employee> countSeniorDevs(List<Employee> employees){

        if (employees == null || employees.isEmpty() || employees.contains(null)) {
            throw new IllegalArgumentException("List is null or empty");
        }

        List<Employee> employeeList = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getSkillLevel() >= 3 && employee.getSkills().contains("programming")){
                employeeList.add(employee);
            }
        }
        return employeeList;
    }
}
