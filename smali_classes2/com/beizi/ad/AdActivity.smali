.class public Lcom/beizi/ad/AdActivity;
.super Landroid/app/Activity;
.source "AdActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/AdActivity$b;,
        Lcom/beizi/ad/AdActivity$a;
    }
.end annotation


# static fields
.field public static a:Z

.field static b:Ljava/lang/Class;


# instance fields
.field private c:Lcom/beizi/ad/AdActivity$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/AdActivity;

    sput-object v0, Lcom/beizi/ad/AdActivity;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/AdActivity;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 3
    invoke-static {p0, v0}, Lcom/beizi/ad/AdActivity;->b(Landroid/app/Activity;I)V

    return-void
.end method

.method public static a(Landroid/app/Activity;I)V
    .locals 0

    .line 4
    invoke-static {p0, p1}, Lcom/beizi/ad/AdActivity;->b(Landroid/app/Activity;I)V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/beizi/ad/AdActivity$b;)V
    .locals 3

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    .line 6
    sget-object v1, Lcom/beizi/ad/AdActivity$2;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v2, 0x3

    if-eq p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 7
    :goto_0
    invoke-static {p0, v0}, Lcom/beizi/ad/AdActivity;->b(Landroid/app/Activity;I)V

    return-void

    :cond_2
    const/4 p1, -0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public static b(Landroid/app/Activity;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method private static b(Landroid/app/Activity;I)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .line 2
    invoke-static {}, Lcom/beizi/ad/internal/utilities/DeviceInfo;->getInstance()Lcom/beizi/ad/internal/utilities/DeviceInfo;

    move-result-object v0

    iget-object v0, v0, Lcom/beizi/ad/internal/utilities/DeviceInfo;->model:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/beizi/ad/internal/utilities/DeviceInfo;->getInstance()Lcom/beizi/ad/internal/utilities/DeviceInfo;

    move-result-object v2

    iget-object v2, v2, Lcom/beizi/ad/internal/utilities/DeviceInfo;->brand:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "AMAZON"

    .line 4
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    const-string v1, "KFTT"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "KFJWI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "KFJWA"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, "window"

    .line 5
    invoke-virtual {p0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    const/4 v4, 0x2

    if-ne p1, v3, :cond_4

    .line 6
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result p1

    if-eq p1, v3, :cond_3

    if-ne p1, v4, :cond_2

    goto :goto_1

    .line 7
    :cond_2
    invoke-virtual {p0, v3}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_4

    :cond_3
    :goto_1
    const/16 p1, 0x9

    .line 8
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_4

    :cond_4
    if-ne p1, v4, :cond_a

    .line 9
    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result p1

    const/16 v1, 0x8

    if-nez v0, :cond_7

    if-eqz p1, :cond_6

    if-ne p1, v3, :cond_5

    goto :goto_2

    .line 10
    :cond_5
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_4

    .line 11
    :cond_6
    :goto_2
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_4

    :cond_7
    if-eqz p1, :cond_9

    if-ne p1, v3, :cond_8

    goto :goto_3

    .line 12
    :cond_8
    invoke-virtual {p0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_4

    .line 13
    :cond_9
    :goto_3
    invoke-virtual {p0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :cond_a
    :goto_4
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->b()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "ACTIVITY_TYPE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ACTIVITY_CAN_JUMP"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v0, Lcom/beizi/ad/R$string;->adactivity_no_type:I

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    const-string v1, "INTERSTITIAL"

    .line 7
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    new-instance p1, Lcom/beizi/ad/internal/activity/b;

    invoke-direct {p1, p0}, Lcom/beizi/ad/internal/activity/b;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    .line 9
    invoke-interface {p1}, Lcom/beizi/ad/AdActivity$a;->a()V

    goto :goto_0

    :cond_1
    const-string v1, "BROWSER"

    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    new-instance p1, Lcom/beizi/ad/internal/activity/a;

    invoke-direct {p1, p0, v0}, Lcom/beizi/ad/internal/activity/a;-><init>(Landroid/app/Activity;Z)V

    iput-object p1, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    .line 12
    invoke-interface {p1}, Lcom/beizi/ad/AdActivity$a;->a()V

    goto :goto_0

    :cond_2
    const-string v1, "MRAID"

    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 14
    new-instance p1, Lcom/beizi/ad/internal/activity/c;

    invoke-direct {p1, p0}, Lcom/beizi/ad/internal/activity/c;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    .line 15
    invoke-interface {p1}, Lcom/beizi/ad/AdActivity$a;->a()V

    goto :goto_0

    :cond_3
    const-string v1, "DOWNLOADBROWSER"

    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 17
    new-instance p1, Lcom/beizi/ad/internal/activity/a;

    invoke-direct {p1, p0, v0}, Lcom/beizi/ad/internal/activity/a;-><init>(Landroid/app/Activity;Z)V

    iput-object p1, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    .line 18
    invoke-interface {p1}, Lcom/beizi/ad/AdActivity$a;->a()V

    .line 19
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/beizi/ad/AdActivity$1;

    invoke-direct {v0, p0}, Lcom/beizi/ad/AdActivity$1;-><init>(Lcom/beizi/ad/AdActivity;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 20
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 21
    :cond_4
    :goto_0
    invoke-static {p0}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;

    .line 22
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 23
    invoke-virtual {p1}, Landroid/webkit/CookieSyncManager;->startSync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method protected onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->c()V

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method protected onPause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->f()Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onPause(Landroid/webkit/WebView;)V

    .line 3
    :cond_0
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->stopSync()V

    .line 5
    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/AdActivity;->c:Lcom/beizi/ad/AdActivity$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/beizi/ad/AdActivity$a;->f()Landroid/webkit/WebView;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->onResume(Landroid/webkit/WebView;)V

    .line 3
    :cond_0
    invoke-static {}, Landroid/webkit/CookieSyncManager;->getInstance()Landroid/webkit/CookieSyncManager;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->startSync()V

    .line 5
    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method
