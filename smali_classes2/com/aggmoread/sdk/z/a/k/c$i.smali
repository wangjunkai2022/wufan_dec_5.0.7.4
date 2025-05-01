.class Lcom/aggmoread/sdk/z/a/k/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/k/c;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/aggmoread/sdk/z/a/k/c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/k/c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/k/c$i;->b:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/c$i;->b:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/c;->f(Lcom/aggmoread/sdk/z/a/k/c;)Lcom/aggmoread/sdk/z/a/k/c$k;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/c$i;->b:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/c;->g(Lcom/aggmoread/sdk/z/a/k/c;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/k/c$i;->b:Lcom/aggmoread/sdk/z/a/k/c;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/k/c;->f(Lcom/aggmoread/sdk/z/a/k/c;)Lcom/aggmoread/sdk/z/a/k/c$k;

    move-result-object v0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/k/c$k;->c()V

    :cond_0
    return-void
.end method
