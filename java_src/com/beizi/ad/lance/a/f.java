package com.beizi.ad.lance.a;

import android.graphics.Rect;
import android.view.View;
import com.beizi.ad.internal.nativead.NativeAdShownListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: CheckViewVisibilityUtil.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private View f6455a;

    /* renamed from: b  reason: collision with root package name */
    private NativeAdShownListener f6456b;

    /* renamed from: c  reason: collision with root package name */
    private com.beizi.ad.internal.nativead.d f6457c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledExecutorService f6458d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f6459e;

    /* renamed from: f  reason: collision with root package name */
    private DecimalFormatSymbols f6460f = new DecimalFormatSymbols(Locale.ENGLISH);

    /* renamed from: g  reason: collision with root package name */
    private Format f6461g = new DecimalFormat("0.00", this.f6460f);

    /* renamed from: h  reason: collision with root package name */
    private boolean f6462h = false;

    public f(View view, NativeAdShownListener nativeAdShownListener, com.beizi.ad.internal.nativead.d dVar) {
        this.f6455a = view;
        this.f6456b = nativeAdShownListener;
        this.f6457c = dVar;
        a();
    }

    public static f a(View view, NativeAdShownListener nativeAdShownListener, com.beizi.ad.internal.nativead.d dVar) {
        if (view == null) {
            return null;
        }
        return new f(view, nativeAdShownListener, dVar);
    }

    private void a() {
        this.f6459e = new Runnable() { // from class: com.beizi.ad.lance.a.f.1
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.a(10)) {
                    if (!f.this.f6462h && f.this.f6457c != null) {
                        f.this.f6462h = true;
                        f.this.f6457c.a();
                    }
                    if (f.this.a(50)) {
                        if (f.this.f6456b != null) {
                            f.this.f6456b.onAdShown();
                        }
                        if (f.this.f6458d != null) {
                            f.this.f6458d.shutdownNow();
                        }
                        f.this.f6457c = null;
                        f.this.f6456b = null;
                        f.this.f6455a = null;
                        f.this.f6458d = null;
                    }
                }
            }
        };
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f6458d = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.beizi.ad.lance.a.f.2
            @Override // java.lang.Runnable
            public void run() {
                if (f.this.f6455a != null) {
                    f.this.f6455a.post(f.this.f6459e);
                }
            }
        }, 0L, 250L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i4) {
        try {
            View view = this.f6455a;
            if (view != null && view.getVisibility() == 0 && this.f6455a.getParent() != null) {
                Rect rect = new Rect();
                if (this.f6455a.getGlobalVisibleRect(rect)) {
                    int height = rect.height() * rect.width();
                    int height2 = this.f6455a.getHeight() * this.f6455a.getWidth();
                    return height2 > 0 && height * 100 >= i4 * height2;
                }
                return false;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }
}
