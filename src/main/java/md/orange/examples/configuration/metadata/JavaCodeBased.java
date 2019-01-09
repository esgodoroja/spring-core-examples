package md.orange.examples.configuration.metadata;

import md.orange.examples.pojos.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("md.orange.examples.configuration.metadata.JavaCodeBased")
public class JavaCodeBased {

  @Bean(name = "employee")
  @Scope(value = "")
  public Employee getEmployer() {
    Employee employee = new Employee();
    employee.setName("employer from JAVA Code Base");
    return employee;
  }

}
