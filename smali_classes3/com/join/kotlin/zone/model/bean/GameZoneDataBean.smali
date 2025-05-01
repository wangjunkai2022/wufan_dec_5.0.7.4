.class public final Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;
.super Ljava/lang/Object;
.source "GameZoneDataBean.kt"


# instance fields
.field private final components:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/CommonGameInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/dto/CommonGameInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 4
    iput-object p3, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 5
    iput-object p4, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Ljava/util/List;ILjava/lang/Object;)Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->copy(Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Ljava/util/List;)Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public final component3()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Ljava/util/List;)Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/CommonGameInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/dto/CommonGameInfoBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;",
            ">;)",
            "Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;-><init>(Ljava/lang/String;Lcom/join/mgps/dto/CommonGameInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    iget-object v3, p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    iget-object p1, p1, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getComponents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/zone/model/bean/ZoneComponentsBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    return-object v0
.end method

.method public final getHeadAdInfo()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public final getRecGameInfo()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GameZoneDataBean(title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", headAdInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->headAdInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recGameInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->recGameInfo:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", components="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/zone/model/bean/GameZoneDataBean;->components:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
