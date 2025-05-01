package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes2.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<com.airbnb.lottie.value.a<V>> f3935a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(V v2) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v2)));
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<V>> b() {
        return this.f3935a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        return this.f3935a.isEmpty() || (this.f3935a.size() == 1 && this.f3935a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f3935a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f3935a.toArray()));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<com.airbnb.lottie.value.a<V>> list) {
        this.f3935a = list;
    }
}
