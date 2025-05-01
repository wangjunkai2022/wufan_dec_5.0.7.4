.class Lcom/beizi/fusion/work/a$1;
.super Landroid/os/Handler;
.source "AdWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/work/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/a;Landroid/os/Looper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-nez v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/work/a;->a(Landroid/os/Message;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->aj()V

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a;->c()Z

    move-result v0

    if-nez v0, :cond_5

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    iget p1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/work/a;->c(I)V

    goto :goto_0

    :cond_2
    const-string p1, "BeiZis"

    const-string v0, "before handleAdClose"

    .line 8
    invoke-static {p1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->G()V

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->ac()V

    goto :goto_0

    .line 11
    :cond_3
    iget-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    if-nez p1, :cond_4

    return-void

    .line 12
    :cond_4
    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->s()I

    move-result p1

    if-ge p1, v2, :cond_5

    iget-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/a;->d:Lcom/beizi/fusion/d/e;

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    if-eq p1, v1, :cond_5

    .line 13
    iget-object p1, p0, Lcom/beizi/fusion/work/a$1;->a:Lcom/beizi/fusion/work/a;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->l()V

    :cond_5
    :goto_0
    return-void
.end method
