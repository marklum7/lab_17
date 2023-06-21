public class Calc<T> {
    public T number1, number2;
    public Calc(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public T cal(String ops) {
        switch (ops) {
            case "+" -> {
                return (T) (Object) ((Double) number1 + (Double) number2);
            }
            case "-" -> {
                return (T) (Object) ((Double) number1 - (Double) number2);
            }
            case "*" -> {
                return (T) (Object) ((Double) number1 * (Double) number2);
            }
            case "/" -> {
                return  (T) (Object) ((Double) number1 / (Double) number2);
            }
        }
        return null;
    }
}

