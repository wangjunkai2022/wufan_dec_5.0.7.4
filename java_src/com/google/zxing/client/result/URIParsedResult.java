package com.google.zxing.client.result;

import java.util.Locale;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class URIParsedResult extends ParsedResult {
    private static final Pattern USER_IN_HOST = Pattern.compile(":/*([^/@]+)@[^/]+");
    private final String title;
    private final String uri;

    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        this.uri = massageURI(str);
        this.title = str2;
    }

    private static boolean isColonFollowedByPortNumber(String str, int i4) {
        int i5 = i4 + 1;
        int indexOf = str.indexOf(47, i5);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        if (indexOf <= i5) {
            return false;
        }
        while (i5 < indexOf) {
            if (str.charAt(i5) < '0' || str.charAt(i5) > '9') {
                return false;
            }
            i5++;
        }
        return true;
    }

    private static String massageURI(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0) {
            return "http://" + trim;
        } else if (isColonFollowedByPortNumber(trim, indexOf)) {
            return "http://" + trim;
        } else {
            return trim.substring(0, indexOf).toLowerCase(Locale.ENGLISH) + trim.substring(indexOf);
        }
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(30);
        ParsedResult.maybeAppend(this.title, sb);
        ParsedResult.maybeAppend(this.uri, sb);
        return sb.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public String getURI() {
        return this.uri;
    }

    public boolean isPossiblyMaliciousURI() {
        return USER_IN_HOST.matcher(this.uri).find();
    }
}
