.class Lcom/beizi/ad/a/a/a$3;
.super Ljava/lang/Object;
.source "EulerAngleUtil.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/a/a/a;->a(Landroid/widget/ImageView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/a/a/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/a/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/a/a/a$3;->a:Lcom/beizi/ad/a/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/ad/a/a/a$3;->a:Lcom/beizi/ad/a/a/a;

    invoke-static {p1}, Lcom/beizi/ad/a/a/a;->b(Lcom/beizi/ad/a/a/a;)Landroid/animation/AnimatorSet;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/a/a/a$3;->a:Lcom/beizi/ad/a/a/a;

    invoke-static {p1}, Lcom/beizi/ad/a/a/a;->b(Lcom/beizi/ad/a/a/a;)Landroid/animation/AnimatorSet;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
