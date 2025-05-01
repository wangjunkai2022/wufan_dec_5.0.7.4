.class Lcom/beizi/fusion/sm/a/a/n$1;
.super Ljava/lang/Object;
.source "OppoImpl.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/a/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/sm/a/a/n;->a(Lcom/beizi/fusion/sm/a/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/sm/a/a/n;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/sm/a/a/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/sm/a/a/n$1;->a:Lcom/beizi/fusion/sm/a/a/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/beizi/fusion/sm/a/e;,
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/sm/a/a/n$1;->a:Lcom/beizi/fusion/sm/a/a/n;

    invoke-static {v0, p1}, Lcom/beizi/fusion/sm/a/a/n;->a(Lcom/beizi/fusion/sm/a/a/n;Landroid/os/IBinder;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/beizi/fusion/sm/a/e; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    new-instance v0, Lcom/beizi/fusion/sm/a/e;

    invoke-direct {v0, p1}, Lcom/beizi/fusion/sm/a/e;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 3
    :goto_0
    throw p1
.end method
