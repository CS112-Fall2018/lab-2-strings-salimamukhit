/**
* In this class we learned how to use string methods. The additional methods that I chose are string concatination which is
* s.concat(otherString). It connects two strings into one, taking one of them as an argument, so it will come after the other one.
* The other method is s.toUpperCase() -- this method makes all symbols in the string uppercased.
 */
public class StringFun {
    public static void main(String[] args) {
        String s = args[0];
        String otherString = args[1];
        String subString = args[2];
        System.out.println(" "); //some spacing between the lines
        System.out.println("The length of string "+s+" equals to "+s.length());
        System.out.println(" ");
        System.out.println("The string "+s+" is equal to "+otherString+". It is "+s.equals(otherString));
        int startIndex = 2;
        int endIndex = 5;
        if (s.length() > endIndex) {
            System.out.println(" ");
            System.out.println("The substring from 2nd index to 5th index of string "+s+" is "+s.substring(startIndex, endIndex));
        } else {
            System.out.println(" ");
            System.out.println("The substring from 2nd to 5th index cannot be generated in string "+s+" because it's length is less than 5");
        }
        System.out.println(" ");
        System.out.println("Deleting whitspaces at the end and start of string "+s+" results in "+s.trim());
        if (s.contains(subString)) {
            System.out.println(" ");
            System.out.println("The string "+subString+" in string "+s+" first occurence index is "+s.indexOf(subString));
            System.out.println(" ");
            System.out.println("The string "+subString+" in string "+s+" last occurence index is "+s.lastIndexOf(subString));
        } else {
            System.out.println(" ");
            System.out.println("The string "+s+" does not contain "+subString);
        }
        int index = 4;
        if (s.length() > 4) {
            System.out.println(" ");
            System.out.println("The character that takes 4th index in string "+s+" is "+s.charAt(index));
        } else {
            System.out.println(" ");
            System.out.println("The character that takes 4th index in string "+s+" does not exist since it's length is too short");
        }
        System.out.println(" ");
        System.out.println("The concatination of string "+s+" and string "+otherString+" results in "+s.concat(otherString));
        System.out.println(" ");
        System.out.println("The string "+s+" in uppercase results in "+s.toUpperCase());

    }
}


