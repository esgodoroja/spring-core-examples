package md.orange.examples.annotations.dependsOn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnExample {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);
  }

}
