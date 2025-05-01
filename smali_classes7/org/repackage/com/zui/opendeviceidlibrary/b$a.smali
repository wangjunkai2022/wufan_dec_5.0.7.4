.class Lorg/repackage/com/zui/opendeviceidlibrary/b$a;
.super Ljava/lang/Object;
.source "OpenDeviceId.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/repackage/com/zui/opendeviceidlibrary/b;->a(Landroid/content/Context;Lorg/repackage/com/zui/opendeviceidlibrary/b$b;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/repackage/com/zui/opendeviceidlibrary/b;


# direct methods
.method constructor <init>(Lorg/repackage/com/zui/opendeviceidlibrary/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    invoke-static {p2}, Lorg/repackage/com/zui/deviceidservice/a$a;->a(Landroid/os/IBinder;)Lorg/repackage/com/zui/deviceidservice/a;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->c(Lorg/repackage/com/zui/opendeviceidlibrary/b;Lorg/repackage/com/zui/deviceidservice/a;)Lorg/repackage/com/zui/deviceidservice/a;

    .line 2
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    invoke-static {p1}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->d(Lorg/repackage/com/zui/opendeviceidlibrary/b;)Lorg/repackage/com/zui/opendeviceidlibrary/b$b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    invoke-static {p1}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->d(Lorg/repackage/com/zui/opendeviceidlibrary/b;)Lorg/repackage/com/zui/opendeviceidlibrary/b$b;

    move-result-object p1

    const-string p2, "Deviceid Service Connected"

    iget-object v0, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    invoke-interface {p1, p2, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/b$b;->a(Ljava/lang/Object;Lorg/repackage/com/zui/opendeviceidlibrary/b;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    const-string p2, "Service onServiceConnected"

    invoke-static {p1, p2}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->f(Lorg/repackage/com/zui/opendeviceidlibrary/b;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->c(Lorg/repackage/com/zui/opendeviceidlibrary/b;Lorg/repackage/com/zui/deviceidservice/a;)Lorg/repackage/com/zui/deviceidservice/a;

    .line 2
    iget-object p1, p0, Lorg/repackage/com/zui/opendeviceidlibrary/b$a;->b:Lorg/repackage/com/zui/opendeviceidlibrary/b;

    const-string v0, "Service onServiceDisconnected"

    invoke-static {p1, v0}, Lorg/repackage/com/zui/opendeviceidlibrary/b;->f(Lorg/repackage/com/zui/opendeviceidlibrary/b;Ljava/lang/String;)V

    return-void
.end method
