/*
Question 1
A Digit Permutation Cipher is a simple form of number encryption where the digits of a
number are rearranged based on a given key where (1<= key <=size of the number). The key
is a sequence of integers that defines the new positions of the digits.
Example: If number = 2613 and key = 4213, then the encrypted number will be 1632 by
positioning the first digit to the 4th place, second digit to the second place, third digit to the
first place and the fourth digit to the third place as per the key given.
Write a program to enter a number and a permutation key (a sequence of digits which is greater
than 0 and less than or equal to the size of the number). The program should encrypt the
number by permuting its digits according to the key. The number of digits in the key must
match the number of digits in the number to be encrypted.
Test your program with the following data and some random data:
Example 1
INPUT: Number: 12345
Key: 31524
OUTPUT: The encrypted number is 24153
Example 2
INPUT: Number: 9876
Key: 4132
OUTPUT: The encrypted number is 8679
Example 3
INPUT: Number: 5239
Key: 4765
OUTPUT: INVALID KEY DIGITS
Example 4
INPUT: Number: 123
Key: 2134
OUTPUT: INVALID KEY SIZE
*/

import java.util.Scanner;

public class Main{
  void main(){
    Scanner s = new Scanner(System.in);
    
    System.out.print("enter the number: ");
    int num = s.nextInt();
    
    int l = (String.valueOf(num)).length();
    
    System.out.print("enter the key: ");
    int key = s.nextInt();
    int ke = key;
    
    int[] n = new int[l];
    int[] k = new int[l];
    int[] numbers = new int[l];
    
    for(int i = l-1; i >= 0 ; i--){
      n[i] = num % 10;
      num /= 10;
      k[i] = key % 10;
      key /= 10;
    }

    for(int i = 0 ; i < l ; i++) numbers[i] = n[i];
    
    int nu = num;
    int[] sum = {0,0};
    int[] po = {1,1};
    
    for(int i = 0; i<l; i++){
      po[0] *= (ke)%10;
      sum[0] += (ke)%10;
      ke /= 10;
    }
    
    for(int i = 1 ; i <= l ; i++) {
      sum[1] += i; 
      po[1] *= i;
    }
    
    if((po[0]!=po[1] && sum[0]!=sum[1]) || k.length != l) return;
    
    for(int i = 0 ; i < l ; i++) n[k[i]-1] = numbers[i];
    
    for(int i = 0 ; i < l ; i++) System.out.print(n[i]+" ");
  }
}