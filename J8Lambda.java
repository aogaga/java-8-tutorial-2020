class J8Lambda{

    public static void main(String [] args){
        J8Lambda j8 = new J8Lambda();
        MathOperation addition = (int a, int b)-> a +b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation
    }
    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(final int a, final int b, final MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}