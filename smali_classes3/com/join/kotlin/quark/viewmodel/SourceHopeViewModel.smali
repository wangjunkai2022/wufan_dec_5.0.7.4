.class public final Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;
.super Lcom/join/kotlin/base/viewmodel/BaseViewModel;
.source "SourceHopeViewModel.kt"


# instance fields
.field private keyword:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final sortType:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/quark/model/bean/SortTypeBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sortTypeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/kotlin/quark/model/bean/SortTypeBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tabItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private title:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/viewmodel/BaseViewModel;-><init>()V

    .line 2
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    const-string/jumbo v1, "\u8d44\u6e90\u8bb8\u613f\u6c60"

    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    const-string/jumbo v0, "\u6700\u70ed"

    const-string/jumbo v1, "\u6700\u65b0"

    const-string/jumbo v2, "\u6211\u7684"

    .line 3
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->tabItems:Ljava/util/ArrayList;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/join/kotlin/quark/model/bean/SortTypeBean;

    .line 4
    new-instance v1, Lcom/join/kotlin/quark/model/bean/SortTypeBean;

    const/4 v2, -0x1

    const-string/jumbo v3, "\u5168\u90e8"

    invoke-direct {v1, v2, v3}, Lcom/join/kotlin/quark/model/bean/SortTypeBean;-><init>(ILjava/lang/String;)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Lcom/join/kotlin/quark/model/bean/SortTypeBean;

    const-string/jumbo v4, "\u5b9e\u73b0\u4e2d"

    invoke-direct {v1, v3, v4}, Lcom/join/kotlin/quark/model/bean/SortTypeBean;-><init>(ILjava/lang/String;)V

    const/4 v4, 0x1

    aput-object v1, v0, v4

    new-instance v1, Lcom/join/kotlin/quark/model/bean/SortTypeBean;

    const-string/jumbo v4, "\u5df2\u5b9e\u73b0"

    invoke-direct {v1, v2, v4}, Lcom/join/kotlin/quark/model/bean/SortTypeBean;-><init>(ILjava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->sortTypeList:Ljava/util/ArrayList;

    .line 5
    new-instance v1, Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->sortType:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method


# virtual methods
.method public final getKeyword()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->keyword:Ljava/lang/String;

    return-object v0
.end method

.method public final getSortType()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/quark/model/bean/SortTypeBean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->sortType:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getTabItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->tabItems:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getTitle()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final setKeyword(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->keyword:Ljava/lang/String;

    return-void
.end method

.method public final setTitle(Landroidx/lifecycle/MutableLiveData;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/MutableLiveData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/viewmodel/SourceHopeViewModel;->title:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method
