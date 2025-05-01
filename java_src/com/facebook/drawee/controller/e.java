package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;
/* compiled from: ForwardingControllerListener.java */
@ThreadSafe
/* loaded from: classes.dex */
public class e<INFO> implements c<INFO> {

    /* renamed from: b  reason: collision with root package name */
    private static final String f11134b = "FdingControllerListener";

    /* renamed from: a  reason: collision with root package name */
    private final List<c<? super INFO>> f11135a = new ArrayList(2);

    public static <INFO> e<INFO> c() {
        return new e<>();
    }

    public static <INFO> e<INFO> d(c<? super INFO> cVar) {
        e<INFO> c5 = c();
        c5.a(cVar);
        return c5;
    }

    public static <INFO> e<INFO> e(c<? super INFO> cVar, c<? super INFO> cVar2) {
        e<INFO> c5 = c();
        c5.a(cVar);
        c5.a(cVar2);
        return c5;
    }

    private synchronized void f(String str, Throwable th) {
    }

    public synchronized void a(c<? super INFO> cVar) {
        this.f11135a.add(cVar);
    }

    public synchronized void b() {
        this.f11135a.clear();
    }

    public synchronized void g(c<? super INFO> cVar) {
        int indexOf = this.f11135a.indexOf(cVar);
        if (indexOf != -1) {
            this.f11135a.set(indexOf, null);
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onFailure(str, th);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onFailure", e5);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void onFinalImageSet(String str, @Nullable INFO info, @Nullable Animatable animatable) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onFinalImageSet", e5);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onIntermediateImageFailed(str, th);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onIntermediateImageFailed", e5);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public void onIntermediateImageSet(String str, @Nullable INFO info) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onIntermediateImageSet(str, info);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onIntermediateImageSet", e5);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void onRelease(String str) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onRelease(str);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onRelease", e5);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f11135a.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                c<? super INFO> cVar = this.f11135a.get(i4);
                if (cVar != null) {
                    cVar.onSubmit(str, obj);
                }
            } catch (Exception e5) {
                f("InternalListener exception in onSubmit", e5);
            }
        }
    }
}
