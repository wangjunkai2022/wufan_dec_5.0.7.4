package com.googlecode.mp4parser.authoring.builder;

import java.util.Map;
/* compiled from: StaticFragmentIntersectionFinderImpl.java */
/* loaded from: classes3.dex */
public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    Map<com.googlecode.mp4parser.authoring.h, long[]> f13191a;

    public f(Map<com.googlecode.mp4parser.authoring.h, long[]> map) {
        this.f13191a = map;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.c
    public long[] a(com.googlecode.mp4parser.authoring.h hVar) {
        return this.f13191a.get(hVar);
    }
}
