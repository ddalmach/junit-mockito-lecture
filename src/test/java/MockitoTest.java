import io.javadev.MessageService;
import io.javadev.WebClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.http.HttpResponse;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MockitoTest {

    @InjectMocks
    @Spy
    private MessageService messageService;

    @Mock
    private WebClient client;

    @Test
    void shouldReturnANonEmptyString() {
        //given
        HttpResponse<String> response;
        when(client.send(Mockito.anyString()))
                .thenReturn("Hello");
        //when
        String messageReceived = messageService.publishMessage();

        //then
        Assertions.assertEquals("Hello", messageReceived);
        Mockito.verify(messageService, times(1)).publishMessage();
    }

}
