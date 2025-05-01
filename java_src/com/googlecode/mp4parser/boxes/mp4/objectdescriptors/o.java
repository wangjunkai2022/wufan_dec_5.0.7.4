package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
/* compiled from: UnknownDescriptor.java */
/* loaded from: classes3.dex */
public class o extends b {

    /* renamed from: f  reason: collision with root package name */
    private static Logger f13982f = Logger.getLogger(o.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private ByteBuffer f13983e;

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f13983e = (ByteBuffer) byteBuffer.slice().limit(c());
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return "UnknownDescriptor{tag=" + this.f13926a + ", sizeOfInstance=" + this.f13927b + ", data=" + this.f13983e + '}';
    }
}
