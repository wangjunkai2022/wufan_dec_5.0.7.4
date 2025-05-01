.class Lcom/beizi/fusion/d/b$2;
.super Ljava/lang/Object;
.source "AdManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/b;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/d/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/d/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/d/b$2;->a:Lcom/beizi/fusion/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/d/b$2;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/g/b;->a(Landroid/content/Context;)Lcom/beizi/fusion/g/b$a;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/g/b$a;->a()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/beizi/fusion/g/b$a;->b()Z

    move-result v0

    .line 4
    iget-object v2, p0, Lcom/beizi/fusion/d/b$2;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v2}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "__GAID__"

    invoke-static {v2, v3, v1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    iget-object v2, p0, Lcom/beizi/fusion/d/b$2;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v2}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v2

    const-string v3, "isLimitTrackGaid"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/beizi/fusion/d/b$2;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/model/DevInfo;->setGaid(Ljava/lang/String;)V

    .line 7
    invoke-static {}, Lcom/beizi/fusion/d/b;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "advertising id is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Lcom/beizi/fusion/d/b;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "User has opted not to use the advertising Id"

    invoke-static {v0, v1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
