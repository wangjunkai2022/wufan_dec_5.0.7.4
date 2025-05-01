.class public final Lcom/kwad/components/core/r/a/b;
.super Lcom/kwad/components/core/l/a;
.source "SourceFile"


# instance fields
.field public Th:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field public Tk:Lcom/kwad/sdk/components/l;

.field public Tl:Lcom/kwad/components/core/webview/tachikoma/k;

.field public mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field public mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/r/a/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/l/a;-><init>(Lcom/kwad/components/core/l/b;)V

    return-void
.end method


# virtual methods
.method public final d(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/r/a/b;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method
