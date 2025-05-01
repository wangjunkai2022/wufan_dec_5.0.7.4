.class Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i$c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i$c;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i$c;->c:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->g:Lcom/aggmoread/sdk/z/c/a/a/c/f;

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/c/r/b;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/i$c;->b:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/b;->onAdLoaded(Ljava/util/List;)V

    return-void
.end method
