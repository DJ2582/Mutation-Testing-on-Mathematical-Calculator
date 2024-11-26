package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BMIPercentage {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double calculateBMIPercentage(double weight, double height, double totalPopulation) {
        // Calculate BMI
        double bmi = BMI.calculateBMI(weight, height);

        // Calculate Percentage of BMI with respect to total population
        double percentage = Percentage.percentage(bmi, totalPopulation);

        logger.info("[BMIPercentage] - BMI: " + bmi + ", Percentage: " + percentage);
        return percentage;
    }
}
