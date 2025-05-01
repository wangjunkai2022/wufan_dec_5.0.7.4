package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: TIOStreamTransport.java */
/* loaded from: classes6.dex */
public class dg extends di {

    /* renamed from: a  reason: collision with root package name */
    protected InputStream f63675a;

    /* renamed from: b  reason: collision with root package name */
    protected OutputStream f63676b;

    protected dg() {
        this.f63675a = null;
        this.f63676b = null;
    }

    @Override // com.umeng.analytics.pro.di
    public int a(byte[] bArr, int i4, int i5) throws dj {
        InputStream inputStream = this.f63675a;
        if (inputStream != null) {
            try {
                int read = inputStream.read(bArr, i4, i5);
                if (read >= 0) {
                    return read;
                }
                throw new dj(4);
            } catch (IOException e5) {
                throw new dj(0, e5);
            }
        }
        throw new dj(1, "Cannot read from null inputStream");
    }

    @Override // com.umeng.analytics.pro.di
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.di
    public void b() throws dj {
    }

    @Override // com.umeng.analytics.pro.di
    public void b(byte[] bArr, int i4, int i5) throws dj {
        OutputStream outputStream = this.f63676b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i4, i5);
                return;
            } catch (IOException e5) {
                throw new dj(0, e5);
            }
        }
        throw new dj(1, "Cannot write to null outputStream");
    }

    @Override // com.umeng.analytics.pro.di
    public void c() {
        InputStream inputStream = this.f63675a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            this.f63675a = null;
        }
        OutputStream outputStream = this.f63676b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            this.f63676b = null;
        }
    }

    @Override // com.umeng.analytics.pro.di
    public void d() throws dj {
        OutputStream outputStream = this.f63676b;
        if (outputStream != null) {
            try {
                outputStream.flush();
                return;
            } catch (IOException e5) {
                throw new dj(0, e5);
            }
        }
        throw new dj(1, "Cannot flush null outputStream");
    }

    public dg(InputStream inputStream) {
        this.f63675a = null;
        this.f63676b = null;
        this.f63675a = inputStream;
    }

    public dg(OutputStream outputStream) {
        this.f63675a = null;
        this.f63676b = null;
        this.f63676b = outputStream;
    }

    public dg(InputStream inputStream, OutputStream outputStream) {
        this.f63675a = null;
        this.f63676b = null;
        this.f63675a = inputStream;
        this.f63676b = outputStream;
    }
}
