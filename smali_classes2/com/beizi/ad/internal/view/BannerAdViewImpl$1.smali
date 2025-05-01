.class Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;
.super Landroid/content/BroadcastReceiver;
.source "BannerAdViewImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/view/BannerAdViewImpl;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->h()V

    .line 3
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->screen_off_stop:I

    .line 4
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 5
    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.SCREEN_ON"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    .line 7
    iget-object p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-static {p2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->a(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)I

    move-result p2

    const/4 v0, 0x1

    if-lez p2, :cond_1

    .line 8
    iget-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->g()V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    .line 9
    :cond_1
    iget-object p2, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-static {p2}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->b(Lcom/beizi/ad/internal/view/BannerAdViewImpl;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 10
    iget-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->h()V

    .line 11
    iget-object p1, p0, Lcom/beizi/ad/internal/view/BannerAdViewImpl$1;->a:Lcom/beizi/ad/internal/view/BannerAdViewImpl;

    invoke-virtual {p1}, Lcom/beizi/ad/internal/view/BannerAdViewImpl;->g()V

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz p1, :cond_3

    .line 12
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget p2, Lcom/beizi/ad/R$string;->screen_on_start:I

    .line 13
    invoke-static {p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Lcom/beizi/ad/internal/utilities/HaoboLog;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method
