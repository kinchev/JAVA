// You can experiment here, it won’t be checked

public class Task {
  static class NonGenericClass {

    private Object val;

    public NonGenericClass(Object val) {
      this.val = val;
    }

    public  Object get() {
      return val;
    }
  }
  public static void main(String[] args) {
    NonGenericClass instance = new NonGenericClass("Hello");
    Integer num = (Integer) instance.get();
  }
}
