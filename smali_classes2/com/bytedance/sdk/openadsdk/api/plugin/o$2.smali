.class Lcom/bytedance/sdk/openadsdk/api/plugin/o$2;
.super Lcom/bytedance/pangle/ZeusPluginStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/api/plugin/o;->m(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;


# direct methods
.method constructor <init>(Lcom/bytedance/sdk/openadsdk/api/plugin/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$2;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-direct {p0}, Lcom/bytedance/pangle/ZeusPluginStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onPluginStateChange(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 1

    .line 1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " state changed, "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "TTPluginManager"

    invoke-static {v0, p3}, Lcom/bytedance/sdk/openadsdk/api/p;->m(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p3, 0x9

    if-ne p2, p3, :cond_0

    const-string p2, "com.byted.pangle"

    .line 2
    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/api/plugin/o$2;->vv:Lcom/bytedance/sdk/openadsdk/api/plugin/o;

    invoke-static {p2, p1}, Lcom/bytedance/sdk/openadsdk/api/plugin/o;->vv(Lcom/bytedance/sdk/openadsdk/api/plugin/o;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
