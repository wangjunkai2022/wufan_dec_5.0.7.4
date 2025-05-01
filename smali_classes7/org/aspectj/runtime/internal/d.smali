.class public Lorg/aspectj/runtime/internal/d;
.super Ljava/lang/Object;
.source "CFlowStack.java"


# static fields
.field private static b:Lorg/aspectj/runtime/internal/cflowstack/d;


# instance fields
.field private a:Lorg/aspectj/runtime/internal/cflowstack/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lorg/aspectj/runtime/internal/d;->p()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lorg/aspectj/runtime/internal/d;->b:Lorg/aspectj/runtime/internal/cflowstack/d;

    invoke-interface {v0}, Lorg/aspectj/runtime/internal/cflowstack/d;->b()Lorg/aspectj/runtime/internal/cflowstack/c;

    move-result-object v0

    iput-object v0, p0, Lorg/aspectj/runtime/internal/d;->a:Lorg/aspectj/runtime/internal/cflowstack/c;

    return-void
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object p1
.end method

.method private static c()Lorg/aspectj/runtime/internal/cflowstack/d;
    .locals 1

    .line 1
    new-instance v0, Lorg/aspectj/runtime/internal/cflowstack/f;

    invoke-direct {v0}, Lorg/aspectj/runtime/internal/cflowstack/f;-><init>()V

    return-object v0
.end method

.method private static d()Lorg/aspectj/runtime/internal/cflowstack/d;
    .locals 1

    .line 1
    new-instance v0, Lorg/aspectj/runtime/internal/cflowstack/g;

    invoke-direct {v0}, Lorg/aspectj/runtime/internal/cflowstack/g;-><init>()V

    return-object v0
.end method

.method private e()Ljava/util/Stack;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/aspectj/runtime/internal/d;->a:Lorg/aspectj/runtime/internal/cflowstack/c;

    invoke-interface {v0}, Lorg/aspectj/runtime/internal/cflowstack/c;->a()Ljava/util/Stack;

    move-result-object v0

    return-object v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/aspectj/runtime/internal/d;->b:Lorg/aspectj/runtime/internal/cflowstack/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static p()V
    .locals 4

    const-string v0, "aspectj.runtime.cflowstack.usethreadlocal"

    const-string v1, "unspecified"

    .line 1
    invoke-static {v0, v1}, Lorg/aspectj/runtime/internal/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const-string v0, "java.class.version"

    const-string v1, "0.0"

    .line 3
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "46.0"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_2

    :cond_0
    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "yes"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 6
    invoke-static {}, Lorg/aspectj/runtime/internal/d;->c()Lorg/aspectj/runtime/internal/cflowstack/d;

    move-result-object v0

    sput-object v0, Lorg/aspectj/runtime/internal/d;->b:Lorg/aspectj/runtime/internal/cflowstack/d;

    goto :goto_2

    .line 7
    :cond_3
    invoke-static {}, Lorg/aspectj/runtime/internal/d;->d()Lorg/aspectj/runtime/internal/cflowstack/d;

    move-result-object v0

    sput-object v0, Lorg/aspectj/runtime/internal/d;->b:Lorg/aspectj/runtime/internal/cflowstack/d;

    :goto_2
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/aspectj/runtime/internal/d;->i()Lb4/a;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0, p1}, Lb4/a;->a(I)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public g()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public h()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    invoke-direct {v0}, Lorg/aspectj/lang/NoAspectBoundException;-><init>()V

    throw v0
.end method

.method public i()Lb4/a;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/a;

    return-object v0
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/aspectj/runtime/internal/d;->i()Lb4/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lb4/a;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lorg/aspectj/lang/NoAspectBoundException;

    invoke-direct {v0}, Lorg/aspectj/lang/NoAspectBoundException;-><init>()V

    throw v0
.end method

.method public k()Lb4/a;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/a;

    return-object v0
.end method

.method public l()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 3
    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lorg/aspectj/runtime/internal/d;->a:Lorg/aspectj/runtime/internal/cflowstack/c;

    invoke-interface {v0}, Lorg/aspectj/runtime/internal/cflowstack/c;->b()V

    :cond_0
    return-void
.end method

.method public m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public n([Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    new-instance v1, Lorg/aspectj/runtime/internal/c;

    invoke-direct {v1, p1}, Lorg/aspectj/runtime/internal/c;-><init>([Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/aspectj/runtime/internal/d;->e()Ljava/util/Stack;

    move-result-object v0

    new-instance v1, Lb4/a;

    invoke-direct {v1, p1}, Lb4/a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
