/*
 * Copyright 2015 Sam Sun <me@samczsun.com>
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

package com.samczsun.skype4j.chat;

import com.samczsun.skype4j.events.chat.user.action.OptionUpdateEvent;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.exceptions.NotLoadedException;
import com.samczsun.skype4j.user.Contact;

/**
 * Represents a group chat with one or more people
 */
public interface GroupChat extends Chat {
    /**
     * Get the topic of the chat.
     *
     * @return The topic of this chat
     * @throws NotLoadedException If the chat is not yet loaded
     */
    String getTopic();

    /**
     * Set the topic of the chat. This will occur in real time
     *
     * @param topic The topic
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     */
    void setTopic(String topic) throws ConnectionException;

    /**
     * Get whether an option is enabled.
     *
     * @param option The option to query
     * @return Whether the option is enabled
     * @throws NotLoadedException If the chat is not yet loaded
     */
    boolean isOptionEnabled(OptionUpdateEvent.Option option);

    /**
     * Set whether an option is enabled.
     * If the option is already enabled and a request to enable it is sent or vice versa, it will be silently ignored
     *
     * @param option The option to set
     * @param enabled Whether to enable it or not
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     */
    void setOptionEnabled(OptionUpdateEvent.Option option, boolean enabled) throws ConnectionException;

    /**
     * Add a contact into this chat. This will occur in real time
     *
     * @param contact The contact to add
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     */
    void add(Contact contact) throws ConnectionException;

    /**
     * Kick a user from this chat. This will occur in real time.
     *
     * @param username The username of the user to kick
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     */
    void kick(String username) throws ConnectionException;

    /**
     * Leave the chat. This will occur in real time.
     *
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     */
    void leave() throws ConnectionException;

    /**
     * Gets the join url for people to join.
     *
     * @return The join url
     * @throws ConnectionException If an error occurs while connecting to the endpoint
     * @throws NotLoadedException If the chat is not yet loaded
     * @throws IllegalStateException If joining is not enabled
     */
    String getJoinUrl() throws ConnectionException;
}
