package com.kwad.components.core.e.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.components.core.e.c.a;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.n.l;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public final class b extends com.kwad.components.core.proxy.d {
    @Nullable
    private static b KF;
    @NonNull
    private final C0456b KG;
    private com.kwad.components.core.e.c.a KJ;
    private boolean KK;

    /* loaded from: classes5.dex */
    public static class a {
        @Nullable
        private DialogInterface.OnShowListener KM;
        @Nullable
        private DialogInterface.OnDismissListener KN;
        private AdTemplate adTemplate;
        private String url;

        public final a af(String str) {
            this.url = str;
            return this;
        }

        public final a aq(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
            return this;
        }

        public final C0456b nT() {
            if (com.kwad.components.core.a.md.booleanValue() && (this.adTemplate == null || TextUtils.isEmpty(this.url))) {
                throw new IllegalArgumentException("param is error, please check it");
            }
            return new C0456b(this, (byte) 0);
        }

        public final a a(@Nullable DialogInterface.OnShowListener onShowListener) {
            this.KM = onShowListener;
            return this;
        }

        public final a c(@Nullable DialogInterface.OnDismissListener onDismissListener) {
            this.KN = onDismissListener;
            return this;
        }
    }

    /* renamed from: com.kwad.components.core.e.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0456b {
        @Nullable
        protected DialogInterface.OnShowListener KM;
        @Nullable
        protected DialogInterface.OnDismissListener KN;
        protected final AdTemplate adTemplate;
        protected String url;

        /* synthetic */ C0456b(a aVar, byte b5) {
            this(aVar);
        }

        private C0456b(a aVar) {
            this.adTemplate = aVar.adTemplate;
            this.url = aVar.url;
            this.KM = aVar.KM;
            this.KN = aVar.KN;
        }
    }

    private b(Activity activity, @NonNull C0456b c0456b) {
        super(activity);
        this.KK = false;
        this.KG = c0456b;
        if (com.kwad.sdk.c.a.a.b(activity)) {
            getWindow().addFlags(1024);
        }
        setOnShowListener(c0456b.KM);
        setOnDismissListener(c0456b.KN);
    }

    public static boolean a(Context context, C0456b c0456b) {
        Activity dB;
        b bVar = KF;
        if ((bVar == null || !bVar.isShowing()) && context != null && (dB = l.dB(context)) != null && !dB.isFinishing()) {
            com.kwad.sdk.a.a.c.Au().dismiss();
            try {
                b bVar2 = new b(dB, c0456b);
                KF = bVar2;
                bVar2.show();
                com.kwad.sdk.core.adlog.c.b(c0456b.adTemplate, 86, (JSONObject) null);
                return true;
            } catch (Throwable th) {
                com.kwad.sdk.core.e.c.printStackTrace(th);
            }
        }
        return false;
    }

    public static boolean nQ() {
        b bVar = KF;
        if (bVar != null) {
            return bVar.isShowing();
        }
        return false;
    }

    public final void aj(boolean z4) {
        this.KK = z4;
        dismiss();
    }

    @Override // com.kwad.components.core.proxy.d
    public final ViewGroup ck() {
        com.kwad.components.core.e.c.a aVar = new com.kwad.components.core.e.c.a(this.mContext, this, this.KG);
        this.KJ = aVar;
        return aVar;
    }

    @Override // com.kwad.components.core.proxy.d, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        KF = null;
    }

    @Override // com.kwad.components.core.proxy.d
    public final void g(View view) {
        this.KJ.setChangeListener(new a.InterfaceC0455a() { // from class: com.kwad.components.core.e.c.b.1
            @Override // com.kwad.components.core.e.c.a.InterfaceC0455a
            public final void nP() {
                b.this.dismiss();
            }
        });
    }

    @Override // com.kwad.components.core.proxy.d
    public final int getLayoutId() {
        return 0;
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return super.isShowing();
    }

    @Override // com.kwad.components.core.proxy.d
    public final boolean nR() {
        return true;
    }

    public final boolean nS() {
        return this.KK;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
        com.kwad.sdk.core.adlog.c.bQ(this.KG.adTemplate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        KF = null;
    }

    @Override // com.kwad.components.core.proxy.d, android.app.Dialog
    public final void onStart() {
        super.onStart();
        b bVar = KF;
        if (bVar != null) {
            bVar.setTitle((CharSequence) null);
        }
    }

    @Override // android.app.Dialog
    public final void show() {
        Resources resources;
        int identifier;
        try {
            super.show();
            int i4 = 0;
            if (getContext() != null && (resources = getContext().getResources()) != null && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", q.a.f73126a)) > 0) {
                i4 = getContext().getResources().getDimensionPixelSize(identifier);
            }
            if (i4 > 0) {
                getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 19 ? 5382 : 1287);
            }
        } catch (Exception e5) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e5);
        }
    }
}
