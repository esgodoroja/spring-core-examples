package md.orange.examples.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

  private String name;
  private int age;

  @Required
  public void setName(String name) {
    this.name = name;
  }


  public void setAge(int age) {
    this.age = age;
  }

  public void displayName() {
    System.out.println(name + "; Age of: " + age);
  }
}
