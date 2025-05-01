package com.sina.weibo.sdk.net;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: i  reason: collision with root package name */
    private String f60132i;

    /* renamed from: j  reason: collision with root package name */
    private Bundle f60133j = new Bundle();

    /* renamed from: k  reason: collision with root package name */
    private Bundle f60134k = new Bundle();

    /* renamed from: l  reason: collision with root package name */
    private Map<String, Object<File>> f60135l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private Map<String, byte[]> f60136m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private int f60137n;

    /* renamed from: o  reason: collision with root package name */
    private int f60138o;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public String f60139i;

        /* renamed from: j  reason: collision with root package name */
        Bundle f60140j = new Bundle();

        /* renamed from: k  reason: collision with root package name */
        Bundle f60141k = new Bundle();

        /* renamed from: l  reason: collision with root package name */
        Map<String, Object<File>> f60142l = new HashMap();

        /* renamed from: m  reason: collision with root package name */
        Map<String, byte[]> f60143m = new HashMap();

        /* renamed from: n  reason: collision with root package name */
        int f60144n = 30000;

        /* renamed from: o  reason: collision with root package name */
        int f60145o = 60000;

        public final a a(String str, Object obj) {
            a(this.f60140j, str, obj);
            return this;
        }

        public final a b(String str, Object obj) {
            a(this.f60141k, str, obj);
            return this;
        }

        public final e e() {
            return new e(this);
        }

        private void a(Bundle bundle, String str, Object obj) {
            if (obj != null) {
                if (obj instanceof String) {
                    bundle.putString(str, String.valueOf(obj));
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Short) {
                    bundle.putShort(str, ((Short) obj).shortValue());
                } else if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                } else if (obj instanceof Byte) {
                    bundle.putByte(str, ((Byte) obj).byteValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof byte[]) {
                    this.f60143m.put(str, (byte[]) obj);
                } else if (obj instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Unsupported params type!");
                }
            }
        }
    }

    public e(a aVar) {
        this.f60132i = aVar.f60139i;
        this.f60133j.putAll(aVar.f60140j);
        this.f60134k.putAll(aVar.f60141k);
        this.f60135l.putAll(aVar.f60142l);
        this.f60136m.putAll(aVar.f60143m);
        this.f60137n = aVar.f60144n;
        this.f60138o = aVar.f60145o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle d() {
        return this.f60134k;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getConnectTimeout() {
        return this.f60137n;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle getParams() {
        return this.f60133j;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getReadTimeout() {
        return this.f60138o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final String getUrl() {
        return this.f60132i;
    }
}
