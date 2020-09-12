package cpen221practice;


class NaturalNumber {

    Classification naturalType;
    String error = "You must supply a natural number (positive integer)";

    private int natNum;
    public NaturalNumber(int num)
    {
        natNum = num;
        if (natNum < 1)
        {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }
    public Classification getClassification()
    {

        if (getAliquotSum(natNum) == natNum)
        {
            naturalType = cpen221practice.Classification.PERFECT;
        }
        else if (getAliquotSum(natNum) > natNum)
        {
            naturalType = cpen221practice.Classification.ABUNDANT;
        }
        else if (getAliquotSum(natNum) < natNum) //to be explicit
        {
            naturalType = cpen221practice.Classification.DEFICIENT;
        }
        return naturalType;
    }

    public int getAliquotSum(int num)
    {
        int AliquotSum = 0;
        for (int i = 1; i < num; ++i)
        {
            if (num % i == 0)
            {
                AliquotSum += i;
            }

        }
        return AliquotSum;
    }


}
