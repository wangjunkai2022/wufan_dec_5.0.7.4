.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "PapaMainV4SubHomeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->u0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->a0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Z)Z

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->c0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Z)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$f;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->a0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Z)Z

    return-void
.end method
