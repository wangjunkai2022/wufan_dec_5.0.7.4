.class final Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/efs/sdk/base/observer/IConfigCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/efs/sdk/fluttersdk/FlutterConfigManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;


# direct methods
.method constructor <init>(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)V
    .locals 0

    iput-object p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChange(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-string v0, "flutter_pv_sampling_rate"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I

    iget-object v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-static {v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)I

    move-result v1

    invoke-static {v1}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->a(I)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->a(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    :try_start_1
    const-string v0, "flutter_pv_max_count"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->b(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    :try_start_2
    const-string v0, "flutter_dart_exception_state"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v1, v0}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->c(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    :try_start_3
    const-string v0, "flutter_dart_exception_max_count"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->d(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;I)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    :goto_3
    iget-object p1, p0, Lcom/efs/sdk/fluttersdk/FlutterConfigManager$1;->a:Lcom/efs/sdk/fluttersdk/FlutterConfigManager;

    invoke-static {p1}, Lcom/efs/sdk/fluttersdk/FlutterConfigManager;->b(Lcom/efs/sdk/fluttersdk/FlutterConfigManager;)Z

    return-void
.end method
