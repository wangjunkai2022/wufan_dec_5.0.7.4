.class Lcom/beizi/fusion/work/a/a$2;
.super Ljava/lang/Object;
.source "BaiduBannerAdWorker.java"

# interfaces
.implements Lcom/baidu/mobads/sdk/api/AdViewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/a/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field b:Z

.field final synthetic c:Lcom/beizi/fusion/work/a/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->a:Z

    .line 3
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->b:Z

    return-void
.end method


# virtual methods
.method public onAdClick(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->k(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->l(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->m(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->b:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->b:Z

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->n(Lcom/beizi/fusion/work/a/a;)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->o(Lcom/beizi/fusion/work/a/a;)V

    :cond_1
    return-void
.end method

.method public onAdClose(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->q(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->r(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->s(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->t(Lcom/beizi/fusion/work/a/a;)V

    return-void
.end method

.method public onAdFailed(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showBaiduBanner Callback --> onAdFailed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    const/16 v1, 0xed1

    invoke-static {v0, p1, v1}, Lcom/beizi/fusion/work/a/a;->a(Lcom/beizi/fusion/work/a/a;Ljava/lang/String;I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->p(Lcom/beizi/fusion/work/a/a;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/a/a;->m()V

    :cond_0
    return-void
.end method

.method public onAdReady(Lcom/baidu/mobads/sdk/api/AdView;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    sget-object v0, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/a/a;->a(Lcom/beizi/fusion/work/a/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->a(Lcom/beizi/fusion/work/a/a;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->b(Lcom/beizi/fusion/work/a/a;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->c(Lcom/beizi/fusion/work/a/a;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->d(Lcom/beizi/fusion/work/a/a;)V

    :goto_0
    return-void
.end method

.method public onAdShow(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/a/a;->b(Lcom/beizi/fusion/work/a/a;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->e(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->f(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->g(Lcom/beizi/fusion/work/a/a;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/a/a;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;)V

    .line 4
    :cond_0
    iget-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/work/a/a$2;->a:Z

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->h(Lcom/beizi/fusion/work/a/a;)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->i(Lcom/beizi/fusion/work/a/a;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/work/a/a$2;->c:Lcom/beizi/fusion/work/a/a;

    invoke-static {p1}, Lcom/beizi/fusion/work/a/a;->j(Lcom/beizi/fusion/work/a/a;)V

    :cond_1
    return-void
.end method

.method public onAdSwitch()V
    .locals 0

    return-void
.end method
