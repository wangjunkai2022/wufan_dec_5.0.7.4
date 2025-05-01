package com.sdk.f;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public long f60041a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    public a f60042b = new a();

    /* renamed from: c  reason: collision with root package name */
    public String f60043c = "";

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<C0603a> f60044a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<String> f60045b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<String> f60046c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public String f60047d = "";

        /* renamed from: com.sdk.f.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0603a {

            /* renamed from: a  reason: collision with root package name */
            public String f60048a = "";

            /* renamed from: b  reason: collision with root package name */
            public long f60049b;

            public String toString() {
                return "_$101005Bean{url='" + this.f60048a + "', time=" + this.f60049b + '}';
            }
        }

        public String toString() {
            return "StatusBean{_$101005=" + this.f60044a + ", _$302001=" + this.f60045b + ", _$302002=" + this.f60046c + ", _$302003='" + this.f60047d + "'}";
        }
    }

    public String toString() {
        return "MobileLog{time=" + this.f60041a + ", status=" + this.f60042b + '}';
    }
}
