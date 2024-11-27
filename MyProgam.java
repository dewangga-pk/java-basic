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
}
