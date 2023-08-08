import java.util.function.BiConsumer;

public class LAMBDAExpressionDemo {
  public static void main(String[] args) {
      BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println(a+b);
      biConsumer.accept(10,20);
  }
}
