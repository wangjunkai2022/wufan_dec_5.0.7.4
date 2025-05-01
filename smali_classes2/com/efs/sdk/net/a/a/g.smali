.class public final Lcom/efs/sdk/net/a/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/net/a/a/f;


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static c:Lcom/efs/sdk/net/a/a/g;


# instance fields
.field private b:Lcom/efs/sdk/net/a/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/efs/sdk/net/a/a/g;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/efs/sdk/net/a/a/b;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/a/b;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/net/a/a/g;->b:Lcom/efs/sdk/net/a/a/b;

    return-void
.end method

.method public static c()Lcom/efs/sdk/net/a/a/g;
    .locals 1

    .line 1
    sget-object v0, Lcom/efs/sdk/net/a/a/g;->c:Lcom/efs/sdk/net/a/a/g;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/efs/sdk/net/a/a/g;

    invoke-direct {v0}, Lcom/efs/sdk/net/a/a/g;-><init>()V

    sput-object v0, Lcom/efs/sdk/net/a/a/g;->c:Lcom/efs/sdk/net/a/a/g;

    .line 3
    :cond_0
    sget-object v0, Lcom/efs/sdk/net/a/a/g;->c:Lcom/efs/sdk/net/a/a/g;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/io/InputStream;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "NetTrace-Interceptor"

    const-string v1, "interpret response stream"

    .line 41
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    invoke-static {p1, p2, p3, p4}, Lcom/efs/sdk/net/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final a()V
    .locals 2

    const-string v0, "NetTrace-Interceptor"

    const-string v1, "data sent"

    .line 43
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/efs/sdk/net/a/a/f$b;)V
    .locals 8

    const-string v0, "Content-Type"

    const-string v1, "NetTrace-Interceptor"

    const-string v2, "request will be sent"

    .line 1
    invoke-static {v1, v2}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/efs/sdk/net/a/a/g;->b:Lcom/efs/sdk/net/a/a/b;

    .line 3
    :try_start_0
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$c;->a()Ljava/lang/String;

    move-result-object v3

    .line 4
    iget-object v2, v2, Lcom/efs/sdk/net/a/a/b;->a:Ljava/util/Map;

    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "save request"

    .line 5
    invoke-static {v1, v2}, Lcom/efs/sdk/base/core/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-static {}, Lcom/efs/sdk/net/a/a;->a()Lcom/efs/sdk/net/a/a;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/efs/sdk/net/a/a;->a(Ljava/lang/String;)Lcom/efs/sdk/net/a/c;

    move-result-object v1

    .line 7
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$b;->b()Ljava/lang/String;

    move-result-object v2

    .line 8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 9
    iput-object v2, v1, Lcom/efs/sdk/net/a/c;->d:Ljava/lang/String;

    .line 10
    :cond_0
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$b;->c()Ljava/lang/String;

    move-result-object v2

    .line 11
    iput-object v2, v1, Lcom/efs/sdk/net/a/c;->e:Ljava/lang/String;

    .line 12
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x0

    .line 13
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$a;->e()I

    move-result v4

    :goto_0
    if-ge v3, v4, :cond_1

    .line 14
    invoke-interface {p1, v3}, Lcom/efs/sdk/net/a/a/f$a;->a(I)Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-interface {p1, v3}, Lcom/efs/sdk/net/a/a/f$a;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 16
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 17
    :cond_1
    invoke-static {p1}, Lcom/efs/sdk/net/a/a/b;->a(Lcom/efs/sdk/net/a/a/f$b;)J

    move-result-wide v3

    .line 18
    iput-wide v3, v1, Lcom/efs/sdk/net/a/c;->f:J

    .line 19
    invoke-static {}, Lcom/efs/sdk/net/NetManager;->getNetConfigManager()Lcom/efs/sdk/net/NetConfigManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/efs/sdk/net/NetConfigManager;->getNetRequestBodyCollectState()Z

    move-result v3

    if-nez v3, :cond_2

    return-void

    .line 20
    :cond_2
    iget-object v3, v1, Lcom/efs/sdk/net/a/c;->e:Ljava/lang/String;

    if-eqz v3, :cond_3

    const-string v4, "get"

    .line 21
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    .line 22
    :cond_3
    iget-object v3, v1, Lcom/efs/sdk/net/a/c;->e:Ljava/lang/String;

    if-eqz v3, :cond_8

    const-string v4, "post"

    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 24
    iget-wide v3, v1, Lcom/efs/sdk/net/a/c;->f:J

    const-wide/16 v5, 0x2800

    cmp-long v7, v3, v5

    if-ltz v7, :cond_4

    return-void

    .line 25
    :cond_4
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "content-type"

    if-nez v3, :cond_5

    :try_start_1
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 26
    :cond_5
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 28
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_6
    if-eqz v0, :cond_8

    const-string v2, "application/json"

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "application/x-www-form-urlencoded"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 30
    :cond_7
    new-instance v0, Ljava/lang/String;

    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$b;->d()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 31
    iput-object v0, v1, Lcom/efs/sdk/net/a/c;->g:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final a(Lcom/efs/sdk/net/a/a/f$d;)V
    .locals 3

    const-string v0, "NetTrace-Interceptor"

    const-string v1, "response headers received"

    .line 33
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v1, p0, Lcom/efs/sdk/net/a/a/g;->b:Lcom/efs/sdk/net/a/a/b;

    const-string v2, "save response"

    .line 35
    invoke-static {v0, v2}, Lcom/efs/sdk/base/core/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$e;->a()Ljava/lang/String;

    move-result-object v0

    .line 37
    iget-object v1, v1, Lcom/efs/sdk/net/a/a/b;->a:Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 38
    invoke-static {}, Lcom/efs/sdk/net/a/a;->a()Lcom/efs/sdk/net/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/efs/sdk/net/a/a;->a(Ljava/lang/String;)Lcom/efs/sdk/net/a/c;

    move-result-object v0

    .line 39
    invoke-interface {p1}, Lcom/efs/sdk/net/a/a/f$e;->b()I

    move-result p1

    .line 40
    iput p1, v0, Lcom/efs/sdk/net/a/c;->h:I

    :cond_0
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-string v0, "NetTrace-Interceptor"

    const-string v1, "next request id"

    .line 1
    invoke-static {v0, v1}, Lcom/efs/sdk/base/core/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/efs/sdk/net/a/a/g;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
