.class final Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CreateSourceHopeActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2;->invoke(Lcom/join/kotlin/base/net/stateCallback/ListDataUiState;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/CreateSourceHopeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/quark/CreateSourceHopeActivity$createObserver$1$2$1;->this$0:Lcom/join/kotlin/quark/CreateSourceHopeActivity;

    invoke-virtual {v0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityCreateSourceHopeBinding;->j:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setNoMore()V

    return-void
.end method
