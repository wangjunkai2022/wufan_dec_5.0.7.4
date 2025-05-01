.class public Lcom/aggmoread/sdk/z/c/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/b$a;
    }
.end annotation


# static fields
.field private static a:Z

.field private static b:Z

.field private static final c:Ljava/util/concurrent/LinkedBlockingDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingDeque<",
            "[",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static d:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/b;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/b;->d:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)I
    .locals 1

    const/16 v0, 0xe

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v0, 0x0

    aget p0, p0, v0

    return p0
.end method

.method public static a(II)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput p0, v0, v1

    const/4 p0, 0x1

    aput p1, v0, p0

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;[I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xa

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static a()V
    .locals 3

    sget-boolean v0, Lcom/aggmoread/sdk/z/c/a/a/b;->a:Z

    if-nez v0, :cond_1

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/b;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/aggmoread/sdk/z/c/a/a/b;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const-string v1, "AMNAME"

    :try_start_1
    const-class v2, Lcom/aggmoread/sdk/z/c/a/a/b$a;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    const-string v1, "aggcore"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const/4 v1, 0x0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sput-boolean v1, Lcom/aggmoread/sdk/z/c/a/a/b;->a:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_0
    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public static a([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a([Ljava/lang/Object;Landroid/content/Context;)V
    .locals 0

    sget-boolean p1, Lcom/aggmoread/sdk/z/c/a/a/b;->b:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/b;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/LinkedBlockingDeque;->offer(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Z)Z
    .locals 10

    sget-boolean v0, Lcom/aggmoread/sdk/z/c/a/a/b;->b:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/b;

    monitor-enter v0

    :try_start_0
    sget-boolean v2, Lcom/aggmoread/sdk/z/c/a/a/b;->b:Z

    if-nez v2, :cond_0

    const/16 v2, 0xb

    const/4 v3, 0x5

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p0, v4, v5

    sget-object p0, Lcom/aggmoread/sdk/z/c/a/a/b;->c:Ljava/util/concurrent/LinkedBlockingDeque;

    aput-object p0, v4, v1

    const/16 p0, 0xa

    new-array p0, p0, [I

    const/4 v6, 0x2

    aput v6, p0, v5

    aput v5, p0, v1

    aput v1, p0, v6

    const/4 v7, 0x3

    aput v7, p0, v7

    const/4 v8, 0x4

    aput v8, p0, v8

    aput v3, p0, v3

    const/4 v3, 0x7

    const/4 v9, 0x6

    aput v3, p0, v9

    aput v9, p0, v3

    const/16 v3, 0x9

    const/16 v9, 0x8

    aput v3, p0, v9

    aput v9, p0, v3

    aput-object p0, v4, v6

    sget-object p0, Lcom/aggmoread/sdk/z/c/a/a/b;->d:[Ljava/lang/Object;

    aput-object p0, v4, v7

    new-array p0, v1, [Z

    aput-boolean p1, p0, v5

    aput-object p0, v4, v8

    invoke-static {v2, v4}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Z

    aget-boolean p0, p0, v5

    sput-boolean p0, Lcom/aggmoread/sdk/z/c/a/a/b;->b:Z

    monitor-exit v0

    return p0

    :cond_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    return v1
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static a([I)[B
    .locals 1

    const/16 v0, 0xd

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0xf

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x9

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method public static b([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static b()[Ljava/lang/Object;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    const/4 v1, 0x5

    aput-object v2, v0, v1

    const/4 v1, 0x6

    aput-object v2, v0, v1

    const/4 v1, 0x7

    aput-object v2, v0, v1

    const/16 v1, 0x8

    aput-object v2, v0, v1

    const/16 v1, 0x9

    aput-object v2, v0, v1

    const/16 v2, 0x12

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    aput-object v2, v0, v1

    return-object v0

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public static c(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x11

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x10

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method public static c()V
    .locals 2

    const/16 v0, 0x13

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static c([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x6

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x12

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method public static d([Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x7

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput v3, v2, v3

    aput-object v2, v0, v3

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static e([Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x14

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static f(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput v1, v2, v3

    aput-object v2, v0, v3

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static f([Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x8

    invoke-static {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static g(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0xa

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static h(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0xb

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    const/16 v4, 0xc

    aput v4, v2, v3

    aput-object v2, v0, v3

    aput-object p0, v0, v1

    invoke-static {v4, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static j(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0xd

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static k(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0xe

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static l(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0xf

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static m(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    new-array v3, v2, [I

    const/4 v4, 0x0

    aput v0, v3, v4

    aput-object v3, v1, v4

    aput-object p0, v1, v2

    const/16 p0, 0xc

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static n(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x3

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static o(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x4

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static p(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x5

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static q(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x6

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static r(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x7

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static s(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0x8

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static t(Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/16 v3, 0x9

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    aput-object p0, v0, v1

    const/16 p0, 0xc

    invoke-static {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/b$a;->a(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
