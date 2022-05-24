public class UserRunner {
    public static void main(String[] args) {
        User Adam = new User("Adam", 22);
        User Krystian = new User("Krystian", 12);
        User Katarzyna = new User("Katarzyna", 39);
        User Zofia = new User("Zofia", 18);

        User[] users = {Adam, Krystian, Katarzyna, Zofia};


        double result = 0;
        for (User user : users) {
            result += user.getAge();
        }

        int average = (int) (result /= users.length);



        double checkAverage = average;
        for (User user : users) {
            if (user.getAge() < average) {
                System.out.println(user.getName());

            } else {
            }
        }

    }
}






