.class public Lcom/aggmoread/sdk/z/c/a/a/e/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/e/b$c;
    }
.end annotation


# static fields
.field private static e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/aggmoread/sdk/z/c/a/a/e/b;",
            ">;>;"
        }
    .end annotation
.end field

.field private static f:Lcom/aggmoread/sdk/z/c/a/a/e/h;


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:[B

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->e:Ljava/util/Map;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/h;

    const-string v1, "cc_default"

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/h;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->f:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/b;J)J
    .locals 0

    iput-wide p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b:J

    return-wide p1
.end method

.method public static a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/e/b;
    .locals 4

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->e:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    const-class v1, Lcom/aggmoread/sdk/z/c/a/a/e/b;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/e/b;->e:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;

    :cond_1
    if-nez v0, :cond_2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/e/b;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/e/b;->e:Ljava/util/Map;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_1
    return-object v0
.end method

.method static synthetic a()Lcom/aggmoread/sdk/z/c/a/a/e/h;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->f:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    return-object v0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/z/c/a/a/e/b;[B)[B
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->c:[B

    return-object p1
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/b$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/b;Lcom/aggmoread/sdk/z/c/a/a/e/b$c;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a([B)V
    .locals 4

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->c:[B

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b:J

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b:J

    :cond_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->f:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a:Ljava/lang/String;

    iget-wide v2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b(Ljava/lang/String;J)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->f:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_v"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "20080717"

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/b$a;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/b$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/b;[B)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->c:[B

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->b:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/e/b;->d:Ljava/lang/String;

    return-object v0
.end method
