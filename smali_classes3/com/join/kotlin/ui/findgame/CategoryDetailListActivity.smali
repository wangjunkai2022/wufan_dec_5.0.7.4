.class public final Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;
.super Lcom/BaseAppCompatActivity;
.source "CategoryDetailListActivity.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCategoryDetailListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n766#2:455\n857#2,2:456\n766#2:458\n857#2,2:459\n1855#2:461\n766#2:462\n857#2,2:463\n1856#2:465\n1549#2:467\n1620#2,3:468\n766#2:471\n857#2,2:472\n1360#2:474\n1446#2,5:475\n1855#2,2:480\n766#2:482\n857#2,2:483\n1360#2:485\n1446#2,5:486\n1855#2,2:491\n766#2:493\n857#2,2:494\n1360#2:496\n1446#2,5:497\n1855#2,2:502\n1549#2:504\n1620#2,2:505\n766#2:507\n857#2,2:508\n1622#2:510\n1360#2:511\n1446#2,2:512\n1549#2:514\n1620#2,3:515\n1448#2,3:518\n1855#2,2:521\n1855#2,2:523\n1#3:466\n*S KotlinDebug\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n*L\n76#1:455\n76#1:456,2\n80#1:458\n80#1:459,2\n83#1:461\n84#1:462\n84#1:463,2\n83#1:465\n181#1:467\n181#1:468,3\n248#1:471\n248#1:472,2\n248#1:474\n248#1:475,5\n249#1:480,2\n263#1:482\n263#1:483,2\n263#1:485\n263#1:486,5\n264#1:491,2\n278#1:493\n278#1:494,2\n278#1:496\n278#1:497,5\n279#1:502,2\n352#1:504\n352#1:505,2\n353#1:507\n353#1:508,2\n352#1:510\n354#1:511\n354#1:512,2\n355#1:514\n355#1:515,3\n354#1:518,3\n360#1:521,2\n443#1:523,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCategoryDetailListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,454:1\n766#2:455\n857#2,2:456\n766#2:458\n857#2,2:459\n1855#2:461\n766#2:462\n857#2,2:463\n1856#2:465\n1549#2:467\n1620#2,3:468\n766#2:471\n857#2,2:472\n1360#2:474\n1446#2,5:475\n1855#2,2:480\n766#2:482\n857#2,2:483\n1360#2:485\n1446#2,5:486\n1855#2,2:491\n766#2:493\n857#2,2:494\n1360#2:496\n1446#2,5:497\n1855#2,2:502\n1549#2:504\n1620#2,2:505\n766#2:507\n857#2,2:508\n1622#2:510\n1360#2:511\n1446#2,2:512\n1549#2:514\n1620#2,3:515\n1448#2,3:518\n1855#2,2:521\n1855#2,2:523\n1#3:466\n*S KotlinDebug\n*F\n+ 1 CategoryDetailListActivity.kt\ncom/join/kotlin/ui/findgame/CategoryDetailListActivity\n*L\n76#1:455\n76#1:456,2\n80#1:458\n80#1:459,2\n83#1:461\n84#1:462\n84#1:463,2\n83#1:465\n181#1:467\n181#1:468,3\n248#1:471\n248#1:472,2\n248#1:474\n248#1:475,5\n249#1:480,2\n263#1:482\n263#1:483,2\n263#1:485\n263#1:486,5\n264#1:491,2\n278#1:493\n278#1:494,2\n278#1:496\n278#1:497,5\n279#1:502,2\n352#1:504\n352#1:505,2\n353#1:507\n353#1:508,2\n352#1:510\n354#1:511\n354#1:512,2\n355#1:514\n355#1:515,3\n354#1:518,3\n360#1:521,2\n443#1:523,2\n*E\n"
    }
.end annotation


# instance fields
.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

.field public context:Landroid/content/Context;

.field private datas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

.field private fragments:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private gameSortType:Lcom/join/kotlin/ui/findgame/data/TagData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public gameTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/findgame/data/GameTypeData;",
            ">;"
        }
    .end annotation
.end field

.field public leftTypeAdapter:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

.field private modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private page:I

.field private playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->page:I

    .line 4
    new-instance v1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 5
    new-instance v1, Lcom/join/kotlin/ui/findgame/data/TagData;

    const-string/jumbo v2, "\u7efc\u5408"

    invoke-direct {v1, v0, v0, v2}, Lcom/join/kotlin/ui/findgame/data/TagData;-><init>(IILjava/lang/String;)V

    iput-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameSortType:Lcom/join/kotlin/ui/findgame/data/TagData;

    .line 6
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 7
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 8
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 9
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 10
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-direct {v0}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$onfindTypeSelected(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;Ljava/util/List;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->onfindTypeSelected(Ljava/util/List;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    return-void
.end method

.method public static final synthetic access$showFilterLayout(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->showFilterLayout()V

    return-void
.end method

.method public static final synthetic access$showTypeList(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->showTypeList(I)V

    return-void
.end method

.method private final initView()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setSelected(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->p:Landroid/widget/LinearLayout;

    const-string v2, "binding.typeMainLayout"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$1;->INSTANCE:Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$1;

    invoke-static {v0, v2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v2, "typeId"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string/jumbo v2, "tagId"

    const/4 v4, 0x3

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_18

    .line 6
    :pswitch_0
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v6, 0x6

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 8
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setFeatureType(I)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v7

    if-ne v7, v6, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_0

    goto :goto_1

    :cond_2
    move-object v2, v5

    :goto_1
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getFeatureType()I

    move-result v7

    if-ne v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_3

    goto :goto_3

    :cond_5
    move-object v2, v5

    :goto_3
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_25

    .line 10
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 11
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto/16 :goto_18

    .line 12
    :pswitch_1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v6, 0x5

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 13
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 14
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setPlayType(I)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v7

    if-ne v7, v6, :cond_7

    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_6

    goto :goto_5

    :cond_8
    move-object v2, v5

    :goto_5
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getPlayType()I

    move-result v7

    if-ne v6, v7, :cond_a

    const/4 v6, 0x1

    goto :goto_6

    :cond_a
    const/4 v6, 0x0

    :goto_6
    if-eqz v6, :cond_9

    goto :goto_7

    :cond_b
    move-object v2, v5

    :goto_7
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_25

    .line 16
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 17
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto/16 :goto_18

    .line 18
    :pswitch_2
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v6, 0x4

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 19
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 20
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    invoke-virtual {v7, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setThemeType(I)V

    .line 21
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v7

    if-ne v7, v6, :cond_d

    const/4 v7, 0x1

    goto :goto_8

    :cond_d
    const/4 v7, 0x0

    :goto_8
    if-eqz v7, :cond_c

    goto :goto_9

    :cond_e
    move-object v2, v5

    :goto_9
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getThemeType()I

    move-result v7

    if-ne v6, v7, :cond_10

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    const/4 v6, 0x0

    :goto_a
    if-eqz v6, :cond_f

    goto :goto_b

    :cond_11
    move-object v2, v5

    :goto_b
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_25

    .line 22
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 23
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto/16 :goto_18

    .line 24
    :pswitch_3
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 25
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 26
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setGameType(I)V

    .line 27
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, v4, :cond_13

    const/4 v6, 0x1

    goto :goto_c

    :cond_13
    const/4 v6, 0x0

    :goto_c
    if-eqz v6, :cond_12

    goto :goto_d

    :cond_14
    move-object v2, v5

    :goto_d
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getGameType()I

    move-result v7

    if-ne v6, v7, :cond_16

    const/4 v6, 0x1

    goto :goto_e

    :cond_16
    const/4 v6, 0x0

    :goto_e
    if-eqz v6, :cond_15

    goto :goto_f

    :cond_17
    move-object v2, v5

    :goto_f
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_25

    .line 28
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 29
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto/16 :goto_18

    .line 30
    :pswitch_4
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 31
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 32
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setModelType(I)V

    .line 33
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, v1, :cond_19

    const/4 v6, 0x1

    goto :goto_10

    :cond_19
    const/4 v6, 0x0

    :goto_10
    if-eqz v6, :cond_18

    goto :goto_11

    :cond_1a
    move-object v2, v5

    :goto_11
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_1e

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getModelType()I

    move-result v7

    if-ne v6, v7, :cond_1c

    const/4 v6, 0x1

    goto :goto_12

    :cond_1c
    const/4 v6, 0x0

    :goto_12
    if-eqz v6, :cond_1b

    goto :goto_13

    :cond_1d
    move-object v2, v5

    :goto_13
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_1e

    .line 34
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 35
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 36
    :cond_1e
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v2, "tagId2"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-lez v0, :cond_25

    .line 37
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v2, v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setId(I)V

    .line 38
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v2, v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setType(I)V

    .line 39
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v2, v0}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setGameType(I)V

    .line 40
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, v4, :cond_20

    const/4 v6, 0x1

    goto :goto_14

    :cond_20
    const/4 v6, 0x0

    :goto_14
    if-eqz v6, :cond_1f

    goto :goto_15

    :cond_21
    move-object v2, v5

    :goto_15
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->getGameType()I

    move-result v7

    if-ne v6, v7, :cond_23

    const/4 v6, 0x1

    goto :goto_16

    :cond_23
    const/4 v6, 0x0

    :goto_16
    if-eqz v6, :cond_22

    goto :goto_17

    :cond_24
    move-object v2, v5

    :goto_17
    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    if-eqz v2, :cond_25

    .line 41
    invoke-virtual {v2, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 42
    iput-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 43
    :cond_25
    :goto_18
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagList()V

    .line 44
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getId()I

    move-result v6

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getId()I

    move-result v7

    if-ne v6, v7, :cond_27

    const/4 v6, 0x1

    goto :goto_19

    :cond_27
    const/4 v6, 0x0

    :goto_19
    if-eqz v6, :cond_26

    move-object v5, v2

    :cond_28
    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    if-nez v5, :cond_29

    goto :goto_1a

    :cond_29
    invoke-virtual {v5, v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->setSelected(Z)V

    .line 45
    :goto_1a
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->o:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->c:Landroid/widget/ImageView;

    const-string v2, "binding.titleLayout.backImage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$21;

    invoke-direct {v2, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$21;-><init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V

    invoke-static {v0, v2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 46
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->o:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string/jumbo v5, "tagName"

    invoke-virtual {v2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setUid(I)V

    .line 48
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->e:Landroid/widget/TextView;

    const-string v2, "binding.filter"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$22;

    invoke-direct {v2, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$22;-><init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V

    invoke-static {v0, v2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 49
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->m:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 50
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-array v0, v4, [Lcom/join/kotlin/ui/findgame/data/TagData;

    .line 51
    new-instance v2, Lcom/join/kotlin/ui/findgame/data/TagData;

    const-string/jumbo v5, "\u7efc\u5408"

    invoke-direct {v2, v1, v5}, Lcom/join/kotlin/ui/findgame/data/TagData;-><init>(ILjava/lang/String;)V

    aput-object v2, v0, v3

    new-instance v2, Lcom/join/kotlin/ui/findgame/data/TagData;

    const/4 v5, 0x2

    const-string/jumbo v6, "\u6700\u65b0"

    invoke-direct {v2, v5, v6}, Lcom/join/kotlin/ui/findgame/data/TagData;-><init>(ILjava/lang/String;)V

    aput-object v2, v0, v1

    new-instance v2, Lcom/join/kotlin/ui/findgame/data/TagData;

    const-string/jumbo v6, "\u8bc4\u5206"

    invoke-direct {v2, v4, v6}, Lcom/join/kotlin/ui/findgame/data/TagData;-><init>(ILjava/lang/String;)V

    aput-object v2, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 54
    check-cast v6, Lcom/join/kotlin/ui/findgame/data/TagData;

    .line 55
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/TagData;->getTitle()Ljava/lang/String;

    move-result-object v6

    .line 56
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    .line 57
    :cond_2a
    new-instance v0, Lcom/join/kotlin/ui/findgame/data/CategroyIntentItemData;

    iget-object v8, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v9, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v10, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v11, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v12, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/join/kotlin/ui/findgame/data/CategroyIntentItemData;-><init>(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    const-string v7, "from"

    invoke-virtual {v6, v7, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 59
    iget-object v6, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    sget-object v7, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->Companion:Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$Companion;

    invoke-virtual {v7, v1, v0, v3}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$Companion;->newInstance(ILcom/join/kotlin/ui/findgame/data/CategroyIntentItemData;I)Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v7, v5, v0, v3}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$Companion;->newInstance(ILcom/join/kotlin/ui/findgame/data/CategroyIntentItemData;I)Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    invoke-virtual {v7, v4, v0, v3}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment$Companion;->newInstance(ILcom/join/kotlin/ui/findgame/data/CategroyIntentItemData;I)Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->r:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v3

    iget-object v5, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    invoke-direct {v1, v3, v5, v2}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 63
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v4}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 64
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->c:Lcom/join/mgps/customview/SlidingTabLayout6;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->r:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/SlidingTabLayout1;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 65
    new-instance v0, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    .line 66
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 67
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getId()I

    move-result v1

    .line 68
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    .line 69
    new-instance v3, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$23;

    invoke-direct {v3, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$23;-><init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V

    .line 70
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;-><init>(Landroid/content/Context;ILjava/util/List;Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;)V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setFindTypeAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;)V

    .line 71
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 72
    new-instance v0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    .line 73
    new-instance v1, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;

    invoke-direct {v1, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity$initView$24;-><init>(Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;)V

    .line 74
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v2

    .line 75
    invoke-direct {v0, p0, v1, v2}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;-><init>(Landroid/content/Context;Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$OnSelectedTabListener;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setLeftTypeAdapter(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final onfindTypeSelected(Ljava/util/List;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;",
            "Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/psk/kotlin/util/CommonListMainData;

    .line 2
    invoke-virtual {v0}, Lcom/psk/kotlin/util/CommonListMainData;->getAny()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.data.GameSubTypeData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v2

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v0, v3}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    goto :goto_0

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v1

    xor-int/2addr v1, v3

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 7
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_7

    .line 8
    :pswitch_0
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    .line 9
    :cond_3
    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    .line 10
    :goto_2
    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto :goto_7

    .line 11
    :pswitch_1
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_3

    .line 12
    :cond_4
    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    .line 13
    :goto_3
    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto :goto_7

    .line 14
    :pswitch_2
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_4

    .line 15
    :cond_5
    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    .line 16
    :goto_4
    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto :goto_7

    .line 17
    :pswitch_3
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_5

    .line 18
    :cond_6
    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    .line 19
    :goto_5
    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    goto :goto_7

    .line 20
    :pswitch_4
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_6

    .line 21
    :cond_7
    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    .line 22
    :goto_6
    iput-object p2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 23
    :goto_7
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagList()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final showFilterLayout()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->p:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->p:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->m:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getLeftTypeAdapter()Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->showTypeList(I)V

    return-void
.end method

.method private final showTypeList(I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711c7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    const-string v1, "e"

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_f

    .line 3
    :pswitch_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x3

    invoke-direct {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v7, v0, v3}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 8
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 10
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_1

    .line 11
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 14
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 15
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_3

    .line 17
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 18
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    .line 19
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x7

    .line 20
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 21
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 22
    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 23
    :pswitch_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 24
    :goto_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_5

    .line 25
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_5

    .line 26
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v2, v0, v3}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 27
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 28
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 30
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_7

    const/4 v6, 0x1

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :goto_7
    if-eqz v6, :cond_6

    .line 31
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 32
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 34
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 35
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 36
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_8

    .line 37
    :cond_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 38
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    .line 39
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x3

    .line 40
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 41
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 43
    :pswitch_2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x2

    invoke-direct {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 44
    :goto_a
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_a

    .line 45
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_a

    .line 46
    :cond_a
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v7, v0, v3}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 47
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 48
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 50
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_c

    const/4 v6, 0x1

    goto :goto_c

    :cond_c
    const/4 v6, 0x0

    :goto_c
    if-eqz v6, :cond_b

    .line 51
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 52
    :cond_d
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 54
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 55
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_d

    .line 57
    :cond_e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 58
    iget-object v2, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    .line 59
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x3

    .line 60
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 61
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    invoke-interface {v2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 63
    :cond_f
    :goto_f
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->updateDatas(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final updateRequestArgs()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->page:I

    .line 2
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v1, v0}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setPage(I)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {v0}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->resetData()V

    .line 4
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setUid(I)V

    .line 5
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setModelType(I)V

    .line 6
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setGameType(I)V

    .line 7
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setThemeType(I)V

    .line 8
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setPlayType(I)V

    .line 9
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setFeatureType(I)V

    .line 10
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameSortType:Lcom/join/kotlin/ui/findgame/data/TagData;

    invoke-virtual {v1}, Lcom/join/kotlin/ui/findgame/data/TagData;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/ui/findgame/data/CategoryRequest;->setGameSortType(I)V

    return-void
.end method

.method private final updateSelectedTagList()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->h:Landroid/widget/TextView;

    const-string v1, "binding.modelTypeText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p0, v0, v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->f:Landroid/widget/TextView;

    const-string v1, "binding.gameTypeText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p0, v0, v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->n:Landroid/widget/TextView;

    const-string v1, "binding.themeTypeText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p0, v0, v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->k:Landroid/widget/TextView;

    const-string v1, "binding.playTypeText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p0, v0, v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->d:Landroid/widget/TextView;

    const-string v1, "binding.featureTypeText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p0, v0, v1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    return-void
.end method

.method private final updateSelectedTagitem(Landroid/widget/TextView;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    .line 4
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private final updateTitle()V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v1

    .line 3
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 5
    check-cast v4, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 6
    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 7
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 9
    invoke-virtual {v7}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->isSelected()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 10
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11
    :cond_1
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 14
    check-cast v4, Ljava/util/List;

    .line 15
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 17
    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 18
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->getTitle()Ljava/lang/String;

    move-result-object v6

    .line 19
    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 20
    :cond_3
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_2

    .line 21
    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    .line 22
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_5

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string/jumbo v2, "\u00b7"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_4

    .line 25
    :cond_6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v1

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->o:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v1, v1, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->e:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 26
    :cond_7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->o:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->e:Landroid/widget/TextView;

    const-string/jumbo v1, "\u5168\u90e8\u6e38\u620f"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_5
    return-void
.end method


# virtual methods
.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->binding:Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->context:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "context"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDatas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    return-object v0
.end method

.method public final getFeatureType()Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-object v0
.end method

.method public final getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "findTypeAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFragments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getGameSortType()Lcom/join/kotlin/ui/findgame/data/TagData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameSortType:Lcom/join/kotlin/ui/findgame/data/TagData;

    return-object v0
.end method

.method public final getGameType()Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-object v0
.end method

.method public final getGameTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/findgame/data/GameTypeData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameTypeList:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "gameTypeList"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getLeftTypeAdapter()Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->leftTypeAdapter:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "leftTypeAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getModelType()Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-object v0
.end method

.method public final getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->page:I

    return v0
.end method

.method public final getPlayType()Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-object v0
.end method

.method public final getRequestArgs()Lcom/join/kotlin/ui/findgame/data/CategoryRequest;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    return-object v0
.end method

.method public final getTabType()Lcom/join/kotlin/ui/findgame/data/GameTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    return-object v0
.end method

.method public final getThemeType()Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v0, 0x0

    const/16 v1, 0x8

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_1

    .line 2
    :sswitch_0
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 3
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 5
    :sswitch_1
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 6
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 9
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 12
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 15
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->n:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 18
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->k:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 21
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 23
    :sswitch_2
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 24
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 25
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->k:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 26
    :sswitch_3
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateRequestArgs()V

    .line 27
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->p:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    const-string v1, "null cannot be cast to non-null type com.join.kotlin.ui.findgame.CategoryDetailItemFragment"

    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;

    .line 31
    iget-object v3, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v4, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v5, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v6, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    iget-object v7, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual/range {v2 .. v7}, Lcom/join/kotlin/ui/findgame/CategoryDetailItemFragment;->updateDatas(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V

    goto :goto_0

    .line 32
    :cond_0
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->updateTitle()V

    goto :goto_1

    .line 33
    :sswitch_4
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 34
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 35
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->h:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 36
    :sswitch_5
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 37
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 38
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 39
    :sswitch_6
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;->setSelected(Z)V

    .line 40
    new-instance p1, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    invoke-direct {p1}, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 41
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->d:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 42
    :goto_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090561 -> :sswitch_6
        0x7f090671 -> :sswitch_5
        0x7f090e38 -> :sswitch_4
        0x7f090f4d -> :sswitch_3
        0x7f091010 -> :sswitch_2
        0x7f09111d -> :sswitch_1
        0x7f09143c -> :sswitch_0
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    const-string v0, "inflate(LayoutInflater.from(this))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;)V

    .line 3
    invoke-virtual {p0, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setContext(Landroid/content/Context;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->a()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->o:Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/TopbarTitleCenterLayoutBinding;->d:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 6
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->gameTypeList()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_2

    const-string p1, "[{\"id\":1,\"title\":\"\u6a21\u62df\u5668\",\"type\":1,\"sub_game_type\":[{\"id\":31,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fba_icon.png\",\"title\":\"\u8857\u673a\"},{\"id\":33,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gba_icon.png\",\"title\":\"GBA\"},{\"id\":34,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/psp_icon.png\",\"title\":\"PSP\"},{\"id\":35,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/fc_icon.png\",\"title\":\"FC\"},{\"id\":43,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/sfc_icon.png\",\"title\":\"SFC\"},{\"id\":53,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/ps_icon.png\",\"title\":\"PS\"},{\"id\":51,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/md_icon.png\",\"title\":\"MD\"},{\"id\":54,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/wsc_icon.png\",\"title\":\"WSC\"},{\"id\":57,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/n64_icon.png\",\"title\":\"N64\"},{\"id\":58,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/on_icon.png\",\"title\":\"ONS\"},{\"id\":32,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/nd_icon.png\",\"title\":\"NDS\"},{\"id\":56,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/gbc_icon.png\",\"title\":\"GBC\"},{\"id\":60,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/dc_icon.png\",\"title\":\"DC\"},{\"id\":102,\"pic\":\"\",\"title\":\"H5\"}]},{\"id\":2,\"title\":\"\u5b89\u5353\",\"type\":2,\"sub_game_type\":[{\"id\":10001,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/onlin_icon.png\",\"title\":\"\u7f51\u6e38\"},{\"id\":10002,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"\u5355\u673a\"},{\"id\":10003,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/game_tag_type_icon/single_icon.png\",\"title\":\"mod\"}]},{\"id\":3,\"title\":\"\u5206\u7c7b\",\"type\":3,\"sub_game_type\":[{\"id\":24,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f3/ae/f3ae58e30ae7e432d7571a5ab08e31a2.png\",\"title\":\"\u52a8\u4f5c\u5192\u9669\"},{\"id\":23,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/2d/31/2d31f269379aee69d2e283478a1b9aa5.png\",\"title\":\"\u4f11\u95f2\u76ca\u667a\"},{\"id\":20,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e3/62/e36255c965b63e80d901f7ea04ae5aa1.png\",\"title\":\"\u89d2\u8272\u626e\u6f14\"},{\"id\":25,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/f4/44/f4444b37064a2cb88401db74dc5e3f75.png\",\"title\":\"\u5c04\u51fb\u98de\u884c\"},{\"id\":19,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/e1/d1/e1d1edd8076f1d92425cef93feef1cf2.png\",\"title\":\"\u7b56\u7565\u6218\u68cb\"},{\"id\":17,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3f/c8/3fc873bf10d151215d5b977178c4afe6.png\",\"title\":\"\u6a21\u62df\u6e38\u620f\"},{\"id\":22,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/3c/05/3c054708b2a888461eb338d34412a3f0.png\",\"title\":\"\u4f53\u80b2\u6e38\u620f\"},{\"id\":39,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/8e/de/8ede16897f71fdba1389d625b1c9ccfa.png\",\"title\":\"\u7ade\u901f\u6e38\u620f\"},{\"id\":18,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fc/9c/fc9c346e32b8f48fe6348b8b72e970ce.png\",\"title\":\"\u683c\u6597\u7ade\u6280\"},{\"id\":38,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/ef/8d/ef8d5060aa6c85a58bff921302bcc73a.png\",\"title\":\"\u7ecf\u8425\u6e38\u620f\"},{\"id\":13,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/c9/49/c949ce67d0ccf31a5dbe6cde1d6c213e.png\",\"title\":\"AVG\u604b\u7231\"},{\"id\":15,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/db/0f/db0f26037fee0b193fa9d77094238d9a.png\",\"title\":\"\u751f\u5b58\u6e38\u620f\"},{\"id\":16,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/88/ff/88ff59f4c24e0d14aed861500a9b85e9.png\",\"title\":\"\u6050\u6016\u6e38\u620f\"},{\"id\":12,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/eb/be/ebbe18e8be70b2ff811e32f5bdd8eee3.png\",\"title\":\"\u5854\u9632\u6e38\u620f\"},{\"id\":41,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/fb/5f/fb5f0f3569e9d40babd7d8c10da7195e.png\",\"title\":\"\u97f3\u4e50\u8282\u594f\"},{\"id\":21,\"pic\":\"http://ctimg2018.myyx618.com/upload/images/a4/4c/a44c5c9440c9433dd8c90065790a72ab.png\",\"title\":\"\u653e\u7f6e\u6302\u673a\"}]},{\"id\":4,\"title\":\"\u9898\u6750\",\"type\":4,\"sub_game_type\":[{\"id\":248,\"pic\":\"\",\"title\":\"\u4e8c\u6b21\u5143\"},{\"id\":249,\"pic\":\"\",\"title\":\"\u62df\u4eba\"},{\"id\":250,\"pic\":\"\",\"title\":\"\u67aa\u6218\"},{\"id\":251,\"pic\":\"\",\"title\":\"\u5c71\u6d77\u7ecf\"},{\"id\":252,\"pic\":\"\",\"title\":\"\u52a8\u6f2bIP\"},{\"id\":253,\"pic\":\"\",\"title\":\"\u5192\u9669\"},{\"id\":254,\"pic\":\"\",\"title\":\"\u5730\u7262\u8ff7\u5bab\"},{\"id\":255,\"pic\":\"\",\"title\":\"\u9b54\u5e7b\"},{\"id\":256,\"pic\":\"\",\"title\":\"\u79d1\u5e7b\"},{\"id\":257,\"pic\":\"\",\"title\":\"\u672b\u65e5\"},{\"id\":258,\"pic\":\"\",\"title\":\"\u706b\u5f71\u5fcd\u8005\"},{\"id\":259,\"pic\":\"\",\"title\":\"\u65e5\u6f2b\"},{\"id\":260,\"pic\":\"\",\"title\":\"\u6d77\u6218\"},{\"id\":261,\"pic\":\"\",\"title\":\"\u6b66\u4fa0\"},{\"id\":262,\"pic\":\"\",\"title\":\"\u7ae5\u8bdd\"},{\"id\":263,\"pic\":\"\",\"title\":\"\u53f2\u83b1\u59c6\"},{\"id\":264,\"pic\":\"\",\"title\":\"\u7f8e\u98df\"},{\"id\":265,\"pic\":\"\",\"title\":\"\u5fcd\u8005\"},{\"id\":266,\"pic\":\"\",\"title\":\"\u706b\u67f4\u4eba\"},{\"id\":267,\"pic\":\"\",\"title\":\"\u67aa\u5a18\"},{\"id\":268,\"pic\":\"\",\"title\":\"\u9b54\u7269\u5a18\"},{\"id\":269,\"pic\":\"\",\"title\":\"\u673a\u7532\"},{\"id\":270,\"pic\":\"\",\"title\":\"\u604b\u7231\"},{\"id\":271,\"pic\":\"\",\"title\":\"\u4e09\u56fd\"},{\"id\":272,\"pic\":\"\",\"title\":\"\u6218\u4e89\"},{\"id\":273,\"pic\":\"\",\"title\":\"\u72e9\u730e\"},{\"id\":274,\"pic\":\"\",\"title\":\"\u4fee\u4ed9\"},{\"id\":275,\"pic\":\"\",\"title\":\"\u521d\u97f3\u672a\u6765\"},{\"id\":276,\"pic\":\"\",\"title\":\"\u4eba\u751f\"},{\"id\":277,\"pic\":\"\",\"title\":\"\u5766\u514b\"},{\"id\":278,\"pic\":\"\",\"title\":\"\u4e8c\u6218\"},{\"id\":279,\"pic\":\"\",\"title\":\"\u6218\u8230\"},{\"id\":280,\"pic\":\"\",\"title\":\"\u795e\u8bdd\"},{\"id\":281,\"pic\":\"\",\"title\":\"\u50f5\u5c38\"},{\"id\":282,\"pic\":\"\",\"title\":\"\u690d\u7269\"},{\"id\":283,\"pic\":\"\",\"title\":\"\u6050\u6016\"},{\"id\":284,\"pic\":\"\",\"title\":\"\u52a8\u7269\"},{\"id\":285,\"pic\":\"\",\"title\":\"\u76d7\u5893\"},{\"id\":286,\"pic\":\"\",\"title\":\"\u8230\u5a18\"},{\"id\":287,\"pic\":\"\",\"title\":\"\u72fc\u4eba\u6740\"},{\"id\":288,\"pic\":\"\",\"title\":\"2048\"},{\"id\":289,\"pic\":\"\",\"title\":\"\u4ed9\u4fa0\"},{\"id\":290,\"pic\":\"\",\"title\":\"\u897f\u6e38\"},{\"id\":291,\"pic\":\"\",\"title\":\"\u519c\u573a\"},{\"id\":292,\"pic\":\"\",\"title\":\"\u7535\u7ade\"},{\"id\":293,\"pic\":\"\",\"title\":\"\u8d5b\u8f66\"},{\"id\":294,\"pic\":\"\",\"title\":\"\u5f00\u7f57\"},{\"id\":295,\"pic\":\"\",\"title\":\"\u8db3\u7403\"},{\"id\":296,\"pic\":\"\",\"title\":\"\u7bee\u7403\"},{\"id\":297,\"pic\":\"\",\"title\":\"\u5996\u602a\"},{\"id\":298,\"pic\":\"\",\"title\":\"\u592a\u7a7a\"},{\"id\":299,\"pic\":\"\",\"title\":\"SLG\"},{\"id\":300,\"pic\":\"\",\"title\":\"\u822a\u6d77\"},{\"id\":301,\"pic\":\"\",\"title\":\"\u70f9\u996a\"},{\"id\":302,\"pic\":\"\",\"title\":\"\u6f2b\u5a01\"},{\"id\":303,\"pic\":\"\",\"title\":\"\u8d85\u7ea7\u82f1\u96c4\"},{\"id\":304,\"pic\":\"\",\"title\":\"\u7f8e\u6f2b\"},{\"id\":305,\"pic\":\"\",\"title\":\"\u6697\u9ed1\"},{\"id\":306,\"pic\":\"\",\"title\":\"\u56fd\u521b\"},{\"id\":307,\"pic\":\"\",\"title\":\"\u5076\u50cf\"},{\"id\":308,\"pic\":\"\",\"title\":\"\u624b\u673a\"},{\"id\":309,\"pic\":\"\",\"title\":\"\u514b\u82cf\u9c81\"},{\"id\":310,\"pic\":\"\",\"title\":\"\u4fa6\u63a2\"},{\"id\":311,\"pic\":\"\",\"title\":\"\u9ad8\u8fbe\"},{\"id\":312,\"pic\":\"\",\"title\":\"\u4e50\u9ad8\"},{\"id\":313,\"pic\":\"\",\"title\":\"\u6570\u72ec\"},{\"id\":314,\"pic\":\"\",\"title\":\"\u94a2\u7434\"},{\"id\":315,\"pic\":\"\",\"title\":\"\u6570\u5b66\"},{\"id\":316,\"pic\":\"\",\"title\":\"\u8131\u51fa\"},{\"id\":317,\"pic\":\"\",\"title\":\"\u5927\u5bcc\u7fc1\"},{\"id\":318,\"pic\":\"\",\"title\":\"\u53e3\u888b\u5996\u602a\"},{\"id\":319,\"pic\":\"\",\"title\":\"\u62f3\u7687\"},{\"id\":320,\"pic\":\"\",\"title\":\"\u5965\u7279\u66fc\"},{\"id\":321,\"pic\":\"\",\"title\":\"\u6b7b\u795e\"},{\"id\":322,\"pic\":\"\",\"title\":\"\u4fa0\u76d7\u730e\u8f66\u624b\"},{\"id\":323,\"pic\":\"\",\"title\":\"\u6b7b\u795evs\u706b\u5f71\"},{\"id\":324,\"pic\":\"\",\"title\":\"\u4e09\u56fd\u6218\u7eaa\"},{\"id\":325,\"pic\":\"\",\"title\":\"\u8718\u86db\u4fa0\"},{\"id\":326,\"pic\":\"\",\"title\":\"\u6e38\u620f\u738b\"},{\"id\":327,\"pic\":\"\",\"title\":\"\u523a\u5ba2\u4fe1\u6761\"},{\"id\":328,\"pic\":\"\",\"title\":\"\u5766\u514b\u5927\u6218\"},{\"id\":329,\"pic\":\"\",\"title\":\"\u201c\u70ed\u8840\u201d\u7cfb\u5217\u6e38\u620f\"},{\"id\":330,\"pic\":\"\",\"title\":\"\u6355\u9c7c\"},{\"id\":331,\"pic\":\"\",\"title\":\"\u68a6\u5e7b\u6a21\u62df\u6218\"},{\"id\":332,\"pic\":\"\",\"title\":\"\u4e09\u56fd\u65e0\u53cc\"},{\"id\":333,\"pic\":\"\",\"title\":\"\u690d\u7269\u5927\u6218\u50f5\u5c38\"},{\"id\":334,\"pic\":\"\",\"title\":\"\u9f99\u73e0\"},{\"id\":335,\"pic\":\"\",\"title\":\"\u9965\u8352\"},{\"id\":336,\"pic\":\"\",\"title\":\"\u6a21\u62df\u5c71\u7f8a\"},{\"id\":337,\"pic\":\"\",\"title\":\"\u82f1\u96c4\u8054\u76df\"},{\"id\":338,\"pic\":\"\",\"title\":\"\u4ed9\u5251\u5947\u4fa0\u4f20\"},{\"id\":339,\"pic\":\"\",\"title\":\"\u4f20\u5947\"},{\"id\":340,\"pic\":\"\",\"title\":\"\u6c34\u6d52\u4f20\"},{\"id\":341,\"pic\":\"\",\"title\":\"\u5947\u8ff9MU\"},{\"id\":342,\"pic\":\"\",\"title\":\"\u5b9e\u51b5\u8db3\u7403\"},{\"id\":343,\"pic\":\"\",\"title\":\"\u6700\u7ec8\u5e7b\u60f3\"},{\"id\":344,\"pic\":\"\",\"title\":\"\u6570\u7801\u5b9d\u8d1d\"},{\"id\":345,\"pic\":\"\",\"title\":\"\u6050\u9f99\"},{\"id\":346,\"pic\":\"\",\"title\":\"\u6218\u56fd\"},{\"id\":347,\"pic\":\"\",\"title\":\"\u6821\u56ed\"}]},{\"id\":5,\"title\":\"\u73a9\u6cd5\",\"type\":5,\"sub_game_type\":[{\"id\":385,\"pic\":\"\",\"title\":\"MOBA\"},{\"id\":386,\"pic\":\"\",\"title\":\"\u81ea\u8d70\u68cb\"},{\"id\":387,\"pic\":\"\",\"title\":\"\u5854\u9632\"},{\"id\":388,\"pic\":\"\",\"title\":\"\u517b\u6210\"},{\"id\":389,\"pic\":\"\",\"title\":\"\u7b56\u7565\"},{\"id\":390,\"pic\":\"\",\"title\":\"\u5c04\u51fb\"},{\"id\":391,\"pic\":\"\",\"title\":\"\u5361\u724c\"},{\"id\":392,\"pic\":\"\",\"title\":\"\u56de\u5408\u5236RPG\"},{\"id\":393,\"pic\":\"\",\"title\":\"\u52a8\u4f5c\"},{\"id\":394,\"pic\":\"\",\"title\":\"\u6302\u673a\u653e\u7f6e\"},{\"id\":395,\"pic\":\"\",\"title\":\"\u52a8\u4f5cRPG\"},{\"id\":396,\"pic\":\"\",\"title\":\"\u683c\u6597\"},{\"id\":397,\"pic\":\"\",\"title\":\"\u5403\u9e21\"},{\"id\":398,\"pic\":\"\",\"title\":\"\u7b56\u7565RPG\"},{\"id\":399,\"pic\":\"\",\"title\":\"MMORPG\"},{\"id\":400,\"pic\":\"\",\"title\":\"\u5efa\u9020\"},{\"id\":401,\"pic\":\"\",\"title\":\"\u6a21\u62df\"},{\"id\":402,\"pic\":\"\",\"title\":\"\u6d88\u9664\"},{\"id\":403,\"pic\":\"\",\"title\":\"\u6218\u68cb\"},{\"id\":404,\"pic\":\"\",\"title\":\"\u7ade\u901f\"},{\"id\":405,\"pic\":\"\",\"title\":\"\u8dd1\u9177\"},{\"id\":406,\"pic\":\"\",\"title\":\"\u7ecf\u8425\"},{\"id\":407,\"pic\":\"\",\"title\":\"\u5373\u65f6\u6218\u7565\"},{\"id\":408,\"pic\":\"\",\"title\":\"\u6587\u5b57\u5192\u9669\"},{\"id\":409,\"pic\":\"\",\"title\":\"\u97f3\u4e50\u8282\u594f\"},{\"id\":410,\"pic\":\"\",\"title\":\"\u68cb\u724c\"},{\"id\":411,\"pic\":\"\",\"title\":\"\u684c\u6e38\"},{\"id\":412,\"pic\":\"\",\"title\":\"io\"},{\"id\":413,\"pic\":\"\",\"title\":\"\u6362\u88c5\"},{\"id\":414,\"pic\":\"\",\"title\":\"\u95ef\u5173\"},{\"id\":415,\"pic\":\"\",\"title\":\"\u4e92\u52a8\u5c0f\u8bf4\"},{\"id\":416,\"pic\":\"\",\"title\":\"\u89e3\u8c1c\"},{\"id\":417,\"pic\":\"\",\"title\":\"\u70b9\u51fb\"},{\"id\":418,\"pic\":\"\",\"title\":\"\u76ca\u667a\"},{\"id\":419,\"pic\":\"\",\"title\":\"\u5f39\u5c04\"},{\"id\":420,\"pic\":\"\",\"title\":\"\u4f53\u80b2\"},{\"id\":421,\"pic\":\"\",\"title\":\"\u4e92\u52a8\u7535\u5f71\"},{\"id\":422,\"pic\":\"\",\"title\":\"\u968f\u884c\u6e38\u620f\"},{\"id\":423,\"pic\":\"\",\"title\":\"\u89c6\u89c9\u5c0f\u8bf4\"},{\"id\":424,\"pic\":\"\",\"title\":\"MUD\"},{\"id\":425,\"pic\":\"\",\"title\":\"\u98de\u884c\"},{\"id\":426,\"pic\":\"\",\"title\":\"\u9a7e\u9a76\"},{\"id\":427,\"pic\":\"\",\"title\":\"\u751f\u5b58\"}]},{\"id\":6,\"title\":\"\u7279\u8272\",\"type\":6,\"sub_game_type\":[{\"id\":428,\"pic\":\"\",\"title\":\"\u8054\u673a\"},{\"id\":429,\"pic\":\"\",\"title\":\"5v5\"},{\"id\":430,\"pic\":\"\",\"title\":\"\u591a\u4eba\"},{\"id\":431,\"pic\":\"\",\"title\":\"\u63a8\u5854\"},{\"id\":432,\"pic\":\"\",\"title\":\"\u7f8e\u5973\"},{\"id\":433,\"pic\":\"\",\"title\":\"\u786c\u6838\"},{\"id\":434,\"pic\":\"\",\"title\":\"\u6536\u96c6\u8981\u7d20\"},{\"id\":435,\"pic\":\"\",\"title\":\"\u56fd\u4ea7\"},{\"id\":436,\"pic\":\"\",\"title\":\"FPS\"},{\"id\":437,\"pic\":\"\",\"title\":\"PVP\"},{\"id\":438,\"pic\":\"\",\"title\":\"\u7ade\u6280\"},{\"id\":439,\"pic\":\"\",\"title\":\"TPS\"},{\"id\":440,\"pic\":\"\",\"title\":\"3D\"},{\"id\":441,\"pic\":\"\",\"title\":\"\u5408\u4f5c\"},{\"id\":442,\"pic\":\"\",\"title\":\"TPP\"},{\"id\":443,\"pic\":\"\",\"title\":\"\u5267\u60c5\"},{\"id\":444,\"pic\":\"\",\"title\":\"\u5bf9\u6218\"},{\"id\":445,\"pic\":\"\",\"title\":\"Roguelike\"},{\"id\":446,\"pic\":\"\",\"title\":\"Steam\u79fb\u690d\"},{\"id\":447,\"pic\":\"\",\"title\":\"\u72ec\u7acb\u6e38\u620f\"},{\"id\":450,\"pic\":\"\",\"title\":\"\u4f11\u95f2\"},{\"id\":451,\"pic\":\"\",\"title\":\"\u9ad8\u753b\u8d28\"},{\"id\":452,\"pic\":\"\",\"title\":\"\u9ad8\u96be\u5ea6\"},{\"id\":453,\"pic\":\"\",\"title\":\"\u6a2a\u7248\"},{\"id\":454,\"pic\":\"\",\"title\":\"\u548c\u98ce\"},{\"id\":455,\"pic\":\"\",\"title\":\"Live2D\"},{\"id\":456,\"pic\":\"\",\"title\":\"\u5361\u901a\"},{\"id\":457,\"pic\":\"\",\"title\":\"\u7ec4\u961f\"},{\"id\":458,\"pic\":\"\",\"title\":\"CCG\"},{\"id\":459,\"pic\":\"\",\"title\":\"1v1\"},{\"id\":460,\"pic\":\"\",\"title\":\"\u53ef\u7231\"},{\"id\":461,\"pic\":\"\",\"title\":\"\u5c40\u57df\u7f51\u8054\u673a\"},{\"id\":462,\"pic\":\"\",\"title\":\"\u50cf\u7d20\"},{\"id\":463,\"pic\":\"\",\"title\":\"\u5f39\u5e55\"},{\"id\":464,\"pic\":\"\",\"title\":\"\u4e2d\u56fd\u98ce\"},{\"id\":465,\"pic\":\"\",\"title\":\"\u9ad8\u81ea\u7531\u5ea6\"},{\"id\":466,\"pic\":\"\",\"title\":\"\u53e4\u98ce\"},{\"id\":467,\"pic\":\"\",\"title\":\"\u53ef\u634f\u8138\"},{\"id\":468,\"pic\":\"\",\"title\":\"\u5f00\u653e\u4e16\u754c\"},{\"id\":469,\"pic\":\"\",\"title\":\"\u793e\u4ea4\"},{\"id\":470,\"pic\":\"\",\"title\":\"DIY\"},{\"id\":471,\"pic\":\"\",\"title\":\"\u7ecf\u5178\"},{\"id\":472,\"pic\":\"\",\"title\":\"\u591a\u7ed3\u5c40\"},{\"id\":473,\"pic\":\"\",\"title\":\"\u624b\u7ed8\u98ce\u683c\"},{\"id\":474,\"pic\":\"\",\"title\":\"\u88c5\u4fee\"},{\"id\":475,\"pic\":\"\",\"title\":\"\u8bbe\u8ba1\"},{\"id\":476,\"pic\":\"\",\"title\":\"\u5973\u6027\u5411\"},{\"id\":477,\"pic\":\"\",\"title\":\"\u58f0\u63a7\"},{\"id\":478,\"pic\":\"\",\"title\":\"\u6f02\u79fb\"},{\"id\":479,\"pic\":\"\",\"title\":\"\u6c34\u58a8\u98ce\"},{\"id\":480,\"pic\":\"\",\"title\":\"2D\"},{\"id\":481,\"pic\":\"\",\"title\":\"\u6253\u51fb\u611f\"},{\"id\":482,\"pic\":\"\",\"title\":\"\u624b\u901f\"},{\"id\":483,\"pic\":\"\",\"title\":\"\u58f0\u4f18\u914d\u97f3\"},{\"id\":484,\"pic\":\"\",\"title\":\"\u81f4\u90c1\"},{\"id\":485,\"pic\":\"\",\"title\":\"DBG\"},{\"id\":486,\"pic\":\"\",\"title\":\"\u9003\u751f\"},{\"id\":487,\"pic\":\"\",\"title\":\"\u79fb\u690d\"},{\"id\":488,\"pic\":\"\",\"title\":\"\u641e\u7b11\"},{\"id\":489,\"pic\":\"\",\"title\":\"\u5408\u6210\"},{\"id\":490,\"pic\":\"\",\"title\":\"\u52a8\u4eba\u97f3\u4e50\"},{\"id\":491,\"pic\":\"\",\"title\":\"\u7535\u97f3\"},{\"id\":492,\"pic\":\"\",\"title\":\"\u7ad6\u7248\"},{\"id\":493,\"pic\":\"\",\"title\":\"\u7ae5\u5e74\"},{\"id\":494,\"pic\":\"\",\"title\":\"Q\u7248\"},{\"id\":495,\"pic\":\"\",\"title\":\"\u6709\u6bd2\"},{\"id\":496,\"pic\":\"\",\"title\":\"\u4e59\u5973\"},{\"id\":497,\"pic\":\"\",\"title\":\"TCG\"},{\"id\":498,\"pic\":\"\",\"title\":\"\u60ac\u7591\"},{\"id\":499,\"pic\":\"\",\"title\":\"\u6cbb\u6108\"},{\"id\":500,\"pic\":\"\",\"title\":\"\u7ec4\u88c5\"},{\"id\":501,\"pic\":\"\",\"title\":\"\u63a8\u7406\"},{\"id\":502,\"pic\":\"\",\"title\":\"\u89e3\u538b\"},{\"id\":503,\"pic\":\"\",\"title\":\"meta\"},{\"id\":504,\"pic\":\"\",\"title\":\"\u6c49\u5316\"},{\"id\":505,\"pic\":\"\",\"title\":\"\u6b27\u7f8e\u753b\u98ce\"},{\"id\":506,\"pic\":\"\",\"title\":\"3v3\"},{\"id\":507,\"pic\":\"\",\"title\":\"\u9b54\u6027\"},{\"id\":508,\"pic\":\"\",\"title\":\"\u5e73\u53f0\u8df3\u8dc3\"},{\"id\":509,\"pic\":\"\",\"title\":\"\u81ea\u5236\u5173\u5361\"},{\"id\":510,\"pic\":\"\",\"title\":\"\u8f7b\u6539\"},{\"id\":511,\"pic\":\"\",\"title\":\"\u7b80\u7ea6\u753b\u98ce\"},{\"id\":512,\"pic\":\"\",\"title\":\"\u8857\u673a\u98ce\u683c\"},{\"id\":513,\"pic\":\"\",\"title\":\"AR\"},{\"id\":514,\"pic\":\"\",\"title\":\"\u6237\u5916\"},{\"id\":515,\"pic\":\"\",\"title\":\"\u65e5\u7cfb\u98ce\u683c\"},{\"id\":516,\"pic\":\"\",\"title\":\"VR\"},{\"id\":517,\"pic\":\"\",\"title\":\"\u4f5b\u7cfb\"},{\"id\":518,\"pic\":\"\",\"title\":\"\u4f4e\u6a21\"},{\"id\":519,\"pic\":\"\",\"title\":\"\u5c0f\u6e05\u65b0\"},{\"id\":520,\"pic\":\"\",\"title\":\"\u4fef\u89c6\u89c6\u89d2\"},{\"id\":521,\"pic\":\"\",\"title\":\"PC\u79fb\u690d\"},{\"id\":522,\"pic\":\"\",\"title\":\"\u4e70\u65ad\u5236\"},{\"id\":523,\"pic\":\"\",\"title\":\"\u8fdb\u5316\"},{\"id\":524,\"pic\":\"\",\"title\":\"\u526a\u7eb8\u98ce\"},{\"id\":525,\"pic\":\"\",\"title\":\"\u526a\u5f71\u98ce\"},{\"id\":526,\"pic\":\"\",\"title\":\"\u50ac\u6cea\"},{\"id\":527,\"pic\":\"\",\"title\":\"\u4e0b\u843d\u5f0f\"},{\"id\":528,\"pic\":\"\",\"title\":\"\u624b\u6b8b\"},{\"id\":529,\"pic\":\"\",\"title\":\"\u53cd\u5e94\u529b\"}]}]"

    .line 8
    :cond_2
    new-instance v2, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v2}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    .line 9
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v3

    const-class v4, Ljava/util/List;

    new-array v5, v0, [Ljava/lang/Class;

    .line 10
    const-class v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v3

    .line 11
    invoke-virtual {v2, p1, v3}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "ObjectMapper().readValue\u2026ta::class.java)\n        )"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setGameTypeList(Ljava/util/List;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 15
    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v4

    if-nez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_3

    .line 16
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 17
    :cond_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_6

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 19
    :cond_6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    .line 20
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 22
    invoke-virtual {v4}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_8

    const/4 v4, 0x1

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    :goto_5
    if-eqz v4, :cond_7

    .line 23
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 24
    :cond_9
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_d

    .line 25
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 26
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 27
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 28
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getGameTypeList()Ljava/util/List;

    move-result-object v3

    .line 29
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 31
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, v0, :cond_b

    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_a

    .line 32
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 33
    :cond_c
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v3

    .line 34
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 35
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v3, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_6

    .line 36
    :cond_d
    invoke-virtual {p0, p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->setContext(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->initView()V

    return-void
.end method

.method public final reLoadDatas()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->l:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->onClick(Landroid/view/View;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;->j:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->onClick(Landroid/view/View;)V

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->binding:Lcom/join/android/app/mgsim/wufun/databinding/CategroyGamelistActivityBinding;

    return-void
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->context:Landroid/content/Context;

    return-void
.end method

.method public final setDatas(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/psk/kotlin/util/CommonListMainData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->datas:Ljava/util/List;

    return-void
.end method

.method public final setFeatureType(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->featureType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-void
.end method

.method public final setFindTypeAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    return-void
.end method

.method public final setFragments(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->fragments:Ljava/util/ArrayList;

    return-void
.end method

.method public final setGameSortType(Lcom/join/kotlin/ui/findgame/data/TagData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/TagData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameSortType:Lcom/join/kotlin/ui/findgame/data/TagData;

    return-void
.end method

.method public final setGameType(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-void
.end method

.method public final setGameTypeList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/kotlin/ui/findgame/data/GameTypeData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->gameTypeList:Ljava/util/List;

    return-void
.end method

.method public final setLeftTypeAdapter(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->leftTypeAdapter:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    return-void
.end method

.method public final setModelType(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->modelType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-void
.end method

.method public final setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->page:I

    return-void
.end method

.method public final setPlayType(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->playType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-void
.end method

.method public final setRequestArgs(Lcom/join/kotlin/ui/findgame/data/CategoryRequest;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/CategoryRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->requestArgs:Lcom/join/kotlin/ui/findgame/data/CategoryRequest;

    return-void
.end method

.method public final setTabType(Lcom/join/kotlin/ui/findgame/data/GameTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->tabType:Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    return-void
.end method

.method public final setThemeType(Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/CategoryDetailListActivity;->themeType:Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    return-void
.end method
