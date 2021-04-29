import java.util.ArrayList;
import java.util.List;

public class Task<T> {

    public static class Triplet<T1, T2, T3>{
        public T1 v1;
        public T2 v2;
        public T3 v3;

        Triplet(T1 v1,T2 v2, T3 v3){
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }
    }

    public static String result;
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(56.0,28.0,"/"));
        t.add(new Triplet<>(12.4,0.0,"/"));
        t.forEach(ts->result+="\n"+c.compute(ts.v1,ts.v2,ts.v3));
        System.out.println(result);
    }
}