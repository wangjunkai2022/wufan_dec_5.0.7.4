package n0;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;
/* compiled from: ImageLoadingTimeControllerListener.java */
/* loaded from: classes.dex */
public class a extends com.facebook.drawee.controller.b {

    /* renamed from: b  reason: collision with root package name */
    private long f71679b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f71680c = -1;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private b f71681d;

    public a(@Nullable b bVar) {
        this.f71681d = bVar;
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    public void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f71680c = currentTimeMillis;
        b bVar = this.f71681d;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f71679b);
        }
    }

    @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
    public void onSubmit(String str, Object obj) {
        this.f71679b = System.currentTimeMillis();
    }
}
