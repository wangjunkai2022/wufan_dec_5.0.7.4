.class public final Lcom/kwad/components/ad/reward/n/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static R(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/ad/reward/n/r;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/n/r;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/n/r;-><init>()V

    .line 2
    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/n/r;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object v0
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/ad/reward/n/r;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/n/r;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/n/r;-><init>()V

    .line 2
    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/n/r;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    invoke-direct {v0, p1}, Lcom/kwad/components/ad/reward/n/r;->setApkDownloadHelper(Lcom/kwad/components/core/e/d/c;)V

    return-object v0
.end method

.method private setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/r;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method private setApkDownloadHelper(Lcom/kwad/components/core/e/d/c;)V
    .locals 0
    .param p1    # Lcom/kwad/components/core/e/d/c;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/n/r;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-void
.end method


# virtual methods
.method public final getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/r;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-object v0
.end method

.method public final ha()Lcom/kwad/components/core/e/d/c;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/n/r;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object v0
.end method
