.class public final Lcom/kwad/components/core/g/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/g/a$a;
    }
.end annotation


# instance fields
.field private Mc:J

.field private Md:Z

.field private Me:J

.field private Mf:Lcom/kwad/components/core/g/a$a;

.field private volatile fS:Landroid/os/Handler;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x3e8

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/core/g/a;->Mc:J

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/g/a;->Md:Z

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/core/g/a;->Me:J

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/g/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/g/a;->Mf:Lcom/kwad/components/core/g/a$a;

    return-void
.end method

.method public final destroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/g/a;->stop()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    return-void
.end method

.method public final pause()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/g/a;->Md:Z

    return-void
.end method

.method public final resume()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/g/a;->Md:Z

    return-void
.end method

.method public final declared-synchronized run()V
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/core/g/a;->Md:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/g/a;->Mf:Lcom/kwad/components/core/g/a$a;

    if-eqz v0, :cond_0

    .line 3
    iget-wide v1, p0, Lcom/kwad/components/core/g/a;->Me:J

    invoke-interface {v0, v1, v2}, Lcom/kwad/components/core/g/a$a;->y(J)V

    .line 4
    iget-wide v0, p0, Lcom/kwad/components/core/g/a;->Me:J

    iget-wide v2, p0, Lcom/kwad/components/core/g/a;->Mc:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/kwad/components/core/g/a;->Me:J

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    iget-wide v1, p0, Lcom/kwad/components/core/g/a;->Mc:J

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final start()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/core/g/a;->Md:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/g/a;->fS:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
