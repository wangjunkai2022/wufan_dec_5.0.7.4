.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/c$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/ExpressResponse;)V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object p3

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

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-static {p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/baidu/mobads/sdk/api/ExpressResponse;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ad loaded"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, -0x1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/baidu/mobads/sdk/api/ExpressResponse;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Ljava/lang/Object;)I

    move-result v2

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    iget-object v4, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v4, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;I)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {v4, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {v3, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;Ljava/lang/Object;I)V

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    iget-object v5, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v6, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v4, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    invoke-direct {v3, v1, v5, v6, v4}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/c;-><init>(Lcom/baidu/mobads/sdk/api/ExpressResponse;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    move v1, v2

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {p1, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;II)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;Ljava/util/List;)V

    return-void
.end method

.method public b(ILjava/lang/String;Lcom/baidu/mobads/sdk/api/ExpressResponse;)V
    .locals 3

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object p3

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

    iget-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-direct {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-static {p3, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->b(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method

.method public c()V
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onLpClosed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onVideoDownloadFailed()V
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onVideoDownloadFailed"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onVideoDownloadSuccess()V
    .locals 2

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/p/e/b;->r()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onVideoDownloadSuccess"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
