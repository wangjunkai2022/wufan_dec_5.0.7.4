package com.kingja.loadsir.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class LoadLayout extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int f55202h = 1;

    /* renamed from: b  reason: collision with root package name */
    private final String f55203b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Class<? extends Callback>, Callback> f55204c;

    /* renamed from: d  reason: collision with root package name */
    private Context f55205d;

    /* renamed from: e  reason: collision with root package name */
    private Callback.OnReloadListener f55206e;

    /* renamed from: f  reason: collision with root package name */
    private Class<? extends Callback> f55207f;

    /* renamed from: g  reason: collision with root package name */
    private Class<? extends Callback> f55208g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f55209b;

        a(Class cls) {
            this.f55209b = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadLayout.this.f(this.f55209b);
        }
    }

    public LoadLayout(@NonNull Context context) {
        super(context);
        this.f55203b = getClass().getSimpleName();
        this.f55204c = new HashMap();
    }

    private void c(Class<? extends Callback> cls) {
        if (!this.f55204c.containsKey(cls)) {
            throw new IllegalArgumentException(String.format("The Callback (%s) is nonexistent.", cls.getSimpleName()));
        }
    }

    private void d(Class<? extends Callback> cls) {
        post(new a(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Class<? extends Callback> cls) {
        Class<? extends Callback> cls2 = this.f55207f;
        if (cls2 != null) {
            if (cls2 == cls) {
                return;
            }
            this.f55204c.get(cls2).onDetach();
        }
        if (getChildCount() > 1) {
            removeViewAt(1);
        }
        for (Class<? extends Callback> cls3 : this.f55204c.keySet()) {
            if (cls3 == cls) {
                SuccessCallback successCallback = (SuccessCallback) this.f55204c.get(SuccessCallback.class);
                if (cls3 == SuccessCallback.class) {
                    successCallback.b();
                } else {
                    successCallback.c(this.f55204c.get(cls3).getSuccessVisible());
                    View rootView = this.f55204c.get(cls3).getRootView();
                    addView(rootView);
                    this.f55204c.get(cls3).onAttach(this.f55205d, rootView);
                }
                this.f55207f = cls;
            }
        }
        this.f55208g = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(Callback callback) {
        if (this.f55204c.containsKey(callback.getClass())) {
            return;
        }
        this.f55204c.put(callback.getClass(), callback);
    }

    public void e(Class<? extends Callback> cls) {
        c(cls);
        if (j2.b.b()) {
            f(cls);
        } else {
            d(cls);
        }
    }

    public Class<? extends Callback> getCurrentCallback() {
        return this.f55208g;
    }

    public void setCallBack(Class<? extends Callback> cls, d dVar) {
        if (dVar == null) {
            return;
        }
        c(cls);
        dVar.a(this.f55205d, this.f55204c.get(cls).obtainRootView());
    }

    public void setupCallback(Callback callback) {
        Callback copy = callback.copy();
        copy.setCallback(this.f55205d, this.f55206e);
        b(copy);
    }

    public void setupSuccessLayout(Callback callback) {
        b(callback);
        View rootView = callback.getRootView();
        rootView.setVisibility(4);
        addView(rootView, new ViewGroup.LayoutParams(-1, -1));
        this.f55208g = SuccessCallback.class;
    }

    public LoadLayout(@NonNull Context context, Callback.OnReloadListener onReloadListener) {
        this(context);
        this.f55205d = context;
        this.f55206e = onReloadListener;
    }
}
