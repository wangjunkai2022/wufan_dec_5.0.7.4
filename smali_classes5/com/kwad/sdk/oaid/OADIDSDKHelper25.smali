.class public Lcom/kwad/sdk/oaid/OADIDSDKHelper25;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/oaid/OADIDSDKHelper25$a;,
        Lcom/kwad/sdk/oaid/OADIDSDKHelper25$IIdentifierListener25;
    }
.end annotation


# static fields
.field private static final SUB_TAG:Ljava/lang/String; = "OADIDSDKHelper25:"

.field private static final TAG:Ljava/lang/String; = "KSAdSDK"

.field private static mIsRequestIng:Z

.field private static sGetOaidFail:Z


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

.method static synthetic access$002(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->sGetOaidFail:Z

    return p0
.end method

.method static synthetic access$102(Z)Z
    .locals 0

    .line 1
    sput-boolean p0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->mIsRequestIng:Z

    return p0
.end method

.method public static getOAId(Landroid/content/Context;Lcom/kwad/sdk/oaid/OADIDSDKHelper25$a;)V
    .locals 6

    if-eqz p0, :cond_3

    .line 1
    sget-boolean v0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->sGetOaidFail:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->isSupport()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 3
    sput-boolean v1, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->sGetOaidFail:Z

    return-void

    .line 4
    :cond_1
    sget-boolean v0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->mIsRequestIng:Z

    if-eqz v0, :cond_2

    return-void

    .line 5
    :cond_2
    sput-boolean v1, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->mIsRequestIng:Z

    .line 6
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25$IIdentifierListener25;

    invoke-direct {v0, v2, v3, p1}, Lcom/kwad/sdk/oaid/OADIDSDKHelper25$IIdentifierListener25;-><init>(JLcom/kwad/sdk/oaid/OADIDSDKHelper25$a;)V

    invoke-static {p0, v1, v0}, Lcom/bun/miitmdid/core/MdidSdkHelper;->InitSdk(Landroid/content/Context;ZLcom/bun/miitmdid/interfaces/IIdentifierListener;)I

    move-result p0

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "OADIDSDKHelper25:sdk init time="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "--result="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const/4 p0, 0x0

    .line 10
    sput-boolean p0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->mIsRequestIng:Z

    .line 11
    sput-boolean v1, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;->sGetOaidFail:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public static isSupport()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/oaid/OADIDSDKHelper25$1;

    invoke-direct {v0}, Lcom/kwad/sdk/oaid/OADIDSDKHelper25$1;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 3
    invoke-interface {v0, v3, v2}, Lcom/bun/miitmdid/interfaces/IIdentifierListener;->OnSupport(ZLcom/bun/miitmdid/interfaces/IdSupplier;)V

    const-string v0, "com.bun.miitmdid.core.MdidSdkHelper"

    .line 4
    const-class v2, Lcom/kwad/sdk/oaid/OADIDSDKHelper25;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v3

    :catchall_0
    return v1
.end method
