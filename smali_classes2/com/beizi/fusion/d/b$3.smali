.class Lcom/beizi/fusion/d/b$3;
.super Ljava/lang/Object;
.source "AdManager.java"

# interfaces
.implements Lcom/beizi/fusion/sm/a/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/d/b;->j()V
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
    iput-object p1, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/beizi/fusion/d/b;->g()Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "code sm Oaid:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "__OAID__"

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "__SMOAID__"

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/g/at;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/beizi/fusion/g/aj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/beizi/fusion/BeiZis;->isLimitPersonalAds()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/model/DevInfo;->setOaid(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/d/b$3;->a:Lcom/beizi/fusion/d/b;

    invoke-static {v0}, Lcom/beizi/fusion/d/b;->b(Lcom/beizi/fusion/d/b;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/fusion/model/RequestInfo;->getInstance(Landroid/content/Context;)Lcom/beizi/fusion/model/RequestInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/model/RequestInfo;->getDevInfo()Lcom/beizi/fusion/model/DevInfo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/model/DevInfo;->setSmOaid(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
