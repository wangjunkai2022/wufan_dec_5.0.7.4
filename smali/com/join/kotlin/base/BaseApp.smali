.class public Lcom/join/kotlin/base/BaseApp;
.super Lcom/join/mgps/va/overmind/VApp;
.source "BaseApp.kt"

# interfaces
.implements Landroidx/lifecycle/ViewModelStoreOwner;


# instance fields
.field private mAppViewModelStore:Landroidx/lifecycle/ViewModelStore;

.field private mFactory:Landroidx/lifecycle/ViewModelProvider$Factory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/va/overmind/VApp;-><init>()V

    return-void
.end method

.method private final getAppFactory()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/BaseApp;->mFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;->Companion:Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;->getInstance(Landroid/app/Application;)Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/base/BaseApp;->mFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/kotlin/base/BaseApp;->mFactory:Landroidx/lifecycle/ViewModelProvider$Factory;

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.ViewModelProvider.Factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getAppViewModelProvider()Landroidx/lifecycle/ViewModelProvider;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    invoke-direct {p0}, Lcom/join/kotlin/base/BaseApp;->getAppFactory()Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/ViewModelStore;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/BaseApp;->mAppViewModelStore:Landroidx/lifecycle/ViewModelStore;

    if-nez v0, :cond_0

    const-string v0, "mAppViewModelStore"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/va/overmind/VApp;->onCreate()V

    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelStore;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelStore;-><init>()V

    iput-object v0, p0, Lcom/join/kotlin/base/BaseApp;->mAppViewModelStore:Landroidx/lifecycle/ViewModelStore;

    .line 3
    invoke-static {}, Lcom/kingja/loadsir/core/c;->b()Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/join/kotlin/base/widget/loadCallBack/LoadingCallback;

    invoke-direct {v1}, Lcom/join/kotlin/base/widget/loadCallBack/LoadingCallback;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/c$b;->a(Lcom/kingja/loadsir/callback/Callback;)Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/join/kotlin/base/widget/loadCallBack/ErrorCallback;

    invoke-direct {v1}, Lcom/join/kotlin/base/widget/loadCallBack/ErrorCallback;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/c$b;->a(Lcom/kingja/loadsir/callback/Callback;)Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    .line 6
    new-instance v1, Lcom/join/kotlin/base/widget/loadCallBack/EmptyCallback;

    invoke-direct {v1}, Lcom/join/kotlin/base/widget/loadCallBack/EmptyCallback;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/c$b;->a(Lcom/kingja/loadsir/callback/Callback;)Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    .line 7
    new-instance v1, Lcom/join/kotlin/quark/loadCallBack/EmptyQuarkSourceCallback;

    invoke-direct {v1}, Lcom/join/kotlin/quark/loadCallBack/EmptyQuarkSourceCallback;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/c$b;->a(Lcom/kingja/loadsir/callback/Callback;)Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    const-class v1, Lcom/kingja/loadsir/callback/SuccessCallback;

    .line 8
    invoke-virtual {v0, v1}, Lcom/kingja/loadsir/core/c$b;->h(Ljava/lang/Class;)Lcom/kingja/loadsir/core/c$b;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/kingja/loadsir/core/c$b;->d()V

    return-void
.end method
