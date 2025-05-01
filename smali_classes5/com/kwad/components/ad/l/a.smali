.class public final Lcom/kwad/components/ad/l/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/l/a$b;,
        Lcom/kwad/components/ad/l/a$a;
    }
.end annotation


# instance fields
.field private HY:Z

.field private HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

.field private Ia:Z

.field private Ib:Z

.field protected Ic:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

.field private Id:Lcom/kwad/components/ad/l/a$a;

.field private Ie:Z

.field private If:Z

.field private Ig:Z

.field private Ih:Lcom/kwad/sdk/core/webview/a/c$a;

.field private Ii:Lcom/kwad/components/ad/l/a$b;

.field private cR:Lcom/kwad/sdk/core/webview/d/a/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

.field private da:Landroid/widget/FrameLayout;

.field private fS:Landroid/os/Handler;

.field private mActivity:Landroid/app/Activity;

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field private mBackIcon:Landroid/widget/ImageView;

.field private mLastDown:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/a;->HY:Z

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/ad/l/a;->fS:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/a;->Ie:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/a;->If:Z

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/ad/l/a;->Ig:Z

    return-void
.end method

.method private static B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->aR(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/l/a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/l/a;->mLastDown:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$a;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->Id:Lcom/kwad/components/ad/l/a$a;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/l/a;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->If:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/l/a;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->bx()Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/l/a;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->HY:Z

    return p1
.end method

.method private bx()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/l/a;->Ig:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/ad/l/a;->HY:Z

    if-nez v0, :cond_0

    return v1

    :cond_0
    return v2

    .line 3
    :cond_1
    iget-boolean v0, p0, Lcom/kwad/components/ad/l/a;->HY:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/kwad/components/ad/l/a;->Ie:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/kwad/components/ad/l/a;->If:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method static synthetic c(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->Ii:Lcom/kwad/components/ad/l/a$b;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/l/a;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->Ie:Z

    return p1
.end method

.method static synthetic d(Lcom/kwad/components/ad/l/a;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->mBackIcon:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/l/a;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->Ia:Z

    return p1
.end method

.method static synthetic e(Lcom/kwad/components/ad/l/a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/l/a;->mLastDown:J

    return-wide v0
.end method

.method static synthetic f(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object p0
.end method

.method private fk()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    sget v1, Lcom/kwad/sdk/R$layout;->ksad_ad_landingpage_layout:I

    const/4 v2, 0x1

    .line 4
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/c/a/a;->a(Landroid/view/ViewGroup;IZ)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 5
    sget v1, Lcom/kwad/sdk/R$id;->ksad_web_card_frame:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/l/a;->Ic:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_web_card_webView:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/KsAdWebView;

    iput-object v0, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    const/4 v1, -0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bu(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/webview/a/c$a;->bw(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 11
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bv(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/webview/a/c$a;->bt(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 13
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->ek(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 14
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->mH()Lcom/kwad/sdk/core/webview/KsAdWebView$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->a(Lcom/kwad/sdk/core/webview/KsAdWebView$b;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    .line 15
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->ik()Lcom/kwad/sdk/core/webview/KsAdWebView$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->b(Lcom/kwad/sdk/core/webview/KsAdWebView$e;)Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/l/a;->Ih:Lcom/kwad/sdk/core/webview/a/c$a;

    .line 16
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->setClientConfig(Lcom/kwad/sdk/core/webview/a/c$a;)V

    .line 17
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    new-instance v1, Lcom/kwad/components/ad/l/a$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/l/a$1;-><init>(Lcom/kwad/components/ad/l/a;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->Ic:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_end_close_btn:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/l/a;->mBackIcon:Landroid/widget/ImageView;

    const/16 v1, 0x8

    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 20
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->mBackIcon:Landroid/widget/ImageView;

    new-instance v1, Lcom/kwad/components/ad/l/a$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/l/a$2;-><init>(Lcom/kwad/components/ad/l/a;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/view/AdBaseFrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/l/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/l/a;->Ia:Z

    return p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/l/a;)Lcom/kwad/sdk/core/webview/d/a/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-object p0
.end method

.method private ik()Lcom/kwad/sdk/core/webview/KsAdWebView$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/l/a$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/a$3;-><init>(Lcom/kwad/components/ad/l/a;)V

    return-object v0
.end method

.method static synthetic j(Lcom/kwad/components/ad/l/a;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/l/a;->mActivity:Landroid/app/Activity;

    return-object p0
.end method

.method private mH()Lcom/kwad/sdk/core/webview/KsAdWebView$b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/l/a$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/l/a$4;-><init>(Lcom/kwad/components/ad/l/a;)V

    return-object v0
.end method

.method private mI()Z
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->bx()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_2

    const/16 v2, 0x8

    .line 5
    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_2
    return v1
.end method


# virtual methods
.method public final a(Landroid/widget/FrameLayout;Lcom/kwad/sdk/core/view/AdBaseFrameLayout;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    .line 6
    iput-object p2, p0, Lcom/kwad/components/ad/l/a;->dB:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    .line 7
    iput-object p3, p0, Lcom/kwad/components/ad/l/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->fk()V

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->HY:Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/l/a$a;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/components/ad/l/a;->Id:Lcom/kwad/components/ad/l/a$a;

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/l/a$b;)V
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/kwad/components/ad/l/a;->Ii:Lcom/kwad/components/ad/l/a$b;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/a/a;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/kwad/components/ad/l/a;->cR:Lcom/kwad/sdk/core/webview/d/a/a;

    return-void
.end method

.method public final af(Z)Lcom/kwad/components/ad/l/a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/l/a;->Ib:Z

    return-object p0
.end method

.method public final ar()Z
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/l/a;->mI()Z

    move-result v0

    const/4 v1, 0x1

    .line 2
    iput-boolean v1, p0, Lcom/kwad/components/ad/l/a;->Ig:Z

    if-eqz v0, :cond_3

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/l/a;->mActivity:Landroid/app/Activity;

    if-eqz v2, :cond_3

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 5
    iget-object v2, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bu(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    .line 6
    iget-object v2, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v2}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getClientConfig()Lcom/kwad/sdk/core/webview/a/c$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/kwad/sdk/core/webview/a/c$a;->bv(Z)Lcom/kwad/sdk/core/webview/a/c$a;

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->Ic:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    new-instance v2, Lcom/kwad/components/ad/l/a$5;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/l/a$5;-><init>(Lcom/kwad/components/ad/l/a;)V

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->a(Landroid/view/View$OnTouchListener;)V

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->al(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    .line 9
    iget-boolean v3, p0, Lcom/kwad/components/ad/l/a;->Ib:Z

    if-nez v3, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v3, p0, Lcom/kwad/components/ad/l/a;->fS:Landroid/os/Handler;

    new-instance v4, Lcom/kwad/components/ad/l/a$6;

    invoke-direct {v4, p0}, Lcom/kwad/components/ad/l/a$6;-><init>(Lcom/kwad/components/ad/l/a;)V

    invoke-virtual {v3, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    .line 11
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->mBackIcon:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    :goto_1
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v1}, Lcom/kwad/sdk/core/webview/KsAdWebView;->onActivityCreate()V

    :cond_3
    return v0
.end method

.method public final ay()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->da:Landroid/widget/FrameLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->B(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/l/a;->HZ:Lcom/kwad/sdk/core/webview/KsAdWebView;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/webview/KsAdWebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final setActivity(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/l/a;->mActivity:Landroid/app/Activity;

    return-void
.end method
