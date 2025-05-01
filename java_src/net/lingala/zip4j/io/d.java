package net.lingala.zip4j.io;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.Deflater;
import net.lingala.zip4j.exception.ZipException;
import w3.o;
import w3.p;
/* compiled from: DeflaterOutputStream.java */
/* loaded from: classes7.dex */
public class d extends c {

    /* renamed from: o  reason: collision with root package name */
    private byte[] f71799o;

    /* renamed from: p  reason: collision with root package name */
    protected Deflater f71800p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f71801q;

    public d(OutputStream outputStream, o oVar) {
        super(outputStream, oVar);
        this.f71800p = new Deflater();
        this.f71799o = new byte[4096];
        this.f71801q = false;
    }

    private void A() throws IOException {
        Deflater deflater = this.f71800p;
        byte[] bArr = this.f71799o;
        int deflate = deflater.deflate(bArr, 0, bArr.length);
        if (deflate > 0) {
            if (this.f71800p.finished()) {
                if (deflate == 4) {
                    return;
                }
                if (deflate < 4) {
                    g(4 - deflate);
                    return;
                }
                deflate -= 4;
            }
            if (!this.f71801q) {
                super.write(this.f71799o, 2, deflate - 2);
                this.f71801q = true;
                return;
            }
            super.write(this.f71799o, 0, deflate);
        }
    }

    @Override // net.lingala.zip4j.io.c
    public void a() throws IOException, ZipException {
        if (this.f71791g.c() == 8) {
            if (!this.f71800p.finished()) {
                this.f71800p.finish();
                while (!this.f71800p.finished()) {
                    A();
                }
            }
            this.f71801q = false;
        }
        super.a();
    }

    @Override // net.lingala.zip4j.io.c
    public void j() throws IOException, ZipException {
        super.j();
    }

    @Override // net.lingala.zip4j.io.c
    public void v(File file, p pVar) throws ZipException {
        super.v(file, pVar);
        if (pVar.c() == 8) {
            this.f71800p.reset();
            if ((pVar.b() >= 0 && pVar.b() <= 9) || pVar.b() == -1) {
                this.f71800p.setLevel(pVar.b());
                return;
            }
            throw new ZipException("invalid compression level for deflater. compression level should be in the range of 0-9");
        }
    }

    @Override // net.lingala.zip4j.io.c, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.c, net.lingala.zip4j.io.b, java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4}, 0, 1);
    }

    @Override // net.lingala.zip4j.io.c, java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        if (this.f71791g.c() != 8) {
            super.write(bArr, i4, i5);
            return;
        }
        this.f71800p.setInput(bArr, i4, i5);
        while (!this.f71800p.needsInput()) {
            A();
        }
    }
}
