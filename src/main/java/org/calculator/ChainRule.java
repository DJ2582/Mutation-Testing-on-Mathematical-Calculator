package org.calculator;
import java.util.ArrayList;
public class ChainRule {
    ArrayList<Integer> rBracketList = new ArrayList<Integer>(), lBracketList = new ArrayList<Integer>(), hasPower = new ArrayList<Integer>();
    ArrayList<String> allTermsBrackets = new ArrayList<String>(), allTermsBracketsWPower = new ArrayList<String>(), derivedTerms = new ArrayList<String>();
    String input;
    public ChainRule(String input){
        this.input=input;
        setBracketLists(input);
    }
    public void setBracketLists(String input){


        for (int i = 0; i < input.length(); i++) {
            char temp1 = input.charAt(i);
            String currentChar = String.valueOf(temp1);
            if (currentChar.equals(")")) {
                rBracketList.add(i);
            } else if (currentChar.equals("(")) {
                lBracketList.add(i);
            }
        }

        if (rBracketList.size() != lBracketList.size()) {
            System.out.println("Brackets are unbalanced");
            return;  // Exit the method if parentheses are unbalanced
        }

        for (int i = lBracketList.size() - 1; i >= 0; i--) {
            int leftIndex = lBracketList.get(i);
            int rightIndex = rBracketList.get(rBracketList.size() - 1 - i);

            // Check if the character after ')' is '^'
            if (rightIndex != rBracketList.size() - 1 && input.charAt(rightIndex + 1) == '^') {
                allTermsBrackets.add(input.substring(leftIndex, rightIndex + 1));
                allTermsBracketsWPower.add(input.substring(leftIndex, rightIndex + 2));
            } else {
                allTermsBracketsWPower.add("0");
            }
        }

    }
    public String action(){


        String currentString = allTermsBracketsWPower.get(0);

        String currentString2 = input.replace(allTermsBrackets.get(0),"u");
        String subbedWithU = MIA.MIA(currentString2);
        String string1 = allTermsBrackets.get(0);
        String string2=((string1.substring(1,string1.length()-1)));
        String derivOfInside = MIA.MIA(string2);
        String derivOfWhole = subbedWithU.replace("u",allTermsBrackets.get(0));
        return ("("+derivOfWhole+")"+"*"+"("+derivOfInside+")");

    }

}
