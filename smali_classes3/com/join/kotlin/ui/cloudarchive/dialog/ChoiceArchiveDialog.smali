.class public final Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "ChoiceArchiveDialog.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nChoiceArchiveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1855#2,2:111\n*S KotlinDebug\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n*L\n46#1:111,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nChoiceArchiveDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1855#2,2:111\n*S KotlinDebug\n*F\n+ 1 ChoiceArchiveDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog\n*L\n46#1:111,2\n*E\n"
    }
.end annotation


# instance fields
.field private final adapter$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private choicedFun:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

.field private final viewModle$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$viewModle$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$adapter$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$adapter$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->adapter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getChoicedFun$p(Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->choicedFun:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public final getAdapter()Lcom/join/kotlin/ui/cloudarchive/adapter/ModChoiceArchiveAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->adapter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/adapter/ModChoiceArchiveAdapter;

    return-object v0
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const v0, 0x7f090335

    if-nez p1, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_2

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 4
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8
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

    const p3, 0x7f0c0639

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(\n            inf\u2026          false\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p3

    const-string v1, "archive"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p3, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object p3

    invoke-virtual {p3}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;->getArchiveList()Landroidx/lifecycle/MutableLiveData;

    move-result-object p3

    const-string v1, "archiveList"

    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableList<com.join.kotlin.ui.cloudarchive.data.ArchiveData>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 6
    invoke-virtual {p3, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;->getArchiveList()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    const-string/jumbo p3, "value"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 9
    invoke-virtual {p3}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getArchiveDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getArchiveDesc()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 10
    invoke-virtual {p3, p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setCheckStatus(I)V

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p3, v0}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setCheckStatus(I)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 13
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    move-result-object p1

    const/16 p3, 0x22

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object v0

    invoke-virtual {p1, p3, v0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 14
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    move-result-object p1

    const/4 p3, 0x7

    invoke-virtual {p1, p3, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getAdapter()Lcom/join/kotlin/ui/cloudarchive/adapter/ModChoiceArchiveAdapter;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getAdapter()Lcom/join/kotlin/ui/cloudarchive/adapter/ModChoiceArchiveAdapter;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$onCreateView$2;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog$onCreateView$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;)V

    invoke-virtual {p1, p2}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->setOnItemClickListener(Lkotlin/jvm/functions/Function3;)V

    .line 17
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialogViewModle;->getDialogData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const-string/jumbo v1, "\u8bf7\u9009\u62e9\u5b58\u6863"

    const-string v2, ""

    move-object v0, p2

    invoke-direct/range {v0 .. v7}, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    return-object p1
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

    return-void
.end method

.method public final setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModChoiceArchiveDialogBinding;

    return-void
.end method

.method public final setItemChoiced(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "func"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/ChoiceArchiveDialog;->choicedFun:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/FragmentManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "manager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
