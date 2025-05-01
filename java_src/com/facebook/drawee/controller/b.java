package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;
/* compiled from: BaseControllerListener.java */
/* loaded from: classes.dex */
public class b<INFO> implements c<INFO> {

    /* renamed from: a  reason: collision with root package name */
    private static final c<Object> f11133a = new b();

    public static <INFO> c<INFO> a() {
        return (c<INFO>) f11133a;
    }

    @Override // com.facebook.drawee.controller.c
    public void onFailure(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.controller.c
    public void onFinalImageSet(String str, @Nullable INFO info, @Nullable Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.c
    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    @Override // com.facebook.drawee.controller.c
    public void onIntermediateImageSet(String str, @Nullable INFO info) {
    }

    @Override // com.facebook.drawee.controller.c
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.controller.c
    public void onSubmit(String str, Object obj) {
    }
}
