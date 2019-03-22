package fromEmail;

// This problem was asked by Stripe.

// Given an array of integers, find the first missing positive integer in linear time
// and constant space. In other words, find the lowest positive integer that does not exist
// in the array. The array can contain duplicates and negative numbers as well.

// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

import java.util.Arrays;

// You can modify the input array in-place.
public class Mail090322 {
        public static void main(String[] args){
                Mail090322 instatntMail090322 = new Mail090322();
                int[] input = {-3,5,2,7,-8,0,1,4,3};
//                int[] input = {-3,2};
                System.out.println(instatntMail090322.findMissing(input));
        }

        public int findMissing(int[] input){
                Arrays.sort(input);
                int output = 0;

                for(int i=0; i<input.length-1;i++){

                        // case 1: input[i]<=0 input[i+1]<=0
                        if(input[i]<=0 && input[i+1]<=0){
                                continue;
                        }

                        // case 2: input[i]<=0 input[i+1] >0
                        if(input[i]<=0 && input[i+1]>0){
                                if(input[i]+1==input[i+1]){
                                        continue;
                                }else{
                                        output = input[i];
                                        for(int j=0; j<input[i+1]-input[i];j++){
                                                output++;
                                                if (output>0&&output!=input[i+1]){
                                                        return output;
                                                }
                                        }
                                        continue;
                                }
                        }

                        // case 3: input[i]>0 input[i+1]>0 and input[i]+1==input[i+1]
                        if(input[i]+1==input[i+1]){
                                continue;
                        }else{
                                output = input[i]+1;
                                return output;
                        }
                }
                output = input[input.length-1]+1;
                if(output<=0){
                        return 1;
                }
                return output;
        }
}
