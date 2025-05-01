package com.beizi.ad.internal.utilities;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class HTTPResponse {
    private int code;
    private HttpErrorCode errorCode;
    private Map<String, List<String>> headers;
    private String locationUrl;
    private ByteArrayOutputStream responseBinaryBody;
    private String responseBody;
    private boolean succeeded;

    public HTTPResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public HttpErrorCode getErrorCode() {
        return this.errorCode;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getLocationUrl() {
        return this.locationUrl;
    }

    public ByteArrayOutputStream getResponseBinaryBody() {
        return this.responseBinaryBody;
    }

    public String getResponseBody() {
        return this.responseBody;
    }

    public boolean getSucceeded() {
        return this.succeeded;
    }

    public void setCode(int i4) {
        this.code = i4;
    }

    public void setErrorCode(HttpErrorCode httpErrorCode) {
        this.errorCode = httpErrorCode;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public void setLocationUrl(String str) {
        this.locationUrl = str;
    }

    public void setResponseBinaryBody(ByteArrayOutputStream byteArrayOutputStream) {
        this.responseBinaryBody = byteArrayOutputStream;
    }

    public void setResponseBody(String str) {
        this.responseBody = str;
    }

    public void setSucceeded(boolean z4) {
        this.succeeded = z4;
    }

    public HTTPResponse(boolean z4, String str, Map<String, List<String>> map) {
        this.succeeded = z4;
        this.responseBody = str;
        this.headers = map;
    }

    public HTTPResponse(boolean z4, ByteArrayOutputStream byteArrayOutputStream, Map<String, List<String>> map) {
        this.succeeded = z4;
        this.responseBinaryBody = byteArrayOutputStream;
        this.headers = map;
    }
}
