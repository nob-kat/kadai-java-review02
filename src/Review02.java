public class Review02 {

    public static void main(String[] args) {
        // iの値が1から100より小さい間、処理を繰り返す
        for (int i = 1; i <= 100; i++) {
            // 2つの条件を同時に満たす場合
            if (i % 3 == 0 && i % 5 == 0 ) {
                // FizzBuzzと表示する
                System.out.println("FizzBuzz");

            // 3で割り切れる場合
            } else if (i % 3 == 0){
                //Fizzと表示する
                System.out.println("Fizz");

            // 5で割り切れる場合
            } else if (i % 5 == 0){
                //Buzzと表示する
                System.out.println("Buzz");

            // それ以外の数は、その数をそのまま表示する
            } else {
                System.out.println(i);
            }

        }
    }
}