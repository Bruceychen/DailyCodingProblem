package fromEmail;

//This problem was asked by Uber.
//
// Given an array of integers, return a new array such that each element at index i 
// of the new array is the product of all the numbers in the original array except the one at i.
//
// For example, if our input was [1, 2, 3, 4, 5], 
// the expected output would be [120, 60, 40, 30, 24].
// If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//
//Follow-up: what if you can't use division?
public class Mail190320 {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        Mail190320 mail190320 = new Mail190320();
        
        System.out.println("Solution with division");
        for(int i=0;i<input.length;i++) {
            System.out.print(mail190320.newArray(input)[i]+", ");
        }
        System.out.println("");
        
        System.out.println("Solution without division");
        for(int i=0;i<input.length;i++) {
            System.out.print(mail190320.newArray2(input)[i]+", ");
        }
        System.out.println("");
    }
    
    
    //solution with division
    public int[] newArray(int[] input) {
        int totalValue=1;
        int[] output = new int[input.length];
        int size = input.length;
        for(int i=0; i <size;i++) {
            totalValue *= input[i];
        }
        
        for(int j=0; j<size;j++) {
            output[j]=totalValue/input[j];
        }
        return output; 
        
    }
    
    //solution without division
    public int[] newArray2(int[] input) {
        int index =0;
        int[] output = new int[input.length];
        
        if(input.length>1) {
            for(int i =0; i< input.length;i++) {
                int innerResult=1;
                for(int j =0;j<input.length;j++) {
                    if(index==j) {
                        continue;
                    }
                    innerResult *= input[j];
                }
                output[i] =innerResult;
                index++;
                innerResult=0;
            }
            return output;
        }else {
            return input;
        }
    }
}
