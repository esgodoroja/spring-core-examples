package md.orange.examples.annotations.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("md.orange.examples.annotations.dependsOn")
public class AppConfig {


  @Bean(name = "simple1")
  public SimpleBean getFirstSimple() {
    System.out.println("Simple 1");
    return new SimpleBean();
  }

  @Bean(name = "simple2")
  @Lazy(value = false)
//  @DependsOn("simple1")
  public SimpleBean getSecondSimple() {
    System.out.println("Simple 2");
    return new SimpleBean();
  }

  @Bean(name = "simple2")
  @DependsOn({"simple2", "simple1"})
  public SimpleBean getNexSimple() {
    System.out.println("Simple 3");
    return new SimpleBean();
  }

  public class SimpleBean {
  }
}
