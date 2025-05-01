.class public final Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;
.super Lcom/BaseAppCompatActivity;
.source "VASingleGameIndexActivity.kt"

# interfaces
.implements Lcom/join/kotlin/domain/common/LoadBindClickProxy;


# instance fields
.field private final dataBinding$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final viewModle$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$dataBinding$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->dataBinding$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$viewModle$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->viewModle$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic f0(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->onCreate$lambda$1(Ljava/lang/Integer;)V

    return-void
.end method

.method private static final onCreate$lambda$1(Ljava/lang/Integer;)V
    .locals 2

    if-nez p0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    :goto_0
    const/4 v0, 0x2

    if-nez p0, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v0, :cond_3

    :goto_1
    if-nez p0, :cond_2

    goto :goto_2

    .line 3
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->dataBinding$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-dataBinding>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    return-object v0
.end method

.method public onClickReload()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;->loadDatas(Landroid/content/Context;)V

    return-void
.end method

.method public onClickSetNetWork()V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object p1

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$onCreate$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity$onCreate$1;-><init>(Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;)V

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;->setListener(Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle$Listener;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object v0

    const/16 v1, 0x22

    invoke-virtual {p1, v1, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ActivityVasingleGameIndexBinding;

    move-result-object p1

    const/16 v0, 0x15

    invoke-virtual {p1, v0, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "gameId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;->initDatas(Ljava/lang/String;)V

    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;->loadDatas(Landroid/content/Context;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameIndexActivity;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/VASingleGameViewModle;->getShowStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    sget-object v0, Lcom/join/kotlin/ui/cloudarchive/w;->a:Lcom/join/kotlin/ui/cloudarchive/w;

    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method
