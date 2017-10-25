
/**
 * Write a description of class Array here.
 * 
 * @author (Kong) 
 * @version (10.25.17)
 */
public class Array
{
    int[] list;
    int[] list2;
    public Array(){
        list = new int [10000];
        list2 = new int[10000];
        //Anytime you iterate through a list or an array, you will always use a FOR loop
        for (int i = 0; i< 10000 ; i++){
            list[i] = i+ 1;
        }
        list2 = list;
        list[0] = 2017;
    }
    public Array(int n) {
        list = new int[n];
        for (int i = 0; i < list.length; i++){          //When talking about the length of an array, DO NOT put parentheses
            list[i] = i+ 1;
        }
    }
    
    public void printArray(){
        for (int i = 0; i < list.length; i++){
        System.out.println(i+1);
    }
    }
}
