import org.calculator.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testPositiveAbsoluteValue() {
        assertEquals(8.0, AbsoluteValue.absoluteValue(8.0), 0.001);
    }

    @Test
    public void testNegativeAbsoluteValue() {
        assertEquals(8.0, AbsoluteValue.absoluteValue(-8.0), 0.001);
    }

    @Test
    public void testZeroAbsoluteValue() {
        assertEquals(0.0, AbsoluteValue.absoluteValue(0.0), 0.001);
    }

    // BMI Test Cases
    @Test
    public void testNormalBMI() {
        assertEquals(24.489795918367346, BMI.calculateBMI(75, 1.75), 0.01);
    }

    @Test
    public void testUnderweightBMI() {
        assertEquals(14.692378328741967, BMI.calculateBMI(40, 1.65), 0.01);
    }

    @Test
    public void testOverweightBMI() {
        assertEquals(29.320987654320987, BMI.calculateBMI(95, 1.80), 0.01);
    }

    @Test
    public void testZeroHeightForBMI() {
        assertTrue(Double.isNaN(BMI.calculateBMI(75, 0)));
    }

    @Test
    public void testNegativeHeightForBMI() {
        assertTrue(Double.isNaN(BMI.calculateBMI(75, -1.75)));
    }

    // Compound Interest Test Cases
    @Test
    public void testStandardCompoundInterest() {
        assertEquals(1041.8625000000002, CompoundInterest.compoundInterest(900, 5, 3), 0.01);
    }

    @Test
    public void testZeroRateForCompoundInterest() {
        assertEquals(900.0, CompoundInterest.compoundInterest(900, 0, 5), 0.01);
    }

    // Cube Root Test Cases
    @Test
    public void testCubeRootOfPositiveNumber() {
        assertEquals(4.0, CubeRoot.cubeRoot(64.0), 0.001);
    }

    @Test
    public void testCubeRootOfNegativeNumber() {
        assertEquals(-4.0, CubeRoot.cubeRoot(-64.0), 0.001);
    }

    @Test
    public void testCubeRootOfZero() {
        assertEquals(0.0, CubeRoot.cubeRoot(0.0), 0.001);
    }

    // Fibonacci Test Cases
    @Test
    public void testFibonacciAtFirstPosition() {
        assertEquals(1, Fibonacci.fibonacci(1), 0.001);
    }

    @Test
    public void testFibonacciAtSecondPosition() {
        assertEquals(1, Fibonacci.fibonacci(2), 0.001);
    }

    @Test
    public void testFibonacciAtThirdPosition() {
        assertEquals(2, Fibonacci.fibonacci(3), 0.001);
    }

    @Test
    public void testFibonacciAtTenthPosition() {
        assertEquals(55, Fibonacci.fibonacci(10), 0.001);
    }

    @Test
    public void testInvalidFibonacciPosition() {
        assertEquals(-1, Fibonacci.fibonacci(0), 0.001);
    }

    @Test
    public void testNegativeFibonacciPosition() {
        assertEquals(-1, Fibonacci.fibonacci(-5), 0.001);
    }

    // GCD Test Cases
    @Test
    public void testGCDOfPositiveNumbers() {
        assertEquals(36.0, GCD.gcd(72, 36), 0.001);
    }

    @Test
    public void testGCDWithOneZero() {
        assertEquals(15, GCD.gcd(15, 0), 0.001);
    }

    @Test
    public void testGCDOfNegativeNumbers() {
        assertEquals(-6, GCD.gcd(-18, -24), 0.001);
    }

    // LCM Test Cases
    @Test
    public void testLCMOfPositiveNumbers() {
        assertEquals(180, LCM.lcm(36, 45), 0.001);
    }

    @Test
    public void testLCMWithOneZero() {
        assertEquals(0, LCM.lcm(0, 25), 0.001);
    }

    @Test
    public void testLCMOfNegativeNumbers() {
        assertEquals(-72, LCM.lcm(-18, -24), 0.001);
    }

    // Modulus Test Cases
    @Test
    public void testModulusOfPositiveNumbers() {
        assertEquals(2, Modulus.modulus(20, 6), 0.001);
    }

    @Test
    public void testModulusWithNegativeDividend() {
        assertEquals(-2, Modulus.modulus(-20, 6), 0.001);
    }

    @Test
    public void testModulusWithNegativeDivisor() {
        assertEquals(2, Modulus.modulus(20, -6), 0.001);
    }

    @Test
    public void testModulusWithBothNegative() {
        assertEquals(-2, Modulus.modulus(-20, -6), 0.001);
    }

    @Test
    public void testModulusWithZeroDividend() {
        assertEquals(0, Modulus.modulus(0, 6), 0.001);
    }

    // Percentage Test Cases
    @Test
    public void testValidPercentage() {
        assertEquals(40.0, Percentage.percentage(40, 100), 0.001);
    }

    @Test
    public void testFullPercentage() {
        assertEquals(100.0, Percentage.percentage(100, 100), 0.001);
    }

    @Test
    public void testZeroTotalPercentage() {
        assertTrue(Double.isNaN(Percentage.percentage(50, 0)));
    }

    @Test
    public void testNegativeValueForPercentage() {
        assertEquals(-20.0, Percentage.percentage(-20, 100), 0.001);
    }

    @Test
    public void testZeroValueForPercentage() {
        assertEquals(0.0, Percentage.percentage(0, 100), 0.001);
    }

    // Array Sum Test Cases
    @Test
    public void testSumOfPositiveNumbersArray() {
        double[] values = {2.0, 3.0, 5.0, 7.0};
        assertEquals(17.0, SumofArray.sumofArray(values), 0.001);
    }

    @Test
    public void testSumOfNegativeNumbersArray() {
        double[] values = {-1.0, -2.0, -3.0, -4.0};
        assertEquals(-10.0, SumofArray.sumofArray(values), 0.001);
    }

    // Square Root Test Cases
    @Test
    public void testPositiveSquareRoot() {
        assertEquals(5.0, SquareRoot.squareRoot(25), 0.001);
    }

    @Test
    public void testZeroSquareRoot() {
        assertEquals(0.0, SquareRoot.squareRoot(0), 0.001);
    }

    @Test
    public void testNegativeSquareRoot() {
        assertEquals(Double.NaN, SquareRoot.squareRoot(-16), 0.001);
    }

    // Factorial Test Cases
    @Test
    public void testPositiveFactorial() {
        assertEquals(720, Factorial.factorial(6), 0.001);
    }

    @Test
    public void testZeroFactorial() {
        assertEquals(1, Factorial.factorial(0), 0.001);
    }

    @Test
    public void testNegativeFactorial() {
        assertEquals(Double.NaN, Factorial.factorial(-4), 0.001);
    }

    // Logarithm Test Cases
    @Test
    public void testPositiveLogarithm() {
        assertEquals(9.210340371976184, Log.log(10000), 0.1);
    }

    @Test
    public void testZeroLogarithm() {
        assertEquals(Double.NEGATIVE_INFINITY, Log.log(0), 0.001);
    }

    @Test
    public void testNegativeLogarithm() {
        assertEquals(Double.NaN, Log.log(-10), 0.001);
    }

    // Log Base 10 Test Cases
    @Test
    public void testPositiveLogBase10() {
        assertEquals(3.0, LogBase10.logBase10(1000), 0.001);
    }

    @Test
    public void testZeroLogBase10() {
        assertEquals(Double.NEGATIVE_INFINITY, LogBase10.logBase10(0), 0.001);
    }

    @Test
    public void testNegativeLogBase10() {
        assertEquals(Double.NaN, LogBase10.logBase10(-100), 0.001);
    }

    // Exponential Test Cases
    @Test
    public void testPositiveExponential() {
        assertEquals(54.5981, Exponential.exponential(4), 0.001);
    }

    @Test
    public void testZeroExponential() {
        assertEquals(1.0, Exponential.exponential(0), 0.001);
    }

    @Test
    public void testNegativeExponential() {
        assertEquals(0.01831563888873418, Exponential.exponential(-4), 0.001);
    }

    // Power Test Cases
    @Test
    public void testPositivePower() {
        assertEquals(128, Power.power(2, 7), 0.001);
    }

    @Test
    public void testZeroPower() {
        assertEquals(1, Power.power(5, 0), 0.001);
    }

    @Test
    public void testNegativePower() {
        assertEquals(0.125, Power.power(2, -3), 0.001);
    }

    @Test
    public void testSineFunction() {
        assertEquals(0.866, Sine.sine(1.05), 0.1);
    }

    @Test
    public void testCosineFunction() {
        assertEquals(0.5, Cosine.cosine(1.047), 0.001);
    }

    @Test
    public void testTangentFunction() {
        assertEquals(1.732, Tangent.tangent(1.047), 0.1);
    }

    // Unit Test for Inverse Trigonometric Functions
    @Test
    public void testArcsineFunction() {
        assertEquals(1.047, Arcsine.arcsine(0.866), 0.1);
    }

    @Test
    public void testArccosineFunction() {
        assertEquals(1.047, Arccosine.arccosine(0.5), 0.1);
    }

    @Test
    public void testArctangentFunction() {
        assertEquals(0.463, Arctangent.arctangent(0.5), 0.1);
    }

    // Unit Test for Hyperbolic Functions
    @Test
    public void testSinhFunction() {
        assertEquals(2.94217428809568, Sinh.sinh(1.8), 0.1);
    }

    @Test
    public void testCoshFunction() {
        assertEquals(2.352409615243247, Cosh.cosh(1.5), 0.001);
    }

    @Test
    public void testTanhFunction() {
        assertEquals(0.964, Tanh.tanh(2.0), 0.1);
    }

    // Unit Test for Decimal Rounding Function
    @Test
    public void testRoundToDecimalPlacesFunction() {
        assertEquals(2.718, RoundToDecimal.roundToDecimalPlaces(Math.E, 3), 0.001);
    }

    // Unit Test for Rounding to Nearest Integer Function
    @Test
    public void testRoundToNearestIntegerFunction() {
        assertEquals(5.0, RoundToInteger.roundToNearestInteger(5.4), 0.001);
    }

    // Unit Test for Angle Conversion Functions
    @Test
    public void testDegreesToRadiansFunction() {
        assertEquals(3.1416, DegreesToRadians.degreesToRadians(180), 0.001);
    }

    @Test
    public void testRadiansToDegreesFunction() {
        assertEquals(90.0, RadiansToDegrees.radiansToDegrees(Math.PI / 2), 0.001);
    }

    // Unit Test for Temperature Conversion Functions
    @Test
    public void testCelsiusToFahrenheitFunction() {
        assertEquals(212.0, CelsiusToFehrenheit.celsiusToFahrenheit(100.0), 0.1);
    }

    @Test
    public void testFahrenheitToCelsiusFunction() {
        assertEquals(0.0, FarenheitToCelsius.fahrenheitToCelsius(32.0), 0.1);
    }

    // Unit Test for Currency Conversion Functions
    @Test
    public void testUsdToInrConversion() {
        assertEquals(8061.0, USDollarsToIndianRupees.usdToInr(100), 5);
    }

    @Test
    public void testInrToUsdConversion() {
        assertEquals(53.34, IndianRupeesToUSDollars.inrToUsd(4445), 0.001);
    }

    // Unit Test for Unit Conversion Functions
    @Test
    public void testCentimetersToMillimetersConversion() {
        assertEquals(100.0, CentimetersToMillimeters.centimetersToMillimeters(10), 0.001);
    }

    @Test
    public void testMetersToCentimetersConversion() {
        assertEquals(500.0, MetersToCentimeters.metersToCentimeters(5), 0.001);
    }

    // Unit Test for Statistical Functions
    @Test
    public void testMeanFunction() {
        assertEquals(5.2, Mean.mean(new double[]{3, 4, 5, 6, 8}), 0.001);
    }

    @Test
    public void testMedianOddArray() {
        assertEquals(4.0, Median.median(new double[]{3, 4, 2, 6, 8}), 0.001);
    }

    @Test
    public void testMedianEvenArray() {
        assertEquals(5.5, Median.median(new double[]{3, 5, 6, 8}), 0.001);
    }

    @Test
    public void testStandardDeviationFunction() {
        assertEquals(3.1368774282716245, Standarddeviation.standardDeviation(new double[]{3, 5, 8, 9, 12}), 0.001);
    }

    @Test
    public void testVarianceFunction() {
        assertEquals(9.84, Variance.variance(new double[]{3, 5, 8, 9, 12}), 0.001);
    }

    // Unit Test for Equation Solving Functions
    @Test
    public void testSolveSimpleEquationValid() {
        assertEquals(2.0, SolveSimpleEquation.solveSimpleEquation("2,3,7"), 0.001);
    }

    @Test
    public void testSolveSimpleEquationInvalid() {
        assertEquals(Double.NaN, SolveSimpleEquation.solveSimpleEquation("0,2,5"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquationInvalidDiscriminant() {
        assertEquals(Double.NaN, SolveQuadraticEquation.solveQuadraticEquation("3,-2,5"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquationRealRoots() {
        assertEquals(4.0, SolveQuadraticEquation.solveQuadraticEquation("1,-8,16"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquationZeroCoefficient() {
        assertEquals(Double.NaN, SolveQuadraticEquation.solveQuadraticEquation("0,-8,16"), 0.001);
    }

    @Test
    public void testSolveQuadraticEquationComplexRoots() {
        assertTrue(Double.isNaN(SolveQuadraticEquation.solveQuadraticEquation("1,1,1")));
    }

    // Unit Test for Power Rule Processing
    @Test
    public void testProcessPowerRuleValid() {
        assertEquals("16.0x^3.0+15.0x^2.0+14.0x^1.0+0", Process_power_rule.process_power_rule("4x^4+5x^3+7x^2+2"));
    }

    @Test
    public void testProcessPowerRuleInvalidInput() {
        assertEquals("Invalid input", Process_power_rule.process_power_rule("4xx5"));
    }

    // Unit Test for Product Rule Processing
    @Test
    public void testProcessProductRuleValid() {
        assertEquals("(4x^5+6x^2)*(21.0x^2.0+5.0x^0.0)+(7x^3+5x)*(20.0x^4.0+12.0x^1.0)", Process_product_rule.process_product_rule("(7x^3+5x)*(4x^5+6x^2)"));
    }

    @Test
    public void testProcessProductRuleInvalidInput() {
        assertEquals("Invalid input", Process_product_rule.process_product_rule("(7x^3+5xxxxx)"));
    }

    // Unit Test for Chain Rule Processing
    @Test
    public void testProcessChainRuleValid() {
        assertEquals("(4.0(4x^3+7x^2)^3.0)*(12.0x^2.0+14.0x^1.0)", Process_chain_rule.process_chain_rule("(4x^3+7x^2)^4"));
    }

    @Test
    public void testProcessChainRuleInvalidInput() {
        assertEquals("Invalid input", Process_chain_rule.process_chain_rule("3x^2+5x"));
    }

    // Unit Test for Logarithm Rule Processing
    @Test
    public void testProcessLogRuleValid() {
        assertEquals("5^xln(5)", Process_log_rule.process_log_rule("5^x"));
    }

    @Test
    public void testProcessLogRuleInvalidInput() {
        assertEquals("2^xln(2)", Process_log_rule.process_log_rule("2^x"));
    }

    // Unit Test for MIA Processing
    @Test
    public void testMIAProcessing() {
        assertEquals("16.0x^3.0+15.0x^2.0+14.0x^1.0+0", MIA.MIA("4x^4+5x^3+7x^2+2"));
    }

    // Unit Test for Product Rule Calculation
    @Test
    public void testProductRuleCalculation() {
        assertEquals("(4x^5+6x^2)*(21.0x^2.0+5.0x^0.0)+(7x^3+5x)*(20.0x^4.0+12.0x^1.0)", Main.product_rule_calc("(7x^3+5x)*(4x^5+6x^2)"));
    }

    // Unit Test for Logarithm Rule Calculation
    @Test
    public void testLogRuleCalculation() {
        assertEquals("5^xln(5)", Main.log_rule_calc("5^x"));
    }

    @Test
    public void testAllPositiveNumbers() {
        double[] input = {10, 20, 30, 40};
        double expected = 77.0; // (50 + 68 + 86 + 104) / 4 = 86
        assertEquals(expected, AverageCelsiusToFahrenheit.averageCelsiusToFahrenheit(input), 0.001);
    }

    @Test
    public void testAllNegativeNumbers() {
        double[] input = {-10, -20, -30};
        double expected = -4.0; // (14 + (-4) + (-22)) / 3 = 14
        assertEquals(expected, AverageCelsiusToFahrenheit.averageCelsiusToFahrenheit(input), 0.001);
    }

    @Test
    public void testPositiveAndNegativeNumbers() {
        double[] input = {-10, 0, 25, 30};
        double expected = 52.25; // (14 + 32 + 77 + 86) / 4 = 61
        assertEquals(expected, AverageCelsiusToFahrenheit.averageCelsiusToFahrenheit(input), 0.001);
    }

    @Test
    public void testBMIPercentage() {
        double weight = 70.0; // kg
        double height = 1.75; // meters
        double totalPopulation = 5000;

        double result = BMIPercentage.calculateBMIPercentage(weight, height, totalPopulation);
        assertEquals(0.4571428571428572, result, 0.01); // Expected percentage with a delta for precision
    }

    @Test
    public void testValidPositiveNumbers() {
        double[] input = {1, 2, 3, 4};
        double expected = 33.0; // 1! + 2! + 3! + 4! = 1 + 2 + 6 + 24 = 33
        assertEquals(expected, SumOfFactorials.sumOfFactorials(input), 0.001);
    }

    @Test
    public void testInputWithZerosAndOnes() {
        double[] input = {0, 1, 1};
        double expected = 3.0; // 0! + 1! + 1! = 1 + 1 + 1 = 3
        assertEquals(expected, SumOfFactorials.sumOfFactorials(input), 0.001);
    }
}
