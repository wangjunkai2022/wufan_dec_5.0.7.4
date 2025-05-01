.class public Lcom/bytedance/sdk/openadsdk/api/vv/o;
.super Lcom/bytedance/sdk/openadsdk/api/m;

# interfaces
.implements Lcom/ss/android/download/api/download/DownloadStatusChangeListener;


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
.method public onDownloadActive(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V
    .locals 4

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

    const v2, 0x36977

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/i;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const v1, 0x36978

    .line 4
    invoke-virtual {p1, v1, p2}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/bykv/vv/vv/vv/vv/b;->d(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    :goto_0
    const p2, 0x36972

    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public onDownloadFailed(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 4

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

    const v2, 0x36977

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/i;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

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
    const v0, 0x36974

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public onDownloadFinished(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 4

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

    const v2, 0x36977

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/i;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

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
    const v0, 0x36976

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public onDownloadPaused(Lcom/ss/android/download/api/model/DownloadShortInfo;I)V
    .locals 4

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

    const v2, 0x36977

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/i;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const v1, 0x36978

    .line 4
    invoke-virtual {p1, v1, p2}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/bykv/vv/vv/vv/vv/b;->d(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    :goto_0
    const p2, 0x36973

    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public onDownloadStart(Lcom/ss/android/download/api/download/DownloadModel;Lcom/ss/android/download/api/download/DownloadController;)V
    .locals 4
    .param p1    # Lcom/ss/android/download/api/download/DownloadModel;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/ss/android/download/api/download/DownloadController;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

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

    const v2, 0x367e1

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/p;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/p;-><init>(Lcom/ss/android/download/api/download/DownloadModel;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    const v1, 0x367e3

    new-instance v2, Lcom/bytedance/sdk/openadsdk/api/vv/vv;

    invoke-direct {v2, p2}, Lcom/bytedance/sdk/openadsdk/api/vv/vv;-><init>(Lcom/ss/android/download/api/download/DownloadController;)V

    .line 4
    invoke-virtual {p1, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/bykv/vv/vv/vv/vv/b;->d(Lcom/bykv/vk/openvk/api/proto/ValueSet;)Lcom/bykv/vv/vv/vv/vv/b;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lcom/bykv/vv/vv/vv/vv/b;->a()Lcom/bykv/vk/openvk/api/proto/Result;

    move-result-object p1

    :goto_0
    const p2, 0x36971

    .line 8
    invoke-virtual {p0, p2, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method

.method public onIdle()V
    .locals 1

    const v0, 0x36970

    .line 1
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(I)V

    return-void
.end method

.method public onInstalled(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 4

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

    const v2, 0x36977

    new-instance v3, Lcom/bytedance/sdk/openadsdk/api/vv/i;

    invoke-direct {v3, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;-><init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V

    .line 3
    invoke-virtual {v1, v2, v3}, Lcom/bykv/vv/vv/vv/vv/a;->h(ILjava/lang/Object;)Lcom/bykv/vv/vv/vv/vv/a;

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
    const v0, 0x36975

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/bytedance/sdk/openadsdk/api/m;->vv(ILcom/bykv/vk/openvk/api/proto/Result;)V

    return-void
.end method
