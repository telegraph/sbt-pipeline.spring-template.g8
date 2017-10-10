package $package$;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/message")
    public Message message(@RequestParam(value="name", defaultValue="World") String name) {
        Message message = new Message(counter.incrementAndGet(), String.format(template, name));
        return message;
    }
}
