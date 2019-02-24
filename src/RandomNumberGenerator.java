public class RandomNumberGenerator {
    private int _seed;
    private  int _multiplier;
    private int _increment;
    private  int _modulus;
    // constructor to initialize the private members
    public RandomNumberGenerator(int seed , int multiplier, int increment, int modulus)
    {
        _seed = seed;
        _multiplier = multiplier;
        _increment = increment;
        _modulus = modulus;
    }

    // Method to change the seed
    public void ChangeSeed(int seed)
    {
        _seed = seed;
    }

    // Method to generate and return pseudorandom sequence .
    public int GenerateRandomNumber()
    {
        return (_multiplier * _seed + _increment) % _modulus;
    }
}
