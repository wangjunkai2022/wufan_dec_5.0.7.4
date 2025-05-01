.class Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/ss/android/socialbase/downloader/network/wv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/downloadnew/p$o;->downloadWithConnection(ILjava/lang/String;Ljava/util/List;)Lcom/ss/android/socialbase/downloader/network/wv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$o;

.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/downloadnew/p$o;Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->m:Lcom/bytedance/sdk/openadsdk/downloadnew/p$o;

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;->i:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public m()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;

    iget v0, v0, Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;->p:I

    return v0
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public vv()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;->vv:Ljava/io/InputStream;

    return-object v0
.end method

.method public vv(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/p$o$1;->vv:Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/downloadnew/m$vv;->m:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
