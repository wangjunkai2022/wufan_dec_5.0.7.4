package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<com.airbnb.lottie.model.content.j, Path>> f3789a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a<Integer, Integer>> f3790b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Mask> f3791c;

    public h(List<Mask> list) {
        this.f3791c = list;
        this.f3789a = new ArrayList(list.size());
        this.f3790b = new ArrayList(list.size());
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f3789a.add(list.get(i4).b().a());
            this.f3790b.add(list.get(i4).c().a());
        }
    }

    public List<a<com.airbnb.lottie.model.content.j, Path>> a() {
        return this.f3789a;
    }

    public List<Mask> b() {
        return this.f3791c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f3790b;
    }
}
