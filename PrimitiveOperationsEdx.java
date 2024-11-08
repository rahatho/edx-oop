public class PrimitiveOperationsEdx {
    public static void main(String[] args) {
        // Sub-Task 1
        // First, declare and initialize two variables, an integer
        // type (byte, short, int, or long) and a floating point value
        // (float or double). The names and values can be whatever you
        // like, for this step and all others. Make sure that the
        // numbers you choose can be stored within the respective
        // primitive type you choose. Print each of these values out
        // on their own line using System.out.println().
        byte byteValue = 9;
	float floatValue = 5.50F;
	
	System.out.println(byteValue);
	System.out.println(floatValue);

        // Sub-Task 2
        // Multiply these variables together, and assign the outcome
        // to a new variable, ensuring that no data is lost. For
        // example, if I multiply 5 and 3.5, the answer should be
        // 17.5. Print out this new value.
	float multipliedValue = byteValue * floatValue;
	
	System.out.println(multipliedValue);
       

        // Sub-Task 3
        // Use casting to convert the integer from the first step to a
        // floating point value and store that in another new
        // variable. Print out the value.
        float convertedFloat = byteValue;
	
	System.out.println(convertedFloat);

        // Sub-Task 4
        // Use casting to convert the floating point value from the
        // first step to an integer type and store that in a new
        // variable. Print out the value.
        int convertedInt = floatValue;

	System.out.println(convertedInt);

        // Sub-Task 5
        // Shifting focus, declare a char variable, and assign an
        // uppercase letter to it. Print out this value.
        char upperChar = 'A';
	
	System.out.println(upperChar);

        // Sub-Task 6
        // Using a numerical operation, change the letter to the same
        // letter, but in lowercase. Use a numerical operation - do
        // not reassign the variable. You may want to review a table
        // of ASCII values as you’re working on this section. Print
        // out the new char value. Hint: you’ll likely have to use
        // casting to get this to work.
	char lowerChar = upperChar + 32;
	
	System.out.println(lowerChar);

        // Uppercase letters are listed in alphabetical order starting
        // with the decimal code of 65. There are 26 letters in the
        // English alphabet and six markings listed in ASCII after the
        // uppercase letters. Lowercase letters begin at the decimal
        // code 97. Thus, the code for a lowercase English letter
        // character in ASCII is 32 values higher than the code for
        // its uppercase counterpart.
	int decimalValue = 65;
	System.out.println(decimalValue);

	char decimalToChar = decimalValue;
	System.out.println(decimalToChar);

	decimalValue = 97;
	System.out.println(decimalValue);

	decimalToChar = decimalValue;
	System.out.println(decimalToChar);

	
        

        // We cast the char variable to an integer to convert it to
        // its character code. For 'T', this is 84. We then add the
        // shift to obtain an integer value of 116. 116 is the
        // character code for 't', and, finally, we cast 116 as a char
        // to obtain a lowercase 't' for charVar.
	char upperCharT = 'T';	
	System.out.println(upperCharT);
	int charTIntValue = upperChar;
	System.out.println(charTIntValue);
	
	char lowerChart = 't';
	System.out.println(lowerChart);
	int chartIntValue = lowerChart;
	System.out.println(chartIntValue);



        
    }
}
