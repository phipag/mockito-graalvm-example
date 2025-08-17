package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MainTest {

    @Mock
    private MessageClass messageClass;

    @Test
    void testGetMessage() {
        when(messageClass.getMessage()).thenReturn("Hello GraalVM from Mockito");

        String result = Main.getMessage(messageClass);

        assertEquals("Hello GraalVM from Mockito", result);
    }
}
