.class public abstract Lcom/join/kotlin/base/activity/BaseVmActivity;
.super Lcom/join/kotlin/base/activity/BaseDownloadActivity;
.source "BaseVmActivity.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "Lcom/join/kotlin/base/viewmodel/BaseViewModel;",
        ">",
        "Lcom/join/kotlin/base/activity/BaseDownloadActivity;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseVmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n*L\n1#1,60:1\n29#2,6:61\n*S KotlinDebug\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n*L\n28#1:61,6\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseVmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n+ 2 CommonExt.kt\ncom/join/kotlin/base/utils/CommonExtKt\n*L\n1#1,60:1\n29#2,6:61\n*S KotlinDebug\n*F\n+ 1 BaseVmActivity.kt\ncom/join/kotlin/base/activity/BaseVmActivity\n*L\n28#1:61,6\n*E\n"
    }
.end annotation


# instance fields
.field public mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TVM;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseDownloadActivity;-><init>()V

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
    invoke-direct {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->createViewModel()Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->setMViewModel(Lcom/join/kotlin/base/viewmodel/BaseViewModel;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->initView(Landroid/os/Bundle;)V

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->createObserver()V

    return-void
.end method

.method public static synthetic showLoading$default(Lcom/join/kotlin/base/activity/BaseVmActivity;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string/jumbo p1, "\u8bf7\u6c42\u7f51\u7edc\u4e2d..."

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->showLoading(Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoading"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract createObserver()V
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
    iget-object v0, p0, Lcom/join/kotlin/base/activity/BaseVmActivity;->mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mViewModel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initDataBind()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract initView(Landroid/os/Bundle;)V
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract layoutId()I
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/join/kotlin/base/activity/BaseDownloadActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->initDataBind()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0, v0}, Lcom/BaseAppCompatActivity;->setContentView(Landroid/view/View;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/base/activity/BaseVmActivity;->layoutId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/BaseAppCompatActivity;->setContentView(I)V

    .line 5
    :goto_0
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/activity/BaseVmActivity;->init(Landroid/os/Bundle;)V

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
    iput-object p1, p0, Lcom/join/kotlin/base/activity/BaseVmActivity;->mViewModel:Lcom/join/kotlin/base/viewmodel/BaseViewModel;

    return-void
.end method

.method public final showLoading(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
