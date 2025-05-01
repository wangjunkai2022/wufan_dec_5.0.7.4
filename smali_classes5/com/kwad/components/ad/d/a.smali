.class public final Lcom/kwad/components/ad/d/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static bJ:Lcom/kwad/sdk/core/config/item/q;

.field public static bK:Lcom/kwad/sdk/core/config/item/q;

.field public static bL:Lcom/kwad/sdk/core/config/item/q;

.field public static bM:Lcom/kwad/sdk/core/config/item/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v1, "kwaiLogoUrl"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/d/a;->bJ:Lcom/kwad/sdk/core/config/item/q;

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v1, "attentionTips"

    const-string v2, "\u53bb\u5173\u6ce8TA"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/d/a;->bK:Lcom/kwad/sdk/core/config/item/q;

    .line 3
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v1, "viewHomeTips"

    const-string v2, "\u67e5\u770bTA\u7684\u4e3b\u9875"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/d/a;->bL:Lcom/kwad/sdk/core/config/item/q;

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/config/item/q;

    const-string v1, "buyNowTips"

    const-string v2, "\u7acb\u5373\u62a2\u8d2d"

    invoke-direct {v0, v1, v2}, Lcom/kwad/sdk/core/config/item/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/kwad/components/ad/d/a;->bM:Lcom/kwad/sdk/core/config/item/q;

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
