.class final Lcom/kwad/components/ad/feed/b/n$3;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/n;->bD()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gr:Lcom/kwad/components/ad/feed/b/n;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method

.method private a(ZZ)Z
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/n;->O(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    return p1

    .line 6
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bW(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    return p2

    .line 7
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bX(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    return p1

    .line 8
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CO()Z

    move-result v0

    if-eqz v0, :cond_3

    return p1

    :cond_3
    return p2
.end method

.method private a(ZZLcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;I)Z
    .locals 1

    const/4 v0, 0x1

    if-eq p4, v0, :cond_4

    const/4 v0, 0x2

    if-eq p4, v0, :cond_3

    const/4 v0, 0x3

    if-eq p4, v0, :cond_2

    .line 1
    invoke-virtual {p3}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getDataFlowAutoStartValue()I

    move-result p4

    if-eqz p4, :cond_1

    .line 2
    invoke-virtual {p3}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->isDataFlowAutoStart()Z

    move-result p3

    if-eqz p3, :cond_0

    return p1

    :cond_0
    return p2

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/feed/b/n$3;->a(ZZ)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    return p2

    :cond_4
    return p1
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/b/d;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/b/d;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/n;->L(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/ah;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v1

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/n;->M(Lcom/kwad/components/ad/feed/b/n;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/utils/ah;->isWifiConnected(Landroid/content/Context;)Z

    move-result v2

    .line 4
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v3}, Lcom/kwad/components/ad/feed/b/n;->A(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    move-result-object v3

    instance-of v3, v3, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    if-eqz v3, :cond_0

    .line 5
    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v3}, Lcom/kwad/components/ad/feed/b/n;->A(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    move-result-object v3

    check-cast v3, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;

    .line 6
    invoke-virtual {v3}, Lcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;->getVideoAutoPlayType()I

    move-result v4

    .line 7
    invoke-direct {p0, v1, v2, v3, v4}, Lcom/kwad/components/ad/feed/b/n$3;->a(ZZLcom/kwad/components/core/internal/api/KSAdVideoPlayConfigImpl;I)Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/d;->aaT:Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0, v1, v2}, Lcom/kwad/components/ad/feed/b/n$3;->a(ZZ)Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/d;->aaT:Z

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/n$3;->gr:Lcom/kwad/components/ad/feed/b/n;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/n;->N(Lcom/kwad/components/ad/feed/b/n;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method
