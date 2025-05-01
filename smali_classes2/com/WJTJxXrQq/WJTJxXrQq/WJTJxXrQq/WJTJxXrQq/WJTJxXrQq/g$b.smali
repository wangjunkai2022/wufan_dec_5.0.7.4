.class Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/kwad/sdk/api/KsLoadManager$DrawAdListener;

.field private b:Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;->b:Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;

    new-instance p2, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b$a;

    invoke-direct {p2, p0, p1, p3, p4}, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b$a;-><init>(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationAdSlotValueSet;Z)V

    iput-object p2, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;->a:Lcom/kwad/sdk/api/KsLoadManager$DrawAdListener;

    return-void
.end method

.method static synthetic a(Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;)Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;
    .locals 0

    iget-object p0, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;->b:Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;

    return-object p0
.end method


# virtual methods
.method public b(Lcom/kwad/sdk/api/KsScene;)V
    .locals 2

    invoke-static {}, Lcom/kwad/sdk/api/KsAdSDK;->getLoadManager()Lcom/kwad/sdk/api/KsLoadManager;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;->a:Lcom/kwad/sdk/api/KsLoadManager$DrawAdListener;

    invoke-interface {v0, p1, v1}, Lcom/kwad/sdk/api/KsLoadManager;->loadDrawAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$DrawAdListener;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/WJTJxXrQq/g$b;->b:Lcom/bytedance/msdk/adapter/ks/KsDrawLoader;

    if-eqz p1, :cond_1

    const v0, 0x13881

    const-string v1, "loadManager is null can not load ads"

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationAdLoaderImpl;->notifyAdFailed(ILjava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
