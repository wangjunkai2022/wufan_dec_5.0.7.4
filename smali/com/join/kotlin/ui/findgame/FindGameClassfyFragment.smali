.class public final Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;
.super Landroidx/fragment/app/Fragment;
.source "FindGameClassfyFragment.kt"

# interfaces
.implements Lcom/join/kotlin/presenter/view/FindHomeView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$OnSelectedTabListener;,
        Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;,
        Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFindGameClassfyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1855#2,2:386\n766#2:388\n857#2,2:389\n1360#2:391\n1446#2,5:392\n1855#2,2:397\n766#2:399\n857#2,2:400\n1360#2:402\n1446#2,5:403\n1855#2,2:408\n766#2:410\n857#2,2:411\n1360#2:413\n1446#2,5:414\n1855#2,2:419\n*S KotlinDebug\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n*L\n215#1:386,2\n305#1:388\n305#1:389,2\n305#1:391\n305#1:392,5\n306#1:397,2\n325#1:399\n325#1:400,2\n325#1:402\n325#1:403,5\n326#1:408,2\n345#1:410\n345#1:411,2\n345#1:413\n345#1:414,5\n346#1:419,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFindGameClassfyFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,385:1\n1855#2,2:386\n766#2:388\n857#2,2:389\n1360#2:391\n1446#2,5:392\n1855#2,2:397\n766#2:399\n857#2,2:400\n1360#2:402\n1446#2,5:403\n1855#2,2:408\n766#2:410\n857#2,2:411\n1360#2:413\n1446#2,5:414\n1855#2,2:419\n*S KotlinDebug\n*F\n+ 1 FindGameClassfyFragment.kt\ncom/join/kotlin/ui/findgame/FindGameClassfyFragment\n*L\n215#1:386,2\n305#1:388\n305#1:389,2\n305#1:391\n305#1:392,5\n306#1:397,2\n325#1:399\n325#1:400,2\n325#1:402\n325#1:403,5\n326#1:408,2\n345#1:410\n345#1:411,2\n345#1:413\n345#1:414,5\n346#1:419,2\n*E\n"
    }
.end annotation


# instance fields
.field public binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

.field private choiceListData:Ljava/util/List;
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

.field public downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

.field public findClassifyAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

.field public findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

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

.field private page:I

.field public presenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

.field public requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

.field private selectedType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    return-void
.end method


# virtual methods
.method public final getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getChoiceListData()Ljava/util/List;
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
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

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
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    return-object v0
.end method

.method public final getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "downloadprensenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFindClassifyAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->findClassifyAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "findClassifyAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "findTypeAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

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
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->gameTypeList:Ljava/util/List;

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
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->leftTypeAdapter:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "leftTypeAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getPage()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    return v0
.end method

.method public final getPresenter()Lcom/join/kotlin/presenter/FindModlePrensenter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->presenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRequestArgs()Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "requestArgs"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSelectedType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->selectedType:I

    return v0
.end method

.method public hidLoading()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->f:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 1
    invoke-static {p1, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    const-string p2, "inflate(inflater, container, false)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/mgps/Util/d0;->d(Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setGameTypeList(Ljava/util/List;)V

    .line 7
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->gameTypeList()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    .line 8
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    .line 9
    new-instance v0, Lcom/fasterxml/jackson/databind/ObjectMapper;

    invoke-direct {v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;-><init>()V

    .line 10
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Ljava/util/List;

    new-array p2, p2, [Ljava/lang/Class;

    .line 11
    const-class v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    aput-object v3, p2, p3

    invoke-virtual {v1, v2, p2}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p2

    .line 12
    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readValue(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "ObjectMapper().readValue\u2026class.java)\n            )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setGameTypeList(Ljava/util/List;)V

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_3

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v2, "\u7cbe\u9009"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x1

    const/4 v3, 0x1

    const/4 v5, 0x0

    const-string v2, "\u6a21\u62df\u5668"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x2

    const/4 v3, 0x2

    const-string v2, "\u5b89\u5353"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x3

    const/4 v3, 0x3

    const-string v2, "\u5206\u7c7b"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x4

    const/4 v3, 0x4

    const-string v2, "\u9898\u6750"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x5

    const/4 v3, 0x5

    const-string v2, "\u73a9\u6cd5"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v1, 0x6

    const/4 v3, 0x6

    const-string v2, "\u7279\u8272"

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    :cond_3
    new-instance p1, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$1;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object v1

    .line 23
    invoke-direct {p1, p2, v0, v1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;-><init>(Landroid/content/Context;Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$OnSelectedTabListener;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setLeftTypeAdapter(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;)V

    .line 24
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getLeftTypeAdapter()Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 25
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getLeftTypeAdapter()Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 26
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->g:Landroid/widget/Button;

    const-string p2, "binding.failedLayoutMain.setNetwork"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$2;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$2;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    invoke-static {p1, p2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 27
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->f:Landroid/widget/ImageView;

    const-string p2, "binding.failedLayoutMain.relodingimag"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$3;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$3;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    invoke-static {p1, p2}, Lcom/psk/kotlin/ext/CommonExtKt;->onClick(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 28
    new-instance p1, Lcom/join/kotlin/presenter/FindModlePrensenter;

    invoke-direct {p1, p0}, Lcom/join/kotlin/presenter/FindModlePrensenter;-><init>(Lcom/join/kotlin/presenter/view/FindHomeView;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setPresenter(Lcom/join/kotlin/presenter/FindModlePrensenter;)V

    .line 29
    new-instance p1, Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    invoke-direct {p1, p2, v0}, Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setFindClassifyAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;)V

    .line 30
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindClassifyAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 31
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, p3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 32
    new-instance p1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 p3, 0x6

    invoke-direct {p1, p2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 33
    new-instance p2, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$4;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$4;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->setSpanSizeLookup(Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;)V

    .line 34
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p2

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 35
    new-instance p2, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p3

    iget-object p3, p3, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const-string v0, "binding.dataList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    invoke-direct {p2, p1, p3, v0}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    .line 36
    invoke-virtual {p0, p2}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setDownloadprensenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V

    .line 37
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindClassifyAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->initData(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 38
    new-instance p1, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getId()I

    move-result p3

    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    new-instance v1, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;

    invoke-direct {v1, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onCreateView$5;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    invoke-direct {p1, p2, p3, v0, v1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;-><init>(Landroid/content/Context;ILjava/util/List;Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter$OnItenSelected;)V

    .line 39
    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setFindTypeAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;)V

    .line 40
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 41
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->a()Landroid/widget/LinearLayout;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/mgps/Util/d0;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lcom/psk/kotlin/ext/CommonExtKt;->toast(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_4

    .line 3
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->f:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public final onEventMainThread(Lcom/join/mgps/event/n;)V
    .locals 1
    .param p1    # Lcom/join/mgps/event/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lorg/greenrobot/eventbus/Subscribe;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "downloadTaskEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->onEventMainThread(Lcom/join/mgps/event/n;)V

    return-void
.end method

.method public onLoadDataSuccess(ILcom/join/kotlin/ui/findgame/data/FindChoiceResultData;)V
    .locals 0
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindChoiceResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1, p2}, Lcom/join/kotlin/presenter/view/FindHomeView$DefaultImpls;->onLoadDataSuccess(Lcom/join/kotlin/presenter/view/FindHomeView;ILcom/join/kotlin/ui/findgame/data/FindChoiceResultData;)V

    return-void
.end method

.method public onLoadDataSuccessV9(ILcom/join/kotlin/ui/findgame/data/FindClassifyResultData;)V
    .locals 10
    .param p2    # Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    iget v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    if-eq p1, v1, :cond_0

    return-void

    :cond_0
    if-ne p1, v0, :cond_3

    .line 2
    iput v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->refreshComplete()V

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 5
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getGame_type()Ljava/util/List;

    move-result-object p1

    const-string v1, "result.game_type"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setGameTypeList(Ljava/util/List;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object p1

    new-instance v7, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v3, "\u7cbe\u9009"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;-><init>(ILjava/lang/String;ILjava/util/List;Z)V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v7}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 7
    :try_start_0
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->gameTypeList()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object p1

    .line 8
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/android/app/common/utils/JsonMapper;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getLeftTypeAdapter()Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 11
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getBanner()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    if-nez p1, :cond_3

    .line 12
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getBanner()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;

    .line 13
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v2

    const/16 v3, 0x8f

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 14
    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getDownloadprensenter()Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/kotlin/ui/findgame/data/FindChoiceBannerData;->getGame_info()Lcom/join/mgps/business/CollectionBeanSubBusiness;

    move-result-object p1

    const-string v3, "choiceBannerData.game_info"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 16
    iget-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    .line 17
    new-instance v9, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v3, 0x3

    .line 18
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getBanner()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v1, "result.banner[0]"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, v9

    .line 19
    invoke-direct/range {v2 .. v8}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    invoke-interface {p1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    :cond_3
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getCollection_list()Ljava/util/List;

    move-result-object p1

    const-string v1, "result.collection_list"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_4

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 23
    iget p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    goto :goto_3

    .line 24
    :cond_4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 25
    :goto_3
    invoke-virtual {p2}, Lcom/join/kotlin/ui/findgame/data/FindClassifyResultData;->getCollection_list()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 27
    iget-object p2, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

    new-instance v7, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v1, 0x7

    const-string v0, "itx"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 28
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindClassifyAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    new-instance p1, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {p1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->setRequestArgs(Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getRequestArgs()Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getRequestArgs()Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getPresenter()Lcom/join/kotlin/presenter/FindModlePrensenter;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getRequestArgs()Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/kotlin/presenter/FindModlePrensenter;->loadClassfyDatas(Landroid/content/Context;Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPreLoadCount(I)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->c:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance p2, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onViewCreated$1;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$onViewCreated$1;-><init>(Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;)V

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    return-void
.end method

.method public final setBinding(Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->binding:Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    return-void
.end method

.method public final setChoiceListData(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->choiceListData:Ljava/util/List;

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
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    return-void
.end method

.method public final setDownloadprensenter(Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;)V
    .locals 1
    .param p1    # Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->downloadprensenter:Lcom/psk/kotlin/util/BasDownLoadActivityPresenter;

    return-void
.end method

.method public final setFindClassifyAdapter(Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->findClassifyAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

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
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->findTypeAdapter:Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

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
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->gameTypeList:Ljava/util/List;

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
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->leftTypeAdapter:Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment$TabRecycleAdapter;

    return-void
.end method

.method public final setPage(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->page:I

    return-void
.end method

.method public final setPresenter(Lcom/join/kotlin/presenter/FindModlePrensenter;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/presenter/FindModlePrensenter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->presenter:Lcom/join/kotlin/presenter/FindModlePrensenter;

    return-void
.end method

.method public final setRequestArgs(Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;)V
    .locals 1
    .param p1    # Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->requestArgs:Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    return-void
.end method

.method public final setSelectedType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->selectedType:I

    return-void
.end method

.method public showLoding()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->f:Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/LodingLayoutIncludeBinding;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->d:Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FailedLayoutIncludeBinding;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method

.method public final showTypeList(I)V
    .locals 11

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object p1

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindClassifyAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindClassifyAdapter;

    goto/16 :goto_10

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v2

    iget-object v2, v2, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->e:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v0

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0711c7

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "e"

    const/4 v3, 0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_f

    .line 8
    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 9
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x3

    .line 11
    invoke-direct {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 12
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 13
    :goto_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_1

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v7, v0, v1}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 17
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 19
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_3

    const/4 v6, 0x1

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    .line 20
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 21
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 23
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 24
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_3

    .line 26
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 27
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    .line 28
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x7

    .line 29
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 30
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 32
    :pswitch_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 33
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    .line 35
    invoke-direct {v5, v6, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 36
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 37
    :goto_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_6

    .line 38
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_5

    .line 39
    :cond_6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v3, v0, v1}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 40
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 43
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_8

    const/4 v6, 0x1

    goto :goto_7

    :cond_8
    const/4 v6, 0x0

    :goto_7
    if-eqz v6, :cond_7

    .line 44
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 45
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 47
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 48
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_8

    .line 50
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 51
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    .line 52
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x3

    .line 53
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 54
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 55
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 56
    :pswitch_2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    .line 57
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 58
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v6

    const/4 v7, 0x2

    .line 59
    invoke-direct {v5, v6, v7}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 60
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 61
    :goto_a
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v4

    if-lez v4, :cond_b

    .line 62
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    goto :goto_a

    .line 63
    :cond_b
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getBinding()Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;

    move-result-object v4

    iget-object v4, v4, Lcom/join/android/app/mgsim/wufun/databinding/FindgameClassfyFragmentLayoutBinding;->h:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v5, Lcom/psk/kotlin/util/GridSpacingItemDecoration;

    invoke-direct {v5, v7, v0, v1}, Lcom/psk/kotlin/util/GridSpacingItemDecoration;-><init>(IIZ)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 64
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getGameTypeList()Ljava/util/List;

    move-result-object v0

    .line 65
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 67
    invoke-virtual {v6}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getType()I

    move-result v6

    if-ne v6, p1, :cond_d

    const/4 v6, 0x1

    goto :goto_c

    :cond_d
    const/4 v6, 0x0

    :goto_c
    if-eqz v6, :cond_c

    .line 68
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 69
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 71
    check-cast v3, Lcom/join/kotlin/ui/findgame/data/GameTypeData;

    .line 72
    invoke-virtual {v3}, Lcom/join/kotlin/ui/findgame/data/GameTypeData;->getSub_game_type()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 73
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_d

    .line 74
    :cond_f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/join/kotlin/ui/findgame/data/GameSubTypeData;

    .line 75
    iget-object v1, p0, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->datas:Ljava/util/List;

    .line 76
    new-instance v10, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v4, 0x3

    .line 77
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc

    const/4 v9, 0x0

    move-object v3, v10

    .line 78
    invoke-direct/range {v3 .. v9}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 80
    :cond_10
    :goto_f
    invoke-virtual {p0}, Lcom/join/kotlin/ui/findgame/FindGameClassfyFragment;->getFindTypeAdapter()Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/findgame/adapter/FindTypeListAdapter;->updateDatas(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_10
    return-void

    nop

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
