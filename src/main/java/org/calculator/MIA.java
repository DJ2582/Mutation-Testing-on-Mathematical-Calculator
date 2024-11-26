package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class MIA {
    static String userinput;
    static String term;
    static ArrayList<String> listOfTerms = new ArrayList<String>();
    static ArrayList<String> listOfDerivedTerms = new ArrayList<String>();
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static String MIA(String inp){
        listOfTerms.clear();listOfDerivedTerms.clear();
        userinput = inp;
        MultiInputAnalyzer2 multi1 = new MultiInputAnalyzer2(userinput);
        if (multi1.moreThanOneTerm==false){
            SingleInputAnalyzer randomVar = new SingleInputAnalyzer(userinput);
            return (Main.power_rule_calc());
        }
        else{
            listOfTerms = multi1.getListOfTerms();
            for (int i=0;i<listOfTerms.size();i++){
                SingleInputAnalyzer derivForEachTerm = new SingleInputAnalyzer(listOfTerms.get(i));

                if (i==0){
                    term = Main.power_rule_calc() + multi1.listOfSigns.get(0);
                }
                if ((i>0)&(i!=listOfTerms.size()-1)){
                    term = term + Main.power_rule_calc() +  multi1.listOfSigns.get(i);
                }
                if (i==listOfTerms.size()-1){
                    return (term+Main.power_rule_calc());
                }
            }
        }
        return null;
    }
}
