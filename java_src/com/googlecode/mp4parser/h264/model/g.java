package com.googlecode.mp4parser.h264.model;

import java.util.Arrays;
/* compiled from: ScalingMatrix.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public f[] f14143a;

    /* renamed from: b  reason: collision with root package name */
    public f[] f14144b;

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        f[] fVarArr = this.f14143a;
        sb.append(fVarArr == null ? null : Arrays.asList(fVarArr));
        sb.append("\n");
        sb.append(", ScalingList8x8=");
        f[] fVarArr2 = this.f14144b;
        sb.append(fVarArr2 != null ? Arrays.asList(fVarArr2) : null);
        sb.append("\n");
        sb.append('}');
        return sb.toString();
    }
}
