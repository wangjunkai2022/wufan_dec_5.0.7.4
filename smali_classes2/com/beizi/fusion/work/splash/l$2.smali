.class Lcom/beizi/fusion/work/splash/l$2;
.super Ljava/lang/Object;
.source "MtgSplashWorker.java"

# interfaces
.implements Lcom/beizi/fusion/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/l;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/l;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string p1, "BeiZis"

    const-string v0, "MTG onInitFail"

    .line 11
    invoke-static {p1, v0}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/splash/l;->aa()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/work/a;->a(I)V

    .line 14
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->k(Lcom/beizi/fusion/work/splash/l;)V

    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->ax()V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string p1, "BeiZis"

    const-string p2, "MTG onInitSuccess"

    .line 1
    invoke-static {p1, p2}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->b(Lcom/beizi/fusion/work/splash/l;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->c(Lcom/beizi/fusion/work/splash/l;)Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Activity;

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->c(Lcom/beizi/fusion/work/splash/l;)Landroid/content/Context;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/work/splash/l;->b(Landroid/app/Activity;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a;->am()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->d(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/l;->e(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/beizi/fusion/work/splash/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->f(Lcom/beizi/fusion/work/splash/l;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    cmp-long v3, p1, v0

    if-lez v3, :cond_1

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->g(Lcom/beizi/fusion/work/splash/l;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p2}, Lcom/beizi/fusion/work/splash/l;->f(Lcom/beizi/fusion/work/splash/l;)J

    move-result-wide v0

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->h(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->i(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->s()I

    move-result p1

    if-ge p1, v2, :cond_2

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->j(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$2;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/splash/l;->l()V

    :cond_2
    :goto_0
    return-void
.end method
