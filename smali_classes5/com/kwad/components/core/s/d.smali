.class public final Lcom/kwad/components/core/s/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;IZ)V
    .locals 0
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 1
    invoke-static {p0, p1, p2, p2}, Lcom/kwad/components/core/s/d;->a(Landroid/app/Activity;IZZ)V

    return-void
.end method

.method public static a(Landroid/app/Activity;IZZ)V
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-static {}, Lcom/kwad/components/core/s/d;->rG()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/kwad/components/core/s/d;->b(Landroid/app/Activity;IZ)V

    if-nez p3, :cond_1

    const p1, 0x1020002

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 5
    invoke-static {p0}, Lcom/kwad/sdk/c/a/a;->getStatusBarHeight(Landroid/content/Context;)I

    move-result p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p0, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    :cond_1
    return-void
.end method

.method private static a(Landroid/app/Activity;Z)Z
    .locals 4
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    :try_start_0
    const-string v0, "android.view.MiuiWindowManager$LayoutParams"

    const-string v1, "EXTRA_FLAG_STATUS_BAR_DARK_MODE"

    .line 6
    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/s;->ap(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const-string v1, "setExtraFlags"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, v2, v3

    .line 9
    invoke-static {p0, v1, v2}, Lcom/kwad/sdk/utils/s;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return p1
.end method

.method private static b(Landroid/app/Activity;IZ)V
    .locals 4
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x500

    const/16 v3, 0x15

    if-lt v1, v3, :cond_2

    if-eqz p2, :cond_1

    const/16 p2, 0x17

    if-lt v1, p2, :cond_1

    const/16 v2, 0x2500

    const/high16 p2, 0x4000000

    .line 3
    invoke-virtual {v0, p2}, Landroid/view/Window;->clearFlags(I)V

    const/high16 p2, -0x80000000

    .line 4
    invoke-virtual {v0, p2}, Landroid/view/Window;->addFlags(I)V

    .line 5
    invoke-static {}, Lcom/kwad/sdk/utils/au;->MQ()Z

    move-result p2

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    .line 6
    invoke-static {p0, v1}, Lcom/kwad/components/core/s/d;->a(Landroid/app/Activity;Z)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {}, Lcom/kwad/sdk/utils/au;->MR()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    invoke-static {p0, v1}, Lcom/kwad/components/core/s/k;->b(Landroid/app/Activity;Z)V

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 10
    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 11
    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void

    :cond_2
    const/16 p0, 0x13

    if-lt v1, p0, :cond_3

    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_3
    return-void
.end method

.method public static rG()Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
