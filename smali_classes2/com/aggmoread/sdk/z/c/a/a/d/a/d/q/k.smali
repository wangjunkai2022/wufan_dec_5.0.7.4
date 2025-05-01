.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b<",
        "Lcom/aggmoread/sdk/z/c/a/a/c/r/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/aggmoread/sdk/z/c/a/a/c/f;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;)Lcom/aggmoread/sdk/z/c/a/a/c/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/c/f;",
            "Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/r/a;",
            ">;)",
            "Lcom/aggmoread/sdk/z/c/a/a/c/f;"
        }
    .end annotation

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k$a;

    invoke-direct {p1, p0, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/k;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;)V

    return-object p1
.end method

.method protected a(Lcom/aggmoread/sdk/z/c/a/a/c/f;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/c/f;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/r/a;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p1, Lcom/aggmoread/sdk/z/c/a/a/c/r/b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/aggmoread/sdk/z/c/a/a/c/r/b;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/r/b;->onAdLoaded(Ljava/util/List;)V

    :cond_0
    return-void
.end method
