package com.kloia.eventapis.api;

/**
 * Created by zeldalozdemir on 21/04/2017.
 */
public interface CommandHandler<D> {

    long DEFAULT_COMMAND_TIMEOUT = 10000L;

    default long getCommandTimeout() {
        return DEFAULT_COMMAND_TIMEOUT;
    }

    Object execute(D dto) throws Exception;
}
