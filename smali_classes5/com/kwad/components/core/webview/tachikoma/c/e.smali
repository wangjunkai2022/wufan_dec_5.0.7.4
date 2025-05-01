.class public Lcom/kwad/components/core/webview/tachikoma/c/e;
.super Lcom/kwad/components/core/proxy/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/tachikoma/c/e$a;,
        Lcom/kwad/components/core/webview/tachikoma/c/e$b;
    }
.end annotation


# instance fields
.field public Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

.field protected Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field protected abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

.field protected abm:Lcom/kwad/sdk/components/k;

.field protected abn:Lcom/kwad/components/core/webview/tachikoma/k;

.field public abo:Z

.field public abp:Lcom/kwad/components/core/webview/tachikoma/c/e$a;

.field private abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

.field private abv:Lcom/kwad/components/core/webview/tachikoma/c/d;

.field private abw:Lcom/kwad/sdk/widget/KSFrameLayout;

.field protected abx:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/DialogInterface$OnDismissListener;",
            ">;"
        }
    .end annotation
.end field

.field public aby:Z

.field public mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field private mPresenter:Lcom/kwad/sdk/mvp/Presenter;

.field public xo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/proxy/g;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abx:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->aby:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/tachikoma/c/e;)Lcom/kwad/components/core/webview/tachikoma/c/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abv:Lcom/kwad/components/core/webview/tachikoma/c/d;

    return-object p0
.end method

.method private af()Lcom/kwad/sdk/mvp/Presenter;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/mvp/Presenter;

    invoke-direct {v0}, Lcom/kwad/sdk/mvp/Presenter;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v1, v1, Lcom/kwad/components/core/webview/tachikoma/c/b;->abn:Lcom/kwad/components/core/webview/tachikoma/k;

    if-eqz v1, :cond_0

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->tA()Lcom/kwad/components/core/webview/tachikoma/c/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->jm()Lcom/kwad/components/core/webview/tachikoma/c/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    return-object v0
.end method

.method public static b(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/core/webview/tachikoma/c/e;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/e;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/c/e;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->hl()Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->getTemplateId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->xo:Ljava/lang/String;

    .line 4
    invoke-static {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->c(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abo:Z

    .line 5
    invoke-static {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->d(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->aby:Z

    .line 6
    invoke-static {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->e(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    .line 7
    invoke-static {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->f(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/sdk/components/k;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abm:Lcom/kwad/sdk/components/k;

    .line 8
    invoke-static {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->g(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/core/webview/tachikoma/k;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abn:Lcom/kwad/components/core/webview/tachikoma/k;

    .line 9
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 10
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->getTemplateId()Ljava/lang/String;

    move-result-object p0

    const-string v2, "templateId"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0, v1}, Landroid/app/DialogFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static b(Landroid/app/Activity;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object p0

    iget p0, p0, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 v1, 0x400

    and-int/2addr p0, v1

    if-ne p0, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method

.method private tA()Lcom/kwad/components/core/webview/tachikoma/c/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abv:Lcom/kwad/components/core/webview/tachikoma/c/d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/d;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/c/d;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abv:Lcom/kwad/components/core/webview/tachikoma/c/d;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abv:Lcom/kwad/components/core/webview/tachikoma/c/d;

    return-object v0
.end method

.method private z(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->jl()Lcom/kwad/components/core/webview/tachikoma/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->jn()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    if-nez v0, :cond_1

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->af()Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 6
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/mvp/Presenter;->G(Landroid/view/View;)V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/mvp/Presenter;->k(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    if-nez v0, :cond_0

    .line 4
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_video_tk_dialog_layout:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    return-object p1
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/e/d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

    return-void
.end method

.method public final d(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abx:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final e(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abx:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method protected jl()Lcom/kwad/components/core/webview/tachikoma/c/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/c/b;-><init>()V

    return-object v0
.end method

.method protected jm()Lcom/kwad/components/core/webview/tachikoma/c/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/c;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/c/c;-><init>()V

    return-object v0
.end method

.method protected jn()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/b;->d(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->mActivity:Landroid/app/Activity;

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iput-object p0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Zt:Lcom/kwad/components/core/webview/tachikoma/c/e;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abl:Lcom/kwad/sdk/widget/e;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->xo:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->xo:Ljava/lang/String;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    .line 7
    iget-boolean v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abo:Z

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abo:Z

    .line 8
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abm:Lcom/kwad/sdk/components/k;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    .line 9
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abn:Lcom/kwad/components/core/webview/tachikoma/k;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abn:Lcom/kwad/components/core/webview/tachikoma/k;

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abp:Lcom/kwad/components/core/webview/tachikoma/c/e$a;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abp:Lcom/kwad/components/core/webview/tachikoma/c/e$a;

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    iput-object v1, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    .line 4
    :cond_1
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    const/4 v1, -0x1

    .line 6
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 7
    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 9
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 10
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 11
    invoke-virtual {p1, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 12
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 v0, 0x10

    .line 13
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 14
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getOwnerActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/core/webview/tachikoma/c/e;->b(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x400

    .line 15
    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    .line 16
    :cond_2
    :try_start_1
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abm:Lcom/kwad/sdk/components/k;

    invoke-interface {p1}, Lcom/kwad/sdk/components/k;->isHideNavigationBar()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 17
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 18
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "navigation_bar_height"

    const-string v1, "dimen"

    const-string v3, "android"

    .line 19
    invoke-virtual {p1, v0, v1, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_3

    .line 20
    invoke-virtual {p0}, Lcom/kwad/components/core/proxy/g;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    :cond_3
    if-lez v2, :cond_5

    .line 21
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_4

    const/16 p1, 0x1506

    goto :goto_1

    :cond_4
    const/16 p1, 0x507

    .line 22
    :goto_1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    .line 23
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 24
    :cond_5
    :goto_2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/e$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/tachikoma/c/e$1;-><init>(Lcom/kwad/components/core/webview/tachikoma/c/e;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "templateId"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->xo:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    .line 4
    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->mPresenter:Lcom/kwad/sdk/mvp/Presenter;

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/c/b;->release()V

    .line 7
    iput-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    :cond_1
    return-void
.end method

.method public onDestroyView()V
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroyView()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "destroy view failed:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TkDialogFragment"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abw:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

    if-eqz v0, :cond_1

    .line 8
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/e/d;->ga()V

    :cond_1
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/e/c;->ga()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abx:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    if-eqz v1, :cond_1

    .line 5
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abm:Lcom/kwad/sdk/components/k;

    if-eqz p1, :cond_3

    .line 7
    invoke-interface {p1}, Lcom/kwad/sdk/components/k;->callbackDialogDismiss()V

    :cond_3
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/DialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/tachikoma/c/e;->z(Landroid/view/View;)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->Tf:Lcom/kwad/components/core/webview/tachikoma/e/c;

    if-eqz p1, :cond_0

    .line 4
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/c;->fS()V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e;->abs:Lcom/kwad/components/core/webview/tachikoma/e/d;

    if-eqz p1, :cond_1

    .line 6
    invoke-interface {p1}, Lcom/kwad/components/core/webview/tachikoma/e/d;->fS()V

    :cond_1
    return-void
.end method
