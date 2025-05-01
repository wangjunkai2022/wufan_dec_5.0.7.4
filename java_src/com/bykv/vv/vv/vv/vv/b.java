package com.bykv.vv.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f8197a = false;

    /* renamed from: b  reason: collision with root package name */
    private int f8198b = -1;

    /* renamed from: c  reason: collision with root package name */
    private String f8199c = null;

    /* renamed from: d  reason: collision with root package name */
    private ValueSet f8200d = null;

    /* renamed from: com.bykv.vv.vv.vv.vv.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0211b implements Result {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f8201a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8202b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8203c;

        /* renamed from: d  reason: collision with root package name */
        private final ValueSet f8204d;

        @Override // com.bykv.vk.openvk.api.proto.Result
        public int code() {
            return this.f8202b;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public boolean isSuccess() {
            return this.f8201a;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public String message() {
            return this.f8203c;
        }

        @Override // com.bykv.vk.openvk.api.proto.Result
        public ValueSet values() {
            return this.f8204d;
        }

        private C0211b(boolean z4, int i4, String str, ValueSet valueSet) {
            this.f8201a = z4;
            this.f8202b = i4;
            this.f8203c = str;
            this.f8204d = valueSet;
        }
    }

    private b() {
    }

    public static final b b() {
        return new b();
    }

    public Result a() {
        boolean z4 = this.f8197a;
        int i4 = this.f8198b;
        String str = this.f8199c;
        ValueSet valueSet = this.f8200d;
        if (valueSet == null) {
            valueSet = com.bykv.vv.vv.vv.vv.a.b().a();
        }
        return new C0211b(z4, i4, str, valueSet);
    }

    public b c(int i4) {
        this.f8198b = i4;
        return this;
    }

    public b d(ValueSet valueSet) {
        this.f8200d = valueSet;
        return this;
    }

    public b e(String str) {
        this.f8199c = str;
        return this;
    }

    public b f(boolean z4) {
        this.f8197a = z4;
        return this;
    }
}
