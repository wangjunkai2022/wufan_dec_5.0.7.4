.class public Lcom/papa91/view/AchievementDoneFloatDialog;
.super Landroid/app/Dialog;
.source "AchievementDoneFloatDialog.java"


# instance fields
.field changeRunable:Ljava/lang/Runnable;

.field private context:Landroid/content/Context;

.field dimissRunnable:Ljava/lang/Runnable;

.field private handler:Landroid/os/Handler;

.field private infos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;",
            ">;"
        }
    .end annotation
.end field

.field private isLogin:Z

.field private ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private root:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private tvDesc:Landroid/widget/TextView;

.field private tvTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    .line 3
    new-instance v0, Lcom/papa91/view/AchievementDoneFloatDialog$1;

    invoke-direct {v0, p0}, Lcom/papa91/view/AchievementDoneFloatDialog$1;-><init>(Lcom/papa91/view/AchievementDoneFloatDialog;)V

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->changeRunable:Ljava/lang/Runnable;

    .line 4
    new-instance v0, Lcom/papa91/view/AchievementDoneFloatDialog$2;

    invoke-direct {v0, p0}, Lcom/papa91/view/AchievementDoneFloatDialog$2;-><init>(Lcom/papa91/view/AchievementDoneFloatDialog;)V

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->dimissRunnable:Ljava/lang/Runnable;

    .line 5
    iput-boolean p3, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->isLogin:Z

    .line 6
    iput-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->context:Landroid/content/Context;

    .line 7
    iget-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic a(Lcom/papa91/view/AchievementDoneFloatDialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/papa91/view/AchievementDoneFloatDialog;->lambda$initViews$0(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$000(Lcom/papa91/view/AchievementDoneFloatDialog;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/papa91/view/AchievementDoneFloatDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/papa91/view/AchievementDoneFloatDialog;->showData()V

    return-void
.end method

.method static synthetic access$200(Lcom/papa91/view/AchievementDoneFloatDialog;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->handler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$202(Lcom/papa91/view/AchievementDoneFloatDialog;Landroid/os/Handler;)Landroid/os/Handler;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->handler:Landroid/os/Handler;

    return-object p1
.end method

.method private initViews()V
    .locals 3

    .line 1
    sget v0, Lorg/ppsspp/ppsspp/R$layout;->dialog_achievement_done_float:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setContentView(I)V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const v2, 0x800033

    .line 5
    invoke-virtual {v0, v2}, Landroid/view/Window;->setGravity(I)V

    const/4 v2, 0x0

    .line 6
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    const/16 v2, 0x64

    .line 7
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    const/16 v2, 0x20

    .line 8
    :try_start_0
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 11
    sget v0, Lorg/ppsspp/ppsspp/R$id;->ivAchievement:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 12
    sget v0, Lorg/ppsspp/ppsspp/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->tvTitle:Landroid/widget/TextView;

    .line 13
    sget v0, Lorg/ppsspp/ppsspp/R$id;->tvDesc:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->tvDesc:Landroid/widget/TextView;

    .line 14
    sget v0, Lorg/ppsspp/ppsspp/R$id;->root:I

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->root:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    new-instance v1, Lcom/papa91/view/a;

    invoke-direct {v1, p0}, Lcom/papa91/view/a;-><init>(Lcom/papa91/view/AchievementDoneFloatDialog;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    invoke-direct {p0}, Lcom/papa91/view/AchievementDoneFloatDialog;->showData()V

    return-void
.end method

.method private synthetic lambda$initViews$0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->context:Landroid/content/Context;

    instance-of v0, p1, Lcom/papa91/activity/EmuMenuBaseActivity;

    if-eqz v0, :cond_1

    .line 2
    check-cast p1, Lcom/papa91/activity/EmuMenuBaseActivity;

    .line 3
    iget-boolean v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->isLogin:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p1, v0}, Lcom/papa91/activity/EmuMenuBaseActivity;->showAchievementDialog(I)V

    :cond_1
    return-void
.end method

.method private showData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/view/AchievementDoneFloatDialog;->dismiss()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;

    .line 4
    iget-object v2, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/generic/a;

    sget v3, Lorg/ppsspp/ppsspp/R$drawable;->shape_placeholder:I

    invoke-virtual {v2, v3}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 5
    iget-object v2, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/generic/a;

    sget v3, Lorg/ppsspp/ppsspp/R$drawable;->wifi:I

    invoke-virtual {v2, v3}, Lcom/facebook/drawee/generic/a;->B(I)V

    .line 6
    iget-object v2, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Landroid/net/Uri;)V

    .line 7
    iget-object v2, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->tvTitle:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u606d\u559c\u4f60\u89e3\u9501\u6210\u5c31\u3010"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\u3011"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v2, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->tvDesc:Landroid/widget/TextView;

    iget-boolean v3, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->isLogin:Z

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "%\u73a9\u5bb6\u89e3\u9501\u6b64\u6210\u5c31"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "\u767b\u5f55\u8d26\u53f7\u5373\u53ef\u4fdd\u5b58\u6210\u5c31"

    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 10
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->handler:Landroid/os/Handler;

    if-nez v0, :cond_2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->handler:Landroid/os/Handler;

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->changeRunable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public addInfo(Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public dismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/papa91/view/AchievementDoneFloatDialog;->infos:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 3
    invoke-direct {p0}, Lcom/papa91/view/AchievementDoneFloatDialog;->initViews()V

    return-void
.end method
