.class Lcom/beizi/fusion/update/b$a$1;
.super Ljava/lang/Object;
.source "HeartScheduler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/update/b$a;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

.field final synthetic c:Lcom/beizi/fusion/update/b$a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/update/b$a;ILcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/update/b$a$1;->c:Lcom/beizi/fusion/update/b$a;

    iput p2, p0, Lcom/beizi/fusion/update/b$a$1;->a:I

    iput-object p3, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/beizi/fusion/update/b$a$1;->a:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/h;->f()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/g/e;

    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-direct {v1, v2, v3}, Lcom/beizi/fusion/g/e;-><init>(Landroid/content/Context;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/g/ay;->a(Landroid/content/Context;)V

    .line 4
    new-instance v0, Lcom/beizi/fusion/widget/JSView;

    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-direct {v0, v1, v2}, Lcom/beizi/fusion/widget/JSView;-><init>(Landroid/content/Context;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    .line 5
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/JSView;->load()V

    goto :goto_0

    .line 6
    :cond_2
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/g/ay;->a(Landroid/content/Context;)V

    .line 7
    new-instance v0, Lcom/beizi/fusion/widget/LandingView;

    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-direct {v0, v1, v2}, Lcom/beizi/fusion/widget/LandingView;-><init>(Landroid/content/Context;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    .line 8
    invoke-virtual {v0}, Lcom/beizi/fusion/widget/LandingView;->load()V

    goto :goto_0

    .line 9
    :cond_3
    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/g/o;->a(Landroid/content/Context;)Lcom/beizi/fusion/g/o;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/g/o;->a(Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    goto :goto_0

    .line 10
    :cond_4
    invoke-static {}, Lcom/beizi/fusion/g/h;->b()Lcom/beizi/fusion/g/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/g/h;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/beizi/fusion/g/aw;

    invoke-static {}, Lcom/beizi/fusion/update/b;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/beizi/fusion/update/b$a$1;->b:Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    invoke-direct {v1, v2, v3}, Lcom/beizi/fusion/g/aw;-><init>(Landroid/content/Context;Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
