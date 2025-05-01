package com.googlecode.mp4parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
/* compiled from: FileDataSourceImpl.java */
/* loaded from: classes3.dex */
public class g implements e {

    /* renamed from: b  reason: collision with root package name */
    FileChannel f14090b;

    /* renamed from: c  reason: collision with root package name */
    String f14091c;

    public g(File file) throws FileNotFoundException {
        this.f14090b = new FileInputStream(file).getChannel();
        this.f14091c = file.getName();
    }

    @Override // com.googlecode.mp4parser.e
    public void G(long j4) throws IOException {
        this.f14090b.position(j4);
    }

    @Override // com.googlecode.mp4parser.e
    public ByteBuffer Q(long j4, long j5) throws IOException {
        return this.f14090b.map(FileChannel.MapMode.READ_ONLY, j4, j5);
    }

    @Override // com.googlecode.mp4parser.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14090b.close();
    }

    @Override // com.googlecode.mp4parser.e
    public long m(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException {
        return this.f14090b.transferTo(j4, j5, writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.e
    public long position() throws IOException {
        return this.f14090b.position();
    }

    @Override // com.googlecode.mp4parser.e
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f14090b.read(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.e
    public long size() throws IOException {
        return this.f14090b.size();
    }

    public String toString() {
        return this.f14091c;
    }

    public g(String str) throws FileNotFoundException {
        File file = new File(str);
        this.f14090b = new FileInputStream(file).getChannel();
        this.f14091c = file.getName();
    }

    public g(FileChannel fileChannel) {
        this.f14090b = fileChannel;
        this.f14091c = "unknown";
    }

    public g(FileChannel fileChannel, String str) {
        this.f14090b = fileChannel;
        this.f14091c = str;
    }
}
