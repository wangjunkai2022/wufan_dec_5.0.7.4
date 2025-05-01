.class public abstract Lcom/join/kotlin/ui/base/BasViewModleActivity;
.super Lcom/BaseAppCompatActivity;
.source "BasViewModleActivity.kt"


# instance fields
.field private dataBindingx:Landroidx/databinding/ViewDataBinding;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final mActivityProvider$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mApplicationProvider$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/base/BasViewModleActivity$mActivityProvider$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity$mActivityProvider$2;-><init>(Lcom/join/kotlin/ui/base/BasViewModleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->mActivityProvider$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/base/BasViewModleActivity$mApplicationProvider$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity$mApplicationProvider$2;-><init>(Lcom/join/kotlin/ui/base/BasViewModleActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->mApplicationProvider$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getMActivityProvider()Landroidx/lifecycle/ViewModelProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->mActivityProvider$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/ViewModelProvider;

    return-object v0
.end method

.method private final getMApplicationProvider()Landroidx/lifecycle/ViewModelProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->mApplicationProvider$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/ViewModelProvider;

    return-object v0
.end method


# virtual methods
.method protected getActivityScopeViewModel(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->getMActivityProvider()Landroidx/lifecycle/ViewModelProvider;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method

.method protected getApplicationScopeViewModel(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->getMApplicationProvider()Landroidx/lifecycle/ViewModelProvider;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method

.method public abstract getDataBindingConfig()Lcom/join/kotlin/ui/base/DataBindingConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getDataBindingx()Landroidx/databinding/ViewDataBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->dataBindingx:Landroidx/databinding/ViewDataBinding;

    return-object v0
.end method

.method protected final getViewBinding()Landroidx/databinding/ViewDataBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->dataBindingx:Landroidx/databinding/ViewDataBinding;

    return-object v0
.end method

.method public abstract initViewModel()V
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->initViewModel()V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/base/BasViewModleActivity;->getDataBindingConfig()Lcom/join/kotlin/ui/base/DataBindingConfig;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/DataBindingConfig;->getLayout()I

    move-result v0

    invoke-static {p0, v0}, Landroidx/databinding/DataBindingUtil;->setContentView(Landroid/app/Activity;I)Landroidx/databinding/ViewDataBinding;

    move-result-object v0

    .line 5
    iput-object v0, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->dataBindingx:Landroidx/databinding/ViewDataBinding;

    .line 6
    invoke-virtual {v0, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 7
    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/DataBindingConfig;->getVmVariableId()I

    move-result v1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/DataBindingConfig;->getStateViewModle()Landroidx/lifecycle/ViewModel;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 8
    invoke-virtual {p1}, Lcom/join/kotlin/ui/base/DataBindingConfig;->getBindingParms()Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ltz v2, :cond_0

    .line 11
    :goto_0
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setDataBindingx(Landroidx/databinding/ViewDataBinding;)V
    .locals 0
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/base/BasViewModleActivity;->dataBindingx:Landroidx/databinding/ViewDataBinding;

    return-void
.end method
