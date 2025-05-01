.class Lcom/beizi/fusion/widget/LandingView$3$1;
.super Ljava/lang/Object;
.source "LandingView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/widget/LandingView$3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/widget/LandingView$3;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/widget/LandingView$3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v0, v0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/LandingView;->c(Lcom/beizi/fusion/widget/LandingView;)Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v0, v0, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v0}, Lcom/beizi/fusion/widget/LandingView;->c(Lcom/beizi/fusion/widget/LandingView;)Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getReport()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 4
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 5
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 6
    iget-object v2, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v2, v2, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v2}, Lcom/beizi/fusion/widget/LandingView;->d(Lcom/beizi/fusion/widget/LandingView;)Landroid/content/Context;

    move-result-object v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lcom/beizi/fusion/g/au;->a(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/b/b;)Ljava/lang/String;

    move-result-object v2

    .line 7
    iget-object v3, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v3, v3, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v3}, Lcom/beizi/fusion/widget/LandingView;->c(Lcom/beizi/fusion/widget/LandingView;)Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getUserAgent()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/fusion/g/ab;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    iget-object v2, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v2, v2, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v2}, Lcom/beizi/fusion/widget/LandingView;->d(Lcom/beizi/fusion/widget/LandingView;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v2

    new-instance v13, Lcom/beizi/fusion/b/b;

    sget-object v4, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    const-string v5, ""

    const-string v6, "520.200"

    const-string v7, ""

    const-string v9, ""

    const-string v10, ""

    const-string v12, ""

    move-object v3, v13

    invoke-direct/range {v3 .. v12}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    goto :goto_1

    .line 9
    :cond_0
    iget-object v2, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v2, v2, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v2}, Lcom/beizi/fusion/widget/LandingView;->d(Lcom/beizi/fusion/widget/LandingView;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/beizi/fusion/b/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/b/c;

    move-result-object v2

    new-instance v13, Lcom/beizi/fusion/b/b;

    sget-object v4, Lcom/beizi/fusion/d/b;->b:Ljava/lang/String;

    invoke-static {}, Lcom/beizi/fusion/d/b;->a()Lcom/beizi/fusion/d/b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/beizi/fusion/d/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    const-string v5, ""

    const-string v6, "520.500"

    const-string v7, ""

    const-string v9, ""

    const-string v10, ""

    const-string v12, ""

    move-object v3, v13

    invoke-direct/range {v3 .. v12}, Lcom/beizi/fusion/b/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Lcom/beizi/fusion/b/c;->b(Lcom/beizi/fusion/b/b;)V

    .line 10
    :goto_1
    :try_start_0
    iget-object v2, p0, Lcom/beizi/fusion/widget/LandingView$3$1;->a:Lcom/beizi/fusion/widget/LandingView$3;

    iget-object v2, v2, Lcom/beizi/fusion/widget/LandingView$3;->a:Lcom/beizi/fusion/widget/LandingView;

    invoke-static {v2}, Lcom/beizi/fusion/widget/LandingView;->c(Lcom/beizi/fusion/widget/LandingView;)Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;->getSleepTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method
