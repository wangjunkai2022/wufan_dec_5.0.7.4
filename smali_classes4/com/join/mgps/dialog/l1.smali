.class public Lcom/join/mgps/dialog/l1;
.super Lcom/join/mgps/dialog/p;
.source "ModLaunchDomainDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dialog/l1$a;
    }
.end annotation


# instance fields
.field private k:Lcom/join/mgps/dto/DomainInfoBean;

.field private l:Lcom/join/mgps/dialog/l1$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f110148

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/dialog/p;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f110148

    .line 3
    invoke-direct {p0, p1, v0}, Lcom/join/mgps/dialog/p;-><init>(Landroid/content/Context;I)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    .line 5
    iput-object p2, p0, Lcom/join/mgps/dialog/l1;->k:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/dialog/l1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/dialog/l1;->s(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/join/mgps/dialog/l1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/dialog/l1;->q(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/join/mgps/dialog/l1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/dialog/l1;->r(Landroid/view/View;)V

    return-void
.end method

.method private p()V
    .locals 7

    const v0, 0x7f0908f4

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f090215

    .line 2
    invoke-virtual {p0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090210

    .line 3
    invoke-virtual {p0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f09081f

    .line 4
    invoke-virtual {p0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 5
    iget-object v4, p0, Lcom/join/mgps/dialog/l1;->k:Lcom/join/mgps/dto/DomainInfoBean;

    if-eqz v4, :cond_2

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/dialog/l1;->k:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 9
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v4

    invoke-static {v0}, Lcom/join/mgps/Util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v5, Lcom/join/mgps/dto/WxProgram;

    invoke-virtual {v4, v0, v5}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/WxProgram;

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/WxProgram;->getButton_pic()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    if-nez v4, :cond_0

    .line 11
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/WxProgram;->getButton_pic()Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lcom/facebook/drawee/drawable/r$c;->c:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v3, v0, v4}, Lcom/join/android/app/common/utils/MyImageLoader;->p(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/WxProgram;->getButton_text()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 15
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/WxProgram;->getButton_text()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    const-string v0, "\u9886\u53d6\u653b\u7565"

    .line 20
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    :cond_2
    :goto_0
    new-instance v0, Lcom/join/mgps/dialog/j1;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/j1;-><init>(Lcom/join/mgps/dialog/l1;)V

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    new-instance v0, Lcom/join/mgps/dialog/k1;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/k1;-><init>(Lcom/join/mgps/dialog/l1;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    new-instance v0, Lcom/join/mgps/dialog/i1;

    invoke-direct {v0, p0}, Lcom/join/mgps/dialog/i1;-><init>(Lcom/join/mgps/dialog/l1;)V

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private synthetic q(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/join/mgps/dialog/l1$a;->a()V

    :cond_0
    return-void
.end method

.method private synthetic r(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/join/mgps/dialog/l1$a;->b()V

    :cond_0
    return-void
.end method

.method private synthetic s(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/join/mgps/dialog/l1$a;->b()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/dialog/p;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c01d1

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 5
    invoke-virtual {p0, p0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/dialog/l1;->p()V

    return-void
.end method

.method public onShow(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-super {p0}, Lcom/join/mgps/dialog/p;->show()V

    return-void
.end method

.method public t(Lcom/join/mgps/dialog/l1$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/l1;->l:Lcom/join/mgps/dialog/l1$a;

    return-void
.end method
