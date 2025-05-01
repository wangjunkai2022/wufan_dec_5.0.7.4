package com.google.zxing.client.result;

import com.google.zxing.Result;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import m.a;
/* loaded from: classes3.dex */
public abstract class ResultParser {
    private static final ResultParser[] PARSERS = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser()};
    private static final Pattern DIGITS = Pattern.compile("\\d*");
    private static final Pattern ALPHANUM = Pattern.compile("[a-zA-Z0-9]*");
    private static final Pattern AMPERSAND = Pattern.compile(a.f71490d);
    private static final Pattern EQUALS = Pattern.compile(SimpleComparison.EQUAL_TO_OPERATION);

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
        String[] split = EQUALS.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], URLDecoder.decode(split[1], "UTF-8"));
            } catch (UnsupportedEncodingException e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isStringOfDigits(CharSequence charSequence, int i4) {
        return charSequence != null && i4 == charSequence.length() && DIGITS.matcher(charSequence).matches();
    }

    protected static boolean isSubstringOfAlphaNumeric(CharSequence charSequence, int i4, int i5) {
        int i6;
        return charSequence != null && charSequence.length() >= (i6 = i5 + i4) && ALPHANUM.matcher(charSequence.subSequence(i4, i6)).matches();
    }

    protected static boolean isSubstringOfDigits(CharSequence charSequence, int i4, int i5) {
        int i6;
        return charSequence != null && charSequence.length() >= (i6 = i5 + i4) && DIGITS.matcher(charSequence.subSequence(i4, i6)).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] matchPrefixedField(String str, String str2, char c5, boolean z4) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i4 = 0;
        while (i4 < length) {
            int indexOf = str2.indexOf(str, i4);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            ArrayList arrayList2 = arrayList;
            boolean z5 = true;
            int i5 = length2;
            while (z5) {
                int indexOf2 = str2.indexOf(c5, i5);
                if (indexOf2 < 0) {
                    i5 = str2.length();
                } else if (str2.charAt(indexOf2 - 1) == '\\') {
                    i5 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String unescapeBackslash = unescapeBackslash(str2.substring(length2, indexOf2));
                    if (z4) {
                        unescapeBackslash = unescapeBackslash.trim();
                    }
                    arrayList2.add(unescapeBackslash);
                    i5 = indexOf2 + 1;
                }
                z5 = false;
            }
            i4 = i5;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String matchSinglePrefixedField(String str, String str2, char c5, boolean z4) {
        String[] matchPrefixedField = matchPrefixedField(str, str2, c5, z4);
        if (matchPrefixedField == null) {
            return null;
        }
        return matchPrefixedField[0];
    }

    protected static void maybeAppend(String str, StringBuilder sb) {
        if (str != null) {
            sb.append('\n');
            sb.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String[] maybeWrap(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int parseHexDigit(char c5) {
        if (c5 < '0' || c5 > '9') {
            char c6 = 'a';
            if (c5 < 'a' || c5 > 'f') {
                c6 = 'A';
                if (c5 < 'A' || c5 > 'F') {
                    return -1;
                }
            }
            return (c5 - c6) + 10;
        }
        return c5 - '0';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> parseNameValuePairs(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String str2 : AMPERSAND.split(str.substring(indexOf + 1))) {
            appendKeyValue(str2, hashMap);
        }
        return hashMap;
    }

    public static ParsedResult parseResult(Result result) {
        for (ResultParser resultParser : PARSERS) {
            ParsedResult parse = resultParser.parse(result);
            if (parse != null) {
                return parse;
            }
        }
        return new TextParsedResult(result.getText(), null);
    }

    protected static String unescapeBackslash(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z4 = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z4 || charAt != '\\') {
                sb.append(charAt);
                z4 = false;
            } else {
                z4 = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    public abstract ParsedResult parse(Result result);

    protected static void maybeAppend(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                sb.append('\n');
                sb.append(str);
            }
        }
    }
}
