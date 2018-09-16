/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.exceptions;

import com.samczsun.skype4j.internal.Utils;

import java.io.*;
import java.net.HttpURLConnection;

/**
 * Thrown when an exception occurs while connecting to an endpoint
 */
public class ConnectionException extends SkypeException {
    private static final long serialVersionUID = 6479923597926811460L;
    private int responseCode;
    private String responseMessage;
    private String message;

    public ConnectionException(String cause, HttpURLConnection connection) throws IOException {
        super(null);
        this.responseCode = connection.getResponseCode();
        this.responseMessage = connection.getResponseMessage();
        StringBuilder messageBuilder = new StringBuilder(System.lineSeparator());
        messageBuilder.append("\t\t").append("Cause: ").append(cause).append(System.lineSeparator());
        messageBuilder.append("\t\t").append("Response: ").append(responseCode).append(" ").append(responseMessage).append(System.lineSeparator());
        InputStream readFrom = null;
        try {
            readFrom = connection.getInputStream();
        } catch (IOException e) {
            readFrom = connection.getErrorStream();
        }
        messageBuilder.append("\t\t").append("Begin Message ")
                .append(System.lineSeparator())
                .append(System.lineSeparator());
        if (readFrom != null) {
            StringWriter errorLogger = new StringWriter();
            PrintWriter printWriter = new PrintWriter(errorLogger);
            try {
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                Utils.copy(readFrom, outputStream);
                String result = outputStream.toString("UTF-8");
                messageBuilder.append(result);
            } catch (IOException e) {
                e.printStackTrace(printWriter);
                messageBuilder.append(System.lineSeparator())
                        .append("Exception: ")
                        .append(System.lineSeparator())
                        .append(errorLogger.toString())
                        .append(System.lineSeparator());
            }
        } else {
            messageBuilder.append("There was no message");
        }
        messageBuilder.append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("\t\t").append("End message")
                .append(System.lineSeparator());
        message = messageBuilder.toString();
    }

    public ConnectionException(String cause, IOException nested) {
        super(cause, nested);
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getResponseMessage() {
        return this.responseMessage;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
