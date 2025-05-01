.class final Lcom/umeng/pagesdk/b$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/pagesdk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/pagesdk/b;


# direct methods
.method constructor <init>(Lcom/umeng/pagesdk/b;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/pagesdk/b$1;->a:Lcom/umeng/pagesdk/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "level"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v1, "voltage"

    invoke-virtual {p2, v1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v2, "temperature"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "status"

    invoke-virtual {p2, v3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    const/4 v7, 0x4

    if-eq v3, v7, :cond_1

    const/4 v7, 0x5

    if-eq v3, v7, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    :cond_3
    :goto_0
    const-string v3, "plugged"

    invoke-virtual {p2, v3, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-eq p2, v6, :cond_5

    if-eq p2, v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x2

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    :goto_1
    new-instance p2, Lcom/umeng/pagesdk/a;

    invoke-direct {p2}, Lcom/umeng/pagesdk/a;-><init>()V

    iput p1, p2, Lcom/umeng/pagesdk/a;->a:I

    iput v1, p2, Lcom/umeng/pagesdk/a;->b:I

    iput v4, p2, Lcom/umeng/pagesdk/a;->d:I

    iput v2, p2, Lcom/umeng/pagesdk/a;->c:I

    iput v0, p2, Lcom/umeng/pagesdk/a;->e:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p2, Lcom/umeng/pagesdk/a;->f:J

    iget-object p1, p0, Lcom/umeng/pagesdk/b$1;->a:Lcom/umeng/pagesdk/b;

    invoke-static {p1}, Lcom/umeng/pagesdk/b;->a(Lcom/umeng/pagesdk/b;)Lcom/umeng/pagesdk/b$b;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/umeng/pagesdk/b$1;->a:Lcom/umeng/pagesdk/b;

    invoke-static {p1}, Lcom/umeng/pagesdk/b;->a(Lcom/umeng/pagesdk/b;)Lcom/umeng/pagesdk/b$b;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/umeng/pagesdk/b$b;->a(Lcom/umeng/pagesdk/a;)V

    :cond_6
    iget-object p1, p0, Lcom/umeng/pagesdk/b$1;->a:Lcom/umeng/pagesdk/b;

    invoke-static {p1}, Lcom/umeng/pagesdk/b;->b(Lcom/umeng/pagesdk/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_7
    return-void
.end method
