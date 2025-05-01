.class public final Lcom/join/kotlin/quark/ShareSourceActivity;
.super Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;
.source "ShareSourceActivity.kt"

# interfaces
.implements Lcom/join/kotlin/quark/proxy/ShareSourceClickProxy;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity<",
        "Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ActivityShareSourceBinding;",
        ">;",
        "Lcom/join/kotlin/quark/proxy/ShareSourceClickProxy;"
    }
.end annotation


# instance fields
.field private sourceCallback:Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;-><init>()V

    return-void
.end method

.method private static final createObserver$lambda$5$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final createObserver$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/ShareSourceActivity;->createObserver$lambda$5$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic g0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/quark/ShareSourceActivity;->createObserver$lambda$5$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createObserver()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;

    .line 2
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;->getDiskUrl()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    new-instance v2, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$1;

    invoke-direct {v2, p0}, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$1;-><init>(Lcom/join/kotlin/quark/ShareSourceActivity;)V

    new-instance v3, Lcom/join/kotlin/quark/m;

    invoke-direct {v3, v2}, Lcom/join/kotlin/quark/m;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, p0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 3
    invoke-virtual {v0}, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;->getResultData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;

    invoke-direct {v1, p0}, Lcom/join/kotlin/quark/ShareSourceActivity$createObserver$1$2;-><init>(Lcom/join/kotlin/quark/ShareSourceActivity;)V

    new-instance v2, Lcom/join/kotlin/quark/n;

    invoke-direct {v2, v1}, Lcom/join/kotlin/quark/n;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final getSourceCallback()Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/ShareSourceActivity;->sourceCallback:Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;

    return-object v0
.end method

.method public initView(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/base/dialog/BaseDialogActivity;->callback:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    if-eqz p1, :cond_0

    .line 3
    instance-of v0, p1, Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;

    if-eqz v0, :cond_0

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IDialogShareSourceCallback"

    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;

    iput-object p1, p0, Lcom/join/kotlin/quark/ShareSourceActivity;->sourceCallback:Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "_wishPoolItem"

    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    instance-of v0, p1, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;

    check-cast p1, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;->setWishPoolItem(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityShareSourceBinding;

    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;

    invoke-virtual {p1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityShareSourceBinding;->h(Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDbDialogActivity;->getMDatabind()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityShareSourceBinding;

    invoke-virtual {p1, p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityShareSourceBinding;->g(Lcom/join/kotlin/quark/proxy/ShareSourceClickProxy;)V

    return-void
.end method

.method public onBackClick()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseDialogActivity;->finish()V

    return-void
.end method

.method protected onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseAppCompatActivity;->onResume()V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->q4(Landroid/content/Context;)V

    return-void
.end method

.method public onShareClick()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/BaseAppCompatActivity;->showLoading()V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmDialogActivity;->getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;

    .line 3
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getInstance_(this@ShareSourceActivity).uid"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/viewmodel/ShareSourceViewModel;->sourceAngel(Ljava/lang/String;)V

    return-void
.end method

.method public final setSourceCallback(Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/quark/ShareSourceActivity;->sourceCallback:Lcom/join/kotlin/quark/callback/IDialogShareSourceCallback;

    return-void
.end method
