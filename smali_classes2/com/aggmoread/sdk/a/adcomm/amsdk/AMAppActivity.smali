.class public Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field private static tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;


# instance fields
.field private apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static setActivityPresenter(Lcom/aggmoread/sdk/z/a/t/d;)V
    .locals 0

    sput-object p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/d;->a()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-nez v1, :cond_0

    iput-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    const/4 v0, 0x0

    sput-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/aggmoread/sdk/z/a/t/d;->a(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/t/d;->a(Landroid/os/Bundle;)V

    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/d;->b()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    sget-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-nez v1, :cond_0

    iput-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    const/4 v0, 0x0

    sput-object v0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->tmpActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/t/d;->a(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/d;->onPause()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/d;->onResume()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/a/adcomm/amsdk/AMAppActivity;->apiActivityPresenter:Lcom/aggmoread/sdk/z/a/t/d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/t/d;->a(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
