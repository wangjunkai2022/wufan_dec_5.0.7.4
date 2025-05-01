.class final Lcom/kwad/components/ad/feed/b/e$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/e;->a(Landroid/animation/AnimatorListenerAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ft:Landroid/animation/AnimatorListenerAdapter;

.field final synthetic fu:Lcom/kwad/components/ad/feed/b/e;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/e;Landroid/animation/AnimatorListenerAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/e$1;->fu:Lcom/kwad/components/ad/feed/b/e;

    iput-object p2, p0, Lcom/kwad/components/ad/feed/b/e$1;->ft:Landroid/animation/AnimatorListenerAdapter;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/e$1;->fu:Lcom/kwad/components/ad/feed/b/e;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/e;->a(Lcom/kwad/components/ad/feed/b/e;)Landroid/animation/Animator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/e;->a(Lcom/kwad/components/ad/feed/b/e;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/e$1;->fu:Lcom/kwad/components/ad/feed/b/e;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/e;->b(Lcom/kwad/components/ad/feed/b/e;)Landroid/animation/Animator;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/e$1;->fu:Lcom/kwad/components/ad/feed/b/e;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/e;->b(Lcom/kwad/components/ad/feed/b/e;)Landroid/animation/Animator;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/e$1;->ft:Landroid/animation/AnimatorListenerAdapter;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/e$1;->fu:Lcom/kwad/components/ad/feed/b/e;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/e;->b(Lcom/kwad/components/ad/feed/b/e;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/e$1;->ft:Landroid/animation/AnimatorListenerAdapter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    return-void
.end method
