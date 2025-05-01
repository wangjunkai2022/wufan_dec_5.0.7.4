.class Lcom/beizi/fusion/sm/a/a/d;
.super Ljava/lang/Object;
.source "DefaultImpl.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/d;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/sm/a/c;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/beizi/fusion/sm/a/e;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/beizi/fusion/sm/a/c;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
