package cn.com.chinatelecom.account.api.d;

import android.net.Network;
import java.util.Map;
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public Network f640a;

    /* renamed from: b  reason: collision with root package name */
    public int f641b;

    /* renamed from: c  reason: collision with root package name */
    public String f642c;

    /* renamed from: d  reason: collision with root package name */
    public String f643d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f644e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f645f;

    /* renamed from: g  reason: collision with root package name */
    public String f646g;

    /* renamed from: h  reason: collision with root package name */
    public String f647h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f648i;

    /* renamed from: j  reason: collision with root package name */
    private int f649j;

    /* renamed from: k  reason: collision with root package name */
    private int f650k;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f651a;

        /* renamed from: b  reason: collision with root package name */
        private int f652b;

        /* renamed from: c  reason: collision with root package name */
        private Network f653c;

        /* renamed from: d  reason: collision with root package name */
        private int f654d;

        /* renamed from: e  reason: collision with root package name */
        private String f655e;

        /* renamed from: f  reason: collision with root package name */
        private String f656f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f657g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f658h;

        /* renamed from: i  reason: collision with root package name */
        private String f659i;

        /* renamed from: j  reason: collision with root package name */
        private String f660j;

        /* renamed from: k  reason: collision with root package name */
        private Map<String, String> f661k;

        public a a(int i4) {
            this.f651a = i4;
            return this;
        }

        public a a(Network network) {
            this.f653c = network;
            return this;
        }

        public a a(String str) {
            this.f655e = str;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f661k = map;
            return this;
        }

        public a a(boolean z4) {
            this.f657g = z4;
            return this;
        }

        public a a(boolean z4, String str, String str2) {
            this.f658h = z4;
            this.f659i = str;
            this.f660j = str2;
            return this;
        }

        public g a() {
            return new g(this);
        }

        public a b(int i4) {
            this.f652b = i4;
            return this;
        }

        public a b(String str) {
            this.f656f = str;
            return this;
        }
    }

    public g(a aVar) {
        this.f649j = aVar.f651a;
        this.f650k = aVar.f652b;
        this.f640a = aVar.f653c;
        this.f641b = aVar.f654d;
        this.f642c = aVar.f655e;
        this.f643d = aVar.f656f;
        this.f644e = aVar.f657g;
        this.f645f = aVar.f658h;
        this.f646g = aVar.f659i;
        this.f647h = aVar.f660j;
        this.f648i = aVar.f661k;
    }

    public int a() {
        int i4 = this.f649j;
        if (i4 > 0) {
            return i4;
        }
        return 3000;
    }

    public int b() {
        int i4 = this.f650k;
        if (i4 > 0) {
            return i4;
        }
        return 3000;
    }
}
