.class Lcom/beizi/fusion/sm/a/a/o;
.super Ljava/lang/Object;
.source "SamsungImpl.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/d;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/sm/a/a/o;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/sm/a/c;)V
    .locals 3

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/sm/a/a/o;->a:Landroid/content/Context;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.samsung.android.deviceidservice"

    const-string v2, "com.samsung.android.deviceidservice.DeviceIdService"

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    iget-object v1, p0, Lcom/beizi/fusion/sm/a/a/o;->a:Landroid/content/Context;

    new-instance v2, Lcom/beizi/fusion/sm/a/a/o$1;

    invoke-direct {v2, p0}, Lcom/beizi/fusion/sm/a/a/o$1;-><init>(Lcom/beizi/fusion/sm/a/a/o;)V

    invoke-static {v1, v0, p1, v2}, Lcom/beizi/fusion/sm/a/a/m;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/beizi/fusion/sm/a/c;Lcom/beizi/fusion/sm/a/a/m$a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/sm/a/a/o;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "com.samsung.android.deviceidservice"

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :catch_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/beizi/fusion/sm/a/f;->a(Ljava/lang/Object;)V

    return v1
.end method
