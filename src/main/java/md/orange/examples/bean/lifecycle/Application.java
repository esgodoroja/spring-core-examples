package md.orange.examples.bean.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employee-bean.xml");

    EmployeeBean bean = (EmployeeBean) applicationContext.getBean("employeeBean");

    bean.displayName();

    ((AbstractApplicationContext) applicationContext).registerShutdownHook();
  }

}
