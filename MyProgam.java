import java.util.List;
import java.util.Arrays;
public class MyProgram
{
    public static void main(String[] args)
    {
        System.out.println("1.Reverse String");
        String str = "123";
        System.out.println(reverse(str));
        
        System.out.println("\n2.Swap Number");
        swapNumbers(10, 20);
        
        System.out.println("\n3.Is Contain Vowels");
        System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
		
		System.out.println("\n4.Is Prime Number");
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
		
		System.out.println("\n5. Fibbonacci");
		fibbonacciPrint(10);
		
		System.out.println("\n\n6. Odd Numbers Only");
		List<Integer> firstList = Arrays.asList(1,3,5,7,9,11);
		System.out.println(onlyOddNumbers(firstList));
		
		System.out.println("\n7. Palindrome");
		System.out.println(isPalindrome("beda"));
		System.out.println(isPalindrome("apa"));
		
		System.out.println("\n8. Remove Whitespace");
		System.out.println(removeWhitespace("   Ha Hi Hu He Ho"));
		System.out.println("8. Using trim");
		String s = "  abc  def\t";
        s = s.trim();
        System.out.println(s);
        
        System.out.println("\n9. Sorting Array");
		int[] arrNumb = {5,2,8,3,6,8,1,9};
		Arrays.sort(arrNumb);
		System.out.println(Arrays.toString(arrNumb));
		
		System.out.println("\n10. Factorial");
		System.out.println(factorial(10));
    }
    
    public static String reverse(String in)
    {
        if (in == null ) throw new IllegalArgumentException("Null is not valid input");
        
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        
        for(int i = chars.length - 1; i >=0; i--) out.append(chars[i]);
        
        return out.toString();
    }
    
    public static void swapNumbers(int a, int b)
    {
        int firstNumber = a;
        int secondNumber = b;
        
        System.out.println("a is " + firstNumber + " b is " + secondNumber);
        
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        
        System.out.println("After swap, a is " + firstNumber + " and b is " + secondNumber);
    }
    
    public static boolean stringContainsVowels(String str)
    {
        return str.toLowerCase().matches(".*[aiueo].*");
    }
    
    public static boolean isPrime(int number)
    {
        if (number == 0 || number == 1) return false;
        
        if (number == 2) return true;
        
        for(int i = 2; i<=number/2; i++) {
            if(number%i == 0) return false;
        }
        
        return true;
    }
    
    public static void fibbonacciPrint(int maxLength)
    {
        int a = 0;
        int b = 1;
        int c = 1;
        
        for(int i = 1; i <= maxLength; i++){
            System.out.print(a + ", ");
            
            a = b;
            b = c;
            c = a+b;
        }
    }
    
    public static boolean onlyOddNumbers(List<Integer> list)
    {
        for(int i : list) {
            if(i%2 == 0) return false;
        }
        
        return true;
    }
    
    private static boolean isPalindrome(String str)
    {
        // String reversedText = reverse(str);
        // if(reversedText.equals(str)) return true;
        // return false
        
        int strLength = str.length();
        for(int i = 0; i<= strLength - 1; i++){
            if(str.charAt(i) != str.charAt(strLength - i - 1)) return false;
        }
        return true;
    }
    
    private static String removeWhitespace(String str)
    {
        StringBuilder output = new StringBuilder();
        char[] chars = str.toCharArray();
        
        for(char c : chars){
            if(!Character.isWhitespace(c)) output.append(c);
        }
        
        return output.toString();
    }
    
    private static long factorial(long n)
    {
        if(n == 1) return 1;
        else return (n * factorial(n-1));
        
        // long result = 1;
        // for(int i = 1; i <= n; i++){
        //     result*=i;
        // }
        // return result;
    }
}
