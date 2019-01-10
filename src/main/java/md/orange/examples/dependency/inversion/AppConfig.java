package md.orange.examples.dependency.inversion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("md.orange.examples.dependency.inversion")
public class AppConfig {

  @Bean
  public BeanDeclaredInAppConfig beanDeclaredInAppConfig() {

    return new BeanDeclaredInAppConfig();
  }

  public class BeanDeclaredInAppConfig {

    public void sayHello() {

      System.out.println("Hello, World from BeanDeclaredInAppConfig !");
    }
  }
}