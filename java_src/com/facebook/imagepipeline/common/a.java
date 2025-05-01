package com.facebook.imagepipeline.common;

import com.facebook.common.internal.h;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
/* compiled from: BytesRange.java */
@Immutable
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f11702c = Integer.MAX_VALUE;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static Pattern f11703d;

    /* renamed from: a  reason: collision with root package name */
    public final int f11704a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11705b;

    public a(int i4, int i5) {
        this.f11704a = i4;
        this.f11705b = i5;
    }

    public static a b(int i4) {
        h.d(i4 >= 0);
        return new a(i4, Integer.MAX_VALUE);
    }

    @Nullable
    public static a c(@Nullable String str) throws IllegalArgumentException {
        if (str == null) {
            return null;
        }
        if (f11703d == null) {
            f11703d = Pattern.compile("[-/ ]");
        }
        try {
            String[] split = f11703d.split(str);
            h.d(split.length == 4);
            h.d(split[0].equals("bytes"));
            int parseInt = Integer.parseInt(split[1]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            h.d(parseInt2 > parseInt);
            h.d(parseInt3 > parseInt2);
            if (parseInt2 < parseInt3 - 1) {
                return new a(parseInt, parseInt2);
            }
            return new a(parseInt, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(String.format(null, "Invalid Content-Range header value: \"%s\"", str), e5);
        }
    }

    public static a e(int i4) {
        h.d(i4 > 0);
        return new a(0, i4);
    }

    private static String f(int i4) {
        return i4 == Integer.MAX_VALUE ? "" : Integer.toString(i4);
    }

    public boolean a(@Nullable a aVar) {
        return aVar != null && this.f11704a <= aVar.f11704a && this.f11705b >= aVar.f11705b;
    }

    public String d() {
        return String.format(null, "bytes=%s-%s", f(this.f11704a), f(this.f11705b));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f11704a == aVar.f11704a && this.f11705b == aVar.f11705b;
        }
        return false;
    }

    public int hashCode() {
        return com.facebook.common.util.b.b(this.f11704a, this.f11705b);
    }

    public String toString() {
        return String.format(null, "%s-%s", f(this.f11704a), f(this.f11705b));
    }
}
