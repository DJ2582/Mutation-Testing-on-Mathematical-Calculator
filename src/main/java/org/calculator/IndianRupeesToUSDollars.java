package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IndianRupeesToUSDollars {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double inrToUsd(double inr) {
        logger.info("[INR TO USD] - " + inr);
        // Assuming a conversion rate, you may update this with real-time rates
        double conversionRate = 0.012;
        double res = inr * conversionRate;
        logger.info("[RESULT - INR TO USD] - " + res);
        return res;
    }
}
