.class public Lcom/beizi/fusion/d/m;
.super Ljava/lang/Object;
.source "JadYunAdManagerHolder.java"


# static fields
.field private static a:Z


# direct methods
.method private static a(Landroid/content/Context;)Lcom/jd/ad/sdk/bl/initsdk/JADPrivateController;
    .locals 1

    .line 2
    new-instance v0, Lcom/beizi/fusion/d/m$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/d/m$1;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/beizi/fusion/d/m;->b(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-boolean v0, Lcom/beizi/fusion/d/m;->a:Z

    if-nez v0, :cond_0

    .line 2
    :try_start_0
    new-instance v0, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;

    invoke-direct {v0}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;->setAppId(Ljava/lang/String;)Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p1, v0}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;->setEnableLog(Z)Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;

    move-result-object p1

    .line 5
    invoke-static {p0}, Lcom/beizi/fusion/d/m;->a(Landroid/content/Context;)Lcom/jd/ad/sdk/bl/initsdk/JADPrivateController;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;->setPrivateController(Lcom/jd/ad/sdk/bl/initsdk/JADPrivateController;)Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig$Builder;->build()Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig;

    move-result-object p1

    .line 7
    invoke-static {p0, p1}, Lcom/jd/ad/sdk/bl/initsdk/JADYunSdk;->init(Landroid/content/Context;Lcom/jd/ad/sdk/bl/initsdk/JADYunSdkConfig;)V

    .line 8
    sput-boolean v0, Lcom/beizi/fusion/d/m;->a:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method
