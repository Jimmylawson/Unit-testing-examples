package com.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    DemoUtils demoUtils;



    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executesx$ before the execution  of each test method ");
    }


     @Test
     @DisplayName("Equals and Not Equals")
    void testEqualAndNotEqual(){



         assertEquals(6, demoUtils.add(2,4),"2 + 4 is 6");
         assertNotEquals(6, demoUtils.add(1,9),"1  + 9  must not be 6");
    }

    @Test
    @DisplayName("Testing for Null and Not Null")
    void testNullAndNotNull(){


         String str1 = null;
         String str2 = "luv2code";

         assertNull(demoUtils.checkNull(str1),"Object should be is null");
         assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame(){
        String str1 = "Luv2Code";

        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Academy should be same");
        assertNotSame(str1,demoUtils.getAcademyDuplicate(),"Academy should not be same");

    }

    @DisplayName("True or False")
    @Test
    void testGreaterAndNotGreater(){
        int a = 10;
        int b = 5;
        assertTrue(demoUtils.isGreater(a,b), "This should be true");
        assertFalse(demoUtils.isGreater(b,a),"This should be false");
    }
//    @BeforeAll
//    static void setupBeforeAll(){
//        System.out.println("@BeforeAll executes before the execution of all test methods");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll(){
//        System.out.println("@AfterAll executes after the execution of all test methods");
//    }
//
//    @AfterEach
//    void tearDownAfterEach(){
//        System.out.println("Running @AfterEach");
//        System.out.println();
//    }
}
