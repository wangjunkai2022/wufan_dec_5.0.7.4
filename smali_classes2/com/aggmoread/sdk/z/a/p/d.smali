.class public final Lcom/aggmoread/sdk/z/a/p/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/aggmoread/sdk/z/a/p/c;

.field c:Z

.field private d:Z

.field private final e:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/p/c;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/aggmoread/sdk/z/a/p/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/d$a;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/a/p/d$a;-><init>(Lcom/aggmoread/sdk/z/a/p/d;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/p/d;->a:Landroid/content/Context;

    if-nez p2, :cond_0

    sget-object p2, Lcom/aggmoread/sdk/z/a/p/c;->a:Lcom/aggmoread/sdk/z/a/p/c;

    :cond_0
    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/p/d;->b:Lcom/aggmoread/sdk/z/a/p/c;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/a/p/d;)Lcom/aggmoread/sdk/z/a/p/c;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/a/p/d;->b:Lcom/aggmoread/sdk/z/a/p/c;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/p/c;)Lcom/aggmoread/sdk/z/a/p/d;
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/d;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/a/p/d;-><init>(Landroid/content/Context;Lcom/aggmoread/sdk/z/a/p/c;)V

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/p/d;->b()V

    return-object v0
.end method

.method private a()V
    .locals 4

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/a/p/d;->a(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->c:Z

    :try_start_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/p/d;->e:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->d:Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "ConnectivityListener"

    const-string v2, "Failed to register"

    invoke-static {v1, v2, v0}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private d()V
    .locals 2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/p/d;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/a/p/d;->d:Z

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;)Z
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "connectivity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :catch_0
    move-exception p1

    const-string v1, "ConnectivityListener"

    const-string v2, "Failed to determine connectivity status when connectivity changed "

    invoke-static {v1, v2, p1}, Lcom/aggmoread/sdk/z/a/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/p/d;->a()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/p/d;->d()V

    return-void
.end method
