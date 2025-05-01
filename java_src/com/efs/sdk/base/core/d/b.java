package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public a f10380a;

    /* renamed from: b  reason: collision with root package name */
    public c f10381b = new c();

    /* renamed from: c  reason: collision with root package name */
    public byte[] f10382c;

    /* renamed from: d  reason: collision with root package name */
    public File f10383d;

    public b(String str, byte b5) {
        this.f10380a = new a(str, b5);
    }

    private void d() {
        byte[] bArr;
        a aVar = this.f10380a;
        int i4 = aVar.f10375c;
        if (i4 == 0 && (bArr = this.f10382c) != null) {
            aVar.f10378f = bArr.length;
        } else if (i4 == 1 && this.f10383d.exists()) {
            this.f10380a.f10378f = this.f10383d.length();
        }
    }

    public final long a() {
        d();
        return this.f10380a.f10378f;
    }

    public final boolean b() {
        return !"none".equals(this.f10380a.f10376d);
    }

    public final void c() {
        this.f10381b.f10384a = true;
    }

    public final void b(int i4) {
        this.f10380a.f10375c = i4;
    }

    public final void a(String str) {
        this.f10380a.f10376d = str;
    }

    public final void a(int i4) {
        this.f10380a.f10377e = i4;
        d();
    }

    public final void a(byte[] bArr) {
        this.f10382c = bArr;
        d();
    }

    public static b a(ILogProtocol iLogProtocol) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(iLogProtocol.getLogType(), iLogProtocol.getLogProtocol());
        } catch (Exception e5) {
            e = e5;
        }
        try {
            int bodyType = iLogProtocol.getBodyType();
            if (bodyType == 0) {
                bVar.b(0);
                bVar.a(iLogProtocol.generate());
            } else if (bodyType != 1) {
                Log.w("efs.base", "Can not support body type: " + iLogProtocol.getBodyType());
            } else {
                bVar.b(1);
                bVar.f10383d = new File(iLogProtocol.getFilePath());
            }
            return bVar;
        } catch (Exception e6) {
            e = e6;
            bVar2 = bVar;
            Log.e("efs.base", "log send error", e);
            return bVar2;
        }
    }
}
