import java.io.*;
import java.util.*; 
class ShuffleArray {


public static void main(String[] args){
int arr[]= {1,2,3,4,5};

shuffleArray(arr);

}
public static void shuffleArray(int[] array)
{
    int index, temp;
    Random random = new Random();
    for (int i = array.length - 1; i > 0; i--)
    {
        index =random.nextInt(i + 1);
        temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
System.out.println("Shuffeled array: ");	
for(int i=0;i<array.length;i++){
System.out.print(array[i]);
System.out.print(" ");
}
}

}