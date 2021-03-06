/*
 * Copyright 2019 seti.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.samczsun.skype4j.events;

import com.eclipsesource.json.JsonObject;
import com.samczsun.skype4j.internal.SkypeImpl;

/**
 *
 * @author seti
 */
public class StatusEvent extends Event {
    private final SkypeImpl skype;
    private final JsonObject resource;
    
    public StatusEvent(SkypeImpl skype){
        this.skype = skype;
        this.resource = null;
    }
    
    public StatusEvent(SkypeImpl skype, JsonObject resource){
        this.skype = skype;
        this.resource = resource;
    }
    
    public SkypeImpl getSkypeImpl(){
        return this.skype;
    }
    
    public JsonObject getResource(){
        return this.resource;
    }
    
}
