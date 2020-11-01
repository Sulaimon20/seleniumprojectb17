package test.Properties_and_DriverUtilities;

import org.testng.annotations.Test;

public class LearningPropeties {

    @Test
    public void java_properties(){
        //System.getProperty("os.name")).soutv ==>
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        // compiler result ==>  System.getProperty("os.name") = Windows 10


        //System.getProperty("user.name")).soutv ==>
        System.out.println("System.getProperty(\"user name\") = " + System.getProperty("user name"));
        //compiler result ==> System.getProperty("user name") = null

    }
}
