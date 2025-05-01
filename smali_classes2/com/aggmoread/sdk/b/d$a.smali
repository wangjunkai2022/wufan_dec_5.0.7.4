.class Lcom/aggmoread/sdk/b/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/m/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/d;->d()Lcom/aggmoread/sdk/z/c/a/a/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/b/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/m/a;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Z)Z

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/client/banner/AMBannerAdListener;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/aggmoread/sdk/z/c/a/a/c/m/a;

    new-instance v3, Lcom/aggmoread/sdk/b/f;

    iget-object v4, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {v3, v2, v4}, Lcom/aggmoread/sdk/b/f;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/m/a;Lcom/aggmoread/sdk/b/d;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/client/banner/AMBannerAdListener;

    invoke-interface {v1, v0}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoaded(Ljava/util/List;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$a;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/d;->b(Lcom/aggmoread/sdk/b/d;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/c/m/a;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/m/a;->b()V

    :cond_1
    return-void
.end method
