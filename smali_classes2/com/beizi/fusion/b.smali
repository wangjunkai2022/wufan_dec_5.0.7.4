.class public final Lcom/beizi/fusion/b;
.super Ljava/lang/Object;
.source "MBridgeSDKManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/b$d;,
        Lcom/beizi/fusion/b$c;,
        Lcom/beizi/fusion/b$b;,
        Lcom/beizi/fusion/b$a;
    }
.end annotation


# static fields
.field private static e:Lcom/beizi/fusion/b$d;


# instance fields
.field private a:Landroid/content/Context;

.field private volatile b:Ljava/lang/String;

.field private volatile c:Ljava/lang/String;

.field private volatile d:Lcom/beizi/fusion/b$c;

.field private f:Lcom/mbridge/msdk/MBridgeSDK;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lcom/beizi/fusion/b$d;->a:Lcom/beizi/fusion/b$d;

    sput-object v0, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/fusion/b$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/fusion/b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/b$d;)Lcom/beizi/fusion/b$d;
    .locals 0

    .line 1
    sput-object p0, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    return-object p0
.end method

.method public static a()Lcom/beizi/fusion/b;
    .locals 1

    .line 2
    invoke-static {}, Lcom/beizi/fusion/b$a;->a()Lcom/beizi/fusion/b;

    move-result-object v0

    return-object v0
.end method

.method private a(ZLjava/util/Map;Lcom/beizi/fusion/b$c;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/fusion/b$c;",
            ")V"
        }
    .end annotation

    .line 19
    :try_start_0
    sput-boolean p1, Lcom/mbridge/msdk/MBridgeConstans;->DEBUG:Z

    .line 20
    invoke-static {}, Lcom/mbridge/msdk/out/MBridgeSDKFactory;->getMBridgeSDK()Lcom/mbridge/msdk/system/a;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/fusion/b;->f:Lcom/mbridge/msdk/MBridgeSDK;

    .line 21
    iget-object v0, p0, Lcom/beizi/fusion/b;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/beizi/fusion/b;->b:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/mbridge/msdk/MBridgeSDK;->getMBConfigurationMap(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 22
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 24
    :cond_0
    iget-object p2, p0, Lcom/beizi/fusion/b;->f:Lcom/mbridge/msdk/MBridgeSDK;

    iget-object v0, p0, Lcom/beizi/fusion/b;->a:Landroid/content/Context;

    new-instance v1, Lcom/beizi/fusion/b$b;

    iget-object v2, p0, Lcom/beizi/fusion/b;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/beizi/fusion/b;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    invoke-direct {v1, v2, v3, v4}, Lcom/beizi/fusion/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/fusion/b$c;)V

    invoke-interface {p2, p1, v0, v1}, Lcom/mbridge/msdk/MBridgeSDK;->init(Ljava/util/Map;Landroid/content/Context;Lcom/mbridge/msdk/out/SDKInitStatusListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    sget-object p2, Lcom/beizi/fusion/b$d;->d:Lcom/beizi/fusion/b$d;

    sput-object p2, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    .line 26
    iget-object p2, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    if-eqz p2, :cond_1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lcom/beizi/fusion/b$c;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "context must not null"

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    const-string v1, ""

    move-object p1, v1

    const/4 v1, 0x1

    .line 28
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p1, "appKey or appID must not null"

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " & appKey or appID must not null"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    if-nez v0, :cond_4

    .line 30
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_4

    .line 31
    iget-object p2, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    if-eqz p2, :cond_4

    .line 32
    sget-object p2, Lcom/beizi/fusion/b$d;->d:Lcom/beizi/fusion/b$d;

    sput-object p2, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    .line 33
    iget-object p2, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    invoke-interface {p2, p1}, Lcom/beizi/fusion/b$c;->a(Ljava/lang/String;)V

    :cond_4
    return v0
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lcom/beizi/fusion/b$c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/fusion/b$c;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    .line 3
    :try_start_0
    sget-object v0, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    sget-object v1, Lcom/beizi/fusion/b$d;->b:Lcom/beizi/fusion/b$d;

    if-ne v0, v1, :cond_1

    if-eqz p6, :cond_0

    const-string p1, "sdk is initializing"

    .line 4
    invoke-interface {p6, p1}, Lcom/beizi/fusion/b$c;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_0
    monitor-exit p0

    return-void

    .line 6
    :cond_1
    :try_start_1
    iput-object p6, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/beizi/fusion/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p6

    if-eqz p6, :cond_4

    .line 8
    sget-object p6, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    sget-object v0, Lcom/beizi/fusion/b$d;->c:Lcom/beizi/fusion/b$d;

    if-ne p6, v0, :cond_3

    .line 9
    iget-object p6, p0, Lcom/beizi/fusion/b;->c:Ljava/lang/String;

    invoke-static {p6, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p6

    if-eqz p6, :cond_3

    iget-object p6, p0, Lcom/beizi/fusion/b;->b:Ljava/lang/String;

    invoke-static {p6, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p6

    if-eqz p6, :cond_3

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    if-eqz p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    iget-object p2, p0, Lcom/beizi/fusion/b;->b:Ljava/lang/String;

    iget-object p3, p0, Lcom/beizi/fusion/b;->c:Ljava/lang/String;

    invoke-interface {p1, p2, p3}, Lcom/beizi/fusion/b$c;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    :cond_2
    monitor-exit p0

    return-void

    .line 13
    :cond_3
    :try_start_2
    sput-object v1, Lcom/beizi/fusion/b;->e:Lcom/beizi/fusion/b$d;

    .line 14
    iput-object p1, p0, Lcom/beizi/fusion/b;->a:Landroid/content/Context;

    .line 15
    iput-object p2, p0, Lcom/beizi/fusion/b;->b:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Lcom/beizi/fusion/b;->c:Ljava/lang/String;

    .line 17
    iget-object p1, p0, Lcom/beizi/fusion/b;->d:Lcom/beizi/fusion/b$c;

    invoke-direct {p0, p4, p5, p1}, Lcom/beizi/fusion/b;->a(ZLjava/util/Map;Lcom/beizi/fusion/b$c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
