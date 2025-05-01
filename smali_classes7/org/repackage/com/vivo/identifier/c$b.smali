.class Lorg/repackage/com/vivo/identifier/c$b;
.super Landroid/os/Handler;
.source "IdentifierIdClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/repackage/com/vivo/identifier/c;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_9

    .line 2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "appid"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    :try_start_0
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->i0()Lorg/repackage/com/vivo/identifier/b;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lorg/repackage/com/vivo/identifier/b;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_8

    .line 5
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->K(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    .line 6
    :cond_1
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->G(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_8

    .line 7
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->C(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    .line 8
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->y(Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    const/16 p1, 0xa

    .line 9
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/repackage/com/vivo/identifier/c;->u(ILjava/lang/String;)V

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_6

    .line 10
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->r(Ljava/lang/String;)Ljava/lang/String;

    :cond_6
    const/16 p1, 0x9

    .line 11
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/repackage/com/vivo/identifier/c;->u(ILjava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_7
    invoke-static {p1}, Lorg/repackage/com/vivo/identifier/c;->h(Ljava/lang/String;)Ljava/lang/String;

    const/16 p1, 0x8

    .line 13
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->j0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/repackage/com/vivo/identifier/c;->u(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readException:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    :cond_8
    :goto_0
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->b()Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    .line 16
    :try_start_1
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 17
    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_9
    :goto_1
    return-void
.end method
