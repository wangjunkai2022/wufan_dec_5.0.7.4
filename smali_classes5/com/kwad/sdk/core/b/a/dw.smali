.class public final Lcom/kwad/sdk/core/b/a/dw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static Ej()V
    .locals 3
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/core/b/a/fr;
        methodId = "registerHolder"
    .end annotation

    .line 1
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;

    new-instance v2, Lcom/kwad/sdk/core/b/a/co;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/co;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/response/model/a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ht;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ht;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;

    new-instance v2, Lcom/kwad/sdk/core/b/a/jy;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/jy;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/config/item/j$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fa;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fa;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/contentalliance/coupon/model/ActivityInfo;

    new-instance v2, Lcom/kwad/sdk/core/b/a/f;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/f;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/config/item/h$a;

    new-instance v2, Lcom/kwad/sdk/core/b/a/ex;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/ex;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-static {}, Lcom/kwad/sdk/core/b/a/fr;->Ek()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lcom/kwad/sdk/core/config/item/InstallActivateReminderConfigItem$InstallActivateReminderConfig;

    new-instance v2, Lcom/kwad/sdk/core/b/a/fb;

    invoke-direct {v2}, Lcom/kwad/sdk/core/b/a/fb;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
