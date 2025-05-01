.class Lcom/beizi/ad/internal/network/c$1;
.super Ljava/util/TimerTask;
.source "SharedNetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/network/c;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/ref/WeakReference;

.field final synthetic b:Lcom/beizi/ad/internal/network/c;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/network/c;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    iput-object p2, p0, Lcom/beizi/ad/internal/network/c$1;->a:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 2
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {v1}, Lcom/beizi/ad/internal/network/c;->a(Lcom/beizi/ad/internal/network/c;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-virtual {v1, v0}, Lcom/beizi/ad/internal/network/c;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v1, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {v1}, Lcom/beizi/ad/internal/network/c;->a(Lcom/beizi/ad/internal/network/c;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/beizi/ad/internal/network/c$a;

    .line 5
    iget v3, v1, Lcom/beizi/ad/internal/network/c$a;->b:I

    const/4 v4, 0x3

    if-ge v3, v4, :cond_0

    .line 6
    new-instance v3, Lcom/beizi/ad/internal/network/c$1$1;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, v4, v1}, Lcom/beizi/ad/internal/network/c$1$1;-><init>(Lcom/beizi/ad/internal/network/c$1;ZZLcom/beizi/ad/internal/network/c$a;)V

    new-array v1, v2, [Ljava/lang/Void;

    .line 7
    invoke-virtual {v3, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {v0}, Lcom/beizi/ad/internal/network/c;->a(Lcom/beizi/ad/internal/network/c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {v0}, Lcom/beizi/ad/internal/network/c;->b(Lcom/beizi/ad/internal/network/c;)V

    goto :goto_1

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/internal/network/c$1;->b:Lcom/beizi/ad/internal/network/c;

    invoke-static {v0}, Lcom/beizi/ad/internal/network/c;->b(Lcom/beizi/ad/internal/network/c;)V

    :cond_3
    :goto_1
    return-void
.end method
