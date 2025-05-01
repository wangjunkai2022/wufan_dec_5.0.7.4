.class public final Lcom/kwad/components/ad/interstitial/e/a/b;
.super Lcom/kwad/components/ad/interstitial/e/a/a;
.source "SourceFile"


# static fields
.field private static le:J = 0x190L


# instance fields
.field private df:Lcom/kwad/sdk/core/h/c;

.field private eg:Lcom/kwad/sdk/core/g/d;

.field private eh:Landroid/os/Vibrator;

.field private fD:Lcom/kwad/components/core/webview/jshandler/aw;

.field private final jP:Lcom/kwad/components/ad/interstitial/e/c$a;

.field private lc:Lcom/kwad/components/ad/h/a/a/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private ld:Landroid/widget/FrameLayout;

.field private lf:Z

.field private lg:Z

.field private lh:Lcom/kwad/components/core/webview/tachikoma/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lf:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$1;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$9;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$9;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->df:Lcom/kwad/sdk/core/h/c;

    return-void
.end method

.method static synthetic A(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic B(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic C(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic D(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic E(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic F(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic G(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic H(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic I(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic J(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic K(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic L(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic M(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic N(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic O(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic P(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic Q(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic R(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic S(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dK()V

    return-void
.end method

.method static synthetic T(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic U(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic V(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic W(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic X(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic Y(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic Z(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method private a(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/x;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 33
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/x;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    new-instance v2, Lcom/kwad/components/ad/interstitial/e/a/b$2;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$2;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-direct {v0, p1, v1, v2}, Lcom/kwad/components/core/webview/jshandler/x;-><init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/webview/d/a/a;)V

    return-object v0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/a/b;D)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/a/b;->d(D)V

    return-void
.end method

.method private static a(Landroid/app/Dialog;)Z
    .locals 0

    .line 37
    invoke-virtual {p0}, Landroid/app/Dialog;->getOwnerActivity()Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 38
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/a/b;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lf:Z

    return p1
.end method

.method static synthetic aa(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic ab(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic ac(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/sdk/core/g/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    return-object p0
.end method

.method static synthetic ad(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic ae(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/tachikoma/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lh:Lcom/kwad/components/core/webview/tachikoma/e;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/ad/interstitial/e/a/b;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lg:Z

    return p1
.end method

.method private bu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eh:Landroid/os/Vibrator;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cT(Lcom/kwad/sdk/core/response/model/AdTemplate;)F

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    if-nez v1, :cond_1

    .line 5
    new-instance v1, Lcom/kwad/sdk/core/g/d;

    invoke-direct {v1, v0}, Lcom/kwad/sdk/core/g/d;-><init>(F)V

    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    .line 6
    new-instance v2, Lcom/kwad/components/ad/interstitial/e/a/b$7;

    invoke-direct {v2, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$7;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/g/d;->a(Lcom/kwad/sdk/core/g/b;)V

    .line 7
    :cond_1
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/g/d;->g(F)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bv(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/core/webview/jshandler/aw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    return-object p0
.end method

.method private d(D)V
    .locals 2

    .line 2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/c$b;

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->l(Z)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->c(D)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    const/4 p2, 0x2

    .line 6
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->z(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p2, p2, Lcom/kwad/components/ad/interstitial/e/c;->jS:Lcom/kwad/sdk/widget/KSFrameLayout;

    .line 7
    invoke-virtual {p2}, Lcom/kwad/sdk/widget/KSFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->a(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    const/16 p2, 0x9d

    .line 8
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/e/c$b;->A(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    move-result-object p1

    .line 9
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p2, p1}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$b;)V

    .line 10
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eh:Landroid/os/Vibrator;

    sget-wide v0, Lcom/kwad/components/ad/interstitial/e/a/b;->le:J

    invoke-static {p1, p2, v0, v1}, Lcom/kwad/sdk/utils/bo;->vibrate(Landroid/content/Context;Landroid/os/Vibrator;J)V

    return-void
.end method

.method private dC()Lcom/kwad/components/core/webview/tachikoma/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$14;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$14;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-object v0
.end method

.method private dD()Lcom/kwad/components/core/webview/tachikoma/e;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$15;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$15;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-object v0
.end method

.method private dE()Lcom/kwad/components/core/webview/tachikoma/a/g;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/b/k;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/b/k;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jZ:I

    iput v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/k;->aaX:I

    .line 3
    new-instance v1, Lcom/kwad/components/core/webview/tachikoma/a/g;

    invoke-direct {v1, v0}, Lcom/kwad/components/core/webview/tachikoma/a/g;-><init>(Lcom/kwad/components/core/webview/tachikoma/b/k;)V

    return-object v1
.end method

.method private dF()Lcom/kwad/components/ad/h/a/a/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/ad/h/a/a/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/h/a/a/a;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jU:Ljava/util/List;

    new-instance v2, Lcom/kwad/components/ad/interstitial/e/a/b$16;

    invoke-direct {v2, p0, v0}, Lcom/kwad/components/ad/interstitial/e/a/b$16;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;Lcom/kwad/components/ad/h/a/a/a;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private dG()Lcom/kwad/components/core/webview/jshandler/bf;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/bf;

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v0, v1, v2}, Lcom/kwad/components/core/webview/jshandler/bf;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b$3;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$3;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/bf;->a(Lcom/kwad/components/core/webview/jshandler/bf$a;)V

    return-object v0
.end method

.method private dH()Lcom/kwad/components/core/webview/tachikoma/a/n;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$4;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-object v0
.end method

.method private dI()Lcom/kwad/components/core/webview/jshandler/ai;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ai;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$5;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;-><init>(Lcom/kwad/components/core/webview/jshandler/ai$b;)V

    return-object v0
.end method

.method private dJ()Lcom/kwad/components/core/webview/jshandler/v;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$6;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$6;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-object v0
.end method

.method private dK()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lc:Lcom/kwad/components/ad/h/a/a/b;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/h/a/a/b;->eH()V

    :cond_1
    return-void
.end method

.method private du()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->a(Landroid/app/Dialog;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 4
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_2

    .line 5
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onAdClosed()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/kwad/components/core/d/a;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method static synthetic e(Lcom/kwad/components/ad/interstitial/e/a/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lf:Z

    return p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/h/a/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lc:Lcom/kwad/components/ad/h/a/a/b;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/interstitial/e/a/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lg:Z

    return p0
.end method

.method private getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$8;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$8;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    return-object v0
.end method

.method static synthetic h(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic j(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic k(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method public static l(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 1
    .param p0    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/diskcache/b/a;->DM()Lcom/kwad/sdk/core/diskcache/b/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/core/diskcache/b/a;->bZ(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 4
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic m(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->du()V

    return-void
.end method

.method static synthetic r(Lcom/kwad/components/ad/interstitial/e/a/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->bu()V

    return-void
.end method

.method static synthetic s(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/components/ad/interstitial/e/a/b;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic w(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic x(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic y(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method

.method static synthetic z(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/components/ad/interstitial/e/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lcom/kwad/components/ad/interstitial/e/a/a;->a(Lcom/kwad/components/core/webview/jshandler/aw;)V

    .line 32
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->ld:Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->getTkTemplateId()Ljava/lang/String;

    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->getTKReaderScene()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/e/b;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 0

    .line 34
    invoke-super {p0, p1}, Lcom/kwad/components/ad/interstitial/e/a/a;->a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V

    .line 35
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object p1, p1, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz p1, :cond_0

    .line 36
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onSkippedAd()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 3

    .line 39
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget p1, p1, Lcom/kwad/sdk/commercial/model/WebCloseStatus;->closeType:I

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    .line 40
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->du()V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 2

    .line 7
    invoke-super {p0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/a/a;->a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-static {v0}, Lcom/kwad/components/ad/h/a/a/b;->z(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/h/a/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lc:Lcom/kwad/components/ad/h/a/a/b;

    if-eqz v0, :cond_0

    .line 10
    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b$10;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$10;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/h/a/a/b;->a(Lcom/kwad/components/ad/h/a/a/b$b;)V

    .line 11
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lc:Lcom/kwad/components/ad/h/a/a/b;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lc:Lcom/kwad/components/ad/h/a/a/b;

    invoke-virtual {v0}, Lcom/kwad/components/ad/h/a/a/b;->eG()V

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dI()Lcom/kwad/components/core/webview/jshandler/ai;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 14
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ao;

    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->getOpenNewPageListener()Lcom/kwad/components/core/webview/jshandler/ao$a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ao;-><init>(Lcom/kwad/components/core/webview/jshandler/ao$a;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 16
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 17
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dv(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/ay;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/a/b$11;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$11;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-direct {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ay;-><init>(Lcom/kwad/components/core/webview/jshandler/ay$a;)V

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 19
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dH()Lcom/kwad/components/core/webview/tachikoma/a/n;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 20
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dG()Lcom/kwad/components/core/webview/jshandler/bf;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 21
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dE()Lcom/kwad/components/core/webview/tachikoma/a/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 22
    invoke-direct {p0, p2}, Lcom/kwad/components/ad/interstitial/e/a/b;->a(Lcom/kwad/sdk/core/webview/b;)Lcom/kwad/components/core/webview/jshandler/x;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 23
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dJ()Lcom/kwad/components/core/webview/jshandler/v;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 24
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dF()Lcom/kwad/components/ad/h/a/a/a;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 25
    new-instance p2, Lcom/kwad/components/ad/interstitial/e/a/b$12;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$12;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 26
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dD()Lcom/kwad/components/core/webview/tachikoma/e;

    move-result-object p2

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lh:Lcom/kwad/components/core/webview/tachikoma/e;

    .line 27
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    invoke-virtual {p2, v0}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c$a;)V

    .line 28
    iget-object p2, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lh:Lcom/kwad/components/core/webview/tachikoma/e;

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 29
    new-instance p2, Lcom/kwad/components/core/webview/tachikoma/b;

    new-instance v0, Lcom/kwad/components/ad/interstitial/e/a/b$13;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/interstitial/e/a/b$13;-><init>(Lcom/kwad/components/ad/interstitial/e/a/b;)V

    invoke-direct {p2, v0}, Lcom/kwad/components/core/webview/tachikoma/b;-><init>(Lcom/kwad/components/core/webview/tachikoma/b$a;)V

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    .line 30
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->dC()Lcom/kwad/components/core/webview/tachikoma/c;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/kwad/sdk/components/r;->c(Lcom/kwad/sdk/core/webview/c/a;)V

    return-void
.end method

.method public final aj()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/a/a;->aj()V

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 3

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/c/a/a;->aW(Landroid/content/Context;)F

    move-result v0

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->width:I

    .line 5
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/bj;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v0

    add-float/2addr v1, v2

    float-to-int v0, v1

    iput v0, p1, Lcom/kwad/components/core/webview/jshandler/ac$a;->height:I

    return-void
.end method

.method public final bF()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/c;->dR()Lcom/kwad/components/ad/interstitial/report/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/report/c;->s(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/ad/interstitial/e/a/b;->getTkTemplateId()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-virtual/range {v1 .. v8}, Lcom/kwad/components/core/webview/tachikoma/e/e;->a(Ljava/lang/String;JJJ)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/f/b;->dX()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lf:Z

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->fD:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->df:Lcom/kwad/sdk/core/h/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->a(Lcom/kwad/sdk/core/h/c;)V

    return-void
.end method

.method public final bG()V
    .locals 0

    return-void
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->ld:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_interstitial"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dv(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/a/a;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_tk_view:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->ld:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/a/a;->onUnbind()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lf:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->lg:Z

    .line 4
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eh:Landroid/os/Vibrator;

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/bo;->b(Landroid/content/Context;Landroid/os/Vibrator;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->eg:Lcom/kwad/sdk/core/g/d;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/g/d;->bw(Landroid/content/Context;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    if-eqz v0, :cond_1

    .line 8
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->df:Lcom/kwad/sdk/core/h/c;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/widget/a/a;->b(Lcom/kwad/sdk/core/h/c;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/b;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/a/b;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/components/ad/interstitial/e/c$a;)V

    return-void
.end method
