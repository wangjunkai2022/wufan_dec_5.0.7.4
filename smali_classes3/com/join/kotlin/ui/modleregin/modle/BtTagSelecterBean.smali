.class public final Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;
.super Ljava/lang/Object;
.source "BtTagSelecterBean.kt"


# instance fields
.field private status:Z

.field private time:J

.field private timeMessage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLjava/lang/String;Z)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "timeMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    iput-object p3, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;JLjava/lang/String;ZILjava/lang/Object;)Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p3, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-boolean p4, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->copy(JLjava/lang/String;Z)Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;Z)Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string/jumbo v0, "timeMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;-><init>(JLjava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;

    iget-wide v3, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    iget-wide v5, p1, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    iget-boolean p1, p1, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getStatus()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    return v0
.end method

.method public final getTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    return-wide v0
.end method

.method public final getTimeMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    invoke-static {v0, v1}, Lcom/join/kotlin/ui/modleregin/modle/a;->a(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setStatus(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    return-void
.end method

.method public final setTimeMessage(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BtTagSelecterBean(time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", timeMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->timeMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtTagSelecterBean;->status:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
