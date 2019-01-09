package md.orange.examples.dependency.inversion;

import md.orange.examples.dependency.inversion.AppConfig.BeanDeclaredInAppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanConstructorInjection {

  private BeanDeclaredInAppConfig dependency;

  @Autowired
  public BeanConstructorInjection(BeanDeclaredInAppConfig dependency) {
    this.dependency = dependency;
  }
  public void sayHello() {
    System.out.print("Hello, World from BeanConstructorInjection with dependency: ");
    dependency.sayHello();
  }

}
