// Napisz program, który poprosi użytkownika o podanie dwóch liczb,
// a nastepnie wykona na nich podstawowe operacje matematyczne.

public class Calculator {

    public int dodawanie(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int odejmowanie(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mnozenie(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int dzielenie(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int modulo(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
