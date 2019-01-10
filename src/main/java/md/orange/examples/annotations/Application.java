package md.orange.examples.annotations;

import md.orange.examples.annotations.qualifier.MessageProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext =
        new AnnotationConfigApplicationContext(AppConfig.class);

//    SimpleBean simpleBean = (SimpleBean) applicationContext.getBean("simple");
//    simpleBean.sayHello();
//
    MessageProcessor messageProcessor = applicationContext
        .getBean(MessageProcessor.class);

    messageProcessor.processMsg("Hi");
  }

}
