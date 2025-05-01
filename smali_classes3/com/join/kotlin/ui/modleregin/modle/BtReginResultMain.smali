.class public final Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;
.super Ljava/lang/Object;
.source "BtReginResultMain.kt"


# instance fields
.field private final ad_collection:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final dynamic_component:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final new_online_game:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;",
            "Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ad_collection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "head_banner_game"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new_online_game"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    .line 4
    iput-object p3, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;Ljava/util/List;Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->copy(Ljava/util/List;Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;Ljava/util/List;Ljava/util/List;)Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;Ljava/util/List;Ljava/util/List;)Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;",
            "Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;",
            ">;",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;",
            ">;)",
            "Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "ad_collection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "head_banner_game"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new_online_game"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;-><init>(Ljava/util/List;Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;Ljava/util/List;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    iget-object v3, p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    iget-object v3, p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    iget-object p1, p1, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAd_collection()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/BannerBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    return-object v0
.end method

.method public final getDynamic_component()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BTDynamicMain;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    return-object v0
.end method

.method public final getHead_banner_game()Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    return-object v0
.end method

.method public final getNew_online_game()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/modleregin/modle/BtOnlineGame;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

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

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BtReginResultMain(ad_collection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->ad_collection:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", head_banner_game="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->head_banner_game:Lcom/join/kotlin/ui/modleregin/modle/BtVideodata;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", new_online_game="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->new_online_game:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dynamic_component="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/ui/modleregin/modle/BtReginResultMain;->dynamic_component:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
