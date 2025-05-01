package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4612a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f4613b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4614a;

        /* renamed from: b  reason: collision with root package name */
        int f4615b;

        /* renamed from: c  reason: collision with root package name */
        int f4616c;

        a(int i4, int i5, int i6) {
            this.f4614a = i4;
            this.f4615b = i5;
            this.f4616c = i6;
        }
    }

    public static long a(String str) {
        int c5;
        int d5;
        int i4;
        a aVar;
        int i5;
        int i6;
        int i7;
        Matcher matcher = f4612a.matcher(str);
        if (matcher.find()) {
            i4 = b(matcher.group(1));
            c5 = c(matcher.group(2));
            d5 = d(matcher.group(3));
            aVar = e(matcher.group(4));
        } else {
            Matcher matcher2 = f4613b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            c5 = c(matcher2.group(1));
            int b5 = b(matcher2.group(2));
            a e5 = e(matcher2.group(3));
            d5 = d(matcher2.group(4));
            i4 = b5;
            aVar = e5;
        }
        if (d5 >= 2038) {
            i5 = 1;
            i6 = 0;
            i7 = 2038;
        } else {
            i5 = i4;
            i6 = c5;
            i7 = d5;
        }
        Time time = new Time("UTC");
        time.set(aVar.f4616c, aVar.f4615b, aVar.f4614a, i5, i6, i7);
        return time.toMillis(false);
    }

    private static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    private static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase != 9) {
            if (lowerCase != 10) {
                if (lowerCase != 22) {
                    if (lowerCase != 26) {
                        if (lowerCase != 29) {
                            if (lowerCase != 32) {
                                if (lowerCase != 40) {
                                    if (lowerCase != 42) {
                                        if (lowerCase != 48) {
                                            switch (lowerCase) {
                                                case 35:
                                                    return 9;
                                                case 36:
                                                    return 4;
                                                case 37:
                                                    return 8;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return 10;
                                    }
                                    return 5;
                                }
                                return 6;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 7;
                }
                return 0;
            }
            return 1;
        }
        return 11;
    }

    private static int d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() == 4) {
                return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
            }
            return 1970;
        }
    }

    private static a e(String str) {
        int i4;
        int i5;
        int i6;
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i4 = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i4 = 1;
        }
        int i7 = i4 + 1 + 1 + 1 + 1;
        return new a(charAt, ((str.charAt(i5) - '0') * 10) + (str.charAt(i6) - '0'), ((str.charAt(i7) - '0') * 10) + (str.charAt(i7 + 1) - '0'));
    }
}
