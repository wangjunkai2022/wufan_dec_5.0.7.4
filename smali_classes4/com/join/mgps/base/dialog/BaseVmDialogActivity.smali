.class public abstract Lcom/join/mgps/base/dialog/BaseVmDialogActivity;
.super Lcom/BaseAppCompatActivity;
.source "BaseVmDialogActivity.java"


# instance fields
.field private b:Z

.field private c:Ljava/lang/String;

.field protected d:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseAppCompatActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->b:Z

    const-string v0, ""

    .line 3
    iput-object v0, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->c:Ljava/lang/String;

    return-void
.end method

.method private isOutOfBounds(Landroid/content/Context;Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    .line 4
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledWindowTouchSlop()I

    move-result p1

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->getContentView()Landroid/view/View;

    .line 6
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    neg-int p1, p1

    if-lt v0, p1, :cond_2

    if-lt p2, p1, :cond_2

    .line 8
    invoke-virtual {v2, v0, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public finish()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->d:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;->onActivityDismiss(Landroid/app/Activity;)V

    .line 4
    :cond_0
    invoke-static {}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->get()Lcom/join/kotlin/base/dialog/DialogActivityManager;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->unregisterCallback(Ljava/lang/String;)V

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method hideNavigationBar()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->setSystemUiVisibility()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/BaseAppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "_key_call"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->c:Ljava/lang/String;

    .line 4
    :cond_0
    invoke-static {}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->get()Lcom/join/kotlin/base/dialog/DialogActivityManager;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/join/kotlin/base/dialog/DialogActivityManager;->getCallback(Ljava/lang/String;)Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->d:Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1, p0}, Lcom/join/kotlin/base/dialog/callback/IDialogActivityCallback;->onActivityShow(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p0, p1}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->shouldCloseOnTouch(Landroid/content/Context;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->finish()V

    const/4 p1, 0x1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method setSystemUiVisibility()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/16 v0, 0x1706

    goto :goto_0

    :cond_0
    const/16 v0, 0x707

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public shouldCloseOnTouch(Landroid/content/Context;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->isOutOfBounds(Landroid/content/Context;Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 3
    :goto_0
    iget-boolean p2, p0, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->b:Z

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lcom/join/mgps/base/dialog/BaseVmDialogActivity;->getContentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method
