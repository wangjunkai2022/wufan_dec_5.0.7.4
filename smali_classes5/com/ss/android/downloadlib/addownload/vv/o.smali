.class public Lcom/ss/android/downloadlib/addownload/vv/o;
.super Landroid/app/Dialog;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ss/android/downloadlib/addownload/vv/o$vv;
    }
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field private i:Landroid/widget/TextView;

.field private jh:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private m:Landroid/widget/TextView;

.field private n:Z

.field private o:Lcom/ss/android/downloadlib/addownload/vv/i;

.field private p:Landroid/widget/TextView;

.field private qv:Z

.field private r:Ljava/lang/String;

.field private u:Lcom/ss/android/downloadlib/addownload/vv/p;

.field private vv:Landroid/widget/TextView;

.field private wv:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ss/android/downloadlib/addownload/vv/i;Lcom/ss/android/downloadlib/addownload/vv/p;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Lcom/ss/android/downloadlib/addownload/vv/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Lcom/bytedance/sdk/openadsdk/R$style;->ttdownloader_translucent_dialog:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    iput-object p1, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->wv:Landroid/app/Activity;

    .line 3
    iput-object p7, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->o:Lcom/ss/android/downloadlib/addownload/vv/i;

    .line 4
    iput-object p2, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->k:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->b:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->jh:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->r:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->u:Lcom/ss/android/downloadlib/addownload/vv/p;

    .line 9
    invoke-virtual {p0, p6}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 10
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->i()V

    return-void
.end method

.method private delete()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->qv:Z

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->dismiss()V

    return-void
.end method

.method private i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->wv:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->vv()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 3
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->vv:Landroid/widget/TextView;

    .line 4
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->p()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->m:Landroid/widget/TextView;

    .line 5
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->message_tv:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->p:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->delete_tv:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->i:Landroid/widget/TextView;

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->vv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->jh:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->jh:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 12
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->r:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 15
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :cond_3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->vv:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/vv/o$1;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/vv/o$1;-><init>(Lcom/ss/android/downloadlib/addownload/vv/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->m:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/vv/o$2;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/vv/o$2;-><init>(Lcom/ss/android/downloadlib/addownload/vv/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 18
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->i:Landroid/widget/TextView;

    new-instance v1, Lcom/ss/android/downloadlib/addownload/vv/o$3;

    invoke-direct {v1, p0}, Lcom/ss/android/downloadlib/addownload/vv/o$3;-><init>(Lcom/ss/android/downloadlib/addownload/vv/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic m(Lcom/ss/android/downloadlib/addownload/vv/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->u()V

    return-void
.end method

.method private o()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->n:Z

    .line 2
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->dismiss()V

    return-void
.end method

.method static synthetic p(Lcom/ss/android/downloadlib/addownload/vv/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->delete()V

    return-void
.end method

.method private u()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->dismiss()V

    return-void
.end method

.method static synthetic vv(Lcom/ss/android/downloadlib/addownload/vv/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ss/android/downloadlib/addownload/vv/o;->o()V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->wv:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->wv:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->n:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->o:Lcom/ss/android/downloadlib/addownload/vv/i;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/i;->vv()V

    return-void

    .line 6
    :cond_1
    iget-boolean v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->qv:Z

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->u:Lcom/ss/android/downloadlib/addownload/vv/p;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/p;->delete()V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/ss/android/downloadlib/addownload/vv/o;->o:Lcom/ss/android/downloadlib/addownload/vv/i;

    invoke-interface {v0}, Lcom/ss/android/downloadlib/addownload/vv/i;->m()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public m()I
    .locals 1

    .line 2
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->confirm_tv:I

    return v0
.end method

.method public p()I
    .locals 1

    .line 2
    sget v0, Lcom/bytedance/sdk/openadsdk/R$id;->cancel_tv:I

    return v0
.end method

.method public vv()I
    .locals 1

    .line 2
    sget v0, Lcom/bytedance/sdk/openadsdk/R$layout;->ttdownloader_dialog_select_operation:I

    return v0
.end method
