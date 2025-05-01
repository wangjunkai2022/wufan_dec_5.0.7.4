.class final Lcom/kwad/components/core/s/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/s/a;->init(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic TI:Lcom/kwad/components/core/s/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/s/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/s/a$1;->TI:Lcom/kwad/components/core/s/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioBeOccupied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/s/a$1;->TI:Lcom/kwad/components/core/s/a;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/core/s/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v1}, Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;->onAudioBeOccupied()V

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/core/s/a$1;->TI:Lcom/kwad/components/core/s/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/core/s/a;Z)Z

    return-void
.end method

.method public final onAudioBeReleased()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/s/a$1;->TI:Lcom/kwad/components/core/s/a;

    invoke-static {v0}, Lcom/kwad/components/core/s/a;->a(Lcom/kwad/components/core/s/a;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-nez v1, :cond_0

    .line 4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v1}, Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;->onAudioBeReleased()V

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method
