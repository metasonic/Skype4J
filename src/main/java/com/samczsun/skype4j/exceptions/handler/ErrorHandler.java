package com.samczsun.skype4j.exceptions.handler;

/**
 * Represents a handler which will handle errors produced by the API
 */
public interface ErrorHandler {
    /**
     * Handle the exception. Any exceptions thrown by this ErrorHandler will be silently swallowed and ignored
     *
     * @param errorSource The cause of the error
     * @param error       The error, may be null
     * @param shutdown    Whether the API will shut down because this error is unrecoverable
     */
    void handle(ErrorSource errorSource, Throwable error, boolean shutdown);
}
