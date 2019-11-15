package pl.mpas.git_examples.car.service;

public class MainTest {
    public static void main(String[] args) {
        LambdaConverter my = new LambdaConverter() {
            @Override
            public int convertStringToInt(String string) {
                return string.length();
            }
        };

        LambdaConverter my2 = one -> one.length();

        LambdaOperation added = (a, b) -> a + b;
        LambdaOperation sub = (a,b) -> a - b;
        System.out.println(added.calc(3,4));
        System.out.println(sub.calc(8, 3));
        System.out.println(sub.calc2("sfa"));
    }
}
