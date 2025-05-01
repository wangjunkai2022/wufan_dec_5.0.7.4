.class final Lcom/kwad/components/core/d/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/d/a;->initAsync(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->arC:Lcom/kwad/sdk/core/config/item/k;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->b(Lcom/kwad/sdk/core/config/item/k;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "KsAdExceptionCollectorHelper"

    const-string v1, "init"

    .line 2
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/core/d/a;->nv()Lcom/kwad/sdk/crash/c;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/crash/b;->a(Lcom/kwad/sdk/crash/c;)V

    .line 4
    invoke-static {}, Lcom/kwad/components/core/d/a;->nw()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    invoke-static {}, Lcom/kwad/components/core/d/a;->nx()V

    .line 6
    invoke-static {}, Lcom/kwad/components/core/d/a;->ny()V

    return-void
.end method
