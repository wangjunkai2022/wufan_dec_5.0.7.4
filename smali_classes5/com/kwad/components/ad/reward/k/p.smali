.class public final Lcom/kwad/components/ad/reward/k/p;
.super Lcom/kwad/components/core/webview/jshandler/ak;
.source "SourceFile"


# instance fields
.field private qi:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/components/ad/reward/g;",
            ">;"
        }
    .end annotation
.end field

.field private xn:J

.field private xo:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/kwad/components/ad/reward/g;Ljava/lang/String;JLcom/kwad/sdk/core/webview/b;)V
    .locals 2

    .line 1
    invoke-direct {p0, p5}, Lcom/kwad/components/core/webview/jshandler/ak;-><init>(Lcom/kwad/sdk/core/webview/b;)V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/k/p;->xn:J

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/reward/k/p;->xo:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Lcom/kwad/components/ad/reward/k/p;->xn:J

    if-eqz p1, :cond_0

    .line 5
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/k/p;->qi:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method

.method private static R(Ljava/lang/String;)Z
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p0, "elementType"

    .line 2
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0x12

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/k/p;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/k/p;->xo:Ljava/lang/String;

    return-object p0
.end method

.method private b(Lcom/kwad/components/core/webview/jshandler/ak$b;)Z
    .locals 3

    .line 2
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->getActionType()I

    move-result v0

    const/16 v1, 0x8c

    if-ne v0, v1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zz()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->sT()Ljava/lang/String;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lcom/kwad/components/ad/reward/k/p;->R(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/kwad/components/ad/reward/k/p;->qi:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/k/p;->qi:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/kwad/components/ad/reward/g;

    .line 8
    new-instance v0, Lcom/kwad/components/ad/reward/k/p$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/ad/reward/k/p$1;-><init>(Lcom/kwad/components/ad/reward/k/p;Lcom/kwad/components/ad/reward/g;)V

    const-wide/16 v1, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/ak$b;)V
    .locals 1
    .param p1    # Lcom/kwad/components/core/webview/jshandler/ak$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/k/p;->b(Lcom/kwad/components/core/webview/jshandler/ak$b;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->a(Lcom/kwad/components/core/webview/jshandler/ak$b;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/adlog/c/b;)V
    .locals 5

    .line 4
    invoke-super {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->a(Lcom/kwad/sdk/core/adlog/c/b;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/k/p;->qi:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/k/p;->qi:Ljava/lang/ref/WeakReference;

    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->getPlayDuration()J

    move-result-wide v0

    .line 8
    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->ao(J)Lcom/kwad/sdk/core/adlog/c/b;

    return-void

    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/k/p;->xn:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    .line 10
    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->ao(J)Lcom/kwad/sdk/core/adlog/c/b;

    :cond_1
    return-void
.end method

.method public final b(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0
    .param p3    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/sdk/core/adlog/c/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3, p4}, Lcom/kwad/components/ad/reward/j/b;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method
