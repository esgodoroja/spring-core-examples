package md.orange.examples.pojos;

public class Employee {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void displayName() {
    System.out.println(name);
  }
}
