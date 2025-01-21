package dev.ziaunys;

import io.quarkus.qute.TemplateException;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;

@QuarkusTest
public class TestAssistant {

    @Inject Assistant assistant;

    @Test
    void shouldThrowTemplateException(){
        assertThrows(TemplateException.class, () -> assistant.chat(UUID.randomUUID(), "This should throw an exception because I have included the following: {foo}"));
    }

}
