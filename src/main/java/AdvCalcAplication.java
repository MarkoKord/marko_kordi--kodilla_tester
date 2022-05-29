

public class AdvCalcAplication {
    //    public static void main(String[] args) {
//        AdvCalculator calculator = new AdvCalculator();  // odnosimy się do klasy AdvCalculator do metody calculator
//        double result = calculator.calculate();           //advCalculator odniesienie do metody calculate().
//        System.out.println("Result:" + result);
//
//    }
//}
    public static void main(String[] args) {
        ChooseColor chooseColor = new ChooseColor();
        String result = chooseColor.chooseColor();
        System.out.println("Your Color is:" + result);
    }


}
