package com.yaskovdev.collector;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Slf4j
@Service
@RequiredArgsConstructor
class PersonService {

    private final CollectorConfig config;
    private final KafkaTemplate<String, SocialRatingCalculationRequest> kafka;

    void send(final Person person) {
        final int seed = config.getCalculationSeed();
        log.info("Calculation seed was {}", seed);
        final SocialRatingCalculationRequest request = new SocialRatingCalculationRequest(person.getFirstName(), person.getLastName(), person.getAge(), seed);
        final ListenableFuture<SendResult<String, SocialRatingCalculationRequest>> future = kafka.send("social-rating-calculator", request);
        future.addCallback(new SocialRatingCalculationCallback());
    }
}
