.class public Lcom/bytedance/sdk/openadsdk/api/vv/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bykv/vk/openvk/api/proto/Bridge;


# instance fields
.field private vv:Lcom/ss/android/download/api/model/DownloadShortInfo;


# direct methods
.method public constructor <init>(Lcom/ss/android/download/api/model/DownloadShortInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    return-void
.end method


# virtual methods
.method public call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/bykv/vk/openvk/api/proto/ValueSet;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1
    :pswitch_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->hashCode()I

    goto :goto_0

    :pswitch_1
    const p1, 0x369dd

    .line 2
    const-class p3, Ljava/lang/Object;

    invoke-interface {p2, p1, p3}, Lcom/bykv/vk/openvk/api/proto/ValueSet;->objectValue(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x369d4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/ss/android/download/api/model/DownloadShortInfo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/ss/android/download/api/model/DownloadShortInfo;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->currentBytes:J

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->status:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-boolean v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->onlyWifi:Z

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->fileName:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public p()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->totalBytes:J

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public u()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->failStatus:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public values()Lcom/bykv/vk/openvk/api/proto/ValueSet;
    .locals 4

    .line 1
    invoke-static {}, Lcom/bykv/vv/vv/vv/vv/a;->b()Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv()J

    move-result-wide v1

    const v3, 0x369d6

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->m()I

    move-result v1

    const v2, 0x369d7

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 4
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->p()J

    move-result-wide v1

    const v3, 0x369d8

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->i()J

    move-result-wide v1

    const v3, 0x369d9

    invoke-virtual {v0, v3, v1, v2}, Lcom/bykv/vv/vv/vv/vv/a;->g(IJ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 6
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->o()Ljava/lang/String;

    move-result-object v1

    const v2, 0x369da

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->i(ILjava/lang/String;)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->u()I

    move-result v1

    const v2, 0x369db

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->f(II)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/api/vv/i;->n()Z

    move-result v1

    const v2, 0x369dc

    invoke-virtual {v0, v2, v1}, Lcom/bykv/vv/vv/vv/vv/a;->j(IZ)Lcom/bykv/vv/vv/vv/vv/a;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/bykv/vv/vv/vv/vv/a;->a()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    return-object v0
.end method

.method public vv()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/vv/i;->vv:Lcom/ss/android/download/api/model/DownloadShortInfo;

    if-eqz v0, :cond_0

    .line 2
    iget-wide v0, v0, Lcom/ss/android/download/api/model/DownloadShortInfo;->id:J

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
