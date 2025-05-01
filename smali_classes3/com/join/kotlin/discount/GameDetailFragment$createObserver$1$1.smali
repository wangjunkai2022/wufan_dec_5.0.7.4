.class final Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;
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
        "Lcom/join/kotlin/base/state/ResultState<",
        "+",
        "Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/join/kotlin/base/state/ResultState;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->invoke(Lcom/join/kotlin/base/state/ResultState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/join/kotlin/base/state/ResultState;)V
    .locals 9
    .param p1    # Lcom/join/kotlin/base/state/ResultState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/kotlin/base/state/ResultState<",
            "Lcom/join/kotlin/discount/model/bean/GameDetailDataBean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-static {p1}, Lcom/join/kotlin/discount/GameDetailFragment;->access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailFragment;)Lcom/kingja/loadsir/core/b;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "loadSir"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showError$default(Lcom/kingja/loadsir/core/b;Ljava/lang/String;ILjava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->n:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string/jumbo v0, "\u6e38\u620f\u5df2\u4e0b\u67b6"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/base/fragment/BaseVmDbFragment;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;

    iget-object v0, v0, Lcom/join/android/app/mgsim/wufun/databinding/FragmentDiscountGameDetailV2Binding;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 7
    iget-object v2, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    new-instance v4, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;

    invoke-direct {v4, v2}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$1;-><init>(Lcom/join/kotlin/discount/GameDetailFragment;)V

    new-instance v5, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$2;

    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1;->this$0:Lcom/join/kotlin/discount/GameDetailFragment;

    invoke-direct {v5, v0}, Lcom/join/kotlin/discount/GameDetailFragment$createObserver$1$1$2;-><init>(Lcom/join/kotlin/discount/GameDetailFragment;)V

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lcom/join/kotlin/base/ext/BaseViewModelExtKt;->parseState$default(Lcom/join/kotlin/base/fragment/BaseVmFragment;Lcom/join/kotlin/base/state/ResultState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method
