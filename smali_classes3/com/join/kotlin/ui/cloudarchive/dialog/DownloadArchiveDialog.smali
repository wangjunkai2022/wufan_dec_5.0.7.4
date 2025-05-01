.class public final Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;
.super Landroidx/fragment/app/DialogFragment;
.source "DownloadArchiveDialog.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$UpdateLocalArchiveEvent;
    }
.end annotation


# instance fields
.field public dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

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
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$viewModle$2;

    invoke-direct {v0, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$viewModle$2;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic V(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->onCreateView$lambda$3(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic W(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->onCreateView$lambda$5(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic X(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->onCreateView$lambda$4(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/String;)V

    return-void
.end method

.method private static final onCreateView$lambda$3(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "observe progress="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static final onCreateView$lambda$4(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getProgressText()Landroidx/lifecycle/MutableLiveData;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "progressTextShow="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static final onCreateView$lambda$5(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/Integer;)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-direct {v1, v2, v3}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;-><init>(ILcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->reportDownloadArchive(Landroid/content/Context;Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getDownloadType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 8
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object v0

    new-instance v1, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$UpdateLocalArchiveEvent;

    invoke-direct {v1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$UpdateLocalArchiveEvent;-><init>()V

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    goto :goto_1

    .line 10
    :cond_3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p0

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object p0

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 11
    :goto_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onstatus status="

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final downLoadArchive()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "activity!!.getExternalFilesDir(\"\")!!.absolutePath"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Download/cloudarchive/"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getCloud_archive_local_path()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v3, v0

    check-cast v3, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getCloud_archive_local_path()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v4, v0

    check-cast v4, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getDownloadType()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 8
    invoke-virtual/range {v2 .. v7}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->downloadArchive(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;Ljava/lang/String;ILandroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public final getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "dataBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->viewModle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;

    .line 3
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    const/4 v2, 0x6

    .line 4
    invoke-direct {v0, v2, v1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveDownEvent;-><init>(ILcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->cancleDownloadTask(Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;)V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

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

    const p3, 0x7f0c0213

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, p3, p2, v0}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    const-string p2, "inflate(\n            inf\u2026          false\n        )"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    invoke-virtual {p0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/databinding/ViewDataBinding;->setLifecycleOwner(Landroidx/lifecycle/LifecycleOwner;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    move-result-object p1

    const/16 p2, 0x22

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    move-result-object p1

    const/4 p2, 0x7

    invoke-virtual {p1, p2, p0}, Landroidx/databinding/ViewDataBinding;->setVariable(ILjava/lang/Object;)Z

    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    const-string p3, "archive"

    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ArchiveData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    invoke-virtual {p2, p3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getDownloadType()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    const-string p3, "downloadType"

    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getCloud_archive_local_path()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    const-string p3, "cloud_archive_local_path"

    .line 10
    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/join/kotlin/ui/cloudarchive/data/ModGameArchivePathData;

    .line 11
    invoke-virtual {p2, p3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object p2

    const-string p3, "installInExtPlug"

    invoke-virtual {p1, p3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p2, p1}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->setInstallInExtPlug(Z)V

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    if-eqz p1, :cond_4

    .line 14
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object p1

    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->getGame_id()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    if-eqz p1, :cond_4

    const-string p2, "dowloadTask"

    .line 15
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/kotlin/ui/cloudarchive/data/ArchiveData;->setPackageName(Ljava/lang/String;)V

    .line 17
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->getProgress()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/a;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/a;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;)V

    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 18
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->getProgressTextShow()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/c;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/c;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;)V

    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 19
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getViewModle()Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/DownloadArchivDialogeViewModle;->getRequest()Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->getStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object p1

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/b;

    invoke-direct {p2, p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/b;-><init>(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;)V

    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance p2, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$onCreateView$6;

    invoke-direct {p2}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog$onCreateView$6;-><init>()V

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 21
    :cond_5
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->downLoadArchive()V

    .line 22
    invoke-virtual {p0}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->getDataBinding()Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final setDataBinding(Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;)V
    .locals 1
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->dataBinding:Lcom/join/android/app/mgsim/wufun/databinding/DownloadArchiveDialogBinding;

    return-void
.end method
