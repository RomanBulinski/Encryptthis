import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void testMethod(){
        Main main = new Main();
        assertEquals( "72olle 72olle", main.encryptThis("Hello Hello")  );
    }

    @Test
    public void testMethodEmpty(){
        Main main = new Main();
        assertEquals( "", main.encryptThis("")  );
    }

    @Test
    public void testMethodOneLetter(){
        Main main = new Main();
        assertEquals( "65", main.encryptThis("A")  );
    }

    @Test
    public void testMethodTwoLetter(){
        Main main = new Main();
        assertEquals( "65 119", main.encryptThis("A w")  );
    }



    @Test
    public void testMethod2(){
        Main main = new Main();
        assertEquals( "65 119esi 111dl 111lw 108dvei 105n 97n 111ka", main.encryptThis("A wise old owl lived in an oak")  );
    }

}

//Kata.encryptThis("Hello") =>
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"