import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void testMethod(){
        Main main = new Main();
        assertEquals( "72olle 72olle", main.encryptThis("Hello Hello")  );
    }


}

//Kata.encryptThis("Hello") =>
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"