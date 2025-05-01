.class Lcom/beizi/fusion/work/splash/h$3;
.super Ljava/lang/Object;
.source "HwSplashWorker.java"

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/listeners/AdActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/h;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/h;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->l(Lcom/beizi/fusion/work/splash/h;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->m(Lcom/beizi/fusion/work/splash/h;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->n(Lcom/beizi/fusion/work/splash/h;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->o(Lcom/beizi/fusion/work/splash/h;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/h;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->p(Lcom/beizi/fusion/work/splash/h;)V

    :cond_1
    return-void
.end method

.method public onAdShowed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->h(Lcom/beizi/fusion/work/splash/h;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    sget-object v1, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/h;->b(Lcom/beizi/fusion/work/splash/h;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->i(Lcom/beizi/fusion/work/splash/h;)V

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->j(Lcom/beizi/fusion/work/splash/h;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$3;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->k(Lcom/beizi/fusion/work/splash/h;)V

    return-void
.end method
