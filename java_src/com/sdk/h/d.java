package com.sdk.h;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
/* loaded from: classes5.dex */
public abstract class d {
    public abstract void a(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i4);

    public byte[] a(String str) {
        int i4;
        byte[] bArr = new byte[str.length()];
        str.getBytes(0, str.length(), bArr, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);
        while (true) {
            try {
                a aVar = (a) this;
                int i5 = 0;
                while (true) {
                    a aVar2 = (a) this;
                    i4 = i5 + 4;
                    if (i4 >= 72) {
                        break;
                    }
                    a aVar3 = (a) this;
                    a(pushbackInputStream, byteArrayOutputStream, 4);
                    a aVar4 = (a) this;
                    a aVar5 = (a) this;
                    i5 = i4;
                }
                a aVar6 = (a) this;
                if (i4 == 72) {
                    a aVar7 = (a) this;
                    a(pushbackInputStream, byteArrayOutputStream, 4);
                    a aVar8 = (a) this;
                } else {
                    a(pushbackInputStream, byteArrayOutputStream, 72 - i5);
                }
            } catch (c unused) {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
