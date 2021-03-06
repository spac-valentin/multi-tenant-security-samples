package sample.issuers.inbox.message;

import java.util.Optional;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Rob Winch
 */
public interface MessageService {
	Flux<Message> inbox();
	Mono<Message> findById(String id);
	Mono<Void> deleteById(String id);
}
