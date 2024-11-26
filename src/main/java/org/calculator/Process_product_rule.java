package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Process_product_rule {
    static boolean switch_flag = false;
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static String process_product_rule(String input){
        try{

            Main.product_rule_calc(input);
            switch_flag = true;
        }
        catch(Exception ex){
            switch_flag=false;
            System.out.print("Invalid input\n");
            return "Invalid input";
        }

        return Main.product_rule_calc(input);
    }
}
