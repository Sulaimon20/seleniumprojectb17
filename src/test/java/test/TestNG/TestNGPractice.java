package test.TestNG;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGPractice {
        @AfterClass
        public void after_class(){
            System.out.println("AFTER CLASS is running.....");
        }
        @BeforeClass
        public void before_class(){
            System.out.println("BEFORE CLASS is running............");
        }

        @BeforeMethod
        public void setUp(){ //установить
            System.out.println("Before Method is running...");
        }
        @AfterMethod
        public void tearDown(){//снести
            System.out.println("After method is running...");
        }
        @Test
        public void test1(){
            System.out.println("Test1 running...");
            String actualTitle="Homepage";
            String expectedTitle="Homepage";
            Assert.assertEquals(actualTitle, expectedTitle);





        }
        @Test
        public void test2(){
            System.out.println("Test2 is running...");

        }
        @Ignore
        @Test
        public void test3(){
            String actualTitle="Amazon prime";
            String expectedTitle="prime";
            String testString="sdkjfhskjdhf";

            Assert.assertTrue(actualTitle.contains(expectedTitle));
            Assert.assertTrue(actualTitle.contains(testString));


        }



}
