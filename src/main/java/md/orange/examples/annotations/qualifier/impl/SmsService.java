package md.orange.examples.annotations.qualifier.impl;

import md.orange.examples.annotations.qualifier.MessageService;

public class SmsService implements MessageService {

  @Override
  public void sendMsg(String message) {
    System.out.println("smsService: " + message);
  }
}
