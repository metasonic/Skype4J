package com.samczsun.skype4j.internal.searchresult;

import java.util.List;

public class SkypeDirSearch {

    private String requestId;
    private List<SkypeDirSearchResult> results = null;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<SkypeDirSearchResult> getResults() {
        return results;
    }

    public void setResults(List<SkypeDirSearchResult> results) {
        this.results = results;
    }
}
