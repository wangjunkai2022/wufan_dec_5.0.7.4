.class public Lcom/beizi/fusion/e/a/d;
.super Ljava/lang/Object;
.source "LenovoDeviceIDHelper.java"


# instance fields
.field a:Lcom/beizi/fusion/e/b/c;

.field b:Landroid/content/ServiceConnection;

.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/beizi/fusion/e/a/d$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/e/a/d$1;-><init>(Lcom/beizi/fusion/e/a/d;)V

    iput-object v0, p0, Lcom/beizi/fusion/e/a/d;->b:Landroid/content/ServiceConnection;

    .line 3
    iput-object p1, p0, Lcom/beizi/fusion/e/a/d;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(Lcom/beizi/fusion/e/a/b$a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/e/a/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.zui.deviceidservice"

    const-string v2, "com.zui.deviceidservice.DeviceidService"

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/e/a/d;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/beizi/fusion/e/a/d;->b:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/e/a/d;->a:Lcom/beizi/fusion/e/b/c;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Lcom/beizi/fusion/e/b/c;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {p1, v0}, Lcom/beizi/fusion/e/a/b$a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
