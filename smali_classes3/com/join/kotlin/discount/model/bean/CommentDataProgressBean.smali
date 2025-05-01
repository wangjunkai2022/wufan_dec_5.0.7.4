.class public final Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;
.super Ljava/lang/Object;
.source "CommentDataProgressBean.kt"


# instance fields
.field private max:I

.field private progress:I

.field private starCount:I

.field private title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private type:I

.field private userPercent:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(IIILjava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    .line 3
    iput p2, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    .line 4
    iput p3, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    .line 5
    iput-object p4, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    .line 7
    iput-object p6, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    const/16 p2, 0x64

    const/16 v2, 0x64

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    const-string p4, ""

    :cond_3
    move-object v4, p4

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    move v5, p5

    :goto_3
    move-object v0, p0

    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;-><init>(IIILjava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;IIILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget p5, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    :cond_5
    move-object v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move p5, v0

    move-object p6, v1

    move p7, v2

    move-object p8, v3

    invoke-virtual/range {p2 .. p8}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->copy(IIILjava/lang/String;ILjava/lang/String;)Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IIILjava/lang/String;ILjava/lang/String;)Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;
    .locals 8
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v7, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;-><init>(IIILjava/lang/String;ILjava/lang/String;)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    iget v3, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    iget v3, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    iget v3, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    iget v3, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    iget-object p1, p1, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMax()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    return v0
.end method

.method public final getStarCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    return v0
.end method

.method public final getUserPercent()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public final setMax(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    return-void
.end method

.method public final setProgress(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    return-void
.end method

.method public final setStarCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    return-void
.end method

.method public final setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    return-void
.end method

.method public final setUserPercent(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CommentDataProgressBean(progress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->progress:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->max:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", starCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->starCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", userPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->userPercent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
