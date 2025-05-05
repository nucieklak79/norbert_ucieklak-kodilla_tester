package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

    @SpringBootTest
    public class ShippingCenterTestSuite {

        @Autowired
        private ShippingCenter shippingCenter;

        @Test
        public void testSendPackageSuccess() {
            String address = "Test Address";
            double weight = 20;
            String result = shippingCenter.sendPackage(address, weight);
            assertEquals("Package delivered to: " + address, result);
        }

        @Test
        public void testSendPackageFail() {
            String address = "Test Address";
            double weight = 40;
            String result = shippingCenter.sendPackage(address, weight);
            assertEquals("Package not delivered to: " + address, result);
        }

        @Test
        public void testAutowiredShippingCenter(){
            assertNotEquals(null, shippingCenter);
        }
    }

