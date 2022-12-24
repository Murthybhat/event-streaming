import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    private static final String TEST_TOPIC = "test-topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProducerController(@Qualifier("kafkaTemplate") KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Implementing a GET method
    @GetMapping("publish/{message}")
    public String publish_message(
            @PathVariable("message") String message) {
        kafkaTemplate.send(TEST_TOPIC, message);
        return "Message Published on Kafka !";
    }

}