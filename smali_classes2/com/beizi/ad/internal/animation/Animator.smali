.class public Lcom/beizi/ad/internal/animation/Animator;
.super Landroid/widget/ViewAnimator;
.source "Animator.java"


# instance fields
.field private animation:Lcom/beizi/ad/internal/animation/Transition;

.field private direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

.field private duration:J

.field private type:Lcom/beizi/ad/internal/animation/TransitionType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/beizi/ad/internal/animation/TransitionType;Lcom/beizi/ad/internal/animation/TransitionDirection;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ViewAnimator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    .line 3
    iput-object p2, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 4
    iput-object p3, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    .line 5
    iput-wide p4, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    .line 6
    invoke-static {p2, p4, p5, p3}, Lcom/beizi/ad/internal/animation/AnimationFactory;->create(Lcom/beizi/ad/internal/animation/TransitionType;JLcom/beizi/ad/internal/animation/TransitionDirection;)Lcom/beizi/ad/internal/animation/Transition;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    .line 7
    invoke-virtual {p0}, Lcom/beizi/ad/internal/animation/Animator;->setAnimation()V

    return-void
.end method


# virtual methods
.method public clearAnimation()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setOutAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public getTransitionDirection()Lcom/beizi/ad/internal/animation/TransitionDirection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    return-object v0
.end method

.method public getTransitionDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    return-wide v0
.end method

.method public getTransitionType()Lcom/beizi/ad/internal/animation/TransitionType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    return-object v0
.end method

.method public setAnimation()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/internal/animation/Transition;->getInAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setInAnimation(Landroid/view/animation/Animation;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    invoke-interface {v0}, Lcom/beizi/ad/internal/animation/Transition;->getOutAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/widget/ViewAnimator;->setOutAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method public setTransitionDirection(Lcom/beizi/ad/internal/animation/TransitionDirection;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    iget-wide v1, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    invoke-static {v0, v1, v2, p1}, Lcom/beizi/ad/internal/animation/AnimationFactory;->create(Lcom/beizi/ad/internal/animation/TransitionType;JLcom/beizi/ad/internal/animation/TransitionDirection;)Lcom/beizi/ad/internal/animation/Transition;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    .line 4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/animation/Animator;->setAnimation()V

    :cond_0
    return-void
.end method

.method public setTransitionDuration(J)V
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    cmp-long v2, v0, p1

    if-eqz v2, :cond_0

    .line 2
    iput-wide p1, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    iget-object v1, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    invoke-static {v0, p1, p2, v1}, Lcom/beizi/ad/internal/animation/AnimationFactory;->create(Lcom/beizi/ad/internal/animation/TransitionType;JLcom/beizi/ad/internal/animation/TransitionDirection;)Lcom/beizi/ad/internal/animation/Transition;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    .line 4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/animation/Animator;->setAnimation()V

    :cond_0
    return-void
.end method

.method public setTransitionType(Lcom/beizi/ad/internal/animation/TransitionType;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->type:Lcom/beizi/ad/internal/animation/TransitionType;

    .line 3
    iget-wide v0, p0, Lcom/beizi/ad/internal/animation/Animator;->duration:J

    iget-object v2, p0, Lcom/beizi/ad/internal/animation/Animator;->direction:Lcom/beizi/ad/internal/animation/TransitionDirection;

    invoke-static {p1, v0, v1, v2}, Lcom/beizi/ad/internal/animation/AnimationFactory;->create(Lcom/beizi/ad/internal/animation/TransitionType;JLcom/beizi/ad/internal/animation/TransitionDirection;)Lcom/beizi/ad/internal/animation/Transition;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/animation/Animator;->animation:Lcom/beizi/ad/internal/animation/Transition;

    .line 4
    invoke-virtual {p0}, Lcom/beizi/ad/internal/animation/Animator;->setAnimation()V

    :cond_0
    return-void
.end method
