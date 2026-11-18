package org.example;


import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


import static org.junit.Assert.assertEquals;


public class MainTest {


    @Test
    public void testMainMethod() {


        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;


        try {
            System.setOut(new PrintStream(output, true, StandardCharsets.UTF_8));


            Main.main(new String[]{});


            assertEquals("Hello and welcome!",
                    output.toString(StandardCharsets.UTF_8).trim());


        } finally {
            System.setOut(originalOut);
        }
    }
}