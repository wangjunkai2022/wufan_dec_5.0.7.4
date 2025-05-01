.class public final Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;
.super Ljava/lang/Object;
.source "GameDetailGiftEntityBean.kt"

# interfaces
.implements Lu1/b;


# instance fields
.field private data:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final viewType:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    iput-object p2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;ILjava/lang/Object;ILjava/lang/Object;)Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->copy(ILjava/lang/Object;)Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    return v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(ILjava/lang/Object;)Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;

    invoke-direct {v0, p1, p2}, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;-><init>(ILjava/lang/Object;)V

    return-object v0
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
    instance-of v1, p1, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    iget v3, p1, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    iget-object p1, p1, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public getItemType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    return v0
.end method

.method public final getViewType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setData(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GameDetailGiftEntityBean(viewType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->viewType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/discount/model/bean/GameDetailGiftEntityBean;->data:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
