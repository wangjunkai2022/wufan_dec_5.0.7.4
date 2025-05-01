.class public final Lcom/kwad/components/ad/fullscreen/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static gI:Lcom/kwad/sdk/core/config/item/k;

.field public static gJ:Lcom/kwad/sdk/core/config/item/k;

.field public static gK:Lcom/kwad/sdk/core/config/item/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v1, 0x0

    .line 2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "fullscreenSkipType"

    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/fullscreen/a/a;->gI:Lcom/kwad/sdk/core/config/item/k;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const/4 v2, 0x5

    .line 4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "fullscreenSkipShowTime"

    invoke-direct {v0, v3, v2}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/fullscreen/a/a;->gJ:Lcom/kwad/sdk/core/config/item/k;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/config/item/k;

    const-string v2, "fullScreenShakeMaxCount"

    .line 6
    invoke-direct {v0, v2, v1}, Lcom/kwad/sdk/core/config/item/k;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    sput-object v0, Lcom/kwad/components/ad/fullscreen/a/a;->gK:Lcom/kwad/sdk/core/config/item/k;

    return-void
.end method

.method public static init()V
    .locals 0
    .annotation build Lcom/ksad/annotation/invoker/InvokeBy;
        invokerClass = Lcom/kwad/sdk/core/config/d;
        methodId = "initConfigList"
    .end annotation

    return-void
.end method
