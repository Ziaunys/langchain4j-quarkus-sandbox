package dev.ziaunys;

import dev.langchain4j.data.message.UserMessage;
import io.quarkiverse.langchain4j.guardrails.InputGuardrail;
import io.quarkiverse.langchain4j.guardrails.InputGuardrailResult;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.jboss.logging.Logger;

@Singleton
public class UnreachableGuardrail implements InputGuardrail {

    @Inject
    Logger log;

    @Override
    public InputGuardrailResult validate(UserMessage userMessage) {
        log.info("This guardrail should never get called");
        return success();
    }
}
