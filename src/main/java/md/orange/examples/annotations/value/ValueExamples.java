package md.orange.examples.annotations.value;

import md.orange.examples.annotations.value.AppConfig.DefaultValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueExamples {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);

    DefaultValues defaultValues = applicationContext
        .getBean(DefaultValues.class);

    System.out.println(defaultValues);
  }
}
