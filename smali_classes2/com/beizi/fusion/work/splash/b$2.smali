.class Lcom/beizi/fusion/work/splash/b$2;
.super Ljava/lang/Object;
.source "BeiZiSplashWorker.java"

# interfaces
.implements Lcom/beizi/fusion/g/x$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/b;->aU()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/b$2;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 11

    const-string v0, "eulerAngle"

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$2;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1, v0}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$2;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/splash/b;->ak(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/fusion/b/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/beizi/fusion/b/b;->O(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/b$2;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/b;->al(Lcom/beizi/fusion/work/splash/b;)V

    .line 4
    iget-object v1, p0, Lcom/beizi/fusion/work/splash/b$2;->a:Lcom/beizi/fusion/work/splash/b;

    const-string v2, ""

    const-string v3, ""

    const-string v4, ""

    const-string v5, ""

    const-string v6, ""

    const-string v7, ""

    const-string v8, ""

    const-string v9, ""

    const/4 v10, 0x2

    invoke-static/range {v1 .. v10}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
