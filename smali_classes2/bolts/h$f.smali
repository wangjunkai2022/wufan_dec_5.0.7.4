.class final Lbolts/h$f;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbolts/h;->g(Lbolts/i;Lbolts/g;Lbolts/h;Ljava/util/concurrent/Executor;Lbolts/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lbolts/c;

.field final synthetic c:Lbolts/i;

.field final synthetic d:Lbolts/g;

.field final synthetic e:Lbolts/h;


# direct methods
.method constructor <init>(Lbolts/c;Lbolts/i;Lbolts/g;Lbolts/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbolts/h$f;->b:Lbolts/c;

    iput-object p2, p0, Lbolts/h$f;->c:Lbolts/i;

    iput-object p3, p0, Lbolts/h$f;->d:Lbolts/g;

    iput-object p4, p0, Lbolts/h$f;->e:Lbolts/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lbolts/h$f;->b:Lbolts/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lbolts/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lbolts/h$f;->c:Lbolts/i;

    invoke-virtual {v0}, Lbolts/i;->b()V

    return-void

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbolts/h$f;->d:Lbolts/g;

    iget-object v1, p0, Lbolts/h$f;->e:Lbolts/h;

    invoke-interface {v0, v1}, Lbolts/g;->a(Lbolts/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbolts/h;

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lbolts/h$f;->c:Lbolts/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbolts/i;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_1
    new-instance v1, Lbolts/h$f$a;

    invoke-direct {v1, p0}, Lbolts/h$f$a;-><init>(Lbolts/h$f;)V

    invoke-virtual {v0, v1}, Lbolts/h;->m(Lbolts/g;)Lbolts/h;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    iget-object v1, p0, Lbolts/h$f;->c:Lbolts/i;

    invoke-virtual {v1, v0}, Lbolts/i;->c(Ljava/lang/Exception;)V

    goto :goto_0

    .line 7
    :catch_1
    iget-object v0, p0, Lbolts/h$f;->c:Lbolts/i;

    invoke-virtual {v0}, Lbolts/i;->b()V

    :goto_0
    return-void
.end method
