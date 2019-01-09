package md.orange.examples.dependency.inversion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    //initializing the Application Context once per application.
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);

//    BeanDeclaredInAppConfig beanDeclaredInAppConfig =
//        applicationContext.getBean(BeanDeclaredInAppConfig.class);
//    beanDeclaredInAppConfig.sayHello();

    BeanConstructorInjection beanConstructorInjection
        = applicationContext.getBean(BeanConstructorInjection.class);
//    beanConstructorInjection.sayHello();

    BeanPropertyInjection beanPropertyInjection
        = applicationContext.getBean(BeanPropertyInjection.class);
//    beanPropertyInjection.sayHello();

    BeanPostConstructPreDestroy beanPostConstructPreDestroy
        = applicationContext.getBean(BeanPostConstructPreDestroy.class);
    beanPostConstructPreDestroy.sayHello();

//    ((AnnotationConfigApplicationContext) applicationContext)
// .registerShutdownHook();

//    ((AnnotationConfigApplicationContext) applicationContext).stop();
    applicationContext.close();

  }
}
