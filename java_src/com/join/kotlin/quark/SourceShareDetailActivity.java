package com.join.kotlin.quark;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.databinding.ActivitySourceShareDetailBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.base.dialog.DialogActivityManager;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
import com.join.kotlin.base.ext.CustomViewExtKt;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.kotlin.quark.proxy.SourceShareClickProxy;
import com.join.kotlin.quark.viewmodel.SourceShareDetailViewModel;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.q1;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SourceShareDetailActivity.kt */
/* loaded from: classes3.dex */
public final class SourceShareDetailActivity extends BaseVmDbActivity<SourceShareDetailViewModel, ActivitySourceShareDetailBinding> implements SourceShareClickProxy {
    @Nullable
    private String appCaceDir;
    @Nullable
    private ExtBean extBean;
    @Nullable
    private SourceListItemBean itemBean;
    private com.kingja.loadsir.core.b<Object> loadSir;
    @Nullable
    private String qkPosition;
    private boolean quarkInstalled;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }

    private final void initWebSet() {
        getMDatabind().f17071l.getSettings().setDomStorageEnabled(true);
        getMDatabind().f17071l.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        getMDatabind().f17071l.getSettings().setAppCacheEnabled(true);
        this.appCaceDir = getDir("cacheH5", 0).getPath();
        getMDatabind().f17071l.getSettings().setAppCachePath(this.appCaceDir);
        getMDatabind().f17071l.getSettings().setAllowFileAccess(true);
        getMDatabind().f17071l.getSettings().setCacheMode(-1);
        getMDatabind().f17071l.getSettings().setPluginState(WebSettings.PluginState.ON);
        getMDatabind().f17071l.getSettings().setLoadWithOverviewMode(true);
        getMDatabind().f17071l.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        getMDatabind().f17071l.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getMDatabind().f17071l.getSettings().setTextZoom(100);
        getMDatabind().f17071l.getSettings().setMediaPlaybackRequiresUserGesture(false);
        getMDatabind().f17071l.getSettings().setUseWideViewPort(true);
        getMDatabind().f17071l.getSettings().setSupportZoom(false);
        getMDatabind().f17071l.getSettings().setBuiltInZoomControls(false);
        getMDatabind().f17071l.getSettings().setDefaultTextEncodingName("UTF-8");
        getMDatabind().f17071l.getSettings().setJavaScriptEnabled(true);
        getMDatabind().f17071l.getSettings().setCacheMode(-1);
        try {
            if (Build.VERSION.SDK_INT > 27) {
                getMDatabind().f17071l.getSettings().setSafeBrowsingEnabled(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
    }

    @Nullable
    public final ExtBean getExtBean() {
        return this.extBean;
    }

    @Nullable
    public final SourceListItemBean getItemBean() {
        return this.itemBean;
    }

    @Nullable
    public final String getQkPosition() {
        return this.qkPosition;
    }

    public final boolean getQuarkInstalled() {
        return this.quarkInstalled;
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            if (this.extBean != null) {
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this);
                Event event = Event.visitPCPageZone;
                Ext ext = new Ext();
                ExtBean extBean = this.extBean;
                Intrinsics.checkNotNull(extBean);
                l4.O1(event, ext.setFrom(extBean.getFrom()));
            }
            this.itemBean = (SourceListItemBean) intent.getSerializableExtra("itemBean");
            ((SourceShareDetailViewModel) getMViewModel()).getItemBean().setValue(this.itemBean);
            this.qkPosition = (String) intent.getSerializableExtra("qkPosition");
        }
        getMDatabind().h((SourceShareDetailViewModel) getMViewModel());
        getMDatabind().g(this);
        getMDatabind().f17071l.setOnTouchListener(new View.OnTouchListener() { // from class: com.join.kotlin.quark.t
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initView$lambda$1;
                initView$lambda$1 = SourceShareDetailActivity.initView$lambda$1(view, motionEvent);
                return initView$lambda$1;
            }
        });
        RelativeLayout relativeLayout = getMDatabind().f17063d;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "mDatabind.rlContent");
        com.kingja.loadsir.core.b<Object> loadServiceInit = CustomViewExtKt.loadServiceInit(relativeLayout, new Function0<Unit>() { // from class: com.join.kotlin.quark.SourceShareDetailActivity$initView$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                com.kingja.loadsir.core.b bVar;
                bVar = SourceShareDetailActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showLoading(bVar);
                SourceListItemBean itemBean = SourceShareDetailActivity.this.getItemBean();
                if (itemBean != null) {
                    SourceShareDetailActivity sourceShareDetailActivity = SourceShareDetailActivity.this;
                    if (itemBean.getDisk_url() != null) {
                        sourceShareDetailActivity.getMDatabind().f17071l.loadUrl(itemBean.getDisk_url());
                    }
                }
            }
        });
        this.loadSir = loadServiceInit;
        if (loadServiceInit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadSir");
            loadServiceInit = null;
        }
        CustomViewExtKt.showLoading(loadServiceInit);
        initWebSet();
        getMDatabind().f17071l.setLayerType(2, null);
        SourceListItemBean sourceListItemBean = this.itemBean;
        if (sourceListItemBean != null && sourceListItemBean.getDisk_url() != null) {
            getMDatabind().f17071l.loadUrl(sourceListItemBean.getDisk_url());
        }
        getMDatabind().f17071l.setWebViewClient(new WebViewClient() { // from class: com.join.kotlin.quark.SourceShareDetailActivity$initView$5
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
                com.kingja.loadsir.core.b bVar;
                super.onPageFinished(webView, str);
                bVar = SourceShareDetailActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                bVar.h();
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
                com.kingja.loadsir.core.b bVar;
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                bVar = SourceShareDetailActivity.this.loadSir;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadSir");
                    bVar = null;
                }
                CustomViewExtKt.showError$default(bVar, null, 1, null);
            }
        });
        Ext ext2 = new Ext();
        SourceListItemBean sourceListItemBean2 = this.itemBean;
        ext2.setResourceId(String.valueOf(sourceListItemBean2 != null ? sourceListItemBean2.getId() : null));
        ext2.setQkPosition(this.qkPosition);
        com.papa.sim.statistic.p.l(this).O1(Event.clickSourceDetailPage, ext2);
    }

    @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
    public void onBackClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
    public void onSaveClick() {
        Integer type;
        com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(this);
        Intrinsics.checkNotNullExpressionValue(l02, "getInstance_(this)");
        boolean f5 = APKUtils.f(l02, this, q1.f27991b, null, 4, null);
        this.quarkInstalled = f5;
        if (f5) {
            SourceListItemBean value = ((SourceShareDetailViewModel) getMViewModel()).getItemBean().getValue();
            if (value != null) {
                IntentUtil.getInstance().startQuarkBrowser(this, q1.p(), value.getDisk_url(), value.getTitle(), value.getIcon());
                com.papa.sim.statistic.p.l(this).O1(Event.clickSpeedDownUpQk, new Ext().setQkPosition("qk"));
            }
        } else {
            Intent intent = new Intent(this, QuarkInstallActivity.class);
            intent.putExtras(DialogActivityManager.Companion.get().registerCallback(QuarkInstallActivity.class, new IDialogActivityCallback() { // from class: com.join.kotlin.quark.SourceShareDetailActivity$onSaveClick$2
                @Override // com.join.kotlin.base.dialog.callback.IDialogActivityCallback
                public void onActivityDismiss(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }

                @Override // com.join.kotlin.base.dialog.callback.IDialogActivityCallback
                public void onActivityShow(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                }
            })).putExtra("itemBean", this.itemBean);
            startActivity(intent);
        }
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this);
        Event event = Event.clickPcDetailHomeBtn;
        Ext from = new Ext().setFrom("3");
        SourceListItemBean sourceListItemBean = this.itemBean;
        Ext gameMode = from.setGameMode((sourceListItemBean == null || (type = sourceListItemBean.getType()) == null) ? 8 : type.intValue());
        SourceListItemBean sourceListItemBean2 = this.itemBean;
        l4.O1(event, gameMode.setResourceId(String.valueOf(sourceListItemBean2 != null ? sourceListItemBean2.getId() : null)).setQkPosition(this.qkPosition));
    }

    @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
    public void onSearchClick() {
    }

    @Override // com.join.kotlin.quark.proxy.SourceShareClickProxy
    public void onShareClick() {
    }

    public final void setExtBean(@Nullable ExtBean extBean) {
        this.extBean = extBean;
    }

    public final void setItemBean(@Nullable SourceListItemBean sourceListItemBean) {
        this.itemBean = sourceListItemBean;
    }

    public final void setQkPosition(@Nullable String str) {
        this.qkPosition = str;
    }

    public final void setQuarkInstalled(boolean z4) {
        this.quarkInstalled = z4;
    }
}
