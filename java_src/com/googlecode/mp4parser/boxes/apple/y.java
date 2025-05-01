package com.googlecode.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.aspectj.lang.c;
/* compiled from: AppleRecordingYearBox.java */
/* loaded from: classes3.dex */
public class y extends j {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;

    /* renamed from: y  reason: collision with root package name */
    DateFormat f13722y;

    /* renamed from: z  reason: collision with root package name */
    Date f13723z;

    static {
        s();
    }

    public y() {
        super("©day", 1);
        this.f13723z = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ssZ");
        this.f13722y = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    protected static String F(String str) {
        return str.replaceAll("Z$", "+0000").replaceAll("([0-9][0-9]):([0-9][0-9])$", "$1$2");
    }

    protected static String G(String str) {
        return str.replaceAll("\\+0000$", "Z");
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleRecordingYearBox.java", y.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "", "", "", "java.util.Date"), 27);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDate", "com.googlecode.mp4parser.boxes.apple.AppleRecordingYearBox", "java.util.Date", "date", "", "void"), 31);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected byte[] C() {
        return com.coremedia.iso.l.b(G(this.f13722y.format(this.f13723z)));
    }

    public Date E() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f13723z;
    }

    public void H(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, date));
        this.f13723z = date;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected int v() {
        return com.coremedia.iso.l.b(G(this.f13722y.format(this.f13723z))).length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.j
    protected void y(ByteBuffer byteBuffer) {
        try {
            this.f13723z = this.f13722y.parse(F(com.coremedia.iso.g.h(byteBuffer, byteBuffer.remaining())));
        } catch (ParseException e5) {
            throw new RuntimeException(e5);
        }
    }
}
