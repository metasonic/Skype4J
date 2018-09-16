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

package com.samczsun.skype4j.formatting.lang;

import com.samczsun.skype4j.formatting.IMoji;

import java.util.HashMap;
import java.util.Map;

public enum DefaultMoji implements IMoji {

    ;

    private static final Map<String, IMoji> fliks = new HashMap<>();

    static {
        for (IMoji flik : values()) {
            fliks.put(flik.getId(), flik);
        }
    }

    private String id;
    private String etag;
    private String desc;

    DefaultMoji(String id, String etag, String desc) {
        this.id = id;
        this.etag = etag;
        this.desc = desc;
    }

    public static IMoji getById(String id) {
        return fliks.get(id);
    }

    public String getId() {
        return this.id;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getDescription() {
        return this.desc;
    }
}
