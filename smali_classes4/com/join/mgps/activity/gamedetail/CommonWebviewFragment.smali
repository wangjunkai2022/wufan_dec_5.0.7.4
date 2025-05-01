.class public Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;
.super Landroidx/fragment/app/Fragment;
.source "CommonWebviewFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/LJNestScrollWebView$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebJSPInterfaceMethedBean;,
        Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebViewClientXY;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c025b
.end annotation


# instance fields
.field TAG:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field dialog:Lcom/join/mgps/dialog/d1;

.field failedMessage:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private isError:Z

.field private lastClick:J

.field loding_faile:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field loding_layout:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private mDataLoadingDialog:Lcom/join/mgps/dialog/d1;

.field private mHandler:Landroid/os/Handler;

.field prefDef:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field url:Ljava/lang/String;

.field web:Lcom/join/mgps/customview/LJNestScrollWebView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field weblayout:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private xCustomView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string v0, "ShareWebActivity"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->isError:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->dialog:Lcom/join/mgps/dialog/d1;

    return-void
.end method

.method static synthetic access$000(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->isError:Z

    return p0
.end method

.method static synthetic access$102(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->isError:Z

    return p1
.end method

.method static synthetic access$200(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$300(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->setFullScreen()V

    return-void
.end method

.method private lodeWebView(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lodeWebView() called."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07156b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setBarHeight(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setClickable(Z)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setUseWideViewPort(Z)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setSupportZoom(Z)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setBuiltInZoomControls(Z)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LJNestScrollWebView;->setJavaScriptEnabled(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setCacheMode(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebViewClientXY;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebViewClientXY;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    new-instance v1, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebJSPInterfaceMethedBean;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment$WebJSPInterfaceMethedBean;-><init>(Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->r(Ljava/lang/Object;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->setActivity(Landroid/app/Activity;)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private setFullScreen()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    return-void
.end method


# virtual methods
.method afterview()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "afterView() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->context:Landroid/content/Context;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 4
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    .line 5
    :cond_0
    sget-boolean v0, Lcom/join/android/app/common/http/c;->c:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "https://"

    const-string v2, "http://"

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    const-string v2, "file://"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->lodeWebView(Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->failedMessage:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    const-string v1, "\u7f51\u9875\u52a0\u8f7d\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_4

    .line 13
    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/LJNestScrollWebView;->setMethodListenter(Lcom/join/mgps/customview/LJNestScrollWebView$b;)V

    .line 14
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/b0;->f0(Landroid/content/Context;)Lcom/join/mgps/Util/b0;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/a0;->x(Landroid/content/Context;)Lcom/join/mgps/dialog/d1;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->dialog:Lcom/join/mgps/dialog/d1;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public inCustomView()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->xCustomView:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method loding_faile()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "loding_faile() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->isError:Z

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->url:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->lodeWebView(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public noMethod()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    :cond_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    if-eqz p3, :cond_0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->xCustomView:Landroid/view/View;

    return-void
.end method

.method public onPause()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onPause"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 6
    :cond_0
    :goto_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    return-void
.end method

.method public onReceivedTitle(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    const-string v1, "javascript:papaActivityOnResume()"

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->w(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onResume"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v1}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/LJNestScrollWebView;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Landroid/webkit/WebChromeClient;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->xCustomView:Landroid/view/View;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->weblayout:Landroid/widget/RelativeLayout;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 4
    invoke-direct {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->setFullScreen()V

    return-void
.end method

.method setNetwork()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "setNetwork() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "showLoding() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_layout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "showLodingFailed() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_layout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->TAG:Ljava/lang/String;

    const-string v1, "showMain() called."

    invoke-static {v0, v1}, Lcom/join/mgps/Util/v0;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_faile:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->loding_layout:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public showMainWebview()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->web:Lcom/join/mgps/customview/LJNestScrollWebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->showMain()V

    :cond_0
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/gamedetail/CommonWebviewFragment;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
