package md.orange.examples.dependency.inversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanPropertyInjection {

  private BeanDeclaredByAnnotation dependency;

  @Autowired
  public void setBeanToBeInjected(BeanDeclaredByAnnotation
      beanToBeInjected) {
    this.dependency = beanToBeInjected;
  }
  public void sayHello() {
    System.out.println("Hello, World from BeanPropertyInjection !");
    dependency.sayHello();
  }
}
