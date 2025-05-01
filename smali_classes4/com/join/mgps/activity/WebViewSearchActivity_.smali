.class public final Lcom/join/mgps/activity/WebViewSearchActivity_;
.super Lcom/join/mgps/activity/WebViewSearchActivity;
.source "WebViewSearchActivity_.java"

# interfaces
.implements Ly3/a;
.implements La4/a;
.implements La4/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/WebViewSearchActivity_$z;
    }
.end annotation


# static fields
.field public static final Q:Ljava/lang/String; = "url"

.field public static final R:Ljava/lang/String; = "downloadTask"


# instance fields
.field private final O:La4/c;

.field private final P:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;-><init>()V

    .line 2
    new-instance v0, La4/c;

    invoke-direct {v0}, La4/c;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->O:La4/c;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->P:Ljava/util/Map;

    return-void
.end method

.method static synthetic J0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->showLoading()V

    return-void
.end method

.method static synthetic K0(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/activity/WebViewSearchActivity;->receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    return-void
.end method

.method static synthetic L0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->G0()V

    return-void
.end method

.method static synthetic M0(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic N0(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method static synthetic O0(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->n0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic P0(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->m0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Q0(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->l0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic R0(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->o0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic S0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->checkDownlodingNumber()V

    return-void
.end method

.method static synthetic T0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->getdownloadTask()V

    return-void
.end method

.method static synthetic U0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->F0()V

    return-void
.end method

.method static synthetic V0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->E0()V

    return-void
.end method

.method static synthetic W0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->p0()V

    return-void
.end method

.method static synthetic X0(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->H0()V

    return-void
.end method

.method static synthetic Y0(Lcom/join/mgps/activity/WebViewSearchActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->updateLine(I)V

    return-void
.end method

.method static synthetic Z0(Lcom/join/mgps/activity/WebViewSearchActivity_;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->updateDownloadingPoint(I)V

    return-void
.end method

.method static synthetic a1(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->updateNoOpenPoint()V

    return-void
.end method

.method static synthetic b1(Lcom/join/mgps/activity/WebViewSearchActivity_;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->updateHidePoint()V

    return-void
.end method

.method public static c1(Landroid/content/Context;)Lcom/join/mgps/activity/WebViewSearchActivity_$z;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$z;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static d1(Landroidx/fragment/app/Fragment;)Lcom/join/mgps/activity/WebViewSearchActivity_$z;
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$z;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$z;-><init>(Landroidx/fragment/app/Fragment;)V

    return-object v0
.end method

.method private init_(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/join/mgps/pref/PrefDef_;

    invoke-direct {p1, p0}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->i:Lcom/join/mgps/pref/PrefDef_;

    .line 2
    invoke-static {p0}, La4/c;->b(La4/b;)V

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/activity/WebViewSearchActivity_;->injectExtras_()V

    return-void
.end method

.method private injectExtras_()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "url"

    .line 2
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->t:Ljava/lang/String;

    :cond_0
    const-string v1, "downloadTask"

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->u:Lcom/github/snowdream/android/app/downloader/DownloadTask;

    :cond_1
    return-void
.end method


# virtual methods
.method E0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$a;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method F0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$y;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$y;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method G0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$x;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$x;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method H0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$c;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$c;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method checkDownlodingNumber()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/WebViewSearchActivity_$p;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/WebViewSearchActivity_$p;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public getBean(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->P:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method getdownloadTask()V
    .locals 7

    .line 1
    new-instance v6, Lcom/join/mgps/activity/WebViewSearchActivity_$q;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/WebViewSearchActivity_$q;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;)V

    invoke-static {v6}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public internalFindViewById(I)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method l0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/WebViewSearchActivity_$n;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/WebViewSearchActivity_$n;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method m0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/WebViewSearchActivity_$m;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/WebViewSearchActivity_$m;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method n0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/WebViewSearchActivity_$l;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/WebViewSearchActivity_$l;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method o0(Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v7, Lcom/join/mgps/activity/WebViewSearchActivity_$o;

    const-string v2, ""

    const-wide/16 v3, 0x0

    const-string v5, ""

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/join/mgps/activity/WebViewSearchActivity_$o;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Lorg/androidannotations/api/a;->l(Lorg/androidannotations/api/a$c;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->O:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    move-result-object v0

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_;->init_(Landroid/os/Bundle;)V

    .line 3
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    invoke-static {v0}, La4/c;->c(La4/c;)La4/c;

    const p1, 0x7f0c00ab

    .line 5
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_;->setContentView(I)V

    return-void
.end method

.method public onViewChanged(La4/a;)V
    .locals 1

    const v0, 0x7f0901d9

    .line 1
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flipboard/bottomsheet/BottomSheetLayout;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->e:Lcom/flipboard/bottomsheet/BottomSheetLayout;

    const v0, 0x7f09032d

    .line 2
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->f:Landroid/view/View;

    const v0, 0x7f090878

    .line 3
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f090479

    .line 4
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->h:Landroid/view/View;

    const v0, 0x7f091803

    .line 5
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/customview/LJWebView;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->j:Lcom/join/mgps/customview/LJWebView;

    const v0, 0x7f090c1d

    .line 6
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->k:Landroid/view/View;

    const v0, 0x7f090c24

    .line 7
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->l:Landroid/view/View;

    const v0, 0x7f091035

    .line 8
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->m:Landroid/view/View;

    const v0, 0x7f090ef0

    .line 9
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->n:Landroid/view/View;

    const v0, 0x7f091036

    .line 10
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->o:Landroid/widget/ImageView;

    const v0, 0x7f090ef1

    .line 11
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->p:Landroid/widget/ImageView;

    const v0, 0x7f0910f5

    .line 12
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->q:Landroid/view/View;

    const v0, 0x7f0912d3

    .line 13
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->r:Landroid/view/View;

    const v0, 0x7f091456

    .line 14
    invoke-interface {p1, v0}, La4/a;->internalFindViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->s:Landroid/widget/TextView;

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->m:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 16
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$k;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->n:Landroid/view/View;

    if-eqz p1, :cond_1

    .line 18
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$r;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$r;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->q:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 20
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$s;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$s;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->k:Landroid/view/View;

    if-eqz p1, :cond_3

    .line 22
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$t;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$t;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->r:Landroid/view/View;

    if-eqz p1, :cond_4

    .line 24
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$u;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$u;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity;->f:Landroid/view/View;

    if-eqz p1, :cond_5

    .line 26
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$v;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$v;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 27
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/WebViewSearchActivity;->afterViews()V

    return-void
.end method

.method p0()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$b;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public putBean(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->P:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method receiveDelete(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$j;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_$j;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method receiveStart(Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$h;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/activity/WebViewSearchActivity_$h;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method receiveSuccess(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$i;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_$i;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity;->setContentView(I)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 5
    invoke-super {p0, p1}, Lcom/BaseFragmentActivity;->setContentView(Landroid/view/View;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/WebViewSearchActivity_;->O:La4/c;

    invoke-virtual {p1, p0}, La4/c;->a(La4/a;)V

    return-void
.end method

.method public setIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/WebViewSearchActivity_;->injectExtras_()V

    return-void
.end method

.method public showLoading()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$w;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$w;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateDownloadingPoint(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$e;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_$e;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateHidePoint()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$g;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateLine(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/WebViewSearchActivity_$d;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;I)V

    const-string p1, ""

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method

.method updateNoOpenPoint()V
    .locals 4

    .line 1
    new-instance v0, Lcom/join/mgps/activity/WebViewSearchActivity_$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/WebViewSearchActivity_$f;-><init>(Lcom/join/mgps/activity/WebViewSearchActivity_;)V

    const-string v1, ""

    const-wide/16 v2, 0x0

    invoke-static {v1, v0, v2, v3}, Lorg/androidannotations/api/b;->e(Ljava/lang/String;Ljava/lang/Runnable;J)V

    return-void
.end method
