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

package com.samczsun.skype4j.internal.participants;

import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.internal.SkypeImpl;
import com.samczsun.skype4j.internal.chat.ChatImpl;
import com.samczsun.skype4j.participants.User;
import com.samczsun.skype4j.participants.info.Contact;


public class UserImpl extends ParticipantImpl implements User {
    private Contact contactRep;

    public UserImpl(SkypeImpl skype, ChatImpl chat, String id) throws ConnectionException {
        super(skype, chat, id);
    }

    @Override
    public String getUsername() {
        return getId().substring(2);
    }

    @Override
    public String getDisplayName() {
        if (contactRep == null) return null;
        return contactRep.getDisplayName();
    }

    @Override
    public Contact getContact() {
        return this.contactRep;
    }

    public void setInfo(Contact contact) {
        this.contactRep = contact;
    }
}
