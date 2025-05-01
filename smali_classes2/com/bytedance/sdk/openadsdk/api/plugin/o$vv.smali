.class final Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;
.super Lcom/bytedance/pangle/download/PluginDownloadBean;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "vv"
.end annotation


# instance fields
.field public m:Ljava/io/File;

.field public vv:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/download/PluginDownloadBean;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;->vv:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$vv;->m:Ljava/io/File;

    .line 4
    iput-object v0, p0, Lcom/bytedance/pangle/download/PluginDownloadBean;->mBackupUrlList:Ljava/util/List;

    return-void
.end method
