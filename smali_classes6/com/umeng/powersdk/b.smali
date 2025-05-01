.class public final Lcom/umeng/powersdk/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/powersdk/b$a;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/umeng/powersdk/b;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/powersdk/b;
    .locals 1

    sget-object v0, Lcom/umeng/powersdk/b;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/powersdk/b;->a:Landroid/content/Context;

    :cond_0
    invoke-static {}, Lcom/umeng/powersdk/b$a;->a()Lcom/umeng/powersdk/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/umeng/powersdk/a;
    .locals 11

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/umeng/powersdk/b;->a:Landroid/content/Context;

    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "level"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "voltage"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    const-string v5, "temperature"

    invoke-virtual {v1, v5, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    const-string v6, "status"

    invoke-virtual {v1, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6

    const/4 v7, -0x1

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    const/4 v10, 0x3

    if-eq v6, v10, :cond_1

    const/4 v10, 0x4

    if-eq v6, v10, :cond_1

    const/4 v10, 0x5

    if-eq v6, v10, :cond_0

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    goto :goto_0

    :cond_2
    const/4 v7, 0x1

    :cond_3
    :goto_0
    const-string v6, "plugged"

    invoke-virtual {v1, v6, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    if-eq v1, v9, :cond_5

    if-eq v1, v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v3, 0x2

    goto :goto_1

    :cond_5
    const/4 v3, 0x1

    :goto_1
    new-instance v1, Lcom/umeng/powersdk/a;

    invoke-direct {v1}, Lcom/umeng/powersdk/a;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput v2, v1, Lcom/umeng/powersdk/a;->a:I

    iput v4, v1, Lcom/umeng/powersdk/a;->b:I

    iput v7, v1, Lcom/umeng/powersdk/a;->d:I

    iput v5, v1, Lcom/umeng/powersdk/a;->c:I

    iput v3, v1, Lcom/umeng/powersdk/a;->e:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/umeng/powersdk/a;->f:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-object v0, v1

    :catchall_1
    move-object v1, v0

    :goto_2
    monitor-exit p0

    return-object v1
.end method
