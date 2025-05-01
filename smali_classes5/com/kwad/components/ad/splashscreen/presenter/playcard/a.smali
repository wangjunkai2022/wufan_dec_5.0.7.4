.class public final Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;
.super Lcom/kwad/components/ad/splashscreen/presenter/e;
.source "SourceFile"


# instance fields
.field private Fd:Lcom/kwad/components/core/n/a/d/b;

.field private Fe:J

.field private volatile Ff:Z

.field private final Fg:Ljava/lang/Runnable;

.field private Fh:Lcom/kwad/components/core/n/a/d/a;

.field private jR:Lcom/kwad/components/core/webview/tachikoma/e/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Ff:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$1;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 4
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$2;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fg:Ljava/lang/Runnable;

    .line 5
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$3;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fh:Lcom/kwad/components/core/n/a/d/a;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method private aq()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-boolean v1, v0, Lcom/kwad/components/ad/splashscreen/h;->Cz:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 2
    iput-boolean v1, v0, Lcom/kwad/components/ad/splashscreen/h;->Cz:Z

    .line 3
    iput-boolean v1, v0, Lcom/kwad/components/ad/splashscreen/h;->Cy:Z

    .line 4
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$5;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$5;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->aq()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic j(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fe:J

    return-wide v0
.end method

.method static synthetic k(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method private lV()V
    .locals 2

    .line 1
    const-class v0, Lcom/kwad/components/core/n/a/d/b;

    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/n/a/d/b;

    iput-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fd:Lcom/kwad/components/core/n/a/d/b;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fh:Lcom/kwad/components/core/n/a/d/a;

    invoke-interface {v0, v1}, Lcom/kwad/components/core/n/a/d/b;->a(Lcom/kwad/components/core/n/a/d/a;)V

    :cond_0
    return-void
.end method

.method private lW()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Ff:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Ff:Z

    .line 3
    new-instance v0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$4;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a$4;-><init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->postOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic m(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fg:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic o(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Ff:Z

    return p0
.end method

.method static synthetic p(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic r(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic s(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->lW()V

    return-void
.end method

.method static synthetic t(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic u(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic v(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic w(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method

.method static synthetic x(Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;)Lcom/kwad/components/ad/splashscreen/h;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/splashscreen/presenter/e;->aj()V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fe:J

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-object v1, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/components/ad/splashscreen/h;->Cs:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    invoke-static {v1, v0}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/e;->Di:Lcom/kwad/components/ad/splashscreen/h;

    iget-wide v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fe:J

    iput-wide v1, v0, Lcom/kwad/components/ad/splashscreen/h;->CB:J

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fg:Ljava/lang/Runnable;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dg(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v2

    .line 7
    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    .line 8
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->lV()V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fd:Lcom/kwad/components/core/n/a/d/b;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fh:Lcom/kwad/components/core/n/a/d/a;

    invoke-interface {v0, v1}, Lcom/kwad/components/core/n/a/d/b;->b(Lcom/kwad/components/core/n/a/d/a;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->Fg:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    .line 5
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/a;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->b(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    return-void
.end method
