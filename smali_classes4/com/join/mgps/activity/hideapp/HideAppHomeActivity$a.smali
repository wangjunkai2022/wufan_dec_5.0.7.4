.class Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "HideAppHomeActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)Ljava/util/List;

    move-result-object p1

    const v0, 0x7f0c03d1

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->e(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->d(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;Landroid/view/View;)V

    return-void
.end method

.method private synthetic d(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result p2

    if-nez p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->getType()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;->a(I)Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_1

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result p2

    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->getType()I

    move-result p1

    if-ne p2, p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->h0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)V

    goto :goto_1

    .line 5
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    const-string p2, "\u8bb0\u4e8b\u672c"

    goto :goto_0

    :cond_2
    const-string p2, "\u8ba1\u7b97\u5668\u4f2a\u88c5\u529f\u80fd\u4f7f\u7528\u4e2d\uff0c\u8bf7\u5148\u89e3\u9664\u9690\u8eab\u72b6\u6001"

    :goto_0
    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->showMessage(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private synthetic e(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_;->t0(Landroid/content/Context;)Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;

    move-result-object p1

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;->a(I)Lcom/join/mgps/activity/hideapp/HideAppSetPwdActivity_$c;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method


# virtual methods
.method protected c(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;)V
    .locals 5
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5c06\u81ea\u8eab\u4f2a\u88c5\u6210"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f091573

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u4ece"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\u4e2d\u8f93\u51656\u4f4d\u5bc6\u7801\u8fdb\u5165\u609f\u996d"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09150d

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->getType()I

    move-result v2

    if-ne v1, v2, :cond_0

    const-string v1, "\u89e3\u9664\u9690\u8eab\u72b6\u6001"

    goto :goto_0

    :cond_0
    const-string v1, "\u7acb\u5373\u4f7f\u7528"

    :goto_0
    const v2, 0x7f0914f9

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->getType()I

    move-result v3

    if-ne v1, v3, :cond_1

    const v1, 0x7f080cf6

    goto :goto_1

    :cond_1
    const v1, 0x7f080dbf

    :goto_1
    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;

    .line 5
    invoke-static {v1}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;->g0(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity;)I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->getType()I

    move-result v3

    if-ne v1, v3, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    const v3, 0x7f09155a

    invoke-virtual {v0, v3, v1}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f09078b

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;->a()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/hideapp/b;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/activity/hideapp/b;-><init>(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/activity/hideapp/a;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/hideapp/a;-><init>(Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$a;->c(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/hideapp/HideAppHomeActivity$b;)V

    return-void
.end method
