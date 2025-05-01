.class public final Lcom/kwad/components/core/webview/tachikoma/c/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/tachikoma/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private abA:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field private abB:Lcom/kwad/components/core/webview/tachikoma/k;

.field private abm:Lcom/kwad/sdk/components/k;

.field private abo:Z

.field private aby:Z

.field private mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field private templateId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abo:Z

    return p0
.end method

.method static synthetic d(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aby:Z

    return p0
.end method

.method static synthetic e(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/offline/api/tk/model/StyleTemplate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abA:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/sdk/components/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abm:Lcom/kwad/sdk/components/k;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/core/webview/tachikoma/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abB:Lcom/kwad/components/core/webview/tachikoma/k;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/tachikoma/k;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abB:Lcom/kwad/components/core/webview/tachikoma/k;

    return-void
.end method

.method public final a(Lcom/kwad/components/offline/api/tk/model/StyleTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abA:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    return-void
.end method

.method public final aW(Z)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abo:Z

    return-void
.end method

.method public final aX(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->templateId:Ljava/lang/String;

    return-void
.end method

.method public final aX(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aby:Z

    return-void
.end method

.method public final c(Lcom/kwad/sdk/components/k;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abm:Lcom/kwad/sdk/components/k;

    return-void
.end method

.method public final d(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    return-void
.end method

.method public final getTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final hl()Lcom/kwad/sdk/core/response/model/AdResultData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    return-object v0
.end method

.method public final kf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->abo:Z

    return v0
.end method

.method public final tB()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aby:Z

    return v0
.end method
