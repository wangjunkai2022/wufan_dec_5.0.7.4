.class Lcom/beizi/fusion/d/e$a;
.super Landroid/content/BroadcastReceiver;
.source "BaseManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/d/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/d/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "updateResult"

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/beizi/fusion/d/e;->b(Lcom/beizi/fusion/d/e;Z)Z

    const-string v0, "com.ad.action.UPDATE_CONFIG_SUCCESS"

    .line 4
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    if-ne p2, v1, :cond_2

    .line 5
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2}, Lcom/beizi/fusion/d/e;->j(Lcom/beizi/fusion/d/e;)Ljava/util/Timer;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2}, Lcom/beizi/fusion/d/e;->j(Lcom/beizi/fusion/d/e;)Ljava/util/Timer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Timer;->cancel()V

    .line 7
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2, p1}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Ljava/util/Timer;)Ljava/util/Timer;

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    iget-object p2, p1, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    goto :goto_0

    :cond_2
    if-nez p2, :cond_4

    .line 9
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2}, Lcom/beizi/fusion/d/e;->k(Lcom/beizi/fusion/d/e;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 10
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2}, Lcom/beizi/fusion/d/e;->j(Lcom/beizi/fusion/d/e;)Ljava/util/Timer;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 11
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2}, Lcom/beizi/fusion/d/e;->j(Lcom/beizi/fusion/d/e;)Ljava/util/Timer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Timer;->cancel()V

    .line 12
    iget-object p2, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    invoke-static {p2, p1}, Lcom/beizi/fusion/d/e;->a(Lcom/beizi/fusion/d/e;Ljava/util/Timer;)Ljava/util/Timer;

    .line 13
    :cond_3
    iget-object p1, p0, Lcom/beizi/fusion/d/e$a;->a:Lcom/beizi/fusion/d/e;

    iget-object p2, p1, Lcom/beizi/fusion/d/e;->d:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return-void
.end method
