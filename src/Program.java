import java.util.stream.IntStream;

class Program {
    public  static void main(String[] args)
    {
        RandomNumberGenerator _generate = new RandomNumberGenerator(1, 40, 3641, 729);

        // call the random number generator to print next 10 random integers

        for(int i = 1; i <= 10; i++)
        {
            int rndNumber = _generate.GenerateRandomNumber();
            // change the seed value
            _generate.ChangeSeed(rndNumber);
            System.out.println(rndNumber);
        }

        System.out.println("Next 10 Random integers");
        //set the random number seed to 44
        _generate.ChangeSeed(44);

        // call the random number generator to print next 10 random integers
        for (int i = 1; i <= 10; i++)
        {
            var rndNumber = _generate.GenerateRandomNumber();
            /* change the seed value */
            _generate.ChangeSeed(rndNumber);
            System.out.println(rndNumber);
        }

        //set the random number seed to 36
        _generate.ChangeSeed(36);


        System.out.println("Press Any Key to run test 2 , this would generate 729 different Numbers");

        /*
        Test 2
        just resetting the seed value .
        */

        _generate.ChangeSeed(1);
        // invoke Generate Random Number Method , that would return a Random Number
        // change the seed value
        // finally , print the number on the console
        for (int i = 1; i <= 729; i++)
        {
            // invoke Generate Random Number Method , that would return a Random Number
            int rndNumber = _generate.GenerateRandomNumber();

            // change the seed value
            _generate.ChangeSeed(rndNumber);

            // finally , print the number on the console
            System.out.println(rndNumber);

        }
    }
}
