.class public final Lcom/kwad/components/core/page/c/a/b;
.super Lcom/kwad/sdk/mvp/a;
.source "SourceFile"


# instance fields
.field public OV:Lcom/kwad/components/core/page/AdWebViewActivityProxy$a;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public Pl:Lcom/kwad/components/core/page/a/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public Pn:Lcom/kwad/components/core/page/c/a/f$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public Po:Lcom/kwad/components/core/webview/jshandler/at$b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public Pp:Z

.field public Pq:Z

.field public gS:Landroid/view/ViewGroup;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mAdWebView:Lcom/kwad/sdk/core/webview/KsAdWebView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mAutoShow:Z

.field public mContext:Landroid/content/Context;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mPageTitle:Ljava/lang/String;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public mPageUrl:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mShowPermission:Z

.field public mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/b;->Pp:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/page/c/a/b;->Pq:Z

    return-void
.end method

.method private aG(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/page/c/a/b;->Pq:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/page/c/a/f$a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/b;->Pn:Lcom/kwad/components/core/page/c/a/f$a;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/at$b;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/b;->Po:Lcom/kwad/components/core/webview/jshandler/at$b;

    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lcom/kwad/components/core/page/c/a/b;->aG(Z)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/KsAdWebView$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/b;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    return-void
.end method

.method public final pH()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/c/a/b;->mShowPermission:Z

    return v0
.end method

.method public final pM()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/page/c/a/b;->Po:Lcom/kwad/components/core/webview/jshandler/at$b;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/core/webview/jshandler/at$b;->qf()V

    :cond_0
    return-void
.end method

.method public final pS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/page/c/a/b;->Pq:Z

    return v0
.end method

.method public final pT()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/page/c/a/b;->pH()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final release()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/b;->Pm:Lcom/kwad/sdk/core/webview/KsAdWebView$c;

    .line 2
    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/b;->Pn:Lcom/kwad/components/core/page/c/a/f$a;

    .line 3
    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/b;->mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;

    .line 4
    iput-object v0, p0, Lcom/kwad/components/core/page/c/a/b;->Po:Lcom/kwad/components/core/webview/jshandler/at$b;

    return-void
.end method

.method public final setWebCardCloseListener(Lcom/kwad/sdk/core/webview/d/a/b;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/a/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/page/c/a/b;->mWebCardCloseListener:Lcom/kwad/sdk/core/webview/d/a/b;

    return-void
.end method
