package md.orange.examples.annotations.qualifier.impl;

import md.orange.examples.annotations.qualifier.MessageService;

public class EmailService implements MessageService {

  @Override
  public void sendMsg(String message) {
    System.out.println("from email Service: " + message);
  }
}
