.class public abstract Lcom/beizi/fusion/e/b/d$a;
.super Landroid/os/Binder;
.source "OnePlusIDInterface.java"

# interfaces
.implements Lcom/beizi/fusion/e/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/e/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/e/b/d$a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/os/IBinder;)Lcom/beizi/fusion/e/b/d;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.heytap.openid.IOpenID"

    .line 1
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    instance-of v1, v0, Lcom/beizi/fusion/e/b/d;

    if-nez v1, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    check-cast v0, Lcom/beizi/fusion/e/b/d;

    return-object v0

    .line 4
    :cond_2
    :goto_0
    new-instance v0, Lcom/beizi/fusion/e/b/d$a$a;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/e/b/d$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
