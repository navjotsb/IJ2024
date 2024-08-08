package io.pragra.learning;

public class OperationMethod {

    public void operationMethod(Double num, Double num1, IOperations operations)
    {
        System.out.println(operations.operation(num,num1));
    }
}
