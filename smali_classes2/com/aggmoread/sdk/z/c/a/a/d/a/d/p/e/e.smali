.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$i;


# static fields
.field private static k:Ljava/lang/String; = "AMUTAGBD"


# instance fields
.field public j:Lcom/baidu/mobads/sdk/api/BaiduNativeManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/NativeResponse;)V
    .locals 3

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const-string v1, "onAdError %d, %s"

    invoke-static {p3, v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {p3, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method protected a(Ljava/lang/Object;II)V
    .locals 0

    const-string p2, "203"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mobads/sdk/api/NativeResponse;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const-string v1, "ad loaded"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    const-string v1, "com.sdk.key.ESP"

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Ljava/lang/String;I)Z

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_3

    const/4 v2, -0x1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/baidu/mobads/sdk/api/NativeResponse;

    invoke-static {v6}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;)I

    move-result v2

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->q()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v6, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->a(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v6, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Ljava/lang/Object;I)V

    if-eqz v0, :cond_1

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/a;

    iget-object v7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->j:Lcom/baidu/mobads/sdk/api/BaiduNativeManager;

    iget-object v8, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v9, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v10, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/a;-><init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/baidu/mobads/sdk/api/BaiduNativeManager;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;

    iget-object v7, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->j:Lcom/baidu/mobads/sdk/api/BaiduNativeManager;

    iget-object v8, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v9, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v10, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/d;-><init>(Lcom/baidu/mobads/sdk/api/NativeResponse;Lcom/baidu/mobads/sdk/api/BaiduNativeManager;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->q()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0, v2, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->a(II)V

    return-void

    :cond_3
    invoke-virtual {p0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->e(Ljava/util/List;)V

    return-void
.end method

.method public b(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/NativeResponse;)V
    .locals 3

    sget-object p3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    const-string v1, "onNoAd %d, %s"

    invoke-static {p3, v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p3, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {p3, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public c()V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const-string v1, "onLpClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected c(Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public l()V
    .locals 6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->g:Lcom/aggmoread/sdk/z/c/a/a/e/q/f;

    invoke-static {v1, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/e/q/f;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v3, Lcom/baidu/mobads/sdk/api/BaiduNativeManager;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v4, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v4, v5, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Lcom/baidu/mobads/sdk/api/BaiduNativeManager;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->j:Lcom/baidu/mobads/sdk/api/BaiduNativeManager;

    invoke-virtual {v3, v0}, Lcom/baidu/mobads/sdk/api/BaiduNativeManager;->setAppSid(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->m:I

    new-instance v0, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;

    invoke-direct {v0}, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;-><init>()V

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const-string v2, "load ad"

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v0}, Lcom/baidu/mobads/sdk/api/RequestParameters$Builder;->build()Lcom/baidu/mobads/sdk/api/RequestParameters;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->j:Lcom/baidu/mobads/sdk/api/BaiduNativeManager;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a()Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$i;)Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/baidu/mobads/sdk/api/BaiduNativeManager;->loadFeedAd(Lcom/baidu/mobads/sdk/api/RequestParameters;Lcom/baidu/mobads/sdk/api/BaiduNativeManager$FeedAdListener;)V

    return-void
.end method

.method public onVideoDownloadFailed()V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const-string v1, "onVideoDownloadFailed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onVideoDownloadSuccess()V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/e;->k:Ljava/lang/String;

    const-string v1, "onVideoDownloadSuccess"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
