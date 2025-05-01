.class final Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;
.super Lkotlin/jvm/internal/Lambda;
.source "UserRecomendActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/mgps/dto/ResponseModel<",
        "Ljava/util/List<",
        "+",
        "Lcom/join/mgps/dto/CollectionBeanSub;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUserRecomendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4\n*L\n82#1:178,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserRecomendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,177:1\n1855#2,2:178\n*S KotlinDebug\n*F\n+ 1 UserRecomendActivity.kt\ncom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4\n*L\n82#1:178,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;->this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/mgps/dto/ResponseModel;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;->invoke(Lcom/join/mgps/dto/ResponseModel;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/mgps/dto/ResponseModel;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/dto/ResponseModel<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionBeanSub;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "it.data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;->this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 5
    new-instance v4, Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-direct {v4, v1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;-><init>(Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/join/kotlin/ui/base/BaseHasDownloadActivityViewModle;->updateDowState(Lcom/join/mgps/business/CollectionBeanSubBusiness;)V

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getViewModle()Lcom/join/kotlin/ui/userrecom/RecomViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/userrecom/RecomViewModle;->getShowDataList()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/ArrayList;

    new-instance v9, Lcom/psk/kotlin/util/CommonListMainData;

    const/4 v3, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lcom/psk/kotlin/util/CommonListMainData;-><init>(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity$onCreate$4;->this$0:Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/userrecom/UserRecomendActivity;->getAdapter()Lcom/join/kotlin/ui/userrecom/UserRecomendAdapter;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    return-void
.end method
