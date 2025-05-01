.class Lcom/umeng/analytics/pro/bb;
.super Ljava/lang/Object;
.source "HonorDeviceIdSupplier.java"

# interfaces
.implements Lcom/umeng/analytics/pro/ax;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/umeng/analytics/pro/bb$a;,
        Lcom/umeng/analytics/pro/bb$c;,
        Lcom/umeng/analytics/pro/bb$b;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    sput-object p0, Lcom/umeng/analytics/pro/bb;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2
    :cond_0
    new-instance v1, Lcom/umeng/analytics/pro/bb$a;

    invoke-direct {v1, v0}, Lcom/umeng/analytics/pro/bb$a;-><init>(Lcom/umeng/analytics/pro/bb$1;)V

    .line 3
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.hihonor.id.HnOaIdService"

    .line 4
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "com.hihonor.id"

    .line 5
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, 0x1

    .line 6
    invoke-virtual {p1, v2, v1, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7
    :try_start_0
    invoke-virtual {v1}, Lcom/umeng/analytics/pro/bb$a;->a()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/analytics/pro/c$b;->a(Landroid/os/IBinder;)Lcom/umeng/analytics/pro/c;

    move-result-object v2

    .line 8
    new-instance v3, Lcom/umeng/analytics/pro/bb$b;

    invoke-direct {v3, v0}, Lcom/umeng/analytics/pro/bb$b;-><init>(Lcom/umeng/analytics/pro/bb$1;)V

    .line 9
    invoke-interface {v2, v3}, Lcom/umeng/analytics/pro/c;->a(Lcom/umeng/analytics/pro/b;)V

    .line 10
    sget-object v0, Lcom/umeng/analytics/pro/bb;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 12
    throw v0

    .line 13
    :catch_0
    invoke-virtual {p1, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_1
    return-object v0
.end method
