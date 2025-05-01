.class final Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->b(Ljava/lang/Object;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onReward(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->p:Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->b()Lcom/aggmoread/sdk/z/c/a/a/c/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$b;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->p:Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->b()Lcom/aggmoread/sdk/z/c/a/a/c/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/b;->onReward(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
