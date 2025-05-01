.class Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/m;->vv(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;)Lcom/bykv/vk/openvk/api/proto/ValueSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bykv/vk/openvk/api/proto/ValueSet$ValueGetter<",
        "Ljava/util/List;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/m$1;->vv:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/m$1;->vv()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public vv()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/init/vv/vv/vv/m$1;->vv:Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/mediation/init/IMediationPrivacyConfig;->getCustomAppList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
