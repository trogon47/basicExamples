import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdaList {
    public TestLambdaList() {
    }

    public static void main(String[] args) {
        TestLambdaList test = new TestLambdaList();
        Consumer<TestLambdaList> lambdaFunc = (TestLambdaList t) -> t.methodForLambda();
        List<Consumer> lambdas = new ArrayList<>();
        lambdas.add(lambdaFunc);
        lambdas.add(lambdaFunc);
        for (Consumer<TestLambdaList> lambda : lambdas ) {
            lambda.accept(test);
        }
    }

    public void methodForLambda() {
        System.out.println("hello");
    }


}
