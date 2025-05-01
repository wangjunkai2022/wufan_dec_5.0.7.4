.class final Lcom/kwad/components/ad/reward/b/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/b/a;->a(Lcom/kwad/components/ad/reward/n/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic qS:Lcom/kwad/components/ad/reward/n/r;

.field final synthetic qT:J

.field final synthetic qU:Lcom/kwad/components/ad/reward/b/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/b/a;Lcom/kwad/components/ad/reward/n/r;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/b/a$1;->qU:Lcom/kwad/components/ad/reward/b/a;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/b/a$1;->qS:Lcom/kwad/components/ad/reward/n/r;

    iput-wide p3, p0, Lcom/kwad/components/ad/reward/b/a$1;->qT:J

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/b/a$1;->qU:Lcom/kwad/components/ad/reward/b/a;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/b/a;->a(Lcom/kwad/components/ad/reward/b/a;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/b/a;->a(Lcom/kwad/components/ad/reward/b/a;Landroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/b/a$1$1;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/ad/reward/b/a$1$1;-><init>(Lcom/kwad/components/ad/reward/b/a$1;Landroid/animation/Animator;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 3
    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method
