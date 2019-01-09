package md.orange.examples.application.context;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent> {

  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {
    System.out.println("===========================================");
    System.out.println("stopEvent was called: " + event.getTimestamp());
    System.out.println("for ApplicationContext: " + event.getApplicationContext().getDisplayName());
    System.out.println("===========================================");
  }
}
