.class public Lcom/join/mgps/dialog/e;
.super Landroid/app/Dialog;
.source "AppUpdateDialog.java"


# instance fields
.field b:Landroid/content/Context;

.field c:Landroid/widget/TextView;

.field d:Landroid/webkit/WebView;

.field e:Lcom/join/mgps/dto/VersionDto;

.field f:Landroid/widget/RelativeLayout;

.field g:Landroid/widget/RelativeLayout;

.field h:Lcom/facebook/drawee/view/SimpleDraweeView;

.field i:Landroid/widget/Button;

.field j:Landroid/view/View;

.field k:Z

.field l:Z

.field private m:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const v0, 0x7f110150

    .line 13
    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/join/mgps/dialog/e;->l:Z

    const-wide/16 v0, 0x0

    .line 15
    iput-wide v0, p0, Lcom/join/mgps/dialog/e;->m:J

    .line 16
    iput-object p1, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/join/mgps/dto/VersionDto;)V
    .locals 2

    const p2, 0x7f110150

    .line 7
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p2, 0x0

    .line 8
    iput-boolean p2, p0, Lcom/join/mgps/dialog/e;->l:Z

    const-wide/16 v0, 0x0

    .line 9
    iput-wide v0, p0, Lcom/join/mgps/dialog/e;->m:J

    .line 10
    iput-object p1, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    .line 11
    iput-object p3, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/join/mgps/dialog/e;->l:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILcom/join/mgps/dto/VersionDto;Z)V
    .locals 2

    const p2, 0x7f110150

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 p2, 0x0

    .line 2
    iput-boolean p2, p0, Lcom/join/mgps/dialog/e;->l:Z

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/join/mgps/dialog/e;->m:J

    .line 4
    iput-object p1, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    .line 5
    iput-object p3, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    .line 6
    iput-boolean p4, p0, Lcom/join/mgps/dialog/e;->k:Z

    return-void
.end method

.method private a(Ljava/io/File;Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {p2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/join/android/app/common/utils/APKUtils;->w(Landroid/content/Context;Ljava/io/File;)V

    return-void
.end method

.method static synthetic b(Lcom/join/mgps/dialog/e;Ljava/io/File;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/dialog/e;->a(Ljava/io/File;Landroid/content/Context;)V

    return-void
.end method

.method private e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    invoke-virtual {v0}, Lcom/join/mgps/dto/VersionDto;->getTpl_type()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->i:Landroid/widget/Button;

    new-instance v3, Lcom/join/mgps/dialog/e$c;

    invoke-direct {v3, p0}, Lcom/join/mgps/dialog/e$c;-><init>(Lcom/join/mgps/dialog/e;)V

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    iget-boolean v0, p0, Lcom/join/mgps/dialog/e;->k:Z

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->i:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->i:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v3, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    invoke-virtual {v3}, Lcom/join/mgps/dto/VersionDto;->getTow_tpl_back_ground_pic()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v3, Lcom/join/mgps/dialog/e$d;

    invoke-direct {v3, p0}, Lcom/join/mgps/dialog/e$d;-><init>(Lcom/join/mgps/dialog/e;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 11
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 13
    :goto_1
    iget-object v3, p0, Lcom/join/mgps/dialog/e;->d:Landroid/webkit/WebView;

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    invoke-virtual {v0}, Lcom/join/mgps/dto/VersionDto;->getInfo()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x0

    const-string v6, "text/html"

    const-string v7, "utf-8"

    invoke-virtual/range {v3 .. v8}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    iget-boolean v0, p0, Lcom/join/mgps/dialog/e;->k:Z

    const v3, 0x7f090290

    if-eqz v0, :cond_2

    .line 15
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 16
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    :goto_2
    iget-boolean v0, p0, Lcom/join/mgps/dialog/e;->l:Z

    if-eqz v0, :cond_3

    .line 18
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v1, 0x7f09173a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 20
    iget-object v1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v3, 0x7f09087e

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 21
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v1, "\u514d\u6d41\u91cf\u5b89\u88c5"

    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public d(Lcom/join/mgps/dto/VersionDto;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/e;->e:Lcom/join/mgps/dto/VersionDto;

    .line 2
    iput-boolean p2, p0, Lcom/join/mgps/dialog/e;->k:Z

    .line 3
    invoke-direct {p0}, Lcom/join/mgps/dialog/e;->e()V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/dialog/e;->k:Z

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/join/mgps/dialog/e;->m:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x7d0

    const/4 p1, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    const-string v2, "\u518d\u6309\u4e00\u6b21\u9000\u51fa\u7a0b\u5e8f"

    invoke-static {v0, v2, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/join/mgps/dialog/e;->m:J

    .line 6
    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 8
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 10
    :cond_2
    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 p1, -0x1

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    const/4 p1, 0x0

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 5
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->b:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0197

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f09086a

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebView;

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->d:Landroid/webkit/WebView;

    .line 8
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->C3(Landroid/webkit/WebView;)V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f090f53

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->f:Landroid/widget/RelativeLayout;

    .line 10
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f090eef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->g:Landroid/widget/RelativeLayout;

    .line 11
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f090eee

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 12
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f090ee4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lcom/join/mgps/dialog/e;->i:Landroid/widget/Button;

    .line 13
    invoke-direct {p0}, Lcom/join/mgps/dialog/e;->e()V

    .line 14
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f09173a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/dialog/e$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/e$a;-><init>(Lcom/join/mgps/dialog/e;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    const v0, 0x7f090290

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/dialog/e$b;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/e$b;-><init>(Lcom/join/mgps/dialog/e;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/dialog/e;->j:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method
