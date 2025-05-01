package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AbstractTrack.java */
/* loaded from: classes3.dex */
public abstract class a implements h {

    /* renamed from: b  reason: collision with root package name */
    String f13155b;

    /* renamed from: c  reason: collision with root package name */
    List<c> f13156c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> f13157d = new HashMap();

    public a(String str) {
        this.f13155b = str;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<c> H() {
        return this.f13156c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13157d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : O()) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return this.f13155b;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return null;
    }
}
