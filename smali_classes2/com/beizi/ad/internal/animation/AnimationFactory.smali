.class public Lcom/beizi/ad/internal/animation/AnimationFactory;
.super Ljava/lang/Object;
.source "AnimationFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Lcom/beizi/ad/internal/animation/TransitionType;JLcom/beizi/ad/internal/animation/TransitionDirection;)Lcom/beizi/ad/internal/animation/Transition;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/animation/TransitionType;->RANDOM:Lcom/beizi/ad/internal/animation/TransitionType;

    if-ne p0, v0, :cond_0

    .line 2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-static {}, Lcom/beizi/ad/internal/animation/TransitionType;->values()[Lcom/beizi/ad/internal/animation/TransitionType;

    move-result-object v1

    invoke-static {p0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 4
    sget-object v1, Lcom/beizi/ad/internal/animation/TransitionType;->NONE:Lcom/beizi/ad/internal/animation/TransitionType;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    invoke-static {p0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/internal/animation/TransitionType;

    .line 8
    :cond_0
    sget-object v0, Lcom/beizi/ad/internal/animation/AnimationFactory$1;->$SwitchMap$com$beizi$ad$internal$animation$TransitionType:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 9
    :cond_1
    new-instance p0, Lcom/beizi/ad/internal/animation/Reveal;

    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/animation/Reveal;-><init>(JLcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-object p0

    .line 10
    :cond_2
    new-instance p0, Lcom/beizi/ad/internal/animation/MoveIn;

    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/animation/MoveIn;-><init>(JLcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-object p0

    .line 11
    :cond_3
    new-instance p0, Lcom/beizi/ad/internal/animation/Push;

    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/ad/internal/animation/Push;-><init>(JLcom/beizi/ad/internal/animation/TransitionDirection;)V

    return-object p0

    .line 12
    :cond_4
    new-instance p0, Lcom/beizi/ad/internal/animation/Fade;

    invoke-direct {p0, p1, p2}, Lcom/beizi/ad/internal/animation/Fade;-><init>(J)V

    return-object p0
.end method
