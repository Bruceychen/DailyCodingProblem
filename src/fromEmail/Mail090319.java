package fromEmail;

//This problem was recently asked by Google.
//
//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//Bonus: Can you do this in one pass?

public class Mail090319 {
    public static void main(String[] args) {
        int[] input = {10, 15, 3, 8};
        int k = 17;
        
        Mail090319 mail090319 = new Mail090319();
        System.out.println(mail090319.isAddUp(input, k));
    }
    
    public boolean isAddUp(int[] input, int k) {
        for(int i=0; i<input.length-1;i++) {
            for(int j=i+1;j<input.length;j++) {
                if(k-input[i]==input[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
