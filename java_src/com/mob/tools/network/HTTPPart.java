package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import com.mob.tools.utils.ReflectHelper;
import java.io.InputStream;
/* loaded from: classes5.dex */
public abstract class HTTPPart implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private long f56798a;

    /* renamed from: b  reason: collision with root package name */
    private OnReadListener f56799b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract InputStream a() throws Throwable;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long b() throws Throwable;

    public Object getInputStreamEntity() throws Throwable {
        InputStream inputStream = toInputStream();
        long b5 = b() - this.f56798a;
        ReflectHelper.importClass("org.apache.http.entity.InputStreamEntity");
        return ReflectHelper.newInstance("InputStreamEntity", inputStream, Long.valueOf(b5));
    }

    public void setOffset(long j4) {
        this.f56798a = j4;
    }

    public void setOnReadListener(OnReadListener onReadListener) {
        this.f56799b = onReadListener;
    }

    public InputStream toInputStream() throws Throwable {
        return new ByteCounterInputStream(a());
    }
}
