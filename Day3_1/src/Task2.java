public class Task2 {

    //Declare and initialize an array with four arbitrary whole numbers.
    // Write a Java program to copy this array by iterating it.

    public Task2()
    {
        int[] array = {4, 20, 60, 150};
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
            System.out.println("copy: " + copy[i] + ";  original: " + array[i] + ";");
        }
    }
}
