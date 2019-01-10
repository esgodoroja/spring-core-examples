package md.orange.examples.annotations;

import md.orange.examples.annotations.qualifier.MessageProcessor;
import md.orange.examples.annotations.qualifier.MessageService;
import md.orange.examples.annotations.qualifier.impl.EmailService;
import md.orange.examples.annotations.qualifier.impl.MessageProcessorImpl;
import md.orange.examples.annotations.qualifier.impl.SmsService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("md.orange.examples.annotations.qualifier")
public class AppConfig {



  /**
   * qualifier
   */
  @Bean
  @Primary
  public MessageService getEmailService() {
    return new EmailService();
  }

  @Bean
  public MessageService getSmsService() {
    return new SmsService();
  }

  @Bean
  public MessageProcessor getMessageProcessor() {
    return new MessageProcessorImpl(getEmailService());
  }

  @Bean(name = "simple", autowire = Autowire.BY_NAME
      , initMethod = "init", destroyMethod = "destroy")
  public SimpleBean getSimpleBean() {
    return new SimpleBean();
  }

  public class SimpleBean {

    public void sayHello() {
      System.out.println("Hello World !");
    }

    public void init() {
      System.out.println("init method called");
    }

    public void destroy() {
      System.out.println("destroy method called");
    }
  }
}
