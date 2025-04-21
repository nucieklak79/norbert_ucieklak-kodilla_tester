package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonBMISources {


        static Stream<Arguments> provideDataForBMITests() {
            double testHeight = 1.81;
            double testHeightSquared = testHeight * testHeight;
        return Stream.of(
                Arguments.of(testHeight, 14.9 * testHeightSquared, "Very severely underweight"),
                Arguments.of(testHeight, 15.0 * testHeightSquared, "Severely underweight"),
                Arguments.of(testHeight, 15.9 * testHeightSquared, "Severely underweight"),
                Arguments.of(testHeight, 16.0 * testHeightSquared, "Underweight"),
                Arguments.of(testHeight, 18.4 * testHeightSquared, "Underweight"),
                Arguments.of(testHeight, 18.5 * testHeightSquared, "Normal (healthy weight)"),
                Arguments.of(testHeight, 22.0 * testHeightSquared, "Normal (healthy weight)"),
                Arguments.of(testHeight, 24.9 * testHeightSquared, "Normal (healthy weight)"),
                Arguments.of(testHeight, 25.0 * testHeightSquared, "Overweight"),
                Arguments.of(testHeight, 29.9 * testHeightSquared, "Overweight"),
                Arguments.of(testHeight, 30.0 * testHeightSquared, "Obese Class I (Moderately obese)"),
                Arguments.of(testHeight, 34.9 * testHeightSquared, "Obese Class I (Moderately obese)"),
                Arguments.of(testHeight, 35.0 * testHeightSquared, "Obese Class II (Severely obese)"),
                Arguments.of(testHeight, 39.9 * testHeightSquared, "Obese Class II (Severely obese)"),
                Arguments.of(testHeight, 40.0 * testHeightSquared, "Obese Class III (Very severely obese)"),
                Arguments.of(testHeight, 44.9 * testHeightSquared, "Obese Class III (Very severely obese)"),
                Arguments.of(testHeight, 45.0 * testHeightSquared, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(testHeight, 49.9 * testHeightSquared, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(testHeight, 50.0 * testHeightSquared, "Obese Class V (Super Obese)"),
                Arguments.of(testHeight, 59.9 * testHeightSquared, "Obese Class V (Super Obese)"),
                Arguments.of(testHeight, 60.0 * testHeightSquared, "Obese Class VI (Hyper Obese)"),
                Arguments.of(testHeight, 70.0 * testHeightSquared, "Obese Class VI (Hyper Obese)")
        );
    }
}
