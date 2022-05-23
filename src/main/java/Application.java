public class Application {
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void checkPerson() {

        if (checkIfNameExist()) {
            if (checkAge() && checkHigh() > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    private double checkHigh() {
        return this.height;
    }

    private boolean checkAge() {
        return this.age > 30;
    }

    private boolean checkIfNameExist() {
        return this.name != null;
    }

}












