

public class MethodRefrencingDemo {
    public static final void main(String[] args) {
      final FunctionalInterfaceDemo fDemo=Test :: JustDemonstration();
        fDemo.Sample1();
    }
}


class Test
{
    public void JustDemonstration()
    {
        System.out.println("Here We are Just Implementing the FunctionalInterfaceDemo...KeepQuite!!!!");
    }
}
