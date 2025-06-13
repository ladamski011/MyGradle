package com.example.hello;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HelloPrinterTest {

    @Test
    void printsHello() {
        HelloPrinter printer = new HelloPrinter();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            printer.printHello();
        } finally {
            System.setOut(original);
        }
        assertEquals("Hello" + System.lineSeparator(), out.toString());
    }
}
