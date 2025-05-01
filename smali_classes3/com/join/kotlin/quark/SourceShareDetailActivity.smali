.class public final Lcom/join/kotlin/quark/SourceShareDetailActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbActivity;
.source "SourceShareDetailActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/SourceShareClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbActivity<",
        "Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/SourceShareClickProxy;"
    }
.end annotation


# instance fields
.field private appCaceDir:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private extBean:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private loadSir:Lcom/kingja/loadsir/core/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kingja/loadsir/core/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private qkPosition:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private quarkInstalled:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLoadSir$p(Lcom/join/kotlin/quark/SourceShareDetailActivity;)Lcom/kingja/loadsir/core/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    return-object p0
.end method

.method public static synthetic f0(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->initView$lambda$1(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final initView$lambda$1(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method private final initWebSet()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v2, Landroid/webkit/WebSettings$RenderPriority;->HIGH:Landroid/webkit/WebSettings$RenderPriority;

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setRenderPriority(Landroid/webkit/WebSettings$RenderPriority;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V

    const-string v0, "cacheH5"

    const/4 v2, 0x0

    .line 4
    invoke-virtual {p0, v0, v2}, Landroid/app/Activity;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->appCaceDir:Ljava/lang/String;

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    iget-object v3, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->appCaceDir:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v4, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    sget-object v4, Landroid/webkit/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Landroid/webkit/WebSettings$LayoutAlgorithm;

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/16 v4, 0x64

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v4, "UTF-8"

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setDefaultTextEncodingName(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 20
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-le v0, v1, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSafeBrowsingEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 0

    return-void
.end method

.method public final getExtBean()Lcom/join/mgps/dto/ExtBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-object v0
.end method

.method public final getItemBean()Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    return-object v0
.end method

.method public final getQkPosition()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->qkPosition:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuarkInstalled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->quarkInstalled:Z

    return v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    .line 4
    sget-object v1, Lcom/papa/sim/statistic/Event;->visitPCPageZone:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    iget-object v3, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/join/mgps/dto/ExtBean;->getFrom()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_0
    const-string v0, "itemBean"

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    iput-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;->getItemBean()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    const-string v0, "qkPosition"

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->qkPosition:Ljava/lang/String;

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->h(Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->g(Lcom/join/kotlin/quark/proxy/SourceShareClickProxy;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    sget-object v0, Lcom/join/kotlin/quark/t;->b:Lcom/join/kotlin/quark/t;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 11
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->d:Landroid/widget/RelativeLayout;

    const-string v0, "mDatabind.rlContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$3;-><init>(Lcom/join/kotlin/quark/SourceShareDetailActivity;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->loadServiceInit(Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->loadSir:Lcom/kingja/loadsir/core/b;

    const/4 v0, 0x0

    if-nez p1, :cond_2

    const-string p1, "loadSir"

    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_2
    invoke-static {p1}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 13
    invoke-direct {p0}, Lcom/join/kotlin/quark/SourceShareDetailActivity;->initWebSet()V

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/webkit/WebView;->setLayerType(ILandroid/graphics/Paint;)V

    .line 15
    iget-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz p1, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getDisk_url()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getDisk_url()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 18
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivitySourceShareDetailBinding;->l:Landroid/webkit/WebView;

    new-instance v1, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/SourceShareDetailActivity$initView$5;-><init>(Lcom/join/kotlin/quark/SourceShareDetailActivity;)V

    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 19
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 20
    iget-object v1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getId()Ljava/lang/Integer;

    move-result-object v0

    :cond_4
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setResourceId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 21
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->qkPosition:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 22
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->clickSourceDetailPage:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0, v1, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    return-void
.end method

.method public onSaveClick()V
    .locals 7

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    const-string v1, "getInstance_(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "com.quark.browser"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/join/android/app/common/utils/APKUtils;->f(Lcom/join/android/app/common/utils/APKUtils;Landroid/content/Context;Ljava/lang/String;Lcom/join/android/app/common/utils/APKUtils$DEVICE_TYPE;ILjava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->quarkInstalled:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/SourceShareDetailViewModel;->getItemBean()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/q1;->p()Z

    move-result v3

    .line 5
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getDisk_url()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getIcon()Ljava/lang/String;

    move-result-object v6

    move-object v2, p0

    .line 8
    invoke-virtual/range {v1 .. v6}, Lcom/join/mgps/Util/IntentUtil;->startQuarkBrowser(Landroid/content/Context;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    .line 10
    sget-object v1, Lcom/papa/sim/statistic/Event;->clickSpeedDownUpQk:Lcom/papa/sim/statistic/Event;

    .line 11
    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "qk"

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/join/kotlin/quark/QuarkInstallActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 14
    sget-object v1, Lcom/join/kotlin/base/dialog/DialogActivityManager;->Companion:Lcom/join/kotlin/base/dialog/DialogActivityManager$Companion;

    invoke-virtual {v1}, Lcom/join/kotlin/base/dialog/DialogActivityManager$Companion;->get()Lcom/join/kotlin/base/dialog/DialogActivityManager;

    move-result-object v1

    const-class v2, Lcom/join/kotlin/quark/QuarkInstallActivity;

    .line 15
    new-instance v3, Lcom/join/kotlin/quark/SourceShareDetailActivity$onSaveClick$2;

    invoke-direct {v3}, Lcom/join/kotlin/quark/SourceShareDetailActivity$onSaveClick$2;-><init>()V

    .line 16
    invoke-virtual {v1, v2, v3}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->registerCallback(Ljava/lang/Class;Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;)Landroid/content/Intent;

    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    const-string v3, "itemBean"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 19
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 20
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    .line 21
    sget-object v1, Lcom/papa/sim/statistic/Event;->clickPcDetailHomeBtn:Lcom/papa/sim/statistic/Event;

    .line 22
    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v3, "3"

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setFrom(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getType()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_2
    const/16 v3, 0x8

    :goto_1
    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setGameMode(I)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getId()Ljava/lang/Integer;

    move-result-object v3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :goto_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setResourceId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    iget-object v3, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->qkPosition:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/papa/sim/statistic/Ext;->setQkPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method public onSearchClick()V
    .locals 0

    return-void
.end method

.method public onShareClick()V
    .locals 0

    return-void
.end method

.method public final setExtBean(Lcom/join/mgps/dto/ExtBean;)V
    .locals 0
    .param p1    # Lcom/join/mgps/dto/ExtBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->extBean:Lcom/join/mgps/dto/ExtBean;

    return-void
.end method

.method public final setItemBean(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->itemBean:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    return-void
.end method

.method public final setQkPosition(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->qkPosition:Ljava/lang/String;

    return-void
.end method

.method public final setQuarkInstalled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/quark/SourceShareDetailActivity;->quarkInstalled:Z

    return-void
.end method
