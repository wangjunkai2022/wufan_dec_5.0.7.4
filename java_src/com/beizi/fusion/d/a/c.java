package com.beizi.fusion.d.a;

import com.beizi.fusion.model.JsonNode;
import com.beizi.fusion.model.JsonResolver;
import java.util.List;
/* compiled from: BidS2SResponseModel.java */
/* loaded from: classes2.dex */
public class c {
    @JsonNode(key = "seatbid")

    /* renamed from: a  reason: collision with root package name */
    private List<C0189c> f6666a;

    /* compiled from: BidS2SResponseModel.java */
    /* loaded from: classes2.dex */
    public static class a {
        @JsonNode(key = "price")

        /* renamed from: a  reason: collision with root package name */
        private String f6667a;
        @JsonNode(key = "ext")

        /* renamed from: b  reason: collision with root package name */
        private d f6668b;

        public String a() {
            return this.f6667a;
        }

        public d b() {
            return this.f6668b;
        }
    }

    /* compiled from: BidS2SResponseModel.java */
    /* loaded from: classes2.dex */
    public static class b {
        @JsonNode(key = "impAdInfo")

        /* renamed from: a  reason: collision with root package name */
        private String f6669a;

        public String a() {
            return this.f6669a;
        }
    }

    /* compiled from: BidS2SResponseModel.java */
    /* renamed from: com.beizi.fusion.d.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0189c {
        @JsonNode(key = "seat")

        /* renamed from: a  reason: collision with root package name */
        private String f6670a;
        @JsonNode(key = "bid")

        /* renamed from: b  reason: collision with root package name */
        private List<a> f6671b;
        @JsonNode(key = "ext")

        /* renamed from: c  reason: collision with root package name */
        private b f6672c;

        public String a() {
            return this.f6670a;
        }

        public List<a> b() {
            return this.f6671b;
        }

        public b c() {
            return this.f6672c;
        }
    }

    /* compiled from: BidS2SResponseModel.java */
    /* loaded from: classes2.dex */
    public static class d {
        @JsonNode(key = "token")

        /* renamed from: a  reason: collision with root package name */
        private String f6673a;

        public String a() {
            return this.f6673a;
        }
    }

    public static c a(String str) {
        try {
            return (c) JsonResolver.fromJson(str, (Class<Object>) c.class);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public List<C0189c> a() {
        return this.f6666a;
    }
}
