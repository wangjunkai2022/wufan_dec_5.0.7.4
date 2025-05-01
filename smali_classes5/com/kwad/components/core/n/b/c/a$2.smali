.class final Lcom/kwad/components/core/n/b/c/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/c/a;->pv()Lcom/kwad/components/offline/api/core/api/OfflineOnAudioConflictListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic NZ:Lcom/kwad/components/core/n/b/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/c/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/c/a$2;->NZ:Lcom/kwad/components/core/n/b/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAudioBeOccupied()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/a$2;->NZ:Lcom/kwad/components/core/n/b/c/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/core/n/b/c/a;->a(Lcom/kwad/components/core/n/b/c/a;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/a$2;->NZ:Lcom/kwad/components/core/n/b/c/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/core/n/b/c/a;->b(Lcom/kwad/components/core/n/b/c/a;Z)Z

    .line 3
    new-instance v0, Lcom/kwad/components/core/n/b/c/a$2$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/n/b/c/a$2$1;-><init>(Lcom/kwad/components/core/n/b/c/a$2;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onAudioBeReleased()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/c/a$2;->NZ:Lcom/kwad/components/core/n/b/c/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/core/n/b/c/a;->a(Lcom/kwad/components/core/n/b/c/a;Z)Z

    return-void
.end method
