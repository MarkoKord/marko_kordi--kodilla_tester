public class ChooseColor {
public String chooseColor() {
String colorSelect=UserDialogs.chooseColor();
String x;
    switch (colorSelect) {
        case "B":
            x= "Blue";
        case "G":
            x = "Green";
        case "O":
            x = "Orange";
        case "P":
            x = "Purple";
    }
       defult:
       return colorSelect;



}
}
