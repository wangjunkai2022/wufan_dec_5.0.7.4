package com.alipay.android.phone.mrpc.core;

import com.coremedia.iso.boxes.k1;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
/* loaded from: classes2.dex */
public final class x extends k {

    /* renamed from: g  reason: collision with root package name */
    private u f4611g;

    public x(u uVar, Method method, int i4, String str, byte[] bArr, boolean z4) {
        super(method, i4, str, bArr, "application/x-www-form-urlencoded", z4);
        this.f4611g = uVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.f
    public final Object a() {
        c0 c0Var = new c0(this.f4611g.a());
        c0Var.f4542d = this.f4586b;
        c0Var.f4543e = this.f4589e;
        c0Var.f4546h = this.f4590f;
        c0Var.e("id", String.valueOf(this.f4588d));
        c0Var.e("operationType", this.f4587c);
        c0Var.e("gzip", String.valueOf(this.f4611g.d()));
        c0Var.f(new BasicHeader(k1.f9761p, UUID.randomUUID().toString()));
        List<Header> list = this.f4611g.c().f4592b;
        if (list != null && !list.isEmpty()) {
            for (Header header : list) {
                c0Var.f(header);
            }
        }
        Thread.currentThread().getId();
        c0Var.toString();
        try {
            e eVar = this.f4611g.b().a(c0Var).get();
            if (eVar != null) {
                return eVar.b();
            }
            throw new c((Integer) 9, "response is null");
        } catch (InterruptedException e5) {
            throw new c(13, "", e5);
        } catch (CancellationException e6) {
            throw new c(13, "", e6);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null || !(cause instanceof a)) {
                throw new c(9, "", e7);
            }
            a aVar = (a) cause;
            int a5 = aVar.a();
            switch (a5) {
                case 1:
                    a5 = 2;
                    break;
                case 2:
                    a5 = 3;
                    break;
                case 3:
                    a5 = 4;
                    break;
                case 4:
                    a5 = 5;
                    break;
                case 5:
                    a5 = 6;
                    break;
                case 6:
                    a5 = 7;
                    break;
                case 7:
                    a5 = 8;
                    break;
                case 8:
                    a5 = 15;
                    break;
                case 9:
                    a5 = 16;
                    break;
            }
            throw new c(Integer.valueOf(a5), aVar.b());
        }
    }
}
