package md.orange.examples.bean.factory;

import md.orange.examples.pojos.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {

  private static final String EMPLOYEE_ID0 = "employee";
  private static final String EMPLOYEE_ID1 = "new employee";

  public static void main(String[] args) {
    Resource resource =
//        new FileSystemResource("bean-factory-beans.xml");
        new ClassPathResource("bean-factory-beans.xml");
    BeanFactory factory = new XmlBeanFactory(resource);

    System.out
        .println("factory.containsBean(EMPLOYEE_ID0) = "
            + factory.containsBean(EMPLOYEE_ID0));

    if(factory.containsBean(EMPLOYEE_ID0))
      ((Employee)factory.getBean(EMPLOYEE_ID0)).displayName();

//    if(factory.containsBean(EMPLOYEE_ID1))
    ((Employee)factory.getBean(EMPLOYEE_ID1)).displayName();

  }

}
