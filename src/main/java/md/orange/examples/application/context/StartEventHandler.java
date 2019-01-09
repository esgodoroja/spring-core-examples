package md.orange.examples.application.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent> {

  @Override
  public void onApplicationEvent(ContextStartedEvent event) {
    System.out.println("===========================================");
    System.out.println("StartEvent was called: " + event.getTimestamp());
    System.out.println("for ApplicationContext: " + event.getApplicationContext()
        .getDisplayName());
    System.out.println("===========================================");
  }
}
