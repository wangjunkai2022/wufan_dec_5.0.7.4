.class Lcom/aggmoread/sdk/b/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/n/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/b/d;->e()Lcom/aggmoread/sdk/z/c/a/a/c/n/c;
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

    iput-object p1, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0, p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Lcom/aggmoread/sdk/z/c/a/a/c/d;)V

    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/n/a;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;Z)Z

    iget-object v0, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object v0

    instance-of v0, v0, Lcom/aggmoread/sdk/client/draw/AMDrawAdListener;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/aggmoread/sdk/z/c/a/a/c/n/a;

    new-instance v2, Lcom/aggmoread/sdk/b/g;

    iget-object v3, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    invoke-direct {v2, v1, v3}, Lcom/aggmoread/sdk/b/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/c/n/a;Lcom/aggmoread/sdk/b/d;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/aggmoread/sdk/b/d$h;->a:Lcom/aggmoread/sdk/b/d;

    invoke-static {p1}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/b/d;)Lcom/aggmoread/sdk/client/IAMAdLoadListener;

    move-result-object p1

    check-cast p1, Lcom/aggmoread/sdk/client/draw/AMDrawAdListener;

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoaded(Ljava/util/List;)V

    :cond_1
    return-void
.end method
