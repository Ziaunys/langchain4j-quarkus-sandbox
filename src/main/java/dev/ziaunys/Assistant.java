package dev.ziaunys;


import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@RegisterAiService
@ApplicationScoped
public interface Assistant {

    @SystemMessage(
            """
You are a general AI assistant
"""
    )
    String chat(@MemoryId UUID memoryId, @UserMessage String question);
}
