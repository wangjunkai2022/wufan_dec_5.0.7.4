package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.annotations.DoNotParseDetail;
/* compiled from: TrackFragmentBox.java */
/* loaded from: classes2.dex */
public class k extends com.googlecode.mp4parser.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f9652o = "traf";

    public k() {
        super(f9652o);
    }

    @DoNotParseDetail
    public l C() {
        for (com.coremedia.iso.boxes.d dVar : t()) {
            if (dVar instanceof l) {
                return (l) dVar;
            }
        }
        return null;
    }
}
