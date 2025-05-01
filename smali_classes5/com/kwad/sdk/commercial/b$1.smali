.class final Lcom/kwad/sdk/commercial/b$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/commercial/b;->a(Lcom/kwad/sdk/commercial/b$a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic apb:Lcom/kwad/sdk/commercial/b$a;

.field final synthetic apc:Z


# direct methods
.method constructor <init>(Lcom/kwad/sdk/commercial/b$a;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/b$1;->apb:Lcom/kwad/sdk/commercial/b$a;

    iput-boolean p2, p0, Lcom/kwad/sdk/commercial/b$1;->apc:Z

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/commercial/b$1;->apb:Lcom/kwad/sdk/commercial/b$a;

    iget-boolean v1, p0, Lcom/kwad/sdk/commercial/b$1;->apc:Z

    invoke-static {v0, v1}, Lcom/kwad/sdk/commercial/b;->c(Lcom/kwad/sdk/commercial/b$a;Z)V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/commercial/b;->Bp()V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/commercial/b;->Bq()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 4
    invoke-static {}, Lcom/kwad/sdk/commercial/b;->ny()V

    return-void
.end method
