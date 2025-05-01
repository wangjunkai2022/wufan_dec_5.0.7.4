package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.util.o;
import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: CencSampleEncryptionInformationGroupEntry.java */
/* loaded from: classes3.dex */
public class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f13984d = "seig";

    /* renamed from: a  reason: collision with root package name */
    private boolean f13985a;

    /* renamed from: b  reason: collision with root package name */
    private byte f13986b;

    /* renamed from: c  reason: collision with root package name */
    private UUID f13987c;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        com.coremedia.iso.i.h(allocate, this.f13985a ? 1 : 0);
        if (this.f13985a) {
            com.coremedia.iso.i.m(allocate, this.f13986b);
            allocate.put(o.b(this.f13987c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        this.f13985a = com.coremedia.iso.g.k(byteBuffer) == 1;
        this.f13986b = (byte) com.coremedia.iso.g.p(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.f13987c = o.a(bArr);
    }

    public byte d() {
        return this.f13986b;
    }

    public UUID e() {
        return this.f13987c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f13985a == aVar.f13985a && this.f13986b == aVar.f13986b) {
            UUID uuid = this.f13987c;
            UUID uuid2 = aVar.f13987c;
            return uuid == null ? uuid2 == null : uuid.equals(uuid2);
        }
        return false;
    }

    public boolean f() {
        return this.f13985a;
    }

    public void g(boolean z4) {
        this.f13985a = z4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f13984d;
    }

    public void h(int i4) {
        this.f13986b = (byte) i4;
    }

    public int hashCode() {
        int i4 = (((this.f13985a ? 7 : 19) * 31) + this.f13986b) * 31;
        UUID uuid = this.f13987c;
        return i4 + (uuid != null ? uuid.hashCode() : 0);
    }

    public void i(UUID uuid) {
        this.f13987c = uuid;
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.f13985a + ", ivSize=" + ((int) this.f13986b) + ", kid=" + this.f13987c + '}';
    }
}
