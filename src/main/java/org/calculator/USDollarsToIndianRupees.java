package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class USDollarsToIndianRupees {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double usdToInr(double usd) {
        logger.info("[USD TO INR] - " + usd);
        // Assuming a conversion rate, you may update this with real-time rates
        double conversionRate = 80.61;
        double res = usd * conversionRate;
        logger.info("[RESULT - USD TO INR] - " + res);
        return res;
    }
}
