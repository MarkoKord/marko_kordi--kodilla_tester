import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int getCountOfRandomNumber = getCountOfRandomNumber(5000); // odwołanie do metody, żeby printować wynik

    }

    static int getCountOfRandomNumber(int max) {


        int minNumb = 30, maxNumb = 1;                              //określenie najwyższej i najniższej warotsci


        Random random = new Random();
        int numbers = random.nextInt(5000);                   //deklaracja że suma petli osiaga 5k
        int result = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);                   // zakres pętli pętla zaczyna się od int sum=0 do 30
            sum += temp;
            result++;


            if (temp < minNumb) {                                   // jeśli liczba losowana z przedziału temp jest mniejsza od minNumb
                minNumb = temp;

            }


            if (temp > maxNumb) {
                maxNumb = temp;
            }

            System.out.println("najmnniejsza wylosowana to:" + minNumb);
            System.out.println("największa wylosowana to:" + maxNumb);


        }


return result++;

    }
}





