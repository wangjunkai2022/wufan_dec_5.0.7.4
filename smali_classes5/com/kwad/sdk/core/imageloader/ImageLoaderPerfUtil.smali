.class public Lcom/kwad/sdk/core/imageloader/ImageLoaderPerfUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "ImageLoaderPerfUtil"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderPerfUtil;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static getInfo()Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;-><init>()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/utils/y;->MA()I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;->totalCount:I

    .line 3
    invoke-static {}, Lcom/kwad/sdk/utils/y;->MB()I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;->successCount:I

    .line 4
    invoke-static {}, Lcom/kwad/sdk/utils/y;->MC()I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;->failedCount:I

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/y;->Mz()D

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderInfo;->duration:D

    return-object v0
.end method

.method public static report()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/imageloader/ImageLoaderPerfUtil$1;

    invoke-direct {v0}, Lcom/kwad/sdk/core/imageloader/ImageLoaderPerfUtil$1;-><init>()V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
