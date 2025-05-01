.class public final Lcom/kwad/sdk/core/webview/d/a$a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/core/webview/d/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public XA:I

.field public XB:Ljava/lang/String;

.field public XC:I

.field public XD:Ljava/lang/String;

.field public XE:Ljava/lang/String;

.field public XF:Ljava/lang/String;

.field public XG:I

.field public XH:Ljava/lang/String;

.field public XI:I

.field public XJ:Ljava/lang/String;

.field public XK:Ljava/lang/String;

.field public XL:I

.field public XM:I

.field public XN:I

.field public XO:I

.field public Xz:Ljava/lang/String;

.field public aAB:Ljava/lang/String;

.field public aAG:Ljava/lang/String;

.field public aAH:Ljava/lang/String;

.field public aAS:Ljava/lang/String;

.field public aFT:Ljava/lang/String;

.field public aFU:Ljava/lang/String;

.field public aFV:Z

.field public aFW:Ljava/lang/String;

.field public appId:Ljava/lang/String;

.field public appName:Ljava/lang/String;

.field public appVersion:Ljava/lang/String;

.field public aux:Ljava/lang/String;

.field public auy:Ljava/lang/String;

.field public azQ:Ljava/lang/String;

.field public model:Ljava/lang/String;

.field public sdkType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method

.method public static HL()Lcom/kwad/sdk/core/webview/d/a$a;
    .locals 5

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    new-instance v1, Lcom/kwad/sdk/core/webview/d/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/webview/d/a$a;-><init>()V

    const-string v2, "3.3.63"

    .line 2
    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->Xz:Ljava/lang/String;

    const v2, 0x2e548c

    .line 3
    iput v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XA:I

    const-string v2, "6.0.7"

    .line 4
    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->azQ:Ljava/lang/String;

    const-string v2, "1.3"

    .line 5
    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aFW:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XB:Ljava/lang/String;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->getApiVersionCode()I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XC:I

    const/4 v2, 0x1

    .line 8
    iput v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->sdkType:I

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v3}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 10
    invoke-static {v3}, Lcom/kwad/sdk/utils/k;->cd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->appVersion:Ljava/lang/String;

    .line 11
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v4}, Lcom/kwad/sdk/service/a/f;->getAppName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->appName:Ljava/lang/String;

    .line 12
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v4}, Lcom/kwad/sdk/service/a/f;->getAppId()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->appId:Ljava/lang/String;

    const-string v4, ""

    .line 13
    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aFT:Ljava/lang/String;

    .line 14
    invoke-static {}, Lcom/kwad/sdk/utils/y;->Mt()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aAH:Ljava/lang/String;

    .line 15
    const-class v4, Lcom/kwad/sdk/components/g;

    invoke-static {v4}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v4

    check-cast v4, Lcom/kwad/sdk/components/g;

    if-eqz v4, :cond_0

    .line 16
    invoke-interface {v4}, Lcom/kwad/sdk/components/g;->oV()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aAG:Ljava/lang/String;

    .line 17
    :cond_0
    invoke-static {v3}, Lcom/kwad/sdk/utils/ah;->cx(Landroid/content/Context;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XD:Ljava/lang/String;

    .line 18
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NR()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XE:Ljava/lang/String;

    .line 19
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NI()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->model:Ljava/lang/String;

    .line 20
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NK()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XF:Ljava/lang/String;

    .line 21
    iput v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XG:I

    .line 22
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getOsVersion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XH:Ljava/lang/String;

    .line 23
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NU()I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XI:I

    .line 24
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getLanguage()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XJ:Ljava/lang/String;

    .line 25
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getLocale()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XK:Ljava/lang/String;

    .line 26
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->yV()Z

    move-result v0

    iput-boolean v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aFV:Z

    .line 27
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aFU:Ljava/lang/String;

    .line 28
    invoke-static {v3}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XL:I

    .line 29
    invoke-static {v3}, Lcom/kwad/sdk/utils/bj;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XM:I

    .line 30
    invoke-static {v3}, Lcom/kwad/sdk/utils/aw;->cI(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aux:Ljava/lang/String;

    .line 31
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getOaid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->auy:Ljava/lang/String;

    .line 32
    invoke-static {v3}, Lcom/kwad/sdk/utils/aw;->cJ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aAB:Ljava/lang/String;

    .line 33
    invoke-static {v3}, Lcom/kwad/sdk/utils/aw;->cK(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->aAS:Ljava/lang/String;

    .line 34
    invoke-static {v3}, Lcom/kwad/sdk/c/a/a;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XN:I

    const/high16 v0, 0x42480000    # 50.0f

    .line 35
    invoke-static {v3, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v1, Lcom/kwad/sdk/core/webview/d/a$a;->XO:I

    return-object v1
.end method
