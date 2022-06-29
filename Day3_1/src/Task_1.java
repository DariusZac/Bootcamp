public class Task_1 {

    //Write a program which creates two dimensional
    // array and stores a multiplication table (from 1 - 10) in it.
    //
    //    Example of output:
    //        1 * 1 = 1
    //        1 * 2 = 2
    //        1 * 3 = 3
    //        ....
    //        10 * 9 = 90
    //        10 * 10 = 100
    //
    //    Hint:
    //       1) don't forget that you have
    //       to save the values in the array and output them from the array.
    //       2) Arrays should be the size of [10][10]

    public Task_1()
    {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                array[i][j] = (i + 1) * (j + 1);
                System.out.println( (i + 1) + " * " + (j + 1) + " = " + array[i][j] );
            }
        }
    }
}
