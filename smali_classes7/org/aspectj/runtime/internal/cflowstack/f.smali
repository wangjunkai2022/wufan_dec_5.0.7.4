.class public Lorg/aspectj/runtime/internal/cflowstack/f;
.super Ljava/lang/Object;
.source "ThreadStackFactoryImpl.java"

# interfaces
.implements Lorg/aspectj/runtime/internal/cflowstack/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aspectj/runtime/internal/cflowstack/f$a;,
        Lorg/aspectj/runtime/internal/cflowstack/f$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lorg/aspectj/runtime/internal/cflowstack/a;
    .locals 2

    .line 1
    new-instance v0, Lorg/aspectj/runtime/internal/cflowstack/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/aspectj/runtime/internal/cflowstack/f$a;-><init>(Lorg/aspectj/runtime/internal/cflowstack/e;)V

    return-object v0
.end method

.method public b()Lorg/aspectj/runtime/internal/cflowstack/c;
    .locals 2

    .line 1
    new-instance v0, Lorg/aspectj/runtime/internal/cflowstack/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/aspectj/runtime/internal/cflowstack/f$b;-><init>(Lorg/aspectj/runtime/internal/cflowstack/e;)V

    return-object v0
.end method
