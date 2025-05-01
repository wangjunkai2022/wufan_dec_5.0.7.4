.class public final Lcom/kwad/components/core/webview/jshandler/af$a;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/jshandler/af;
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

.field public appId:Ljava/lang/String;

.field public appName:Ljava/lang/String;

.field public appVersion:Ljava/lang/String;

.field public model:Ljava/lang/String;

.field public sdkType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method

.method public static sS()Lcom/kwad/components/core/webview/jshandler/af$a;
    .locals 5

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/af$a;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/af$a;-><init>()V

    const-string v2, "3.3.63"

    .line 2
    iput-object v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->Xz:Ljava/lang/String;

    const v2, 0x2e548c

    .line 3
    iput v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XA:I

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XB:Ljava/lang/String;

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->getApiVersionCode()I

    move-result v2

    iput v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XC:I

    const/4 v2, 0x1

    .line 6
    iput v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->sdkType:I

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v3}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 8
    invoke-static {v3}, Lcom/kwad/sdk/utils/k;->cd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->appVersion:Ljava/lang/String;

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v4}, Lcom/kwad/sdk/service/a/f;->getAppName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->appName:Ljava/lang/String;

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getAppId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->appId:Ljava/lang/String;

    .line 11
    invoke-static {v3}, Lcom/kwad/sdk/utils/ah;->cx(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XD:Ljava/lang/String;

    .line 12
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NR()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XE:Ljava/lang/String;

    .line 13
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NI()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->model:Ljava/lang/String;

    .line 14
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NK()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XF:Ljava/lang/String;

    .line 15
    iput v2, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XG:I

    .line 16
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getOsVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XH:Ljava/lang/String;

    .line 17
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->NU()I

    move-result v0

    iput v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XI:I

    .line 18
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getLanguage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XJ:Ljava/lang/String;

    .line 19
    invoke-static {}, Lcom/kwad/sdk/utils/bj;->getLocale()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XK:Ljava/lang/String;

    .line 20
    invoke-static {v3}, Lcom/kwad/sdk/utils/bj;->getScreenWidth(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XL:I

    .line 21
    invoke-static {v3}, Lcom/kwad/sdk/utils/bj;->getScreenHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XM:I

    .line 22
    invoke-static {v3}, Lcom/kwad/sdk/c/a/a;->getStatusBarHeight(Landroid/content/Context;)I

    move-result v0

    iput v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XN:I

    const/high16 v0, 0x42480000    # 50.0f

    .line 23
    invoke-static {v3, v0}, Lcom/kwad/sdk/c/a/a;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, v1, Lcom/kwad/components/core/webview/jshandler/af$a;->XO:I

    return-object v1
.end method
