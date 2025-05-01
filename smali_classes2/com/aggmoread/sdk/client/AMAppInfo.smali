.class public Lcom/aggmoread/sdk/client/AMAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMAppInfo$Permission;
    }
.end annotation


# instance fields
.field private appName:Ljava/lang/String;

.field private authorName:Ljava/lang/String;

.field private descriptionUrl:Ljava/lang/String;

.field private icpNumber:Ljava/lang/String;

.field private pacakgesSize:J

.field private packageName:Ljava/lang/String;

.field private permissionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMAppInfo$Permission;",
            ">;"
        }
    .end annotation
.end field

.field private permissionsUrl:Ljava/lang/String;

.field private privacyAgreement:Ljava/lang/String;

.field private suitableAge:Ljava/lang/String;

.field private versionName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMAppInfo$Permission;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->appName:Ljava/lang/String;

    iput-object p2, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->authorName:Ljava/lang/String;

    iput-wide p3, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->pacakgesSize:J

    iput-object p5, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->permissionsUrl:Ljava/lang/String;

    iput-object p6, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->permissionList:Ljava/util/List;

    iput-object p7, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->privacyAgreement:Ljava/lang/String;

    iput-object p8, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->versionName:Ljava/lang/String;

    iput-object p9, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->packageName:Ljava/lang/String;

    iput-object p10, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->descriptionUrl:Ljava/lang/String;

    iput-object p11, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->icpNumber:Ljava/lang/String;

    iput-object p12, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->suitableAge:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthorName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->authorName:Ljava/lang/String;

    return-object v0
.end method

.method public getDescriptionUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->descriptionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getIcpNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->icpNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getPacakgesSize()J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->pacakgesSize:J

    return-wide v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getPermissionList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMAppInfo$Permission;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->permissionList:Ljava/util/List;

    return-object v0
.end method

.method public getPermissionsUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->permissionsUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPrivacyAgreement()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->privacyAgreement:Ljava/lang/String;

    return-object v0
.end method

.method public getSuitableAge()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->suitableAge:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAppInfo;->versionName:Ljava/lang/String;

    return-object v0
.end method
