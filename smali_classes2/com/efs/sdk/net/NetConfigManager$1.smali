.class final Lcom/efs/sdk/net/NetConfigManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/base/observer/IConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/net/NetConfigManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/net/NetConfigManager;


# direct methods
.method constructor <init>(Lcom/efs/sdk/net/NetConfigManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/net/NetConfigManager$1;->a:Lcom/efs/sdk/net/NetConfigManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChange(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "net_launch"

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "apm_netperf_sampling_rate"

    .line 1
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2
    iget-object v3, p0, Lcom/efs/sdk/net/NetConfigManager$1;->a:Lcom/efs/sdk/net/NetConfigManager;

    invoke-static {v3}, Lcom/efs/sdk/net/NetConfigManager;->a(Lcom/efs/sdk/net/NetConfigManager;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 3
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 4
    new-instance v4, Ljava/lang/Thread;

    new-instance v5, Lcom/efs/sdk/net/NetConfigManager$1$1;

    invoke-direct {v5, p0, v3, v2}, Lcom/efs/sdk/net/NetConfigManager$1$1;-><init>(Lcom/efs/sdk/net/NetConfigManager$1;Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V

    invoke-direct {v4, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    .line 6
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    :try_start_1
    const-string v2, "apm_netperf_extra"

    .line 7
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 8
    iget-object v3, p0, Lcom/efs/sdk/net/NetConfigManager$1;->a:Lcom/efs/sdk/net/NetConfigManager;

    invoke-static {v3}, Lcom/efs/sdk/net/NetConfigManager;->a(Lcom/efs/sdk/net/NetConfigManager;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    new-instance v1, Ljava/lang/Thread;

    new-instance v3, Lcom/efs/sdk/net/NetConfigManager$1$2;

    invoke-direct {v3, p0, v0, v2}, Lcom/efs/sdk/net/NetConfigManager$1$2;-><init>(Lcom/efs/sdk/net/NetConfigManager$1;Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V

    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 11
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    :try_start_2
    const-string v0, "apm_netperf_day_limit"

    .line 13
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/efs/sdk/net/NetConfigManager$1;->a:Lcom/efs/sdk/net/NetConfigManager;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v0}, Lcom/efs/sdk/net/NetConfigManager;->a(Lcom/efs/sdk/net/NetConfigManager;I)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_2
    :try_start_3
    const-string v0, "apm_netperf_data_rate"

    .line 16
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 17
    iget-object v0, p0, Lcom/efs/sdk/net/NetConfigManager$1;->a:Lcom/efs/sdk/net/NetConfigManager;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/efs/sdk/net/NetConfigManager;->b(Lcom/efs/sdk/net/NetConfigManager;I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :cond_2
    return-void

    :catchall_3
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
