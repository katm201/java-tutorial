public class Test {
  public void pupAge() {
    int age; // local variable
    age = 0; // if you remove this line, you get an error when compiling
    age = age + 7;
    System.out.println("Puppy age is: " + age);
  }

  public static void main(String[] args) {
    Test test = new Test();
    test.pupAge();
  }
}