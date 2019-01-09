package md.orange.examples.bean.lifecycle;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class EmployeeBean implements InitializingBean,
    DisposableBean, ApplicationContextAware,
    BeanNameAware, BeanFactoryAware {

  private String name;

  public EmployeeBean() {
    System.out.println("Constructor is called");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void displayName() {
    System.out.println(name);
  }

  public void customInit() {
    System.out.println("===========================");
    System.out.println("customInit method is called ");
    System.out.println("===========================");
  }

  public void customDestroy() {
    System.out.println("===========================");
    System.out.println("customDestroy method is called ");
  }

  @Override
  public void destroy() {
    System.out.println("===========================");
    System.out.println("destroy method is called ");
  }

  @Override
  public void afterPropertiesSet() {
    System.out.println("===========================");
    System.out.println("afterPropertiesSet method is called ");
//    System.out.println("===========================");
  }

  @Override
  public void setBeanName(String beanName) {
    System.out.println("===========================");
    System.out.println("setBeanName method of Aware bean is called");
    System.out.println("setBeanName:: Bean Name defined in context="
        + beanName);
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("===========================");
    System.out.println("setBeanFactory method of Aware bean is called");
    System.out.println("setBeanFactory:: Aware bean singleton="
        + beanFactory.isSingleton("employeeBean"));
    System.out.println("===========================");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext)
      throws BeansException {
    System.out.println("setApplicationContext method of Aware bean is called");
    System.out.println("setApplicationContext:: Bean Definition Names="
        + Arrays.toString(applicationContext.getBeanDefinitionNames()));
  }


}
