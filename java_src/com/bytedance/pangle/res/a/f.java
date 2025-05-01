package com.bytedance.pangle.res.a;

import java.io.DataInput;
/* loaded from: classes2.dex */
public abstract class f implements DataInput {

    /* renamed from: a  reason: collision with root package name */
    public final i f8552a;

    public f(i iVar) {
        this.f8552a = iVar;
    }

    @Override // java.io.DataInput
    public boolean readBoolean() {
        return this.f8552a.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() {
        return this.f8552a.readByte();
    }

    @Override // java.io.DataInput
    public char readChar() {
        return this.f8552a.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() {
        return this.f8552a.readDouble();
    }

    @Override // java.io.DataInput
    public float readFloat() {
        return this.f8552a.readFloat();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i4, int i5) {
        this.f8552a.readFully(bArr, i4, i5);
    }

    @Override // java.io.DataInput
    public int readInt() {
        return this.f8552a.readInt();
    }

    @Override // java.io.DataInput
    public String readLine() {
        return this.f8552a.readLine();
    }

    @Override // java.io.DataInput
    public long readLong() {
        return this.f8552a.readLong();
    }

    @Override // java.io.DataInput
    public short readShort() {
        return this.f8552a.readShort();
    }

    @Override // java.io.DataInput
    public String readUTF() {
        return this.f8552a.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() {
        return this.f8552a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() {
        return this.f8552a.readUnsignedShort();
    }

    @Override // java.io.DataInput
    public int skipBytes(int i4) {
        return this.f8552a.skipBytes(i4);
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) {
        this.f8552a.readFully(bArr);
    }
}
