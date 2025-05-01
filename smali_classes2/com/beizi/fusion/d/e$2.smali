.class Lcom/beizi/fusion/d/e$2;
.super Ljava/util/TimerTask;
.source "BaseManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/d/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/e$2;->a:Lcom/beizi/fusion/d/e;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "========update inner outTime==========:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/e$2;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v0}, Lcom/beizi/fusion/d/e;->b(Lcom/beizi/fusion/d/e;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;I)I

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/e$2;->a:Lcom/beizi/fusion/d/e;

    iget-object v0, v0, Lcom/beizi/fusion/d/e;->q:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/d/e$2;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v0}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/d/e$2;->a:Lcom/beizi/fusion/d/e;

    invoke-static {v0}, Lcom/beizi/fusion/d/e;->c(Lcom/beizi/fusion/d/e;)Lcom/beizi/fusion/b/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/d;->a(Z)V

    :cond_0
    return-void
.end method
