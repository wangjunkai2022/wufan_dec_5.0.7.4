.class public abstract Lcom/aggmoread/sdk/client/AMCustomController;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public canReadInstalledPackages()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canReadLocation()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canUseAndroidId()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canUseMacAddress()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canUseNetworkState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canUsePhoneState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public canUseStoragePermission()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getDevOaid()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getIMSI()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getImei()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getInstalledPackages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getLocation()Landroid/location/Location;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMacAddress()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getSerialNumberInner()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
