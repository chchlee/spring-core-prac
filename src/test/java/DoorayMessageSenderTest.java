

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;
import com.nhnacademy.edu.springframework.messagesender.DoorayMessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class DoorayMessageSenderTest {
    private DoorayHookSender doorayHookSender;
    private DoorayMessageSender doorayMessageSender;

    @BeforeEach
    void setUp() {
        doorayHookSender = mock(DoorayHookSender.class);
        doorayMessageSender = new DoorayMessageSender(doorayHookSender);
    }

    @Test
    void sendMessage_테스트() {
        User user = new User("테스트 사용자", "테스트 메시지");
        String message = "테스트 메시지";

        doorayMessageSender.sendMessage(user, message);

        verify(doorayHookSender, times(1)).send(any(DoorayHook.class));
    }
}
