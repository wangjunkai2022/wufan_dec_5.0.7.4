package io.netty.handler.codec.http;

import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public class QueryStringDecoder {
    private static final int DEFAULT_MAX_PARAMS = 1024;
    private final Charset charset;
    private final int maxParams;
    private Map<String, List<String>> params;
    private String path;
    private int pathEndIdx;
    private final boolean semicolonIsNormalChar;
    private final String uri;

    public QueryStringDecoder(String str) {
        this(str, HttpConstants.DEFAULT_CHARSET);
    }

    private static boolean addParam(String str, int i4, int i5, int i6, Map<String, List<String>> map, Charset charset) {
        if (i4 >= i6) {
            return false;
        }
        if (i5 <= i4) {
            i5 = i6 + 1;
        }
        String decodeComponent = decodeComponent(str, i4, i5 - 1, charset, false);
        String decodeComponent2 = decodeComponent(str, i5, i6, charset, false);
        List<String> list = map.get(decodeComponent);
        if (list == null) {
            list = new ArrayList<>(1);
            map.put(decodeComponent, list);
        }
        list.add(decodeComponent2);
        return true;
    }

    public static String decodeComponent(String str) {
        return decodeComponent(str, HttpConstants.DEFAULT_CHARSET);
    }

    private static Map<String, List<String>> decodeParams(String str, int i4, Charset charset, int i5, boolean z4) {
        int length = str.length();
        if (i4 >= length) {
            return Collections.emptyMap();
        }
        if (str.charAt(i4) == '?') {
            i4++;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i6 = i4;
        int i7 = i6;
        int i8 = -1;
        while (i7 < length) {
            char charAt = str.charAt(i7);
            if (charAt == '#') {
                break;
            }
            if (charAt != '&') {
                if (charAt != ';') {
                    if (charAt == '=') {
                        if (i6 != i7) {
                            if (i8 < i6) {
                                i8 = i7 + 1;
                            }
                        }
                        i6 = i7 + 1;
                    }
                } else if (z4) {
                    continue;
                }
                i7++;
            }
            if (addParam(str, i6, i8, i7, linkedHashMap, charset) && i5 - 1 == 0) {
                return linkedHashMap;
            }
            i6 = i7 + 1;
            i7++;
        }
        addParam(str, i6, i8, i7, linkedHashMap, charset);
        return linkedHashMap;
    }

    private static int findPathEndIndex(String str) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '?' || charAt == '#') {
                return i4;
            }
        }
        return length;
    }

    private int pathEndIdx() {
        if (this.pathEndIdx == -1) {
            this.pathEndIdx = findPathEndIndex(this.uri);
        }
        return this.pathEndIdx;
    }

    public Map<String, List<String>> parameters() {
        if (this.params == null) {
            this.params = decodeParams(this.uri, pathEndIdx(), this.charset, this.maxParams, this.semicolonIsNormalChar);
        }
        return this.params;
    }

    public String path() {
        if (this.path == null) {
            this.path = decodeComponent(this.uri, 0, pathEndIdx(), this.charset, true);
        }
        return this.path;
    }

    public String rawPath() {
        return this.uri.substring(0, pathEndIdx());
    }

    public String rawQuery() {
        int pathEndIdx = pathEndIdx() + 1;
        return pathEndIdx < this.uri.length() ? this.uri.substring(pathEndIdx) : "";
    }

    public String toString() {
        return uri();
    }

    public String uri() {
        return this.uri;
    }

    public QueryStringDecoder(String str, boolean z4) {
        this(str, HttpConstants.DEFAULT_CHARSET, z4);
    }

    public static String decodeComponent(String str, Charset charset) {
        return str == null ? "" : decodeComponent(str, 0, str.length(), charset, false);
    }

    public QueryStringDecoder(String str, Charset charset) {
        this(str, charset, true);
    }

    private static String decodeComponent(String str, int i4, int i5, Charset charset, boolean z4) {
        int i6;
        int i7;
        int i8 = i5 - i4;
        if (i8 <= 0) {
            return "";
        }
        int i9 = i4;
        while (true) {
            if (i9 >= i5) {
                i9 = -1;
                break;
            }
            char charAt = str.charAt(i9);
            if (charAt == '%' || (charAt == '+' && !z4)) {
                break;
            }
            i9++;
        }
        if (i9 == -1) {
            return str.substring(i4, i5);
        }
        byte[] allocateUninitializedArray = PlatformDependent.allocateUninitializedArray((i5 - i9) / 3);
        StringBuilder sb = new StringBuilder(i8);
        sb.append((CharSequence) str, i4, i9);
        while (i9 < i5) {
            char charAt2 = str.charAt(i9);
            if (charAt2 != '%') {
                if (charAt2 == '+' && !z4) {
                    charAt2 = ' ';
                }
                sb.append(charAt2);
            } else {
                int i10 = 0;
                while (true) {
                    i6 = i9 + 3;
                    if (i6 <= i5) {
                        i7 = i10 + 1;
                        allocateUninitializedArray[i10] = StringUtil.decodeHexByte(str, i9 + 1);
                        if (i6 >= i5 || str.charAt(i6) != '%') {
                            break;
                        }
                        i9 = i6;
                        i10 = i7;
                    } else {
                        throw new IllegalArgumentException("unterminated escape sequence at index " + i9 + " of: " + str);
                    }
                }
                i9 = i6 - 1;
                sb.append(new String(allocateUninitializedArray, 0, i7, charset));
            }
            i9++;
        }
        return sb.toString();
    }

    public QueryStringDecoder(String str, Charset charset, boolean z4) {
        this(str, charset, z4, 1024);
    }

    public QueryStringDecoder(String str, Charset charset, boolean z4, int i4) {
        this(str, charset, z4, i4, false);
    }

    public QueryStringDecoder(String str, Charset charset, boolean z4, int i4, boolean z5) {
        this.uri = (String) ObjectUtil.checkNotNull(str, "uri");
        this.charset = (Charset) ObjectUtil.checkNotNull(charset, "charset");
        this.maxParams = ObjectUtil.checkPositive(i4, "maxParams");
        this.semicolonIsNormalChar = z5;
        this.pathEndIdx = z4 ? -1 : 0;
    }

    public QueryStringDecoder(URI uri) {
        this(uri, HttpConstants.DEFAULT_CHARSET);
    }

    public QueryStringDecoder(URI uri, Charset charset) {
        this(uri, charset, 1024);
    }

    public QueryStringDecoder(URI uri, Charset charset, int i4) {
        this(uri, charset, i4, false);
    }

    public QueryStringDecoder(URI uri, Charset charset, int i4, boolean z4) {
        String str;
        String rawPath = uri.getRawPath();
        rawPath = rawPath == null ? "" : rawPath;
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            str = rawPath;
        } else {
            str = rawPath + '?' + rawQuery;
        }
        this.uri = str;
        this.charset = (Charset) ObjectUtil.checkNotNull(charset, "charset");
        this.maxParams = ObjectUtil.checkPositive(i4, "maxParams");
        this.semicolonIsNormalChar = z4;
        this.pathEndIdx = rawPath.length();
    }
}
