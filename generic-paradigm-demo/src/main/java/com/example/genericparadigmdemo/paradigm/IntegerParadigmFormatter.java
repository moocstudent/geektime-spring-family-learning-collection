package com.example.genericparadigmdemo.paradigm;

public class IntegerParadigmFormatter extends ParadigmFormatter<Integer>{
    public IntegerParadigmFormatter(Integer lower, Integer upper) {
        super(lower, upper);
    }


    public static void main(String[] args) {
        ParadigmFormatter<Integer> v1 = new ParadigmFormatter<Integer>(1,2);
        int lower = v1.getLower();
        int upper = v1.getUpper();
        System.out.println(lower + "," + upper);

        ParadigmFormatter<Integer> v2 = new ParadigmFormatter<>(1,2);
        ParadigmFormatter<Integer> v3 = getReverse(v2);
        System.out.println(v3.getLower() + "," + v3.getUpper());
    }

    public static <T> ParadigmFormatter<T> getReverse(ParadigmFormatter<T> paradigmFormatter){
        return new ParadigmFormatter<T>(paradigmFormatter.getUpper(),paradigmFormatter.getLower());
    }


}
