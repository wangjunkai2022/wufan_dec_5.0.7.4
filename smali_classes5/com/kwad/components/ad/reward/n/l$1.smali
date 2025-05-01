.class final Lcom/kwad/components/ad/reward/n/l$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/n/l;->kb()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic zs:Lcom/kwad/components/ad/reward/n/l;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/n/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/l$1;->zs:Lcom/kwad/components/ad/reward/n/l;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/l$1;->zs:Lcom/kwad/components/ad/reward/n/l;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/l;->a(Lcom/kwad/components/ad/reward/n/l;)Landroid/widget/TextView;

    move-result-object v1

    const-wide/16 v2, 0x64

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v0, v1, v2, v3, v4}, Lcom/kwad/components/ad/reward/n/l;->a(Lcom/kwad/components/ad/reward/n/l;Landroid/view/View;JF)Landroid/animation/Animator;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/n/l;->a(Lcom/kwad/components/ad/reward/n/l;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/l$1;->zs:Lcom/kwad/components/ad/reward/n/l;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/l;->b(Lcom/kwad/components/ad/reward/n/l;)Landroid/animation/Animator;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/reward/n/l$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/n/l$1$1;-><init>(Lcom/kwad/components/ad/reward/n/l$1;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/l$1;->zs:Lcom/kwad/components/ad/reward/n/l;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/n/l;->b(Lcom/kwad/components/ad/reward/n/l;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    return-void
.end method
