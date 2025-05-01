.class public abstract Lcom/join/kotlin/base/fragment/BaseVmFragment;
.super Landroidx/fragment/app/Fragment;
.source "BaseVmFragment.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Lcom/join/kotlin/base/viewmodel/BaseViewModel;",
        ">",
        "Landroidx/fragment/app/Fragment;"
    }
.end annotation


# instance fields
.field private final handler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isFirst:Z

.field public mActivity:Landroidx/appcompat/app/AppCompatActivity;

.field public mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVM;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    .line 2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->handler:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->isFirst:Z

    return-void
.end method

.method public static synthetic V(Lcom/join/kotlin/base/fragment/BaseVmFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->onVisible$lambda$0(Lcom/join/kotlin/base/fragment/BaseVmFragment;)V

    return-void
.end method

.method private final createViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TVM;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    invoke-static {p0}, Lcom/join/kotlin/base/ext/GetViewModelExtKt;->getVmClazz(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    return-object v0
.end method

.method private final init(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->createViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->setMViewModel(Lcom/join/kotlin/base/viewmodel/BaseViewModel;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->initView(Landroid/os/Bundle;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->createObserver()V

    return-void
.end method

.method private final onVisible()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->isFirst:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/join/kotlin/base/fragment/a;

    invoke-direct {v1, p0}, Lcom/join/kotlin/base/fragment/a;-><init>(Lcom/join/kotlin/base/fragment/BaseVmFragment;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->lazyLoadTime()J

    move-result-wide v2

    .line 4
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private static final onVisible$lambda$0(Lcom/join/kotlin/base/fragment/BaseVmFragment;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->lazyLoadData()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->isFirst:Z

    return-void
.end method

.method private final registorDefUIChange()V
    .locals 0

    return-void
.end method

.method public static synthetic showLoading$default(Lcom/join/kotlin/base/fragment/BaseVmFragment;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string/jumbo p1, "\u8bf7\u6c42\u7f51\u7edc\u4e2d..."

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->showLoading(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoading"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method protected final varargs addLoadingObserve([Lcom/join/kotlin/base/viewmodel/BaseViewModel;)V
    .locals 1
    .param p1    # [Lcom/join/kotlin/base/viewmodel/BaseViewModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string/jumbo v0, "viewModels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract createObserver()V
.end method

.method public abstract dismissLoading()V
.end method

.method public final getMActivity()Landroidx/appcompat/app/AppCompatActivity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->mActivity:Landroidx/appcompat/app/AppCompatActivity;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mActivity"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TVM;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mViewModel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initData()V
    .locals 0

    return-void
.end method

.method public abstract initView(Landroid/os/Bundle;)V
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract layoutId()I
.end method

.method public abstract lazyLoadData()V
.end method

.method public lazyLoadTime()J
    .locals 2

    const-wide/16 v0, 0x12c

    return-wide v0
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    check-cast p1, Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->setMActivity(Landroidx/appcompat/app/AppCompatActivity;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->layoutId()I

    move-result p3

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public onResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->onVisible()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string/jumbo v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->isFirst:Z

    .line 3
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->createViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->setMViewModel(Lcom/join/kotlin/base/viewmodel/BaseViewModel;)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->initView(Landroid/os/Bundle;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->createObserver()V

    .line 6
    invoke-direct {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->registorDefUIChange()V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/base/fragment/BaseVmFragment;->initData()V

    return-void
.end method

.method public final setMActivity(Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 1
    .param p1    # Landroidx/appcompat/app/AppCompatActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->mActivity:Landroidx/appcompat/app/AppCompatActivity;

    return-void
.end method

.method public final setMViewModel(Lcom/join/kotlin/base/viewmodel/BaseViewModel;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/base/viewmodel/BaseViewModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TVM;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/base/fragment/BaseVmFragment;->mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    return-void
.end method

.method public abstract showLoading(Ljava/lang/String;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
