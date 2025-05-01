package com.kwad.components.core.page;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.ksad.annotation.invoker.InvokeBy;
import com.kwad.components.core.c.f;
import com.kwad.components.core.page.widget.a;
import com.kwad.components.core.webview.tachikoma.c.e;
import com.kwad.sdk.R;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.AdWebViewActivity;
import com.kwad.sdk.commercial.model.WebCloseStatus;
import com.kwad.sdk.core.response.b.e;
import com.kwad.sdk.core.response.model.AdResultData;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.bh;
import com.kwad.sdk.utils.bo;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(AdWebViewActivity.class)
@Keep
/* loaded from: classes5.dex */
public class AdWebViewActivityProxy extends com.kwad.components.core.proxy.c {
    public static final String KEY_AD_RESULT_CACHE_IDX = "key_ad_result_cache_idx";
    private static final String KEY_IS_AUTO_SHOW = "key_is_auto_show";
    private static final String KEY_LANDING_PAGE_TYPE = "key_landing_page_type";
    private static final String KEY_PAGE_TITLE = "key_page_title";
    private static final String KEY_PAGE_URL = "key_page_url";
    private static final String KEY_SHOW_PERMISSION = "key_show_permission";
    private static final String KEY_SHOW_TK_CONFIRM_DIALOG = "key_show_tk_confirm_dialog";
    public static final String KEY_TEMPLATE = "key_template_json";
    private AdResultData mAdResultData;
    private AdTemplate mAdTemplate;
    private boolean mAutoShow;
    private com.kwad.components.core.q.b mDialogFragment;
    private boolean mDisableShowConfirmDialog;
    private boolean mHasShowShowConfirmDialog;
    private Dialog mKsExitInterceptDialog;
    private Dialog mKsExitInterceptDialogV2;
    private int mLandingPageType;
    private c mLandingPageView;
    private String mPageTitle;
    private String mPageUrl;
    private boolean mShowPermission;
    private volatile boolean destroyed = false;
    private com.kwad.sdk.core.webview.d.a.b mWebCardCloseListener = new com.kwad.sdk.core.webview.d.a.b() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.1
        @Override // com.kwad.sdk.core.webview.d.a.b
        public final void b(WebCloseStatus webCloseStatus) {
            AdWebViewActivityProxy.this.finish();
        }
    };
    private com.kwad.components.core.page.a.a mLandPageViewListener = new com.kwad.components.core.page.a.a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.2
        @Override // com.kwad.components.core.page.a.a
        public final void pC() {
            AdWebViewActivityProxy.this.onBackPressed();
        }

        @Override // com.kwad.components.core.page.a.a
        public final void pD() {
            if (AdWebViewActivityProxy.this.mLandingPageView == null || !AdWebViewActivityProxy.this.mLandingPageView.getCanInterceptBackClick()) {
                if (!AdWebViewActivityProxy.this.mDisableShowConfirmDialog) {
                    if (AdWebViewActivityProxy.this.handleMiddlePageDialog()) {
                        return;
                    }
                    if (!AdWebViewActivityProxy.this.mAdTemplate.mIsForceJumpLandingPage) {
                        if (!com.kwad.sdk.core.response.b.a.aN(e.dS(AdWebViewActivityProxy.this.mAdTemplate)) || com.kwad.components.core.q.a.rj().rk() != 1 || !com.kwad.components.core.q.a.rj().rp() || com.kwad.components.core.q.a.rj().rm()) {
                            if (AdWebViewActivityProxy.this.isFormAdExitInterceptEnable()) {
                                AdWebViewActivityProxy.this.showDialog();
                                return;
                            } else {
                                AdWebViewActivityProxy.this.finish();
                                return;
                            }
                        } else if (!com.kwad.components.core.q.a.rj().rl() && com.kwad.sdk.core.config.d.CE()) {
                            AdWebViewActivityProxy adWebViewActivityProxy = AdWebViewActivityProxy.this;
                            adWebViewActivityProxy.mDialogFragment = adWebViewActivityProxy.getTkDialogFragment();
                            com.kwad.components.core.q.b.a(AdWebViewActivityProxy.this.mDialogFragment, AdWebViewActivityProxy.this.getActivity(), AdWebViewActivityProxy.this.mBaseDialogListener);
                            return;
                        } else {
                            AdWebViewActivityProxy.this.finish();
                            return;
                        }
                    }
                    AdWebViewActivityProxy.this.finish();
                    return;
                }
                AdWebViewActivityProxy.this.finish();
                return;
            }
            AdWebViewActivityProxy.this.mLandingPageView.pM();
        }
    };
    private com.kwad.components.core.webview.tachikoma.e.c mBaseDialogListener = new com.kwad.components.core.webview.tachikoma.e.c() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.3
        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public final void F(boolean z4) {
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public final void fS() {
            com.kwad.components.core.q.a.rj().aL(true);
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public final void ga() {
            com.kwad.components.core.q.a.rj().aL(false);
        }

        @Override // com.kwad.components.core.webview.tachikoma.e.c
        public final void gb() {
        }
    };

    /* loaded from: classes5.dex */
    public static class a {
        private String OJ;
        private String OL;
        private AdResultData OM;
        private boolean ON;
        private boolean OO;
        private int OP;
        private boolean OQ;
        private AdTemplate adTemplate;

        /* renamed from: com.kwad.components.core.page.AdWebViewActivityProxy$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class C0468a {
            private String OJ;
            private String OL;
            private AdResultData OM;
            private boolean OO;
            private int OP = 0;
            private boolean OQ;
            private boolean OR;
            private AdTemplate adTemplate;

            public final C0468a aC(boolean z4) {
                this.OR = z4;
                return this;
            }

            public final C0468a aD(boolean z4) {
                this.OO = z4;
                return this;
            }

            public final C0468a aE(boolean z4) {
                this.OQ = z4;
                return this;
            }

            public final C0468a at(String str) {
                this.OJ = str;
                return this;
            }

            public final C0468a au(String str) {
                this.OL = str;
                return this;
            }

            public final C0468a az(int i4) {
                this.OP = i4;
                return this;
            }

            public final C0468a m(AdResultData adResultData) {
                this.OM = adResultData;
                return this;
            }

            public final a pK() {
                AdResultData adResultData = this.OM;
                if (adResultData != null) {
                    return new a(this.OJ, this.OL, adResultData, this.OR, this.OO, this.OQ, this.OP, (byte) 0);
                }
                return new a(this.OJ, this.OL, this.adTemplate, this.OR, this.OO, this.OQ, this.OP, (byte) 0);
            }

            public final C0468a at(AdTemplate adTemplate) {
                this.adTemplate = adTemplate;
                return this;
            }
        }

        /* synthetic */ a(String str, String str2, AdResultData adResultData, boolean z4, boolean z5, boolean z6, int i4, byte b5) {
            this(str, str2, adResultData, z4, z5, z6, i4);
        }

        public final AdTemplate getAdTemplate() {
            return this.adTemplate;
        }

        public final String pE() {
            return this.OJ;
        }

        public final String pF() {
            return this.OL;
        }

        public final int pG() {
            return this.OP;
        }

        public final boolean pH() {
            return this.ON;
        }

        public final boolean pI() {
            return this.OQ;
        }

        public final boolean pJ() {
            return this.OO;
        }

        /* synthetic */ a(String str, String str2, AdTemplate adTemplate, boolean z4, boolean z5, boolean z6, int i4, byte b5) {
            this(str, str2, adTemplate, z4, z5, z6, i4);
        }

        private a(String str, String str2, AdTemplate adTemplate, boolean z4, boolean z5, boolean z6, int i4) {
            this(str, str2, z4, z5, z6, i4);
            this.adTemplate = adTemplate;
        }

        private a(String str, String str2, AdResultData adResultData, boolean z4, boolean z5, boolean z6, int i4) {
            this(str, str2, z4, z5, z6, i4);
            this.OM = adResultData;
            this.adTemplate = com.kwad.sdk.core.response.b.c.n(adResultData);
        }

        private a(String str, String str2, boolean z4, boolean z5, boolean z6, int i4) {
            this.OJ = str;
            this.OL = str2;
            this.ON = z4;
            this.OO = z5;
            this.OQ = z6;
            this.OP = i4;
        }
    }

    private com.kwad.components.core.page.widget.a buildDialog() {
        return new com.kwad.components.core.page.widget.a(getActivity(), new a.InterfaceC0472a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.5
            @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
            public final void a(DialogInterface dialogInterface) {
                com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 104);
                dialogInterface.dismiss();
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
            public final void b(DialogInterface dialogInterface) {
                try {
                    AdWebViewActivityProxy.super.onBackPressed();
                } catch (Throwable unused) {
                }
                com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 105);
            }

            @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
            public final void c(DialogInterface dialogInterface) {
                com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 106);
                dialogInterface.dismiss();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.kwad.components.core.q.b getTkDialogFragment() {
        e.b bVar = new e.b();
        bVar.d(this.mAdResultData);
        bVar.aX(com.kwad.sdk.core.response.b.b.dy(this.mAdTemplate));
        bVar.aW(false);
        bVar.aX(true);
        return com.kwad.components.core.q.b.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMiddlePageDialog() {
        boolean z4 = false;
        if (this.mAdTemplate != null && com.kwad.sdk.core.config.d.CE()) {
            if (!bh.isNullString(com.kwad.sdk.core.response.b.a.cc(this.mAdTemplate)) && com.kwad.sdk.core.response.b.a.cb(this.mAdTemplate)) {
                z4 = true;
                if (this.mHasShowShowConfirmDialog) {
                    try {
                        super.onBackPressed();
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTrace(th);
                    }
                } else {
                    com.kwad.components.core.q.b tkDialogFragment = getTkDialogFragment();
                    this.mDialogFragment = tkDialogFragment;
                    com.kwad.components.core.q.b.a(tkDialogFragment, getActivity(), this.mBaseDialogListener);
                    this.mHasShowShowConfirmDialog = true;
                }
            }
            return z4;
        }
        return false;
    }

    private void initContentView() {
        c a5 = c.a(this.mContext, new a.C0468a().at(this.mPageTitle).au(this.mPageUrl).at(this.mAdTemplate).aC(this.mShowPermission).aD(this.mAutoShow).az(this.mLandingPageType).aE(this.mDisableShowConfirmDialog).pK());
        this.mLandingPageView = a5;
        a5.setLandPageViewListener(this.mLandPageViewListener);
        this.mLandingPageView.setWebCardCloseListener(this.mWebCardCloseListener);
        ((ViewGroup) findViewById(R.id.ksad_land_page_root)).addView(this.mLandingPageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFormAdExitInterceptEnable() {
        AdTemplate adTemplate;
        if (this.mShowPermission || (adTemplate = this.mAdTemplate) == null || com.kwad.sdk.core.response.b.e.F(adTemplate)) {
            return false;
        }
        if (com.kwad.sdk.core.config.d.CM() && this.mAdTemplate.mIsFromContent) {
            return true;
        }
        return com.kwad.sdk.core.config.d.CN() && !this.mAdTemplate.mIsFromContent;
    }

    public static void launch(Context context, a aVar) {
        if (context == null || TextUtils.isEmpty(aVar.OL)) {
            return;
        }
        try {
            com.kwad.sdk.commercial.g.a.j(aVar.getAdTemplate(), aVar.pG(), aVar.pF());
            com.kwad.sdk.service.b.a(AdWebViewActivity.class, AdWebViewActivityProxy.class);
            Intent intent = new Intent(context, AdWebViewActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(KEY_PAGE_TITLE, aVar.OJ);
            intent.putExtra(KEY_LANDING_PAGE_TYPE, aVar.OP);
            intent.putExtra(KEY_PAGE_URL, aVar.OL);
            intent.putExtra(KEY_IS_AUTO_SHOW, aVar.OO);
            intent.putExtra(KEY_SHOW_PERMISSION, aVar.ON);
            intent.putExtra(KEY_SHOW_TK_CONFIRM_DIALOG, aVar.pI());
            AdResultData adResultData = aVar.OM;
            if (adResultData == null) {
                adResultData = com.kwad.sdk.core.response.b.c.dD(aVar.adTemplate);
            }
            intent.putExtra("key_ad_result_cache_idx", f.ne().i(adResultData));
            context.startActivity(intent);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
            com.kwad.sdk.commercial.g.a.a(aVar.getAdTemplate(), aVar.pG(), aVar.pF(), bo.t(th));
            if (l.zJ().yV()) {
                ServiceProvider.reportSdkCaughtException(th);
                return;
            }
            throw th;
        }
    }

    @InvokeBy(invokerClass = com.kwad.sdk.service.b.class, methodId = "initComponentProxyForInvoker")
    public static void register() {
        com.kwad.sdk.service.b.a(AdWebViewActivity.class, AdWebViewActivityProxy.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialog() {
        if (this.mKsExitInterceptDialog == null) {
            this.mKsExitInterceptDialog = buildDialog();
        }
        com.kwad.sdk.core.adlog.c.b(this.mAdTemplate, 103, (JSONObject) null);
        this.mKsExitInterceptDialog.show();
    }

    @Override // com.kwad.components.core.proxy.c
    public boolean checkIntentData(@Nullable Intent intent) {
        AdResultData d5 = f.ne().d(getIntent().getIntExtra("key_ad_result_cache_idx", 0), true);
        this.mAdResultData = d5;
        if (d5 == null) {
            return false;
        }
        AdTemplate n4 = com.kwad.sdk.core.response.b.c.n(d5);
        this.mAdTemplate = n4;
        return n4 != null;
    }

    @Override // com.kwad.components.core.proxy.c
    public int getLayoutId() {
        return 0;
    }

    @Override // com.kwad.components.core.proxy.c
    public String getPageName() {
        return "AdWebViewActivityProxy";
    }

    @Override // com.kwad.components.core.proxy.c
    public void initData() {
        this.destroyed = false;
        this.mPageTitle = getIntent().getStringExtra(KEY_PAGE_TITLE);
        this.mLandingPageType = getIntent().getIntExtra(KEY_LANDING_PAGE_TYPE, 0);
        this.mPageUrl = getIntent().getStringExtra(KEY_PAGE_URL);
        this.mAutoShow = getIntent().getBooleanExtra(KEY_IS_AUTO_SHOW, false);
        this.mShowPermission = getIntent().getBooleanExtra(KEY_SHOW_PERMISSION, false);
        this.mDisableShowConfirmDialog = getIntent().getBooleanExtra(KEY_SHOW_TK_CONFIRM_DIALOG, false);
    }

    @Override // com.kwad.components.core.proxy.c
    public void initView() {
        setContentView(R.layout.ksad_activity_landpage);
        initContentView();
    }

    @Override // com.kwad.components.core.proxy.c
    public void onActivityCreate() {
        super.onActivityCreate();
        com.kwad.sdk.commercial.g.a.k(this.mAdTemplate, this.mLandingPageType, this.mPageUrl);
    }

    @Override // com.kwad.components.core.proxy.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        c cVar = this.mLandingPageView;
        if (cVar != null && cVar.getCanInterceptBackClick()) {
            this.mLandingPageView.pM();
        } else if (this.mDisableShowConfirmDialog) {
            finish();
        } else if (handleMiddlePageDialog()) {
        } else {
            AdTemplate adTemplate = this.mAdTemplate;
            if (adTemplate != null && !adTemplate.mIsForceJumpLandingPage) {
                if (com.kwad.sdk.core.response.b.a.aN(com.kwad.sdk.core.response.b.e.dS(adTemplate)) && com.kwad.components.core.q.a.rj().rk() == 1 && com.kwad.components.core.q.a.rj().rp() && !com.kwad.components.core.q.a.rj().rm()) {
                    if (!com.kwad.components.core.q.a.rj().rl() && com.kwad.sdk.core.config.d.CE()) {
                        com.kwad.components.core.q.b tkDialogFragment = getTkDialogFragment();
                        this.mDialogFragment = tkDialogFragment;
                        com.kwad.components.core.q.b.a(tkDialogFragment, getActivity(), this.mBaseDialogListener);
                        return;
                    }
                    super.onBackPressed();
                    return;
                }
                if (isFormAdExitInterceptEnable()) {
                    try {
                        if (this.mKsExitInterceptDialogV2 == null) {
                            this.mKsExitInterceptDialogV2 = new com.kwad.components.core.page.widget.a(getActivity(), new a.InterfaceC0472a() { // from class: com.kwad.components.core.page.AdWebViewActivityProxy.4
                                @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
                                public final void a(DialogInterface dialogInterface) {
                                    com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 104);
                                    dialogInterface.dismiss();
                                }

                                @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
                                public final void b(DialogInterface dialogInterface) {
                                    if (!AdWebViewActivityProxy.this.destroyed) {
                                        try {
                                            AdWebViewActivityProxy.super.onBackPressed();
                                        } catch (Throwable th) {
                                            com.kwad.sdk.core.e.c.printStackTrace(th);
                                        }
                                    }
                                    com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 105);
                                }

                                @Override // com.kwad.components.core.page.widget.a.InterfaceC0472a
                                public final void c(DialogInterface dialogInterface) {
                                    com.kwad.sdk.core.adlog.c.p(AdWebViewActivityProxy.this.mAdTemplate, 106);
                                    dialogInterface.dismiss();
                                }
                            });
                        }
                        com.kwad.sdk.core.adlog.c.b(this.mAdTemplate, 103, (JSONObject) null);
                        this.mKsExitInterceptDialogV2.show();
                        return;
                    } catch (Throwable th) {
                        com.kwad.sdk.core.e.c.printStackTraceOnly(th);
                    }
                }
                super.onBackPressed();
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.kwad.components.core.proxy.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        try {
            this.destroyed = true;
            com.kwad.components.core.q.b bVar = this.mDialogFragment;
            if (bVar != null) {
                bVar.dismiss();
                this.mDialogFragment = null;
            }
            Dialog dialog = this.mKsExitInterceptDialog;
            if (dialog != null && dialog.isShowing()) {
                this.mKsExitInterceptDialog.dismiss();
            }
            Dialog dialog2 = this.mKsExitInterceptDialogV2;
            if (dialog2 != null && dialog2.isShowing()) {
                this.mKsExitInterceptDialogV2.dismiss();
            }
            super.onDestroy();
            AdTemplate adTemplate = this.mAdTemplate;
            if (adTemplate != null) {
                adTemplate.interactLandingPageShowing = false;
                adTemplate.mIsForceJumpLandingPage = false;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.kwad.components.core.proxy.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // com.kwad.components.core.proxy.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPreCreate(@Nullable Bundle bundle) {
        super.onPreCreate(bundle);
        try {
            getIntent().removeExtra("key_template");
        } catch (Throwable unused) {
        }
    }

    @Override // com.kwad.components.core.proxy.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
    }

    public static void launch(Context context, AdTemplate adTemplate) {
        launch(context, new a.C0468a().au(com.kwad.sdk.core.response.b.b.cD(adTemplate)).at(adTemplate).pK());
    }
}
