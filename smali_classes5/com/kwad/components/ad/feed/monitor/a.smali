.class public final Lcom/kwad/components/ad/feed/monitor/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static d(Lcom/kwad/sdk/core/response/model/AdTemplate;)Landroid/util/Pair;
    .locals 10
    .param p0    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v7, 0x2

    if-eqz v0, :cond_0

    .line 4
    new-instance p0, Landroid/util/Pair;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "empty videoUrl"

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v0

    const-string v1, ""

    const-wide/16 v3, 0x0

    const/4 v8, 0x1

    if-gez v0, :cond_4

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/diskcache/b/a;->bZ(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/utils/q;->L(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    new-instance v1, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    .line 9
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v5

    invoke-virtual {v5, v2, v1}, Lcom/kwad/sdk/core/diskcache/b/a;->a(Ljava/lang/String;Lcom/kwad/sdk/core/network/a/a$a;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v7, 0x1

    .line 10
    :cond_2
    iget-object v1, v1, Lcom/kwad/sdk/core/network/a/a$a;->msg:Ljava/lang/String;

    move v8, v7

    :goto_0
    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    .line 12
    :cond_3
    invoke-virtual {p0, v3, v4}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setDownloadSize(J)V

    goto :goto_1

    :cond_4
    if-lez v0, :cond_7

    .line 13
    new-instance v9, Lcom/kwad/sdk/core/network/a/a$a;

    invoke-direct {v9}, Lcom/kwad/sdk/core/network/a/a$a;-><init>()V

    .line 14
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/videocache/c/a;->by(Landroid/content/Context;)Lcom/kwad/sdk/core/videocache/f;

    move-result-object v1

    .line 15
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/videocache/f;->eM(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    mul-int/lit16 v3, v0, 0x400

    int-to-long v3, v3

    const/4 v6, 0x0

    move-object v5, v9

    .line 16
    invoke-virtual/range {v1 .. v6}, Lcom/kwad/sdk/core/videocache/f;->a(Ljava/lang/String;JLcom/kwad/sdk/core/network/a/a$a;Lcom/kwad/sdk/export/proxy/AdHttpResponseListener;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v7, 0x1

    :cond_5
    move v8, v7

    .line 17
    :cond_6
    iget-object v1, v9, Lcom/kwad/sdk/core/network/a/a$a;->msg:Ljava/lang/String;

    mul-int/lit16 v0, v0, 0x400

    int-to-long v2, v0

    .line 18
    invoke-virtual {p0, v2, v3}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setDownloadSize(J)V

    goto :goto_1

    .line 19
    :cond_7
    invoke-virtual {p0, v3, v4}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setDownloadSize(J)V

    .line 20
    :goto_1
    new-instance p0, Landroid/util/Pair;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
