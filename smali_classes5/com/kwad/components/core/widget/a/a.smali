.class public abstract Lcom/kwad/components/core/widget/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/a;
.implements Lcom/kwad/sdk/utils/bs$a;


# instance fields
.field private final adg:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private adh:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/kwad/sdk/core/h/c;",
            ">;"
        }
    .end annotation
.end field

.field private final adi:I

.field protected final hh:Lcom/kwad/sdk/utils/bs;

.field private final mRootView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adg:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/widget/a/a;->mRootView:Landroid/view/View;

    .line 4
    iput p2, p0, Lcom/kwad/components/core/widget/a/a;->adi:I

    .line 5
    new-instance p1, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p1, p0, Lcom/kwad/components/core/widget/a/a;->hh:Lcom/kwad/sdk/utils/bs;

    return-void
.end method

.method private aZ(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/h/c;

    if-eqz v1, :cond_1

    if-eqz p1, :cond_2

    .line 3
    invoke-interface {v1}, Lcom/kwad/sdk/core/h/c;->aM()V

    goto :goto_0

    .line 4
    :cond_2
    invoke-interface {v1}, Lcom/kwad/sdk/core/h/c;->aN()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private iZ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adg:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, v1}, Lcom/kwad/components/core/widget/a/a;->aZ(Z)V

    :cond_0
    return-void
.end method

.method private tZ()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/a/a;->dX()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a/a;->iZ()V

    return-void

    .line 3
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a/a;->uc()V

    return-void
.end method

.method private uc()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adg:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, v1}, Lcom/kwad/components/core/widget/a/a;->aZ(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Message;)V
    .locals 3

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x29a

    if-ne p1, v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a/a;->tZ()V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/widget/a/a;->hh:Lcom/kwad/sdk/utils/bs;

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/h/c;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/ai;->checkUiThread()V

    if-nez p1, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance v0, Lcom/kwad/components/core/widget/a/a$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/widget/a/a$1;-><init>(Lcom/kwad/components/core/widget/a/a;Lcom/kwad/sdk/core/h/c;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 7
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/h/c;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/ai;->checkUiThread()V

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    if-eqz v0, :cond_1

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public abstract dX()Z
.end method

.method public final release()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/a/a;->ub()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adh:Ljava/util/Set;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_0
    return-void
.end method

.method public final ua()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->hh:Lcom/kwad/sdk/utils/bs;

    const/16 v1, 0x29a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public final ub()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a/a;->tZ()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final ud()Z
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a/a;->adg:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
