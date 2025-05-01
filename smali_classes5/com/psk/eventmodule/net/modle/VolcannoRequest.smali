.class public final Lcom/psk/eventmodule/net/modle/VolcannoRequest;
.super Ljava/lang/Object;
.source "VolcannoRequest.kt"


# instance fields
.field private final bhv_time:J

.field private final data:Lcom/psk/eventmodule/net/modle/VolcanoData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLcom/psk/eventmodule/net/modle/VolcanoData;)V
    .locals 1
    .param p3    # Lcom/psk/eventmodule/net/modle/VolcanoData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    iput-object p3, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    return-void
.end method

.method public static synthetic copy$default(Lcom/psk/eventmodule/net/modle/VolcannoRequest;JLcom/psk/eventmodule/net/modle/VolcanoData;ILjava/lang/Object;)Lcom/psk/eventmodule/net/modle/VolcannoRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-wide p1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-object p3, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->copy(JLcom/psk/eventmodule/net/modle/VolcanoData;)Lcom/psk/eventmodule/net/modle/VolcannoRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    return-wide v0
.end method

.method public final component2()Lcom/psk/eventmodule/net/modle/VolcanoData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    return-object v0
.end method

.method public final copy(JLcom/psk/eventmodule/net/modle/VolcanoData;)Lcom/psk/eventmodule/net/modle/VolcannoRequest;
    .locals 1
    .param p3    # Lcom/psk/eventmodule/net/modle/VolcanoData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;

    invoke-direct {v0, p1, p2, p3}, Lcom/psk/eventmodule/net/modle/VolcannoRequest;-><init>(JLcom/psk/eventmodule/net/modle/VolcanoData;)V

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
    instance-of v1, p1, Lcom/psk/eventmodule/net/modle/VolcannoRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/psk/eventmodule/net/modle/VolcannoRequest;

    iget-wide v3, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    iget-wide v5, p1, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    iget-object p1, p1, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBhv_time()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    return-wide v0
.end method

.method public final getData()Lcom/psk/eventmodule/net/modle/VolcanoData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    invoke-static {v0, v1}, Lcom/join/kotlin/ui/modleregin/modle/a;->a(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    invoke-virtual {v1}, Lcom/psk/eventmodule/net/modle/VolcanoData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VolcannoRequest(bhv_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->bhv_time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/psk/eventmodule/net/modle/VolcannoRequest;->data:Lcom/psk/eventmodule/net/modle/VolcanoData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
