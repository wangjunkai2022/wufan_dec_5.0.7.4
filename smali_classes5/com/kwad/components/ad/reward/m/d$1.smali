.class final Lcom/kwad/components/ad/reward/m/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/m/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic xS:Lcom/kwad/components/ad/reward/m/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/m/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioBeOccupied()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/m/d;->a(Lcom/kwad/components/ad/reward/m/d;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/m/d;->a(Lcom/kwad/components/ad/reward/m/d;)Lcom/kwad/components/core/video/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/m/d;->b(Lcom/kwad/components/ad/reward/m/d;)Lcom/kwad/components/core/video/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/video/b;->setAudioEnabled(Z)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/m/d;->c(Lcom/kwad/components/ad/reward/m/d;)Ljava/util/List;

    move-result-object v0

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m/d;->c(Lcom/kwad/components/ad/reward/m/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/utils/h$a;

    .line 6
    invoke-interface {v2}, Lcom/kwad/sdk/utils/h$a;->onAudioBeOccupied()V

    goto :goto_0

    .line 7
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public final onAudioBeReleased()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/m/d;->c(Lcom/kwad/components/ad/reward/m/d;)Ljava/util/List;

    move-result-object v0

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/m/d$1;->xS:Lcom/kwad/components/ad/reward/m/d;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m/d;->c(Lcom/kwad/components/ad/reward/m/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/utils/h$a;

    .line 3
    invoke-interface {v2}, Lcom/kwad/sdk/utils/h$a;->onAudioBeReleased()V

    goto :goto_0

    .line 4
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
