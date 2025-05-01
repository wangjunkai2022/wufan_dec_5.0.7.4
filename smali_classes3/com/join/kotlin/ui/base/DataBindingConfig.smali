.class public final Lcom/join/kotlin/ui/base/DataBindingConfig;
.super Ljava/lang/Object;
.source "DataBindingConfig.kt"


# instance fields
.field private bindingParms:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final layout:I

.field private final stateViewModle:Landroidx/lifecycle/ViewModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final vmVariableId:I


# direct methods
.method public constructor <init>(IILandroidx/lifecycle/ViewModel;)V
    .locals 1
    .param p3    # Landroidx/lifecycle/ViewModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "stateViewModle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->layout:I

    iput p2, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->vmVariableId:I

    iput-object p3, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->stateViewModle:Landroidx/lifecycle/ViewModel;

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->bindingParms:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public final addBindingParam(ILjava/lang/Object;)Lcom/join/kotlin/ui/base/DataBindingConfig;
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "any"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->bindingParms:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->bindingParms:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public final getBindingParms()Landroid/util/SparseArray;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->bindingParms:Landroid/util/SparseArray;

    return-object v0
.end method

.method public final getLayout()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->layout:I

    return v0
.end method

.method public final getStateViewModle()Landroidx/lifecycle/ViewModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->stateViewModle:Landroidx/lifecycle/ViewModel;

    return-object v0
.end method

.method public final getVmVariableId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->vmVariableId:I

    return v0
.end method

.method public final setBindingParms(Landroid/util/SparseArray;)V
    .locals 1
    .param p1    # Landroid/util/SparseArray;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/base/DataBindingConfig;->bindingParms:Landroid/util/SparseArray;

    return-void
.end method
