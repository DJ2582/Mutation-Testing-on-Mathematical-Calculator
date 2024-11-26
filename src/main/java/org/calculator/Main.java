package org.calculator;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    static boolean switch_flag = false;
    public static void main(String[] args) {
        System.out.print("Good to Go..........................\n");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("*************************CALCULATOR**********************\n");
            System.out.print("What do you want to do ?\n");
            System.out.print(   "1. Absolute Value " +
                    "           \n2. Square Root of Number  " +
                    "           \n3. Factorial of number " +
                    "           \n3. Exponential of number " +
                    "           \n4. Modulus(Reminder of number) " +
                    "           \n5. Natural Logarithm " +
                    "           \n6. Base 10 Logarithm " +
                    "           \n7. Mean " +
                    "           \n8. Median " +
                    "           \n9. Standard Deviation " +
                    "           \n10. Variance " +
                    "           \n11. Percentage " +
                    "           \n12. Power " +
                    "           \n13. Cube root of number " +
                    "           \n14. Sine " +
                    "           \n15. Cosine " +
                    "           \n16. Tangent " +
                    "           \n17. Arcsine " +
                    "           \n18. Arccosine " +
                    "           \n19. Arctangent " +
                    "           \n20. Sinh " +
                    "           \n21. Cosh " +
                    "           \n22. Tanh " +
                    "           \n23. Sum of the array " +
                    "           \n24. Round to Decimal Places " +
                    "           \n25. Round to Nearest Integer " +
                    "           \n26. GCD " +
                    "           \n27. LCM " +
                    "           \n28. Degrees to Radians " +
                    "           \n29. Radians to Degrees " +
                    "           \n30. Compound Interest " +
                    "           \n31. Celsius to Fahrenheit " +
                    "           \n32. Fahrenheit to Celsius " +
                    "           \n33. Fibonacci " +
                    "           \n34. Solve Simple Equation " +
                    "           \n35. Solve Quadratic Equation " +
                    "           \n36. Body Mass Index " +
                    "           \n37. US Dollars To Indian Rupees " +
                    "           \n38. Indian Rupees To US Dollars " +
                    "           \n39. Centimeters to Millimeters " +
                    "           \n40. Meters to Centimeters " +
                    "           \n41. Factorial " +
                    "           \n42. Solve Derivation " +
                    "           \nAny other integer to Quit\n");
            System.out.print("\n Enter your choice : ");
            int ch = sc.nextInt();
            double res = 0;
            double num, pow,intNum1,intNum2;
            switch (ch) {
                case (1): // Absolute Value
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = AbsoluteValue.absoluteValue(num);
                    break;
                case (2): // SquareRoot
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = SquareRoot.squareRoot(num);
                    break;
                case (3): // Exponential of number
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = Exponential.exponential(num);
                    break;
                case (4): // Modulus
                    System.out.print("Enter first number: ");
                    intNum1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    intNum2 = sc.nextInt();
                    res = Modulus.modulus(intNum1, intNum2);
                    break;
                case (5): // Natural Log
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = Log.log(num);
                    break;
                case (6): // Base 10 Log
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = LogBase10.logBase10(num);
                    break;
                case (7): // Mean
                    System.out.print("Enter the number of values : ");
                    int count = sc.nextInt();
                    double[] values = new double[count];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < count; i++) {
                        values[i] = sc.nextDouble();
                    }
                    res = Mean.mean(values);
                    break;
                case (8): // Median
                    System.out.print("Enter the number of values : ");
                    int countMedian = sc.nextInt();
                    double[] valuesMedian = new double[countMedian];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countMedian; i++) {
                        valuesMedian[i] = sc.nextDouble();
                    }
                    res = Median.median(valuesMedian);
                    break;
                case (9): // Standard Deviation
                    System.out.print("Enter the number of values : ");
                    int countSD = sc.nextInt();
                    double[] valuesSD = new double[countSD];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countSD; i++) {
                        valuesSD[i] = sc.nextDouble();
                    }
                    res = Standarddeviation.standardDeviation(valuesSD);
                    break;
                case (10): // Variance
                    System.out.print("Enter the number of values : ");
                    int countVariance = sc.nextInt();
                    double[] valuesVariance = new double[countVariance];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < countVariance; i++) {
                        valuesVariance[i] = sc.nextDouble();
                    }
                    res = Variance.variance(valuesVariance);
                    break;
                case (11): // Percentage
                    System.out.print("Enter value: ");
                    intNum1 = sc.nextDouble();
                    System.out.print("Enter total: ");
                    intNum2 = sc.nextDouble();
                    res = Percentage.percentage(intNum1, intNum2);
                    break;
                case (12): // Power
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    System.out.print("Enter power : ");
                    pow = sc.nextDouble();
                    res = Power.power(num, pow);
                    break;
                case (13): // Cube Root
                    System.out.print("Enter the number: ");
                    num = sc.nextDouble();
                    res = CubeRoot.cubeRoot(num);
                    break;
                case (14): // Sine
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Sine.sine(num);
                    break;
                case (15): // Cosine
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Cosine.cosine(num);
                    break;
                case (16): // Tangent
                    System.out.print("Enter angle in radians : ");
                    num = sc.nextDouble();
                    res = Tangent.tangent(num);
                    break;
                case (17): // Arcsine
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arcsine.arcsine(num);
                    break;
                case (18): // Arccosine
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arccosine.arccosine(num);
                    break;
                case (19): // Arctangent
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Arctangent.arctangent(num);
                    break;
                case (20): // Sinh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Sinh.sinh(num);
                    break;
                case (21): // Cosh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Cosh.cosh(num);
                    break;
                case (22): // Tanh
                    System.out.print("Enter value : ");
                    num = sc.nextDouble();
                    res = Tanh.tanh(num);
                    break;
                case (23): // Sum of the Array
                    System.out.print("Enter the number of values : ");
                    int count1 = sc.nextInt();
                    double[] values1 = new double[count1];
                    System.out.print("Enter the values separated by spaces:\n");
                    for (int i = 0; i < count1; i++) {
                        values1[i] = sc.nextDouble();
                    }
                    res = SumofArray.sumofArray(values1);
                    break;
                case (24): // Round to Decimal Places
                    System.out.print("Enter number : ");
                    num = sc.nextDouble();
                    System.out.print("Enter decimal places : ");
                    int decimalPlaces = sc.nextInt();
                    res = RoundToDecimal.roundToDecimalPlaces(num, decimalPlaces);
                    break;
                case (25): // Round to Nearest Integer
                    System.out.print("Enter number : ");
                    num = sc.nextDouble();
                    res = RoundToInteger.roundToNearestInteger(num);
                    break;
                case (26): // GCD
                    System.out.print("Enter first number: ");
                    intNum1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    intNum2 = sc.nextInt();
                    res = GCD.gcd(intNum1, intNum2);
                    break;
                case (27): // LCM
                    System.out.print("Enter first number: ");
                    intNum1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    intNum2 = sc.nextInt();
                    res = LCM.lcm(intNum1, intNum2);
                    break;
                case (28): // Degrees to Radians
                    System.out.print("Enter degrees : ");
                    num = sc.nextDouble();
                    res = DegreesToRadians.degreesToRadians(num);
                    break;
                case (29): // Radians to Degrees
                    System.out.print("Enter radians : ");
                    num = sc.nextDouble();
                    res = RadiansToDegrees.radiansToDegrees(num);
                    break;
                case (30): // Radians to Degrees
                    System.out.print("Enter Principal: ");
                    intNum1 = sc.nextDouble();
                    System.out.print("Enter Rate: ");
                    intNum2 = sc.nextDouble();
                    System.out.print("Enter Time (years): ");
                    double time = sc.nextDouble();
                    res = CompoundInterest.compoundInterest(intNum1, intNum2, time);
                    break;
                case (31): // Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius : ");
                    num = sc.nextDouble();
                    res = CelsiusToFehrenheit.celsiusToFahrenheit(num);
                    break;
                case (32): // Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit : ");
                    num = sc.nextDouble();
                    res = FarenheitToCelsius.fahrenheitToCelsius(num);
                    break;
                case (33): // Fibonacci
                    System.out.print("Enter the position (n): ");
                    intNum1 = sc.nextInt();
                    res = Fibonacci.fibonacci(intNum1);
                    System.out.println("Fibonacci number: " + res);
                    break;

                case (34): // Solve Simple Equation
                    System.out.print("Enter only coefficients of the simple equation (e.g., 'a*x + b = c', then enter 'a,b,c'): ");
                    sc.nextLine(); // Consume newline
                    String simpleEquation = sc.nextLine();
                    res = SolveSimpleEquation.solveSimpleEquation(simpleEquation);
                    break;
                case (35): // Solve Quadratic Equation
                    System.out.print("Enter the coefficients of the quadratic equation (e.g., 'a*x^2 + b*x + c = 0'): input 'a,b,c':");
                    sc.nextLine(); // Consume newline
                    String quadraticEquation = sc.nextLine();
                    res = SolveQuadraticEquation.solveQuadraticEquation(quadraticEquation);
                    break;
                case (36): // Body mass index
                    System.out.print("Enter weight (in kg): ");
                    intNum1 = sc.nextDouble();
                    System.out.print("Enter height (in meters): ");
                    intNum2 = sc.nextDouble();
                    res = BMI.calculateBMI(intNum1, intNum2);
                    break;

                case (37): // US Dollars To Indian Rupees
                    System.out.print("Enter amount in USD : ");
                    num = sc.nextDouble();
                    res = USDollarsToIndianRupees.usdToInr(num);
                    break;
                case (38): // Indian Rupees to US Dollars
                    System.out.print("Enter amount in INR : ");
                    num = sc.nextDouble();
                    res = IndianRupeesToUSDollars.inrToUsd(num);
                    break;
                case (39): // Centimeters to Millimeters
                    System.out.print("Enter length in centimeters : ");
                    num = sc.nextDouble();
                    res = CentimetersToMillimeters.centimetersToMillimeters(num);
                    break;
                case (40): // Meters to Centimeters
                    System.out.print("Enter length in meters : ");
                    num = sc.nextDouble();
                    res = MetersToCentimeters.metersToCentimeters(num);
                    break;
                case (41): // Factorial
                    do {
                        System.out.print("Enter no : ");
                        num = (int) sc.nextDouble();
                        if (num < 0)
                            System.out.print("Please enter a positive no. !!!\n");
                    } while (num < 0);
                    res = Factorial.factorial(num);
                    break;
                case(42): // Solve Derivative
                    ArrayList<String> all_terms = new ArrayList<String>();
                    System.out.print("Enter the type of Derivative to be solved for: ( Power Rule, Product Rule, Chain Rule, Log Rule)");
                    sc.nextLine();
                    String input = sc.nextLine();
                    if (input.equals("Power Rule")){
                        System.out.print("Enter your function: (MULTIPLE TERMS AVAILABLE e.g. 'ax^b+cx^d+ex^f+...'): ");
                        String function = sc.next();
                        Process_power_rule.process_power_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function: ");
                            sc.reset();
                            function=sc.next();
                            Process_power_rule.process_power_rule(function);
                        }

                        System.out.print("The derivative is: "+ Process_power_rule.process_power_rule(function) + "\n");

                    }
                    if (input.equals("Product Rule")){
                        System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
                        String function = sc.next();
                        Process_product_rule.process_product_rule(function);
                        while (switch_flag==false) {
                            System.out.print("Enter your function (form: (ax^b+cx^d)*(ex^f+gx^h)): ");
                            sc.reset();
                            function = sc.next();
                            Process_product_rule.process_product_rule(function);

                        }
                        System.out.print("Derivative: "+ Process_product_rule.process_product_rule(function) + "\n");

                    }
                    if (input.equals("Chain Rule")){
                        System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
                        String function = sc.next();
                        Process_chain_rule.process_chain_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function (form: (ax^b+cx^d)^e): ");
                            sc.reset();
                            function=sc.next();
                            Process_chain_rule.process_chain_rule(function);

                        }

                        ChainRule obj = new ChainRule(function);
                        System.out.print("Derivative: "+ Process_chain_rule.process_chain_rule(function) + "\n");

                    }
                    if (input.equals("Log Rule")){
                        System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
                        String function = sc.next();
                        Process_log_rule.process_log_rule(function);
                        while (switch_flag==false){
                            System.out.print("Enter your function (form: a^x, MULTIPLE TERMS NOT AVAILABLE): ");
                            sc.reset();
                            function=sc.next();
                            Process_log_rule.process_log_rule(function);
                        }

                        System.out.print("Derivative: "+ Process_log_rule.process_log_rule(function) + "\n");

                    }

                default:
                    System.out.print("Closing the application\n");
                    return;
            }
            System.out.print("Result : " + res + "\n");
        }
    }

    public static String log_rule_calc(String term){
        String number = "";
        for (int placeInString = 0;placeInString<term.length();placeInString++){
            if (String.valueOf(term.charAt(placeInString)).equals("^")){
                number=term.substring(0,placeInString);

            }
        }
        Double.parseDouble(number);
        return (term+"ln("+number+")");

    }

    public static String power_rule_calc(){
        if (SingleInputAnalyzer.getVariable().equals("")){
            return "0";
        }
        double coefficient=Double.parseDouble(SingleInputAnalyzer.getCoefficient());
        double power = Double.parseDouble(SingleInputAnalyzer.getPower());
        final String VARIABLE = SingleInputAnalyzer.getVariable();
        String newCoefficient = String.valueOf(coefficient*power);
        String newPower = String.valueOf(power-1);
        String newTerm = newCoefficient+VARIABLE+"^"+newPower;
        return newTerm;
    }


    public static String product_rule_calc(String input){
        String fx="",gx="";
        boolean switch1=false,switch2=false;
        boolean entireSwitch1=true,entireSwitch2=false;;
        for (int i=0;i<input.length();i++){
            if (entireSwitch1==true){
                if (switch1==true){
                    if (!String.valueOf(input.charAt(i)).equals(")")){

                        fx+=String.valueOf(input.charAt(i));
                    }
                }
                if (String.valueOf(input.charAt(i)).equals("(")){
                    switch1=true;
                }
                if (String.valueOf(input.charAt(i)).equals(")")){
                    switch1=false;
                    entireSwitch1=false;
                    entireSwitch2=true;
                    i+=1;
                }
            }
            if (entireSwitch2==true){

                if (switch2==true){

                    if (!String.valueOf(input.charAt(i)).equals(")")){

                        gx+=String.valueOf(input.charAt(i));
                    }
                }
                if (String.valueOf(input.charAt(i)).equals("(")){

                    switch2=true;
                }
                if (String.valueOf(input.charAt(i)).equals(")")){
                    switch2=false;
                    entireSwitch2=false;
                }
            }
        }
        String dfdx = MIA.MIA(fx);
        String dgdx = MIA.MIA(gx);
        return ("("+gx+")"+"*"+"("+dfdx+")"+"+"+"("+fx+")"+"*"+"("+dgdx+")");
    }
}
