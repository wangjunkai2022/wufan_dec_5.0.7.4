package com.mob.tools.network;

import com.mob.tools.utils.Data;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
@Deprecated
/* loaded from: classes5.dex */
public class ByteArrayPart extends HTTPPart {

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayOutputStream f56793a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = this.f56793a;
        if (byteArrayOutputStream == null) {
            return new ByteArrayInputStream(new byte[0]);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray != null && this.f56793a.size() > 0) {
            return new ByteArrayInputStream(byteArray, 0, this.f56793a.size());
        }
        return new ByteArrayInputStream(new byte[0]);
    }

    public ByteArrayPart append(byte[] bArr) throws Throwable {
        if (this.f56793a == null) {
            this.f56793a = new ByteArrayOutputStream(bArr.length);
        }
        this.f56793a.write(bArr);
        this.f56793a.flush();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mob.tools.network.HTTPPart
    public long b() throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = this.f56793a;
        if (byteArrayOutputStream == null) {
            return 0L;
        }
        return byteArrayOutputStream.size();
    }

    public String toString() {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = this.f56793a;
        if (byteArrayOutputStream == null || (byteArray = byteArrayOutputStream.toByteArray()) == null) {
            return null;
        }
        return Data.byteToHex(byteArray, 0, this.f56793a.size());
    }
}
