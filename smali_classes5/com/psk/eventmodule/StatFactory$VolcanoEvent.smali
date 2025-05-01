.class public final Lcom/psk/eventmodule/StatFactory$VolcanoEvent;
.super Ljava/lang/Object;
.source "StatFactory.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/psk/eventmodule/StatFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VolcanoEvent"
.end annotation


# instance fields
.field private final event:Lcom/psk/eventmodule/Event;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final goods_id:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final net_game:Z

.field private final other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final spm:Lcom/psk/eventmodule/StatFactory$SpmData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V
    .locals 1
    .param p1    # Lcom/psk/eventmodule/Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/psk/eventmodule/StatFactory$SpmData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/psk/eventmodule/StatFactory$VolcanoOther;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goods_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    .line 3
    iput-object p2, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    .line 5
    iput-object p4, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    .line 6
    iput-boolean p5, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/psk/eventmodule/StatFactory$VolcanoEvent;Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;ZILjava/lang/Object;)Lcom/psk/eventmodule/StatFactory$VolcanoEvent;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->copy(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/psk/eventmodule/Event;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/psk/eventmodule/StatFactory$SpmData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    return-object v0
.end method

.method public final component4()Lcom/psk/eventmodule/StatFactory$VolcanoOther;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    return v0
.end method

.method public final copy(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)Lcom/psk/eventmodule/StatFactory$VolcanoEvent;
    .locals 7
    .param p1    # Lcom/psk/eventmodule/Event;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/psk/eventmodule/StatFactory$SpmData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/psk/eventmodule/StatFactory$VolcanoOther;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goods_id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;-><init>(Lcom/psk/eventmodule/Event;Ljava/lang/String;Lcom/psk/eventmodule/StatFactory$SpmData;Lcom/psk/eventmodule/StatFactory$VolcanoOther;Z)V

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
    instance-of v1, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    iget-object v3, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    iget-object v3, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    iget-object v3, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    iget-object v3, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    iget-boolean p1, p1, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEvent()Lcom/psk/eventmodule/Event;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    return-object v0
.end method

.method public final getGoods_id()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNet_game()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    return v0
.end method

.method public final getOther()Lcom/psk/eventmodule/StatFactory$VolcanoOther;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    return-object v0
.end method

.method public final getSpm()Lcom/psk/eventmodule/StatFactory$SpmData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    invoke-virtual {v1}, Lcom/psk/eventmodule/StatFactory$SpmData;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/psk/eventmodule/StatFactory$VolcanoOther;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VolcanoEvent(event="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->event:Lcom/psk/eventmodule/Event;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", goods_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->goods_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", spm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->spm:Lcom/psk/eventmodule/StatFactory$SpmData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", other="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->other:Lcom/psk/eventmodule/StatFactory$VolcanoOther;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", net_game="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/psk/eventmodule/StatFactory$VolcanoEvent;->net_game:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
