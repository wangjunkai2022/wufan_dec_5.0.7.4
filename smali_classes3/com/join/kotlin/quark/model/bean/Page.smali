.class public final Lcom/join/kotlin/quark/model/bean/Page;
.super Ljava/lang/Object;
.source "PageBean.kt"


# instance fields
.field private final limit:I

.field private page:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    .line 3
    iput p2, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    return-void
.end method

.method public synthetic constructor <init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/16 p2, 0x14

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/join/kotlin/quark/model/bean/Page;-><init>(II)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/quark/model/bean/Page;IIILjava/lang/Object;)Lcom/join/kotlin/quark/model/bean/Page;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/quark/model/bean/Page;->copy(II)Lcom/join/kotlin/quark/model/bean/Page;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    return v0
.end method

.method public final copy(II)Lcom/join/kotlin/quark/model/bean/Page;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/join/kotlin/quark/model/bean/Page;

    invoke-direct {v0, p1, p2}, Lcom/join/kotlin/quark/model/bean/Page;-><init>(II)V

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
    instance-of v1, p1, Lcom/join/kotlin/quark/model/bean/Page;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/quark/model/bean/Page;

    iget v1, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    iget v3, p1, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    iget p1, p1, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLimit()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    return v0
.end method

.method public final getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Page(page="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/quark/model/bean/Page;->page:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/join/kotlin/quark/model/bean/Page;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
