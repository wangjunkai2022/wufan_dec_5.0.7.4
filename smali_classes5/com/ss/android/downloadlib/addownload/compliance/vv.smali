.class public Lcom/ss/android/downloadlib/addownload/compliance/vv;
.super Landroid/app/Dialog;


# instance fields
.field private b:J

.field private i:Landroid/widget/TextView;

.field private final jh:Lcom/ss/android/downloadlib/addownload/m/m;

.field private final k:J

.field private m:Landroid/widget/TextView;

.field private n:Lcom/ss/android/downloadlib/guide/install/ClipImageView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private qv:Landroid/widget/LinearLayout;

.field private u:Landroid/widget/TextView;

.field private vv:Landroid/widget/TextView;

.field private wv:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;J)V
    .locals 0
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->wv:Landroid/app/Activity;

    .line 3
    iput-wide p2, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->k:J

    .line 4
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/p;->vv()Lcom/ss/android/downloadlib/addownload/compliance/p;

    move-result-object p1

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ss/android/downloadlib/addownload/m/m;

    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    return-void
.end method

.method static synthetic i(Lcom/ss/android/downloadlib/addownload/compliance/vv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->k:J

    return-wide v0
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/addownload/compliance/vv;)Lcom/ss/android/downloadlib/guide/install/ClipImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->n:Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    return-object p0
.end method

.method static synthetic p(Lcom/ss/android/downloadlib/addownload/compliance/vv;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->wv:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/compliance/vv;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->b:J

    return-wide v0
.end method

.method private vv()V
    .locals 8

    .line 2
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_app_name:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv:Landroid/widget/TextView;

    .line 3
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_app_version:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->m:Landroid/widget/TextView;

    .line 4
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_app_developer:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->p:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_app_detail:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->i:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_app_privacy:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->o:Landroid/widget/TextView;

    .line 7
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->tv_give_up:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->u:Landroid/widget/TextView;

    .line 8
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->iv_app_icon:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->n:Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    .line 9
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->ll_download:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->qv:Landroid/widget/LinearLayout;

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv:Landroid/widget/TextView;

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    iget-object v3, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    iget-object v3, v3, Lcom/ss/android/downloadlib/addownload/m/m;->o:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    const-string v5, "--"

    aput-object v5, v2, v3

    invoke-static {v2}, Lcom/ss/android/downloadlib/n/jh;->vv([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->m:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "\u7248\u672c\u53f7\uff1a"

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-array v6, v1, [Ljava/lang/String;

    iget-object v7, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    iget-object v7, v7, Lcom/ss/android/downloadlib/addownload/m/m;->u:Ljava/lang/String;

    aput-object v7, v6, v4

    aput-object v5, v6, v3

    invoke-static {v6}, Lcom/ss/android/downloadlib/n/jh;->vv([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->p:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "\u5f00\u53d1\u8005\uff1a"

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-array v1, v1, [Ljava/lang/String;

    iget-object v5, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    iget-object v5, v5, Lcom/ss/android/downloadlib/addownload/m/m;->n:Ljava/lang/String;

    aput-object v5, v1, v4

    const-string v4, "\u5e94\u7528\u4fe1\u606f\u6b63\u5728\u5b8c\u5584\u4e2d"

    aput-object v4, v1, v3

    invoke-static {v1}, Lcom/ss/android/downloadlib/n/jh;->vv([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->n:Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    invoke-static {}, Lcom/ss/android/downloadlib/addownload/b;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lcom/ss/android/downloadlib/n/jh;->vv(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/guide/install/ClipImageView;->setRoundRadius(I)V

    .line 14
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->n:Lcom/ss/android/downloadlib/guide/install/ClipImageView;

    const-string v1, "#EBEBEB"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ss/android/downloadlib/guide/install/ClipImageView;->setBackgroundColor(I)V

    .line 15
    invoke-static {}, Lcom/ss/android/downloadlib/addownload/compliance/i;->vv()Lcom/ss/android/downloadlib/addownload/compliance/i;

    move-result-object v0

    iget-wide v1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->k:J

    new-instance v3, Lcom/ss/android/downloadlib/addownload/compliance/vv$2;

    invoke-direct {v3, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$2;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/ss/android/downloadlib/addownload/compliance/i;->vv(JLcom/ss/android/downloadlib/addownload/compliance/i$vv;)V

    .line 16
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->i:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/vv$3;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$3;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->o:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/vv$4;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$4;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->u:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/vv$5;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$5;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->qv:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/compliance/vv$6;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$6;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->wv:Landroid/app/Activity;

    invoke-static {v0}, Lcom/ss/android/socialbase/appdownloader/p;->vv(Landroid/app/Activity;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv;->dismiss()V

    return-void

    :cond_0
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 5
    sget v0, Lcom/bytedance/sdk/openadsdk/R$layout;->ttdownloader_dialog_appinfo:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(I)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 7
    sget v1, Lcom/bytedance/sdk/openadsdk/R$drawable;->ttdownloader_bg_transparent:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 8
    :cond_1
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 10
    iget-object p1, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->jh:Lcom/ss/android/downloadlib/addownload/m/m;

    iget-wide v0, p1, Lcom/ss/android/downloadlib/addownload/m/m;->m:J

    iput-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->b:J

    .line 11
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv;->vv()V

    .line 12
    iget-wide v0, p0, Lcom/ss/android/downloadlib/addownload/compliance/vv;->b:J

    const-string p1, "lp_app_dialog_show"

    invoke-static {p1, v0, v1}, Lcom/ss/android/downloadlib/addownload/compliance/n;->m(Ljava/lang/String;J)V

    .line 13
    new-instance p1, Lcom/ss/android/downloadlib/addownload/compliance/vv$1;

    invoke-direct {p1, p0}, Lcom/ss/android/downloadlib/addownload/compliance/vv$1;-><init>(Lcom/ss/android/downloadlib/addownload/compliance/vv;)V

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    return-void
.end method
