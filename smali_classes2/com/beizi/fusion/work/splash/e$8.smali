.class Lcom/beizi/fusion/work/splash/e$8;
.super Ljava/lang/Object;
.source "CsjSplashWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/e;->aM()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/e$8;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$8;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->M(Lcom/beizi/fusion/work/splash/e;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$8;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->t(Lcom/beizi/fusion/work/splash/e;)Landroid/os/CountDownTimer;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$8;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->t(Lcom/beizi/fusion/work/splash/e;)Landroid/os/CountDownTimer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->cancel()V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/e$8;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/e;->N(Lcom/beizi/fusion/work/splash/e;)V

    return-void
.end method
