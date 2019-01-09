package md.orange.examples.application.context;

import md.orange.examples.pojos.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  private static final String EMPLOYEE_ID0 = "employee";
  private static final String EMPLOYEE_ID1 = "new employee";

  public static void main(String[] args) {
    //initializing the Application Context once per application.
    ApplicationContext applicationContext =
//        new FileSystemXmlApplicationContext("application-context-beans.xml");
        new ClassPathXmlApplicationContext(
            "application-context-beans.xml");

    ((AbstractApplicationContext) applicationContext).start();

    System.out.println("Additional Info");
    System.out.println("StartupDate = " + applicationContext.getStartupDate());
    System.out.println("DisplayName = " + applicationContext.getDisplayName().intern());
    System.out.println("ApplicationName = " + applicationContext.getApplicationName());
    System.out.println("===========================================");

    if (applicationContext.containsBean(EMPLOYEE_ID0)) {
      ((Employee) applicationContext.getBean(EMPLOYEE_ID0)).displayName();
    }

    if (applicationContext.containsBean(EMPLOYEE_ID1)) {
      ((Employee) applicationContext.getBean(EMPLOYEE_ID1)).displayName();
    }

    ((AbstractApplicationContext) applicationContext).stop();

  }

}
