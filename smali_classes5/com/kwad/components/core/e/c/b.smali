.class public final Lcom/kwad/components/core/e/c/b;
.super Lcom/kwad/components/core/proxy/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/e/c/b$a;,
        Lcom/kwad/components/core/e/c/b$b;
    }
.end annotation


# static fields
.field private static KF:Lcom/kwad/components/core/e/c/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final KG:Lcom/kwad/components/core/e/c/b$b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private KJ:Lcom/kwad/components/core/e/c/a;

.field private KK:Z


# direct methods
.method private constructor <init>(Landroid/app/Activity;Lcom/kwad/components/core/e/c/b$b;)V
    .locals 1
    .param p2    # Lcom/kwad/components/core/e/c/b$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/proxy/d;-><init>(Landroid/app/Activity;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/e/c/b;->KK:Z

    .line 3
    iput-object p2, p0, Lcom/kwad/components/core/e/c/b;->KG:Lcom/kwad/components/core/e/c/b$b;

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/c/a/a;->b(Landroid/app/Activity;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 6
    :cond_0
    iget-object p1, p2, Lcom/kwad/components/core/e/c/b$b;->KM:Landroid/content/DialogInterface$OnShowListener;

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 7
    iget-object p1, p2, Lcom/kwad/components/core/e/c/b$b;->KN:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p0, p1}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/components/core/e/c/b$b;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/components/core/e/c/b;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-nez p0, :cond_1

    return v1

    .line 2
    :cond_1
    invoke-static {p0}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    invoke-static {}, Lcom/kwad/sdk/a/a/c;->Au()Lcom/kwad/sdk/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/a/a/c;->dismiss()V

    .line 5
    :try_start_0
    new-instance v0, Lcom/kwad/components/core/e/c/b;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/core/e/c/b;-><init>(Landroid/app/Activity;Lcom/kwad/components/core/e/c/b$b;)V

    .line 6
    sput-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    invoke-virtual {v0}, Lcom/kwad/components/core/e/c/b;->show()V

    .line 7
    iget-object p0, p1, Lcom/kwad/components/core/e/c/b$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 p1, 0x56

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    .line 8
    invoke-static {p0}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    :cond_3
    :goto_0
    return v1
.end method

.method public static nQ()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/e/c/b;->isShowing()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final aj(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/core/e/c/b;->KK:Z

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/e/c/b;->dismiss()V

    return-void
.end method

.method public final ck()Landroid/view/ViewGroup;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/c/a;

    iget-object v1, p0, Lcom/kwad/components/core/proxy/d;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/kwad/components/core/e/c/b;->KG:Lcom/kwad/components/core/e/c/b$b;

    invoke-direct {v0, v1, p0, v2}, Lcom/kwad/components/core/e/c/a;-><init>(Landroid/content/Context;Lcom/kwad/components/core/e/c/b;Lcom/kwad/components/core/e/c/b$b;)V

    iput-object v0, p0, Lcom/kwad/components/core/e/c/b;->KJ:Lcom/kwad/components/core/e/c/a;

    return-object v0
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/proxy/d;->dismiss()V

    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    return-void
.end method

.method public final g(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/e/c/b;->KJ:Lcom/kwad/components/core/e/c/a;

    new-instance v0, Lcom/kwad/components/core/e/c/b$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/e/c/b$1;-><init>(Lcom/kwad/components/core/e/c/b;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/c/a;->setChangeListener(Lcom/kwad/components/core/e/c/a$a;)V

    return-void
.end method

.method public final getLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isShowing()Z
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final nR()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final nS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/e/c/b;->KK:Z

    return v0
.end method

.method public final onBackPressed()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/AlertDialog;->onBackPressed()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/e/c/b;->KG:Lcom/kwad/components/core/e/c/b$b;

    iget-object v0, v0, Lcom/kwad/components/core/e/c/b$b;->adTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bQ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/AlertDialog;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 2
    sput-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/proxy/d;->onStart()V

    .line 2
    sget-object v0, Lcom/kwad/components/core/e/c/b;->KF:Lcom/kwad/components/core/e/c/b;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final show()V
    .locals 5

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "navigation_bar_height"

    const-string v3, "dimen"

    const-string v4, "android"

    .line 4
    invoke-virtual {v1, v2, v3, v4}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    :cond_0
    if-lez v0, :cond_2

    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    const/16 v0, 0x1506

    goto :goto_0

    :cond_1
    const/16 v0, 0x507

    .line 7
    :goto_0
    invoke-virtual {p0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 8
    :try_start_2
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method
