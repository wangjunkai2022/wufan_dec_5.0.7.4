package com.facebook.common.internal;

import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
/* compiled from: Objects.java */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: Objects.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f10850a;

        /* renamed from: b  reason: collision with root package name */
        private a f10851b;

        /* renamed from: c  reason: collision with root package name */
        private a f10852c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10853d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: Objects.java */
        /* loaded from: classes.dex */
        public static final class a {
            @Nullable

            /* renamed from: a  reason: collision with root package name */
            String f10854a;
            @Nullable

            /* renamed from: b  reason: collision with root package name */
            Object f10855b;

            /* renamed from: c  reason: collision with root package name */
            a f10856c;

            private a() {
            }
        }

        private a h() {
            a aVar = new a();
            this.f10852c.f10856c = aVar;
            this.f10852c = aVar;
            return aVar;
        }

        private b i(@Nullable Object obj) {
            h().f10855b = obj;
            return this;
        }

        private b j(String str, @Nullable Object obj) {
            a h4 = h();
            h4.f10855b = obj;
            h4.f10854a = (String) h.i(str);
            return this;
        }

        public b a(String str, char c5) {
            return j(str, String.valueOf(c5));
        }

        public b b(String str, double d5) {
            return j(str, String.valueOf(d5));
        }

        public b c(String str, float f5) {
            return j(str, String.valueOf(f5));
        }

        public b d(String str, int i4) {
            return j(str, String.valueOf(i4));
        }

        public b e(String str, long j4) {
            return j(str, String.valueOf(j4));
        }

        public b f(String str, @Nullable Object obj) {
            return j(str, obj);
        }

        public b g(String str, boolean z4) {
            return j(str, String.valueOf(z4));
        }

        public b k(char c5) {
            return i(String.valueOf(c5));
        }

        public b l(double d5) {
            return i(String.valueOf(d5));
        }

        public b m(float f5) {
            return i(String.valueOf(f5));
        }

        public b n(int i4) {
            return i(String.valueOf(i4));
        }

        public b o(long j4) {
            return i(String.valueOf(j4));
        }

        public b p(@Nullable Object obj) {
            return i(obj);
        }

        public b q(boolean z4) {
            return i(String.valueOf(z4));
        }

        public b r() {
            this.f10853d = true;
            return this;
        }

        public String toString() {
            boolean z4 = this.f10853d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f10850a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f10851b.f10856c; aVar != null; aVar = aVar.f10856c) {
                if (!z4 || aVar.f10855b != null) {
                    sb.append(str);
                    String str2 = aVar.f10854a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    sb.append(aVar.f10855b);
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            a aVar = new a();
            this.f10851b = aVar;
            this.f10852c = aVar;
            this.f10853d = false;
            this.f10850a = (String) h.i(str);
        }
    }

    private g() {
    }

    @CheckReturnValue
    public static boolean a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> T b(@Nullable T t4, @Nullable T t5) {
        return t4 != null ? t4 : (T) h.i(t5);
    }

    public static int c(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    private static String d(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static b e(Class<?> cls) {
        return new b(d(cls));
    }

    public static b f(Object obj) {
        return new b(d(obj.getClass()));
    }

    public static b g(String str) {
        return new b(str);
    }
}
