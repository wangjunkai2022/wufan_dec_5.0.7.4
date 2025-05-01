package com.googlecode.mp4parser.boxes.mp4;

import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.l;
import com.googlecode.mp4parser.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: AbstractDescriptorBox.java */
/* loaded from: classes3.dex */
public class a extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    private static Logger f13871u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13872v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13873w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13874x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13875y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13876z = null;

    /* renamed from: s  reason: collision with root package name */
    protected com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b f13877s;

    /* renamed from: t  reason: collision with root package name */
    protected ByteBuffer f13878t;

    static {
        s();
        f13871u = Logger.getLogger(a.class.getName());
    }

    public a(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("AbstractDescriptorBox.java", a.class);
        f13872v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 42);
        f13873w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"), 58);
        f13874x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "", "java.lang.String"), 62);
        f13875y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 66);
        f13876z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 70);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13878t = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.f13878t.rewind();
            this.f13877s = l.a(-1, this.f13878t);
        } catch (IOException e5) {
            f13871u.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e5);
        } catch (IndexOutOfBoundsException e6) {
            f13871u.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e6);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        this.f13878t.rewind();
        byteBuffer.put(this.f13878t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f13878t.limit() + 4;
    }

    public ByteBuffer v() {
        j.b().c(e.v(f13872v, this, this));
        return this.f13878t;
    }

    public com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b w() {
        j.b().c(e.v(f13873w, this, this));
        return this.f13877s;
    }

    public String x() {
        j.b().c(e.v(f13874x, this, this));
        return this.f13877s.toString();
    }

    public void y(ByteBuffer byteBuffer) {
        j.b().c(e.w(f13876z, this, this, byteBuffer));
        this.f13878t = byteBuffer;
    }

    public void z(com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b bVar) {
        j.b().c(e.w(f13875y, this, this, bVar));
        this.f13877s = bVar;
    }
}
