.class public final Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;
.super Ljava/lang/Object;
.source "ZoneMultiEntry.kt"


# instance fields
.field private final componentId:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final data:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final viewType:I


# direct methods
.method public constructor <init>(ILjava/lang/Integer;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    .line 4
    iput-object p3, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;ILjava/lang/Integer;Ljava/lang/Object;ILjava/lang/Object;)Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->copy(ILjava/lang/Integer;Ljava/lang/Object;)Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    return v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(ILjava/lang/Integer;Ljava/lang/Object;)Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;
    .locals 1
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    invoke-direct {v0, p1, p2, p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;-><init>(ILjava/lang/Integer;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final dataVal()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
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
    instance-of v1, p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    iget v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    iget v3, p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    iget-object p1, p1, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getComponentId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getData()Ljava/lang/Object;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    return-object v0
.end method

.method public final getViewType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ZoneMultiEntry(viewType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->viewType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", componentId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->componentId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->data:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
