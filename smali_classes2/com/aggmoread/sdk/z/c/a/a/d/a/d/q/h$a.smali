.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/c/p/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h;->a(Lcom/aggmoread/sdk/z/c/a/a/c/f;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;)Lcom/aggmoread/sdk/z/c/a/a/c/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/d;)V
    .locals 0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;->a()V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/c/a/a/c/p/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/h$a;->a:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/q/b$g;->onAdLoaded(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public onAdVideoCached()V
    .locals 0

    return-void
.end method
