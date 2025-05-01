package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.t;
import java.util.List;
/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class m extends a<com.airbnb.lottie.model.content.j, Path> {

    /* renamed from: i  reason: collision with root package name */
    private final com.airbnb.lottie.model.content.j f3800i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f3801j;

    /* renamed from: k  reason: collision with root package name */
    private List<t> f3802k;

    public m(List<com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.j>> list) {
        super(list);
        this.f3800i = new com.airbnb.lottie.model.content.j();
        this.f3801j = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a
    /* renamed from: p */
    public Path i(com.airbnb.lottie.value.a<com.airbnb.lottie.model.content.j> aVar, float f5) {
        this.f3800i.c(aVar.f4337b, aVar.f4338c, f5);
        com.airbnb.lottie.model.content.j jVar = this.f3800i;
        List<t> list = this.f3802k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                jVar = this.f3802k.get(size).c(jVar);
            }
        }
        com.airbnb.lottie.utils.g.i(jVar, this.f3801j);
        return this.f3801j;
    }

    public void q(@Nullable List<t> list) {
        this.f3802k = list;
    }
}
