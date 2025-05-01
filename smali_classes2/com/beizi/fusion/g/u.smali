.class public Lcom/beizi/fusion/g/u;
.super Landroid/app/Dialog;
.source "DownloadApkConfirmDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/Button;

.field private g:Landroid/view/ViewGroup;

.field private h:Landroid/widget/ProgressBar;

.field private i:Landroid/widget/Button;

.field private j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;)V
    .locals 1

    .line 1
    sget v0, Lcom/beizi/fusion/R$style;->DownloadConfirmDialogFullScreen:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    iput-object p1, p0, Lcom/beizi/fusion/g/u;->a:Landroid/content/Context;

    .line 3
    iput-object p3, p0, Lcom/beizi/fusion/g/u;->c:Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

    .line 4
    iput-object p2, p0, Lcom/beizi/fusion/g/u;->j:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    iput p1, p0, Lcom/beizi/fusion/g/u;->b:I

    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 8
    invoke-direct {p0}, Lcom/beizi/fusion/g/u;->b()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/fusion/g/u;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/u;->h:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public static a(J)Ljava/lang/String;
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    const-string p0, "0"

    return-object p0

    :cond_0
    const-string v0, "B"

    const-string v1, "kB"

    const-string v2, "MB"

    const-string v3, "GB"

    const-string v4, "TB"

    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    long-to-double p0, p0

    .line 12
    invoke-static {p0, p1}, Ljava/lang/Math;->log10(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x4090000000000000L    # 1024.0

    invoke-static {v3, v4}, Ljava/lang/Math;->log10(D)D

    move-result-wide v5

    div-double/2addr v1, v5

    double-to-int v1, v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v5, Ljava/text/DecimalFormat;

    const-string v6, "#,##0.##"

    invoke-direct {v5, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    int-to-double v6, v1

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p0, v3

    invoke-virtual {v5, p0, p1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p0, v0, v1

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->h:Landroid/widget/ProgressBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->g:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    const-string v0, "\u62b1\u6b49\uff0c\u5e94\u7528\u4fe1\u606f\u83b7\u53d6\u5931\u8d25"

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    invoke-virtual {p1, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void

    .line 9
    :cond_0
    new-instance v0, Lcom/beizi/fusion/g/u$1;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/g/u$1;-><init>(Lcom/beizi/fusion/g/u;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    aput-object p1, v2, v1

    .line 10
    invoke-virtual {v0, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method static synthetic b(Lcom/beizi/fusion/g/u;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    return-object p0
.end method

.method private b()V
    .locals 3

    .line 2
    sget v0, Lcom/beizi/fusion/R$layout;->download_confirm_dialog:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 3
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_root:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 4
    iget v1, p0, Lcom/beizi/fusion/g/u;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 5
    sget v1, Lcom/beizi/fusion/R$drawable;->download_confirm_background_portrait:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 6
    sget v1, Lcom/beizi/fusion/R$drawable;->download_confirm_background_landscape:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 7
    :cond_1
    :goto_0
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_close:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/beizi/fusion/g/u;->e:Landroid/widget/ImageView;

    .line 8
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_reload_button:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    .line 10
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_confirm:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/beizi/fusion/g/u;->f:Landroid/widget/Button;

    .line 12
    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 13
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_progress_bar:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/beizi/fusion/g/u;->h:Landroid/widget/ProgressBar;

    .line 14
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_content:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/beizi/fusion/g/u;->g:Landroid/view/ViewGroup;

    .line 15
    invoke-direct {p0}, Lcom/beizi/fusion/g/u;->c()V

    return-void
.end method

.method static synthetic c(Lcom/beizi/fusion/g/u;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/u;->g:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private c()V
    .locals 3

    .line 2
    sget v0, Lcom/beizi/fusion/R$id;->download_confirm_holder:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 3
    new-instance v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/beizi/fusion/g/u;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/beizi/fusion/g/u;->d:Landroid/widget/TextView;

    .line 4
    new-instance v1, Landroid/widget/ScrollView;

    iget-object v2, p0, Lcom/beizi/fusion/g/u;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 5
    iget-object v2, p0, Lcom/beizi/fusion/g/u;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method static synthetic d(Lcom/beizi/fusion/g/u;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/fusion/g/u;->d:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->f:Landroid/widget/Button;

    const-string v1, "\u7acb\u5373\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->cancel()V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->c:Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;->onCancel()V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->e:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->c:Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

    if-eqz p1, :cond_0

    .line 3
    invoke-interface {p1}, Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;->onCancel()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->f:Landroid/widget/Button;

    if-ne p1, v0, :cond_3

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->c:Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;

    if-eqz p1, :cond_2

    .line 7
    invoke-interface {p1}, Lcom/qq/e/comm/compliance/DownloadConfirmCallBack;->onConfirm()V

    .line 8
    :cond_2
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    goto :goto_0

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->i:Landroid/widget/Button;

    if-ne p1, v0, :cond_4

    .line 10
    iget-object p1, p0, Lcom/beizi/fusion/g/u;->j:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/beizi/fusion/g/u;->a(Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected onStart()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/g/av;->o(Landroid/content/Context;)I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/beizi/fusion/g/u;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/beizi/fusion/g/av;->n(Landroid/content/Context;)I

    move-result v1

    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 4
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 5
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    .line 6
    iget v4, p0, Lcom/beizi/fusion/g/u;->b:I

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-ne v4, v6, :cond_0

    .line 7
    iput v5, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    int-to-double v0, v0

    const-wide v4, 0x3fe3333333333333L    # 0.6

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v4

    double-to-int v0, v0

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    const/16 v0, 0x50

    .line 9
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 10
    sget v0, Lcom/beizi/fusion/R$style;->DownloadConfirmDialogAnimationUp:I

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    int-to-double v0, v1

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v6

    double-to-int v0, v0

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 12
    iput v5, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 v0, 0x5

    .line 13
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 14
    sget v0, Lcom/beizi/fusion/R$style;->DownloadConfirmDialogAnimationRight:I

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    :cond_1
    :goto_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 15
    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 16
    invoke-virtual {v2, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 17
    new-instance v0, Lcom/beizi/fusion/g/u$2;

    invoke-direct {v0, p0}, Lcom/beizi/fusion/g/u$2;-><init>(Lcom/beizi/fusion/g/u;)V

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->show()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/fusion/g/u;->j:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/beizi/fusion/g/u;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "load error url:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/fusion/g/u;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method
