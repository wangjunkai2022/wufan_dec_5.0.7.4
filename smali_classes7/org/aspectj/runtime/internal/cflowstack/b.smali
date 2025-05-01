.class public Lorg/aspectj/runtime/internal/cflowstack/b;
.super Ljava/lang/Object;
.source "ThreadCounterImpl11.java"

# interfaces
.implements Lorg/aspectj/runtime/internal/cflowstack/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aspectj/runtime/internal/cflowstack/b$a;
    }
.end annotation


# static fields
.field private static final e:I = 0x4e20

.field private static final f:I = 0x64


# instance fields
.field private a:Ljava/util/Hashtable;

.field private b:Ljava/lang/Thread;

.field private c:Lorg/aspectj/runtime/internal/cflowstack/b$a;

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->d:I

    return-void
.end method

.method private declared-synchronized e()Lorg/aspectj/runtime/internal/cflowstack/b$a;
    .locals 4

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->b:Ljava/lang/Thread;

    if-eq v0, v1, :cond_4

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->b:Ljava/lang/Thread;

    .line 3
    iget-object v1, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    invoke-virtual {v1, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;

    iput-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->c:Lorg/aspectj/runtime/internal/cflowstack/b$a;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;

    invoke-direct {v0}, Lorg/aspectj/runtime/internal/cflowstack/b$a;-><init>()V

    iput-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->c:Lorg/aspectj/runtime/internal/cflowstack/b$a;

    .line 5
    iget-object v1, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    iget-object v2, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->b:Ljava/lang/Thread;

    invoke-virtual {v1, v2, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_0
    iget v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->d:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->d:I

    .line 7
    iget-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->size()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 8
    iget v1, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->d:I

    const/16 v2, 0x64

    const/16 v3, 0x4e20

    div-int/2addr v3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-le v1, v0, :cond_4

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    iget-object v1, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 11
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Thread;

    .line 12
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 13
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Thread;

    .line 15
    iget-object v2, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->a:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->d:I

    .line 17
    :cond_4
    iget-object v0, p0, Lorg/aspectj/runtime/internal/cflowstack/b;->c:Lorg/aspectj/runtime/internal/cflowstack/b$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/cflowstack/b;->e()Lorg/aspectj/runtime/internal/cflowstack/b$a;

    move-result-object v0

    iget v1, v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;->a:I

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/cflowstack/b;->e()Lorg/aspectj/runtime/internal/cflowstack/b$a;

    move-result-object v0

    iget v1, v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;->a:I

    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/cflowstack/b;->e()Lorg/aspectj/runtime/internal/cflowstack/b$a;

    move-result-object v0

    iget v0, v0, Lorg/aspectj/runtime/internal/cflowstack/b$a;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
