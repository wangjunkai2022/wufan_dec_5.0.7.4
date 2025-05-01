.class final Lcom/kwad/components/ad/feed/b/m$11;
.super Lcom/kwad/components/core/webview/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/feed/b/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gb:Lcom/kwad/components/ad/feed/b/m;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-direct {p0}, Lcom/kwad/components/core/webview/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/a;Lcom/kwad/sdk/core/webview/b;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p2, Lcom/kwad/sdk/core/webview/b;->aEY:Z

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/f;

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->c(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->loadType:I

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/f;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ba;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/ba;-><init>()V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ba;)Lcom/kwad/components/core/webview/jshandler/ba;

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->d(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ba;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 5
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ao;

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->e(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ao$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ao;-><init>(Lcom/kwad/components/core/webview/jshandler/ao$a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 6
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/WebCardVideoPositionHandler;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$11$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$11$1;-><init>(Lcom/kwad/components/ad/feed/b/m$11;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/WebCardVideoPositionHandler;-><init>(Lcom/kwad/components/core/webview/jshandler/WebCardVideoPositionHandler$a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 7
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ab;

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$11$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$11$2;-><init>(Lcom/kwad/components/ad/feed/b/m$11;)V

    invoke-direct {v0, p2, v1}, Lcom/kwad/components/core/webview/jshandler/ab;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/webview/jshandler/ab$a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 8
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/ay;

    new-instance v0, Lcom/kwad/components/ad/feed/b/m$11$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$11$3;-><init>(Lcom/kwad/components/ad/feed/b/m$11;)V

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/ay;-><init>(Lcom/kwad/components/core/webview/jshandler/ay$a;)V

    .line 9
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 10
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ar;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/ar;-><init>()V

    invoke-static {p2, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/ar;)Lcom/kwad/components/core/webview/jshandler/ar;

    .line 11
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p2}, Lcom/kwad/components/ad/feed/b/m;->u(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ar;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 12
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p2}, Lcom/kwad/components/ad/feed/b/m;->h(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 13
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/e;

    const/4 v0, 0x1

    invoke-direct {p2, v0, v0}, Lcom/kwad/components/core/webview/jshandler/e;-><init>(II)V

    .line 14
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 15
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v0, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;-><init>()V

    invoke-static {p2, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    .line 16
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v0, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;-><init>()V

    invoke-static {p2, v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    .line 17
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p2}, Lcom/kwad/components/ad/feed/b/m;->v(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveShopListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 18
    iget-object p2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p2}, Lcom/kwad/components/ad/feed/b/m;->w(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/WebCardRegisterLiveMessageListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/ax;

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->x(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ax$c;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/jshandler/ax;-><init>(Lcom/kwad/components/core/webview/jshandler/ax$c;)V

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/a;->a(Lcom/kwad/sdk/core/webview/c/a;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 28
    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    .line 29
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->k(Lcom/kwad/components/ad/feed/b/m;)I

    move-result v0

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aj$a;)V
    .locals 5

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->z(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->C(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 23
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->j(Lcom/kwad/components/ad/feed/b/m;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-nez v4, :cond_1

    .line 24
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    iget v1, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;D)D

    .line 25
    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aj$a;->height:I

    int-to-float p1, p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->k(Lcom/kwad/components/ad/feed/b/m;)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    float-to-double v0, p1

    .line 26
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->D(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/widget/RatioFrameLayout;

    move-result-object p1

    double-to-float v2, v0

    float-to-double v2, v2

    invoke-virtual {p1, v2, v3}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 27
    invoke-static {}, Lcom/kwad/components/ad/feed/b/m;->bz()Ljava/util/HashMap;

    move-result-object p1

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/m;->E(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    iget-wide v2, v2, Lcom/kwad/sdk/core/response/model/AdTemplate;->posId:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 3

    .line 54
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->L(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    iget p1, p1, Lcom/kwad/components/core/webview/jshandler/aq$a;->status:I

    invoke-static {v0, p1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;I)I

    .line 56
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->M(Lcom/kwad/components/ad/feed/b/m;)I

    move-result p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    .line 57
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    const/4 v0, 0x3

    const/4 v1, 0x4

    const-string v2, "3"

    invoke-static {p1, v2, v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Ljava/lang/String;II)V

    return-void

    .line 58
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->s(Lcom/kwad/components/ad/feed/b/m;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 59
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->N(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 60
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->N(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/widget/b;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 61
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->C(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 62
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->O(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/o/a;->av(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 63
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->P(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/m$a;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 64
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {p1}, Lcom/kwad/components/ad/feed/b/m;->P(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/m$a;

    move-result-object p1

    const/4 v0, 0x2

    const-string v1, ""

    invoke-interface {p1, v0, v1}, Lcom/kwad/components/ad/feed/b/m$a;->c(ILjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0, p1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/core/webview/jshandler/aw;)Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 6

    .line 30
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->F(Lcom/kwad/components/ad/feed/b/m;)V

    .line 31
    iget v0, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    .line 32
    iget-boolean v1, p1, Lcom/kwad/sdk/core/webview/d/b/a;->KS:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 33
    iget-boolean v0, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yl:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 34
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->G(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    .line 35
    iget-object v3, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yo:Lcom/kwad/sdk/core/webview/d/b/c;

    if-eqz v3, :cond_2

    iget-object v3, v3, Lcom/kwad/sdk/core/webview/d/b/c;->Lh:Ljava/lang/String;

    .line 36
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 37
    iget-object v3, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yo:Lcom/kwad/sdk/core/webview/d/b/c;

    iget-object v3, v3, Lcom/kwad/sdk/core/webview/d/b/c;->Lh:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const-string v3, ""

    .line 38
    :goto_1
    new-instance v4, Lcom/kwad/components/core/e/d/a$a;

    iget-object v5, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 39
    invoke-virtual {v5}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 40
    invoke-static {v5}, Lcom/kwad/components/ad/feed/b/m;->K(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 41
    invoke-static {v5}, Lcom/kwad/components/ad/feed/b/m;->J(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/e/d/c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 42
    invoke-static {v5, p1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/sdk/core/webview/d/b/a;)Z

    move-result v5

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v4

    .line 43
    invoke-virtual {v4, v0}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget v4, p1, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    .line 44
    invoke-virtual {v0, v4}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 45
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/e/d/a$a;->ah(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v3, 0x5

    .line 46
    invoke-virtual {v0, v3}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-boolean p1, p1, Lcom/kwad/sdk/core/webview/d/b/a;->KS:Z

    .line 47
    invoke-virtual {v0, p1}, Lcom/kwad/components/core/e/d/a$a;->au(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 48
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->as(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 49
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->b(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    if-nez v0, :cond_3

    const-wide/16 v0, 0x0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->b(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->getPlayDuration()J

    move-result-wide v0

    .line 50
    :goto_2
    invoke-virtual {p1, v0, v1}, Lcom/kwad/components/core/e/d/a$a;->v(J)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 51
    invoke-virtual {p1, v2}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/ad/feed/b/m$11$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$11$5;-><init>(Lcom/kwad/components/ad/feed/b/m$11;)V

    .line 52
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 53
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method public final g(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    const-string p2, "1"

    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-static {p1, p2, v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Ljava/lang/String;II)V

    return-void
.end method

.method public final onAdShow()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/webview/c;->onAdShow()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/feed/b/m$11$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/feed/b/m$11$4;-><init>(Lcom/kwad/components/ad/feed/b/m$11;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onPageFinished()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->Q(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 3
    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->R(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->cI(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/kwad/components/ad/feed/b/m$11;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v4}, Lcom/kwad/components/ad/feed/b/m;->C(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/webview/KsAdWebView;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kwad/sdk/core/webview/KsAdWebView;->getLoadTime()J

    move-result-wide v4

    sub-long/2addr v2, v4

    .line 5
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;J)V

    return-void
.end method
