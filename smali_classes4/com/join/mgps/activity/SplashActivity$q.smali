.class Lcom/join/mgps/activity/SplashActivity$q;
.super Lw1/p;
.source "SplashActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/ShowViewDataBean;

.field final synthetic c:Lcom/join/mgps/dto/SplashIntentBean;

.field final synthetic d:Lcom/join/mgps/activity/SplashActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity$q;->d:Lcom/join/mgps/activity/SplashActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/SplashActivity$q;->b:Lcom/join/mgps/dto/ShowViewDataBean;

    iput-object p3, p0, Lcom/join/mgps/activity/SplashActivity$q;->c:Lcom/join/mgps/dto/SplashIntentBean;

    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onAutoComplete(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lw1/p;->onAutoComplete(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/SplashActivity$q;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$q;->d:Lcom/join/mgps/activity/SplashActivity;

    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity$q;->b:Lcom/join/mgps/dto/ShowViewDataBean;

    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity$q;->c:Lcom/join/mgps/dto/SplashIntentBean;

    invoke-static {p1}, Lcom/join/mgps/activity/SplashActivity;->n(Lcom/join/mgps/activity/SplashActivity;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "0"

    goto :goto_0

    :cond_0
    const-string v1, "1"

    :goto_0
    invoke-static {p1, p2, v0, v1}, Lcom/join/mgps/activity/SplashActivity;->m(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V

    return-void
.end method

.method public varargs onPrepared(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$q;->d:Lcom/join/mgps/activity/SplashActivity;

    iget-object p1, p1, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->getDuration()I

    move-result p1

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity$q;->d:Lcom/join/mgps/activity/SplashActivity;

    div-int/lit16 p1, p1, 0x3e8

    iput p1, p2, Lcom/join/mgps/activity/SplashActivity;->D:I

    .line 3
    invoke-static {p2}, Lcom/join/mgps/activity/SplashActivity;->g(Lcom/join/mgps/activity/SplashActivity;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity$q;->d:Lcom/join/mgps/activity/SplashActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/SplashActivity;->g(Lcom/join/mgps/activity/SplashActivity;)Landroid/os/Handler;

    move-result-object p1

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method
