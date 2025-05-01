.class public final Lcom/join/kotlin/quark/model/bean/SpTagInfo;
.super Ljava/lang/Object;
.source "JumpModelEntityListItemBean.kt"


# instance fields
.field private final bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final model:Lcom/join/kotlin/quark/model/bean/Model;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/join/kotlin/quark/model/bean/BtGame;Lcom/join/kotlin/quark/model/bean/MiniGame;Lcom/join/kotlin/quark/model/bean/ModGameVm;Lcom/join/kotlin/quark/model/bean/Model;Lcom/join/kotlin/quark/model/bean/NetGameVm;Lcom/join/kotlin/quark/model/bean/SelfSupport;Lcom/join/kotlin/quark/model/bean/SingleGameVm;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/quark/model/bean/BtGame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/quark/model/bean/MiniGame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/quark/model/bean/ModGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/join/kotlin/quark/model/bean/Model;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/join/kotlin/quark/model/bean/NetGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/join/kotlin/quark/model/bean/SelfSupport;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/join/kotlin/quark/model/bean/SingleGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    .line 4
    iput-object p3, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    .line 5
    iput-object p4, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    .line 6
    iput-object p5, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    .line 7
    iput-object p6, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    .line 8
    iput-object p7, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    return-void
.end method

.method public static synthetic copy$default(Lcom/join/kotlin/quark/model/bean/SpTagInfo;Lcom/join/kotlin/quark/model/bean/BtGame;Lcom/join/kotlin/quark/model/bean/MiniGame;Lcom/join/kotlin/quark/model/bean/ModGameVm;Lcom/join/kotlin/quark/model/bean/Model;Lcom/join/kotlin/quark/model/bean/NetGameVm;Lcom/join/kotlin/quark/model/bean/SelfSupport;Lcom/join/kotlin/quark/model/bean/SingleGameVm;ILjava/lang/Object;)Lcom/join/kotlin/quark/model/bean/SpTagInfo;
    .locals 5

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    :cond_1
    move-object p9, p2

    and-int/lit8 p2, p8, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p8, 0x20

    if-eqz p2, :cond_5

    iget-object p6, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    :cond_5
    move-object v3, p6

    and-int/lit8 p2, p8, 0x40

    if-eqz p2, :cond_6

    iget-object p7, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    :cond_6
    move-object v4, p7

    move-object p2, p0

    move-object p3, p1

    move-object p4, p9

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move-object p8, v3

    move-object p9, v4

    invoke-virtual/range {p2 .. p9}, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->copy(Lcom/join/kotlin/quark/model/bean/BtGame;Lcom/join/kotlin/quark/model/bean/MiniGame;Lcom/join/kotlin/quark/model/bean/ModGameVm;Lcom/join/kotlin/quark/model/bean/Model;Lcom/join/kotlin/quark/model/bean/NetGameVm;Lcom/join/kotlin/quark/model/bean/SelfSupport;Lcom/join/kotlin/quark/model/bean/SingleGameVm;)Lcom/join/kotlin/quark/model/bean/SpTagInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/join/kotlin/quark/model/bean/BtGame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    return-object v0
.end method

.method public final component2()Lcom/join/kotlin/quark/model/bean/MiniGame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    return-object v0
.end method

.method public final component3()Lcom/join/kotlin/quark/model/bean/ModGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    return-object v0
.end method

.method public final component4()Lcom/join/kotlin/quark/model/bean/Model;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    return-object v0
.end method

.method public final component5()Lcom/join/kotlin/quark/model/bean/NetGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    return-object v0
.end method

.method public final component6()Lcom/join/kotlin/quark/model/bean/SelfSupport;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    return-object v0
.end method

.method public final component7()Lcom/join/kotlin/quark/model/bean/SingleGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    return-object v0
.end method

.method public final copy(Lcom/join/kotlin/quark/model/bean/BtGame;Lcom/join/kotlin/quark/model/bean/MiniGame;Lcom/join/kotlin/quark/model/bean/ModGameVm;Lcom/join/kotlin/quark/model/bean/Model;Lcom/join/kotlin/quark/model/bean/NetGameVm;Lcom/join/kotlin/quark/model/bean/SelfSupport;Lcom/join/kotlin/quark/model/bean/SingleGameVm;)Lcom/join/kotlin/quark/model/bean/SpTagInfo;
    .locals 9
    .param p1    # Lcom/join/kotlin/quark/model/bean/BtGame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/quark/model/bean/MiniGame;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/quark/model/bean/ModGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/join/kotlin/quark/model/bean/Model;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/join/kotlin/quark/model/bean/NetGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lcom/join/kotlin/quark/model/bean/SelfSupport;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/join/kotlin/quark/model/bean/SingleGameVm;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v8, Lcom/join/kotlin/quark/model/bean/SpTagInfo;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/join/kotlin/quark/model/bean/SpTagInfo;-><init>(Lcom/join/kotlin/quark/model/bean/BtGame;Lcom/join/kotlin/quark/model/bean/MiniGame;Lcom/join/kotlin/quark/model/bean/ModGameVm;Lcom/join/kotlin/quark/model/bean/Model;Lcom/join/kotlin/quark/model/bean/NetGameVm;Lcom/join/kotlin/quark/model/bean/SelfSupport;Lcom/join/kotlin/quark/model/bean/SingleGameVm;)V

    return-object v8
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
    instance-of v1, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    iget-object v3, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    iget-object p1, p1, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBt_game()Lcom/join/kotlin/quark/model/bean/BtGame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    return-object v0
.end method

.method public final getMini_game()Lcom/join/kotlin/quark/model/bean/MiniGame;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    return-object v0
.end method

.method public final getMod_game_vm()Lcom/join/kotlin/quark/model/bean/ModGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    return-object v0
.end method

.method public final getModel()Lcom/join/kotlin/quark/model/bean/Model;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    return-object v0
.end method

.method public final getNet_game_vm()Lcom/join/kotlin/quark/model/bean/NetGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    return-object v0
.end method

.method public final getSelf_support()Lcom/join/kotlin/quark/model/bean/SelfSupport;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    return-object v0
.end method

.method public final getSingle_game_vm()Lcom/join/kotlin/quark/model/bean/SingleGameVm;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/BtGame;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/MiniGame;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/ModGameVm;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/Model;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/NetGameVm;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/SelfSupport;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/SingleGameVm;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SpTagInfo(bt_game="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->bt_game:Lcom/join/kotlin/quark/model/bean/BtGame;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mini_game="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mini_game:Lcom/join/kotlin/quark/model/bean/MiniGame;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mod_game_vm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->mod_game_vm:Lcom/join/kotlin/quark/model/bean/ModGameVm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->model:Lcom/join/kotlin/quark/model/bean/Model;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", net_game_vm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->net_game_vm:Lcom/join/kotlin/quark/model/bean/NetGameVm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", self_support="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->self_support:Lcom/join/kotlin/quark/model/bean/SelfSupport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", single_game_vm="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/kotlin/quark/model/bean/SpTagInfo;->single_game_vm:Lcom/join/kotlin/quark/model/bean/SingleGameVm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
