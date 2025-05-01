package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: InitialObjectDescriptor.java */
/* loaded from: classes3.dex */
public class j extends k {

    /* renamed from: e  reason: collision with root package name */
    private int f13965e;

    /* renamed from: f  reason: collision with root package name */
    int f13966f;

    /* renamed from: g  reason: collision with root package name */
    int f13967g;

    /* renamed from: h  reason: collision with root package name */
    int f13968h;

    /* renamed from: i  reason: collision with root package name */
    String f13969i;

    /* renamed from: j  reason: collision with root package name */
    int f13970j;

    /* renamed from: k  reason: collision with root package name */
    int f13971k;

    /* renamed from: l  reason: collision with root package name */
    int f13972l;

    /* renamed from: m  reason: collision with root package name */
    int f13973m;

    /* renamed from: n  reason: collision with root package name */
    int f13974n;

    /* renamed from: o  reason: collision with root package name */
    List<g> f13975o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    List<h> f13976p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    List<b> f13977q = new ArrayList();

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        int i4;
        int i5 = com.coremedia.iso.g.i(byteBuffer);
        this.f13965e = (65472 & i5) >> 6;
        this.f13966f = (i5 & 63) >> 5;
        this.f13967g = (i5 & 31) >> 4;
        int a5 = a() - 2;
        if (this.f13966f == 1) {
            int p4 = com.coremedia.iso.g.p(byteBuffer);
            this.f13968h = p4;
            this.f13969i = com.coremedia.iso.g.h(byteBuffer, p4);
            i4 = a5 - (this.f13968h + 1);
        } else {
            this.f13970j = com.coremedia.iso.g.p(byteBuffer);
            this.f13971k = com.coremedia.iso.g.p(byteBuffer);
            this.f13972l = com.coremedia.iso.g.p(byteBuffer);
            this.f13973m = com.coremedia.iso.g.p(byteBuffer);
            this.f13974n = com.coremedia.iso.g.p(byteBuffer);
            i4 = a5 - 5;
            if (i4 > 2) {
                b a6 = l.a(-1, byteBuffer);
                i4 -= a6.a();
                if (a6 instanceof g) {
                    this.f13975o.add((g) a6);
                } else {
                    this.f13977q.add(a6);
                }
            }
        }
        if (i4 > 2) {
            b a7 = l.a(-1, byteBuffer);
            if (a7 instanceof h) {
                this.f13976p.add((h) a7);
            } else {
                this.f13977q.add(a7);
            }
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return "InitialObjectDescriptor{objectDescriptorId=" + this.f13965e + ", urlFlag=" + this.f13966f + ", includeInlineProfileLevelFlag=" + this.f13967g + ", urlLength=" + this.f13968h + ", urlString='" + this.f13969i + "', oDProfileLevelIndication=" + this.f13970j + ", sceneProfileLevelIndication=" + this.f13971k + ", audioProfileLevelIndication=" + this.f13972l + ", visualProfileLevelIndication=" + this.f13973m + ", graphicsProfileLevelIndication=" + this.f13974n + ", esDescriptors=" + this.f13975o + ", extensionDescriptors=" + this.f13976p + ", unknownDescriptors=" + this.f13977q + '}';
    }
}
