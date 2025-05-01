.class final Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/quark/model/bean/SourceTabListBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCreateSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n29#2,2:278\n32#2,3:282\n1855#3,2:280\n*S KotlinDebug\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1\n*L\n204#1:278,2\n204#1:282,3\n206#1:280,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCreateSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,277:1\n29#2,2:278\n32#2,3:282\n1855#3,2:280\n*S KotlinDebug\n*F\n+ 1 CreateSourceHopeActivity.kt\ncom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1\n*L\n204#1:278,2\n204#1:282,3\n206#1:280,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1;->invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V
    .locals 7
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceTabListBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-static {v0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/kingja/loadsir/core/b;->h()V

    if-eqz p1, :cond_7

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;->getTabs()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    .line 7
    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getTab_id()Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v4, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v5, 0x0

    :goto_2
    if-nez v5, :cond_1

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getTab_id()Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x2

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v6, :cond_5

    const/4 v3, 0x1

    :cond_5
    :goto_3
    if-nez v3, :cond_1

    .line 8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_6
    invoke-static {v0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity;->access$getTagAdapter(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_7

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/quark/viewmodel/CreateSourceHopeViewModel;->setSelectTag(Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    :cond_7
    return-void
.end method
