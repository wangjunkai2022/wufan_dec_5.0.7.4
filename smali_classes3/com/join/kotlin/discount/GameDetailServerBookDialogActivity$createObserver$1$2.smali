.class final Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailServerBookDialogActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailServerBookDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1864#2,3:123\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2\n*L\n80#1:123,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailServerBookDialogActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1864#2,3:123\n*S KotlinDebug\n*F\n+ 1 GameDetailServerBookDialogActivity.kt\ncom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2\n*L\n80#1:123,3\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;->invoke(Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;)V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItems()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity$createObserver$1$2;->this$0:Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;

    .line 4
    invoke-virtual {v3}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 5
    invoke-virtual {v3}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->getSubscribe()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v3, p1}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->setSubscribe(Z)V

    .line 6
    invoke-virtual {v3}, Lcom/join/kotlin/discount/model/bean/GameServerInfoBean;->getSubscribe()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string/jumbo p1, "\u8ba2\u9605\u6210\u529f"

    goto :goto_1

    :cond_1
    const-string/jumbo p1, "\u53d6\u6d88\u8ba2\u9605\u6210\u529f"

    :goto_1
    invoke-static {p1}, Lcom/papa91/arc/ext/ToastManager;->show(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {v1}, Lcom/join/kotlin/discount/GameDetailServerBookDialogActivity;->getMAdapter()Lcom/join/kotlin/discount/adapter/GameDetailServerBookAdapter;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void

    :cond_2
    move v2, v4

    goto :goto_0

    :cond_3
    return-void
.end method
