.class public final Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "CommentArchiveDialog.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

.field private dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final viewModle$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/DialogFragment;-><init>()V

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$viewModle$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    .line 3
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    const-string/jumbo v2, "\u63d0\u793a"

    const-string/jumbo v3, "\u8bf7\u8bc4\u4ef7\u4e00\u4e0b\u4f60\u521a\u624d\u73a9\u7684\u4e91\u5b58\u6863\u5427\uff5e"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x1c

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    return-void
.end method


# virtual methods
.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getDialogData()Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
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
    const v0, 0x7f091033

    if-nez p1, :cond_1

    goto :goto_1

    .line 2
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$1;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$1;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/domain/ext/EXTKt;->checkHasLogin(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_2
    :goto_1
    const v0, 0x7f091723

    if-nez p1, :cond_3

    goto :goto_2

    .line 4
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_4

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/domain/ext/EXTKt;->checkHasLogin(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_4
    :goto_2
    const v0, 0x7f090f79

    if-nez p1, :cond_5

    goto :goto_3

    .line 6
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_6

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$3;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onClick$3;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;)V

    invoke-static {p1, v0}, Lcom/join/kotlin/domain/ext/EXTKt;->checkHasLogin(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    :cond_6
    :goto_3
    const v0, 0x7f090335

    if-nez p1, :cond_7

    goto :goto_4

    .line 8
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_8

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    :cond_8
    :goto_4
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
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

    const p3, 0x7f0c063b

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(\n            inf\u2026          false\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    move-result-object p1

    const/16 p2, 0x22

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    move-result-object p1

    const/4 p2, 0x7

    invoke-virtual {p1, p2, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onCreateView$1;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog$onCreateView$1;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;)V

    invoke-virtual {p1, p2}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->setClickCommentDialogListener(Lkotlin/jvm/functions/Function1;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->getDialogData()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    const-string p3, "archive"

    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 10
    :cond_1
    invoke-static {}, Lb2/g;->t()Lb2/g;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DelArchiveDialogViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getId()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    move-object p2, p3

    :goto_0
    invoke-virtual {p1, p2}, Lb2/g;->p(Ljava/lang/String;)Lcom/join/mgps/db/tables/CloudArchiveTable;

    move-result-object p1

    if-eqz p1, :cond_3

    const/4 p2, 0x3

    .line 11
    invoke-virtual {p1, p2}, Lcom/join/mgps/db/tables/CloudArchiveTable;->setIsFirstRun(I)V

    .line 12
    invoke-static {}, Lb2/g;->t()Lb2/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/b;->update(Ljava/lang/Object;)I

    .line 13
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    .line 14
    sget-object v0, Lcom/papa/sim/statistic/Event;->exitGamePopupWin:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/join/mgps/db/tables/CloudArchiveTable;->getGameId()Ljava/lang/String;

    move-result-object p3

    :cond_4
    invoke-virtual {v1, p3}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 15
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

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

.method public final setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/ModCommentlArchiveDialogBinding;

    return-void
.end method

.method public final setDatas(Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "dialogData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

    return-void
.end method

.method public final setDialogData(Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/CommentArchiveDialog;->dialogData:Lcom/join/kotlin/ui/cloudarchive/dialog/DialogData;

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
