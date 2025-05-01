.class final Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "UploadSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V
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
    value = "SMAP\nUploadSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n29#2,2:151\n32#2,3:156\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1\n*L\n97#1:151,2\n97#1:156,3\n99#1:153,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUploadSourceHopeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n29#2,2:151\n32#2,3:156\n1864#3,3:153\n*S KotlinDebug\n*F\n+ 1 UploadSourceHopeActivity.kt\ncom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1\n*L\n97#1:151,2\n97#1:156,3\n99#1:153,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/UploadSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/UploadSourceHopeActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1;->invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/quark/model/bean/SourceTabListBean;)V
    .locals 6
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceTabListBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/UploadSourceHopeActivity;

    invoke-static {v0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->access$getLoadSir$p(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/kingja/loadsir/core/b;->h()V

    if-eqz p1, :cond_4

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/quark/UploadSourceHopeActivity$createObserver$1$1$1;->this$0:Lcom/join/kotlin/quark/UploadSourceHopeActivity;

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/quark/model/bean/SourceTabListBean;->getTabs()Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 5
    invoke-static {v0}, Lcom/join/kotlin/quark/UploadSourceHopeActivity;->access$getTagAdapter(Lcom/join/kotlin/quark/UploadSourceHopeActivity;)Lcom/join/kotlin/quark/adapter/SourceHopeTagAdapter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->submitList(Ljava/util/List;)V

    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1
    check-cast v3, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;

    if-eqz v3, :cond_2

    .line 7
    invoke-virtual {v3}, Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;->getActive()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_3

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v2

    check-cast v2, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;

    invoke-virtual {v2, v3}, Lcom/join/kotlin/quark/viewmodel/UploadSourceHopeViewModel;->setSelectTag(Lcom/join/kotlin/quark/model/bean/SourceTabItemBean;)V

    :cond_3
    move v2, v4

    goto :goto_0

    :cond_4
    return-void
.end method
