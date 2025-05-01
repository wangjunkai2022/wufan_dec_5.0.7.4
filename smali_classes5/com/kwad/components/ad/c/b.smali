.class public final Lcom/kwad/components/ad/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/kwad/components/ad/c/a;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 26
    :cond_0
    invoke-interface {p0}, Lcom/kwad/components/ad/c/a;->V()V

    return-void
.end method

.method private static a(Lcom/kwad/components/ad/c/a;Ljava/lang/String;)V
    .locals 0

    if-nez p0, :cond_0

    return-void

    .line 27
    :cond_0
    invoke-interface {p0}, Lcom/kwad/components/ad/c/a;->W()V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;Lcom/kwad/components/ad/c/a;)Z
    .locals 9
    .param p0    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;->getAdVideoPreCacheSize()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x400

    mul-long v1, v1, v3

    const-string v3, ""

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-lez v7, :cond_3

    .line 5
    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;->isContinueLoadingAll()Z

    move-result v3

    if-eqz v3, :cond_1

    const-wide/16 v5, -0x1

    goto :goto_0

    :cond_1
    move-wide v5, v1

    .line 6
    :goto_0
    new-instance v7, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v7}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    .line 7
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/kwad/sdk/core/videocache/c/a;->by(Landroid/content/Context;)Lcom/kwad/sdk/core/videocache/f;

    move-result-object v3

    .line 8
    invoke-virtual {v3, v0}, Lcom/kwad/sdk/core/videocache/f;->eL(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 9
    invoke-static {p3}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/components/ad/c/a;)V

    goto :goto_1

    .line 10
    :cond_2
    new-instance v8, Lcom/kwad/components/ad/c/b$1;

    invoke-direct {v8, v1, v2, p3, p2}, Lcom/kwad/components/ad/c/b$1;-><init>(JLcom/kwad/components/ad/c/a;Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;)V

    move-object v1, v3

    move-object v2, v0

    move-wide v3, v5

    move-object v5, v7

    move-object v6, v8

    .line 11
    invoke-virtual/range {v1 .. v6}, Lcom/kwad/sdk/core/videocache/f;->a(Ljava/lang/String;JLcom/kwad/sdk/core/network/a/a$a;Lcom/kwad/sdk/export/proxy/AdHttpResponseListener;)Z

    move-result v1

    move v4, v1

    .line 12
    :goto_1
    iget-object v3, v7, Lcom/kwad/sdk/core/network/a/a$a;->msg:Ljava/lang/String;

    goto :goto_3

    :cond_3
    cmp-long v7, v1, v5

    if-gez v7, :cond_6

    .line 13
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/diskcache/b/a;->bZ(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 14
    invoke-static {v1}, Lcom/kwad/sdk/utils/q;->L(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 15
    :cond_4
    new-instance v2, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v2}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    .line 16
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lcom/kwad/sdk/core/diskcache/b/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/network/a/a$a;)Z

    move-result v3

    .line 17
    iget-object v2, v2, Lcom/kwad/sdk/core/network/a/a$a;->msg:Ljava/lang/String;

    move v4, v3

    move-object v3, v2

    :goto_2
    if-eqz v1, :cond_5

    .line 18
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 19
    :cond_5
    invoke-virtual {p0, v5, v6}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setDownloadSize(J)V

    if-eqz v4, :cond_7

    .line 20
    invoke-static {p3}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/components/ad/c/a;)V

    goto :goto_3

    .line 21
    :cond_6
    invoke-static {p3}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/components/ad/c/a;)V

    :cond_7
    :goto_3
    if-eqz v4, :cond_8

    .line 22
    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;->getAdVideoPreCacheSize()I

    move-result p0

    invoke-static {v0, p0}, Lcom/kwad/components/core/video/j;->m(Ljava/lang/String;I)V

    goto :goto_4

    .line 23
    :cond_8
    invoke-static {p1, p0, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V

    .line 24
    invoke-static {p1, p0}, Lcom/kwad/components/ad/reward/monitor/b;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 25
    invoke-static {p3, v3}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/components/ad/c/a;Ljava/lang/String;)V

    :goto_4
    return v4
.end method

.method static synthetic b(Lcom/kwad/components/ad/c/a;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/components/ad/c/a;)V

    return-void
.end method
