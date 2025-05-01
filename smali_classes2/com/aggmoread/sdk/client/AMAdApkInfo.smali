.class public Lcom/aggmoread/sdk/client/AMAdApkInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appName:Ljava/lang/String;

.field private authorName:Ljava/lang/String;

.field private fileSize:J

.field private iconUrl:Ljava/lang/String;

.field private permissions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private privacyAgreement:Ljava/lang/String;

.field private time:J

.field private versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->appName:Ljava/lang/String;

    iput-object p2, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->authorName:Ljava/lang/String;

    iput-object p3, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->versionName:Ljava/lang/String;

    iput-wide p4, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->fileSize:J

    iput-wide p6, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->time:J

    iput-object p8, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->privacyAgreement:Ljava/lang/String;

    iput-object p9, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->permissions:Ljava/util/List;

    iput-object p10, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->iconUrl:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthorName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->authorName:Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->fileSize:J

    return-wide v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPermissions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->permissions:Ljava/util/List;

    return-object v0
.end method

.method public getPrivacyAgreement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->privacyAgreement:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->time:J

    return-wide v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->appName:Ljava/lang/String;

    return-void
.end method

.method public setAuthorName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->authorName:Ljava/lang/String;

    return-void
.end method

.method public setFileSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->fileSize:J

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setPermissions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->permissions:Ljava/util/List;

    return-void
.end method

.method public setPrivacyAgreement(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->privacyAgreement:Ljava/lang/String;

    return-void
.end method

.method public setTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->time:J

    return-void
.end method

.method public setVersionName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdApkInfo;->versionName:Ljava/lang/String;

    return-void
.end method
