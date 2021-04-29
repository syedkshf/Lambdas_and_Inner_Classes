public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= (a,b) -> a + b;
                break;
            case "-": res= (a,b) -> a - b;
                break;
            case "*": res= (a,b) -> a * b;
                break;
            case "/": res= (a,b) -> b!=0 ? a / b : Double.POSITIVE_INFINITY;
                break;
            default: res= (a,b) -> Double.MIN_VALUE;
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
        DoMath calc = toOperation(op);
        return calc.compute(n1,n2);
    }
}
