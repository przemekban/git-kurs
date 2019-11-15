package pl.mpas.git_examples.car.service;

@FunctionalInterface
public interface LambdaOperation {

    int calc(int a, int b);

    default int calc2(String s){
        return 0;
    }
}
