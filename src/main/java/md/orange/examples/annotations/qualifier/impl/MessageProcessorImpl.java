package md.orange.examples.annotations.qualifier.impl;

import md.orange.examples.annotations.qualifier.MessageProcessor;
import md.orange.examples.annotations.qualifier.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {

  private MessageService messageService;

  // setter based DI
//  @Autowired
//  @Qualifier("emailService")
//  public void setMessageService(MessageService messageService) {
//    this.messageService = messageService;
//  }

  @Autowired
  public MessageProcessorImpl(@Qualifier("emailService") MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMsg(String message) {
    messageService.sendMsg(message);

  }
}
