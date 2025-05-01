.class public final Lcom/kwad/components/core/webview/jshandler/az;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/az$a;
    }
.end annotation


# instance fields
.field private WI:Lcom/kwad/sdk/core/webview/c/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private YJ:Lcom/kwad/sdk/api/KsAppDownloadListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final cO:Lcom/kwad/sdk/core/webview/b;

.field private final mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;)V
    .locals 0
    .param p2    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/az;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/api/KsAppDownloadListener;)V
    .locals 0
    .param p2    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/kwad/sdk/api/KsAppDownloadListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 6
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/az;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 7
    iput-object p3, p0, Lcom/kwad/components/core/webview/jshandler/az;->YJ:Lcom/kwad/sdk/api/KsAppDownloadListener;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/az;)Lcom/kwad/sdk/api/KsAppDownloadListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/jshandler/az;->YJ:Lcom/kwad/sdk/api/KsAppDownloadListener;

    return-object p0
.end method

.method private a(IF)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/az;->WI:Lcom/kwad/sdk/core/webview/c/c;

    if-eqz v0, :cond_0

    .line 12
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/az$a;-><init>()V

    .line 13
    iput p2, v0, Lcom/kwad/components/core/webview/jshandler/az$a;->YL:F

    .line 14
    iput p1, v0, Lcom/kwad/components/core/webview/jshandler/az$a;->status:I

    .line 15
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->cO:Lcom/kwad/sdk/core/webview/b;

    .line 16
    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    iget-wide p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->totalBytes:J

    iput-wide p1, v0, Lcom/kwad/components/core/webview/jshandler/az$a;->totalBytes:J

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->WI:Lcom/kwad/sdk/core/webview/c/c;

    invoke-interface {p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/webview/jshandler/az;IF)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/jshandler/az;->a(IF)V

    return-void
.end method

.method private sQ()Lcom/kwad/sdk/api/KsAppDownloadListener;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/az$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/webview/jshandler/az$1;-><init>(Lcom/kwad/components/core/webview/jshandler/az;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->cO:Lcom/kwad/sdk/core/webview/b;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/b;->Hx()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "native photo is null"

    .line 4
    invoke-interface {p2, p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/az;->WI:Lcom/kwad/sdk/core/webview/c/c;

    .line 6
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz p1, :cond_2

    .line 7
    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/az;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    if-nez p2, :cond_1

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/core/webview/jshandler/az;->sQ()Lcom/kwad/sdk/api/KsAppDownloadListener;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/az;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    .line 9
    iget-object p2, p0, Lcom/kwad/components/core/webview/jshandler/az;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {p2, p1}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    return-void

    .line 10
    :cond_1
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/c;->d(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    :cond_2
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerProgressListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/az;->WI:Lcom/kwad/sdk/core/webview/c/c;

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/az;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/az;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1, v2}, Lcom/kwad/components/core/e/d/c;->c(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 4
    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/az;->Wr:Lcom/kwad/sdk/api/KsAppDownloadListener;

    :cond_0
    return-void
.end method
