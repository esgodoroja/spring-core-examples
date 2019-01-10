package md.orange.examples.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredExample {

  public static void main(String[] args) {
    ApplicationContext applicationContext =
        new ClassPathXmlApplicationContext(
            "required-beans.xml");

    if (applicationContext.containsBean("employee")) {
      ((Employee) applicationContext.getBean("employee")).displayName();
    }
  }
}
