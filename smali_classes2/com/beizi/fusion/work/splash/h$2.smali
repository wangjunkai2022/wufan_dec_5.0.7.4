.class Lcom/beizi/fusion/work/splash/h$2;
.super Ljava/lang/Object;
.source "HwSplashWorker.java"

# interfaces
.implements Lcom/huawei/openalliance/ad/inter/listeners/AdListener;


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
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdDismissed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->f(Lcom/beizi/fusion/work/splash/h;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->g(Lcom/beizi/fusion/work/splash/h;)V

    return-void
.end method

.method public onAdFailedToLoad(I)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showHwSplash onAdFailedToLoad() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/beizi/fusion/work/splash/h;->a(Lcom/beizi/fusion/work/splash/h;Ljava/lang/String;I)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->a(Lcom/beizi/fusion/work/splash/h;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/h;->a(Lcom/beizi/fusion/work/splash/h;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->b(Lcom/beizi/fusion/work/splash/h;)Lcom/huawei/openalliance/ad/views/PPSSplashView;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/h;->a(Lcom/beizi/fusion/work/splash/h;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->c(Lcom/beizi/fusion/work/splash/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->d(Lcom/beizi/fusion/work/splash/h;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/h$2;->a:Lcom/beizi/fusion/work/splash/h;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/h;->e(Lcom/beizi/fusion/work/splash/h;)V

    :goto_0
    return-void
.end method
