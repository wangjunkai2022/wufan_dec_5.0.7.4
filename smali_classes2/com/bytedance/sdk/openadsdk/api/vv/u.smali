.class public Lcom/bytedance/sdk/openadsdk/api/vv/u;
.super Lcom/bytedance/sdk/openadsdk/api/m;

# interfaces
.implements Lcom/ss/android/download/api/config/IDownloadButtonClickListener;


# direct methods
.method public constructor <init>(Lcom/bykv/vk/openvk/api/proto/EventListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/api/m;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/m;->vv:Lcom/bykv/vk/openvk/api/proto/EventListener;

    return-void
.end method


# virtual methods
.method public handleComplianceDialog(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/m;->vv()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/b;->b()Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v1

    const v2, 0x3677d

    .line 3
    invoke-virtual {v1, v2, p1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 5
    invoke-virtual {v0, p1}, Lcom/bykv/vv/vv/vv/vv/b;->d(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    :goto_0
    const v0, 0x3677c

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public handleMarketFailedComplianceDialog()V
    .locals 1

    const v0, 0x36786

    .line 1
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(I)V

    return-void
.end method
