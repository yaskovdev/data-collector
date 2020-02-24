package com.yaskovdev.collector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.annotation.Nonnull;

@Slf4j
class SocialRatingCalculationCallback implements ListenableFutureCallback<SendResult<String, SocialRatingCalculationRequest>> {

    @Override
    public void onSuccess(final SendResult<String, SocialRatingCalculationRequest> result) {
        log.info("Successfully sent, result is {}", result);
    }

    @Override
    public void onFailure(@Nonnull final Throwable e) {
        log.info("Could not send", e);
    }
}
