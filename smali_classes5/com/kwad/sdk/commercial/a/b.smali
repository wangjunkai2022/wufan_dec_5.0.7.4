.class public Lcom/kwad/sdk/commercial/a/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apj:Ljava/lang/String;

.field public apk:Ljava/lang/String;

.field public apl:Ljava/lang/String;

.field public apm:J

.field public apn:J

.field public apo:I

.field public app:I

.field public downloadId:Ljava/lang/String;

.field public downloadTime:J

.field public status:I

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static Bs()Lcom/kwad/sdk/commercial/a/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/a/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/a/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final aj(J)Lcom/kwad/sdk/commercial/a/b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/commercial/a/b;->downloadTime:J

    return-object p0
.end method

.method public final bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dV(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/a/b;->url:Ljava/lang/String;

    .line 4
    :try_start_0
    new-instance p1, Ljava/net/URL;

    iget-object v1, p0, Lcom/kwad/sdk/commercial/a/b;->url:Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/commercial/a/b;->apj:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :catchall_0
    iget-object p1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->downloadId:Ljava/lang/String;

    iput-object p1, p0, Lcom/kwad/sdk/commercial/a/b;->downloadId:Ljava/lang/String;

    .line 7
    iget-object p1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->appPackageName:Ljava/lang/String;

    iput-object v1, p0, Lcom/kwad/sdk/commercial/a/b;->apk:Ljava/lang/String;

    .line 8
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->appName:Ljava/lang/String;

    iput-object p1, p0, Lcom/kwad/sdk/commercial/a/b;->apl:Ljava/lang/String;

    .line 9
    iget-wide v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->totalBytes:J

    iput-wide v1, p0, Lcom/kwad/sdk/commercial/a/b;->apm:J

    .line 10
    iget-wide v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->soFarBytes:J

    iput-wide v0, p0, Lcom/kwad/sdk/commercial/a/b;->apn:J

    return-object p0
.end method

.method public final cc(I)Lcom/kwad/sdk/commercial/a/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/a/b;->status:I

    return-object p0
.end method

.method public final cd(I)Lcom/kwad/sdk/commercial/a/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/a/b;->apo:I

    return-object p0
.end method

.method public final ce(I)Lcom/kwad/sdk/commercial/a/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/a/b;->app:I

    return-object p0
.end method

.method public synthetic setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/a/b;->bc(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/a/b;

    move-result-object p1

    return-object p1
.end method
