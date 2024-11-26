package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Process_chain_rule {
    private static final Logger logger = LogManager.getLogger(Main.class);
    static boolean switch_flag = false;
    public static String process_chain_rule(String input){
        ChainRule obj = new ChainRule(input);
        try{
            obj.action();
            switch_flag=true;

        }
        catch (Exception ex){
            System.out.print("Invalid input.\n");
            switch_flag=false;
            return "Invalid input";
        }
        return obj.action();
    }
}
