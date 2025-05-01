.class final Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailFragment;->createObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$3;->invoke(Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;)V
    .locals 3
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getShowAvgDuration()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getAvg_duration()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    xor-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$3;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;

    invoke-virtual {v0}, Lcom/join/kotlin/discount/viewmodel/GameDetailFragmentViewModel;->getGoodRate()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/CommentStatisticDataBean;->getGood_rate()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    const-string p1, "100%"

    :cond_4
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
