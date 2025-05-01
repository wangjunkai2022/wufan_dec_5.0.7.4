.class final Lcom/kwad/components/core/d/a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/crash/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/d/a;->ns()Lcom/kwad/sdk/crash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Kh:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/d/a$4;->Kh:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final nB()Lcom/kwad/sdk/crash/model/message/a;
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/model/message/a;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/model/message/a;-><init>()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/report/t;->FD()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/crash/model/message/a;->fD(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/api/SdkConfig;->appId:Ljava/lang/String;

    const-string v2, "mKsadAppId"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lx()Lcom/kwad/sdk/api/SdkConfig;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/api/SdkConfig;->appName:Ljava/lang/String;

    const-string v2, "mKsadAppName"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/d/a$4;->Kh:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mKsadAppPackageName"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/d/a$4;->Kh:Landroid/content/Context;

    invoke-static {v1}, Lcom/kwad/sdk/utils/k;->cd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "mKsadAppVersion"

    invoke-virtual {v0, v2, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mKsadSdkName"

    const-string v2, "com.kwad.sdk"

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    invoke-static {}, Lcom/kwad/sdk/l;->getSDKVersion()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->getSdkCrashVersionName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "mKsadSdkVersion"

    invoke-virtual {v0, v3, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    const-string v1, "mKsadSdKVersionCode"

    const v3, 0x2e548c

    invoke-virtual {v0, v1, v3}, Lcom/kwad/sdk/crash/model/message/a;->putInt(Ljava/lang/String;I)V

    .line 10
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/l;->getApiVersion()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/kwad/sdk/crash/model/message/ExceptionMessage;->getSdkCrashVersionName(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "mKsadSdkApiVersion"

    invoke-virtual {v0, v3, v1}, Lcom/kwad/sdk/crash/model/message/a;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {}, Lcom/kwad/sdk/l;->zJ()Lcom/kwad/sdk/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/l;->getApiVersionCode()I

    move-result v1

    const-string v3, "mKsadSdKApiVersionCode"

    invoke-virtual {v0, v3, v1}, Lcom/kwad/sdk/crash/model/message/a;->putInt(Ljava/lang/String;I)V

    const-string v1, "mKsadSdkType"

    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/crash/model/message/a;->putInt(Ljava/lang/String;I)V

    const-string v1, "mBuildNumber"

    const/16 v2, 0x299

    .line 13
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/crash/model/message/a;->putInt(Ljava/lang/String;I)V

    .line 14
    invoke-static {}, Lcom/kwad/components/core/d/a;->nA()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/core/d/a$b;

    .line 15
    invoke-interface {v2}, Lcom/kwad/components/core/d/a$b;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 16
    invoke-interface {v2}, Lcom/kwad/components/core/d/a$b;->getValue()Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    .line 17
    invoke-interface {v2}, Lcom/kwad/components/core/d/a$b;->getKey()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Lcom/kwad/components/core/d/a$b;->getValue()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/kwad/sdk/crash/model/message/a;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method
