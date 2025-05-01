.class Lcom/join/mgps/fragment/CardViewPagerFragment$e;
.super Ljava/lang/Object;
.source "CardViewPagerFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CardViewPagerFragment;->o0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/CardViewPagerFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CardViewPagerFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$e;->b:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$e;->b:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/CardViewPagerFragment;->e0(Lcom/join/mgps/fragment/CardViewPagerFragment;)Landroid/widget/ImageButton;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

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
