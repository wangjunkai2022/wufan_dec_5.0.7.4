.class public final Lcom/aggmoread/sdk/z/a/m/e;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# static fields
.field private static b:Lcom/aggmoread/sdk/z/a/m/e;

.field private static c:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 2

    const-string v0, "AdSdk-api.bg.tasks"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static a()V
    .locals 2

    sget-object v0, Lcom/aggmoread/sdk/z/a/m/e;->b:Lcom/aggmoread/sdk/z/a/m/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/aggmoread/sdk/z/a/m/e;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/m/e;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/a/m/e;->b:Lcom/aggmoread/sdk/z/a/m/e;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v0, Landroid/os/Handler;

    sget-object v1, Lcom/aggmoread/sdk/z/a/m/e;->b:Lcom/aggmoread/sdk/z/a/m/e;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/m/e;->c:Landroid/os/Handler;

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/e;->b()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static b()Landroid/os/Handler;
    .locals 2

    const-class v0, Lcom/aggmoread/sdk/z/a/m/e;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/e;->a()V

    sget-object v1, Lcom/aggmoread/sdk/z/a/m/e;->c:Landroid/os/Handler;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
