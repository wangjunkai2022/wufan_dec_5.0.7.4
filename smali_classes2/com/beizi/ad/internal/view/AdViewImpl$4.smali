.class Lcom/beizi/ad/internal/view/AdViewImpl$4;
.super Landroid/os/CountDownTimer;
.source "AdViewImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/AdViewImpl;->addCloseButton(IIILandroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Z

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Lcom/beizi/ad/internal/view/AdViewImpl;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/AdViewImpl;JJIZLandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iput p6, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->a:I

    iput-boolean p7, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->b:Z

    iput-object p8, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->c:Landroid/view/View;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 3
    iget-boolean v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->b:Z

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->c:Landroid/view/View;

    instance-of v2, v0, Lcom/beizi/ad/internal/view/AdWebView;

    if-eqz v2, :cond_0

    .line 5
    check-cast v0, Lcom/beizi/ad/internal/view/AdWebView;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdBy(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/activity/b;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/activity/b;->g()V

    goto/16 :goto_0

    .line 7
    :cond_0
    instance-of v2, v0, Lcom/beizi/ad/internal/video/AdVideoView;

    if-eqz v2, :cond_5

    .line 8
    check-cast v0, Lcom/beizi/ad/internal/video/AdVideoView;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/video/AdVideoView;->getAdWebView()Lcom/beizi/ad/internal/view/AdWebView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdWebView;->loadAdBy(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 9
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    check-cast v0, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/InterstitialAdViewImpl;->getAdImplementation()Lcom/beizi/ad/AdActivity$a;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/activity/b;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/activity/b;->g()V

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 11
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl;->a(Landroid/view/View;)Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_5

    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 14
    :cond_2
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-virtual {v0, v1}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->a(Z)V

    .line 15
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->c()Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/view/AdViewImpl$a$a;->a:Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl$a;->c()Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    move-result-object v0

    sget-object v1, Lcom/beizi/ad/internal/view/AdViewImpl$a$a;->b:Lcom/beizi/ad/internal/view/AdViewImpl$a$a;

    if-ne v0, v1, :cond_4

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/AdViewImpl;->getAdDispatcher()Lcom/beizi/ad/internal/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/beizi/ad/internal/b;->b()V

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    iget-object v0, v0, Lcom/beizi/ad/internal/view/AdViewImpl;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_5

    .line 18
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->jsLogTag:Ljava/lang/String;

    const-string v1, "Should not close banner!"

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public onTick(J)V
    .locals 2

    const-wide/16 v0, 0x3e8

    .line 1
    div-long/2addr p1, v0

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    long-to-int p2, p1

    .line 2
    iget p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->a:I

    if-lez p1, :cond_0

    if-gt p2, p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->g(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/beizi/ad/internal/view/AdViewImpl$4;->d:Lcom/beizi/ad/internal/view/AdViewImpl;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/AdViewImpl;->e(Lcom/beizi/ad/internal/view/AdViewImpl;)Landroidx/appcompat/widget/AppCompatTextView;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
