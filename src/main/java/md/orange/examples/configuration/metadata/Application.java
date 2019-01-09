package md.orange.examples.configuration.metadata;

import md.orange.examples.pojos.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(JavaCodeBased.class);

    System.out.println("Additional Info");
    System.out.println("StartupDate = " + applicationContext.getStartupDate());
    System.out.println("DisplayName = " + applicationContext.getDisplayName().intern());
    System.out.println("ApplicationName = " + applicationContext.getApplicationName());
    System.out.println("===========================================");

    if (applicationContext.containsBean("employee")) {
      ((Employee) applicationContext.getBean(Employee.class)).displayName();
    }
  }

}
