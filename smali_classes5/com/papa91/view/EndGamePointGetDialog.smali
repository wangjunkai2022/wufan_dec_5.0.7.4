.class public Lcom/papa91/view/EndGamePointGetDialog;
.super Landroid/app/Dialog;
.source "EndGamePointGetDialog.java"


# instance fields
.field private bean:Lcom/papa91/arc/bean/EndGameAllowBean;

.field private context:Landroid/app/Activity;

.field private gameId:Ljava/lang/String;

.field private sdkType:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/papa91/arc/bean/EndGameAllowBean;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget v0, Lcom/papa91/mix/R$style;->Dialog:I

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 2
    iput-object p2, p0, Lcom/papa91/view/EndGamePointGetDialog;->bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    .line 3
    iput-object p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->context:Landroid/app/Activity;

    .line 4
    iput-object p3, p0, Lcom/papa91/view/EndGamePointGetDialog;->gameId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/papa91/view/EndGamePointGetDialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/papa91/view/EndGamePointGetDialog;->lambda$onCreate$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/papa91/view/EndGamePointGetDialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/papa91/view/EndGamePointGetDialog;->lambda$onCreate$0(Landroid/view/View;)V

    return-void
.end method

.method private synthetic lambda$onCreate$0(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 2
    iget-object p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->context:Landroid/app/Activity;

    instance-of v0, p1, Lcom/papa91/activity/EmuMenuBaseActivity;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/papa91/activity/EmuMenuBaseActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, Lcom/papa91/activity/EmuBaseActivity;->endGameAllow(ZI)V

    :cond_0
    return-void
.end method

.method private synthetic lambda$onCreate$1(Landroid/view/View;)V
    .locals 2

    .line 1
    sget-object p1, Lcom/papa91/arc/CContext;->mVideoAdListener:Lcom/papa91/arc/CContext$IVideoAdListener;

    iget v0, p0, Lcom/papa91/view/EndGamePointGetDialog;->sdkType:I

    iget-object v1, p0, Lcom/papa91/view/EndGamePointGetDialog;->gameId:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/papa91/arc/CContext$IVideoAdListener;->showEndAd(ILjava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->context:Landroid/app/Activity;

    instance-of v0, p1, Lcom/papa91/activity/EmuBaseActivity;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/papa91/activity/EmuBaseActivity;

    const-string v0, "clickGameVSAdVideo"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/papa91/activity/EmuBaseActivity;->senCommonEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    sget p1, Lcom/papa91/mix/R$layout;->dialog_end_game_get_point:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 3
    sget p1, Lcom/papa91/mix/R$id;->ivClose:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 4
    sget v0, Lcom/papa91/mix/R$id;->textEndless:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 5
    sget v1, Lcom/papa91/mix/R$id;->tvPointCount:I

    invoke-virtual {p0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 6
    sget v2, Lcom/papa91/mix/R$id;->llBtn:I

    invoke-virtual {p0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 7
    sget v3, Lcom/papa91/mix/R$id;->icMulti:I

    invoke-virtual {p0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 8
    sget v4, Lcom/papa91/mix/R$id;->icVideoAd:I

    invoke-virtual {p0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 9
    sget v4, Lcom/papa91/mix/R$id;->textReceive:I

    invoke-virtual {p0, v4}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const/4 v4, 0x0

    .line 10
    invoke-virtual {p0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 11
    iget-object v5, p0, Lcom/papa91/view/EndGamePointGetDialog;->bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v5}, Lcom/papa91/arc/bean/EndGameAllowBean;->isAwardUnlimited()Z

    move-result v5

    const/16 v6, 0x8

    if-eqz v5, :cond_0

    .line 12
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 17
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/papa91/view/EndGamePointGetDialog;->bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v3}, Lcom/papa91/arc/bean/EndGameAllowBean;->getAwardCards()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    :goto_0
    new-instance v0, Lcom/papa91/view/c;

    invoke-direct {v0, p0}, Lcom/papa91/view/c;-><init>(Lcom/papa91/view/EndGamePointGetDialog;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    new-instance p1, Lcom/papa91/view/b;

    invoke-direct {p1, p0}, Lcom/papa91/view/b;-><init>(Lcom/papa91/view/EndGamePointGetDialog;)V

    invoke-virtual {v2, p1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    iget-object p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getAdVideoConfigList()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 22
    iget-object p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getAdVideoConfigList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/bean/EndGameAdBean;

    if-eqz v0, :cond_1

    .line 23
    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAdBean;->getSdkType()I

    move-result p1

    iput p1, p0, Lcom/papa91/view/EndGamePointGetDialog;->sdkType:I

    .line 24
    sget-object p1, Lcom/papa91/arc/CContext;->mVideoAdListener:Lcom/papa91/arc/CContext$IVideoAdListener;

    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAdBean;->getSdkType()I

    move-result v1

    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAdBean;->getAdId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/papa91/arc/bean/EndGameAdBean;->getSdkKey()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v2, v0}, Lcom/papa91/arc/CContext$IVideoAdListener;->loadEndAd(ILjava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
