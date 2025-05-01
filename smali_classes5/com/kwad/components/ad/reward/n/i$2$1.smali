.class final Lcom/kwad/components/ad/reward/n/i$2$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/n/i$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private yQ:I

.field final synthetic yR:Landroid/animation/Animator;

.field final synthetic yS:Lcom/kwad/components/ad/reward/n/i$2;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/n/i$2;Landroid/animation/Animator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yS:Lcom/kwad/components/ad/reward/n/i$2;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yR:Landroid/animation/Animator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yQ:I

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yQ:I

    const/4 v0, 0x3

    if-lt p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yR:Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 4
    iget p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yQ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/kwad/components/ad/reward/n/i$2$1;->yQ:I

    return-void
.end method
