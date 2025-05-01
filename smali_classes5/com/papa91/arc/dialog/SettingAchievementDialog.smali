.class public Lcom/papa91/arc/dialog/SettingAchievementDialog;
.super Lcom/papa91/arc/dialog/SettingDialog;
.source "SettingAchievementDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;,
        Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;
    }
.end annotation


# instance fields
.field private allAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

.field private allPage:I

.field private context:Landroid/content/Context;

.field private defaultType:I

.field private isTourist:Z

.field private ivAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

.field private ivTips:Landroid/widget/ImageView;

.field private llUserInfo:Landroid/widget/LinearLayout;

.field private ll_empty:Landroid/widget/LinearLayout;

.field private lockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

.field private lockPage:I

.field private lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

.field private lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

.field private lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

.field private lv_type:Landroid/widget/ListView;

.field private oldSelIndex:I

.field private progressBar:Landroid/widget/ProgressBar;

.field private tvProgress:Landroid/widget/TextView;

.field private tvUsername:Landroid/widget/TextView;

.field private tv_back_game:Landroid/widget/TextView;

.field private tv_title:Landroid/widget/TextView;

.field private typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

.field private typeBeans:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/papa91/arc/bean/TypeBean;",
            ">;"
        }
    .end annotation
.end field

.field private unlockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

.field private unlockPage:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/papa91/arc/dialog/SettingDialog;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allPage:I

    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockPage:I

    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockPage:I

    .line 3
    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    .line 4
    iput-boolean v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    .line 5
    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->context:Landroid/content/Context;

    .line 6
    iput p2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    .line 7
    iput-boolean p3, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    .line 8
    sget p1, Lorg/ppsspp/ppsspp/R$id;->tv_back_game:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tv_back_game:Landroid/widget/TextView;

    .line 9
    sget p1, Lorg/ppsspp/ppsspp/R$id;->ivAvatar:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 10
    sget p1, Lorg/ppsspp/ppsspp/R$id;->tvUsername:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tvUsername:Landroid/widget/TextView;

    .line 11
    sget p1, Lorg/ppsspp/ppsspp/R$id;->llUserInfo:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->llUserInfo:Landroid/widget/LinearLayout;

    .line 12
    sget p1, Lorg/ppsspp/ppsspp/R$id;->lv_type:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ListView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_type:Landroid/widget/ListView;

    .line 13
    sget p1, Lorg/ppsspp/ppsspp/R$id;->lv_achievement_all:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/ListViewFinal;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    .line 14
    sget p1, Lorg/ppsspp/ppsspp/R$id;->lv_achievement_unlock:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/ListViewFinal;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    .line 15
    sget p1, Lorg/ppsspp/ppsspp/R$id;->lv_achievement_lock:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/widget/listview/ListViewFinal;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    .line 16
    sget p1, Lorg/ppsspp/ppsspp/R$id;->tv_title:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tv_title:Landroid/widget/TextView;

    .line 17
    sget p1, Lorg/ppsspp/ppsspp/R$id;->ivTips:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivTips:Landroid/widget/ImageView;

    .line 18
    sget p1, Lorg/ppsspp/ppsspp/R$id;->tvProgress:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tvProgress:Landroid/widget/TextView;

    .line 19
    sget p1, Lorg/ppsspp/ppsspp/R$id;->progressBar:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->progressBar:Landroid/widget/ProgressBar;

    .line 20
    sget p1, Lorg/ppsspp/ppsspp/R$id;->ll_empty:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ll_empty:Landroid/widget/LinearLayout;

    .line 21
    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tv_title:Landroid/widget/TextView;

    const-string p2, "\u6210\u5c31"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x2

    new-array p1, p1, [Landroid/view/View;

    .line 22
    iget-object p2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tv_back_game:Landroid/widget/TextView;

    const/4 p3, 0x0

    aput-object p2, p1, p3

    iget-object p2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivTips:Landroid/widget/ImageView;

    aput-object p2, p1, v0

    invoke-virtual {p0, p1}, Lcom/papa91/arc/dialog/SettingDialog;->setOnListener([Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    invoke-direct {p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$initData$1()V

    return-void
.end method

.method static synthetic access$000(Lcom/papa91/arc/dialog/SettingAchievementDialog;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->oldSelIndex:I

    return p0
.end method

.method static synthetic access$002(Lcom/papa91/arc/dialog/SettingAchievementDialog;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->oldSelIndex:I

    return p1
.end method

.method static synthetic access$100(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeBeans:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$200(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    return-object p0
.end method

.method static synthetic access$300(Lcom/papa91/arc/dialog/SettingAchievementDialog;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->setTab(I)V

    return-void
.end method

.method public static synthetic b(Lcom/papa91/arc/dialog/SettingAchievementDialog;ILcom/papa91/arc/bean/Response;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$getData$4(ILcom/papa91/arc/bean/Response;I)V

    return-void
.end method

.method public static synthetic c(Lcom/papa91/arc/dialog/SettingAchievementDialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$refreshUserStatus$3(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/papa91/arc/dialog/SettingAchievementDialog;Lcom/papa91/arc/bean/Request;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$getData$5(Lcom/papa91/arc/bean/Request;II)V

    return-void
.end method

.method public static synthetic e(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    invoke-direct {p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$initData$2()V

    return-void
.end method

.method public static synthetic f(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    invoke-direct {p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lambda$initData$0()V

    return-void
.end method

.method private getData(I)V
    .locals 3

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 1
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allPage:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockPage:I

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockPage:I

    .line 2
    :goto_0
    new-instance v1, Lcom/papa91/arc/bean/RequestAchievementArgs;

    invoke-direct {v1}, Lcom/papa91/arc/bean/RequestAchievementArgs;-><init>()V

    .line 3
    invoke-virtual {v1, v0}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setPage(I)V

    .line 4
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setGameId(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setUid(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->getPlugVerCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setPlugVersion(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v1, p1}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setType(I)V

    .line 8
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa91/arc/bean/RequestAchievementArgs;->setToken(Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/papa91/arc/bean/Request;->getRequest(Landroid/content/Context;Ljava/lang/Object;)Lcom/papa91/arc/bean/Request;

    move-result-object v1

    .line 10
    invoke-static {v1}, Lcom/papa91/arc/util/SignUtil;->getSignForAPP(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa91/arc/bean/Request;->setSign(Ljava/lang/String;)V

    .line 11
    new-instance v2, Lcom/papa91/arc/dialog/r;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/papa91/arc/dialog/r;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;Lcom/papa91/arc/bean/Request;II)V

    invoke-static {v2}, Lcom/papa91/arc/ext/ThreadManager;->runOnWriteThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private initData()V
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->refreshUserStatus()V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    invoke-direct {v0, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    iput-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    new-instance v1, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;

    invoke-direct {v1, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    invoke-virtual {v0, v1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->setItemClickListener(Lcom/papa91/arc/interfaces/IOnItemClickListener;)V

    .line 5
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_type:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeBeans:Ljava/util/ArrayList;

    .line 7
    new-instance v7, Lcom/papa91/arc/bean/TypeBean;

    const/4 v2, 0x1

    iget v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-ne v1, v9, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "\u5168\u90e8\u6210\u5c31"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/papa91/arc/bean/TypeBean;-><init>(ILjava/lang/String;ZII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeBeans:Ljava/util/ArrayList;

    new-instance v7, Lcom/papa91/arc/bean/TypeBean;

    const/4 v2, 0x2

    iget v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    const/4 v10, 0x2

    if-ne v1, v10, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "\u5df2\u89e3\u9501"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/papa91/arc/bean/TypeBean;-><init>(ILjava/lang/String;ZII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeBeans:Ljava/util/ArrayList;

    new-instance v7, Lcom/papa91/arc/bean/TypeBean;

    const/4 v2, 0x3

    iget v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    const/4 v11, 0x3

    if-ne v1, v11, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v3, "\u672a\u89e3\u9501"

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/papa91/arc/bean/TypeBean;-><init>(ILjava/lang/String;ZII)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->typeBeans:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->setDatas(Ljava/util/List;)V

    .line 11
    new-instance v0, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    invoke-direct {v0, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    iput-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    .line 12
    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-virtual {v1, v0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 13
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    new-instance v1, Lcom/papa91/arc/dialog/p;

    invoke-direct {v1, p0}, Lcom/papa91/arc/dialog/p;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    invoke-virtual {v0, v1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setOnLoadMoreListener(Lcom/papa91/arc/widget/listview/OnLoadMoreListener;)V

    .line 14
    invoke-direct {p0, v9}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    .line 15
    new-instance v0, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    invoke-direct {v0, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    iput-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    .line 16
    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-virtual {v1, v0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 17
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    new-instance v1, Lcom/papa91/arc/dialog/n;

    invoke-direct {v1, p0}, Lcom/papa91/arc/dialog/n;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    invoke-virtual {v0, v1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setOnLoadMoreListener(Lcom/papa91/arc/widget/listview/OnLoadMoreListener;)V

    .line 18
    invoke-direct {p0, v10}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    .line 19
    new-instance v0, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    invoke-direct {v0, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    iput-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    .line 20
    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    invoke-virtual {v1, v0}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 21
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    new-instance v1, Lcom/papa91/arc/dialog/o;

    invoke-direct {v1, p0}, Lcom/papa91/arc/dialog/o;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    invoke-virtual {v0, v1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setOnLoadMoreListener(Lcom/papa91/arc/widget/listview/OnLoadMoreListener;)V

    .line 22
    invoke-direct {p0, v11}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    .line 23
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->defaultType:I

    invoke-direct {p0, v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->setTab(I)V

    return-void
.end method

.method private synthetic lambda$getData$4(ILcom/papa91/arc/bean/Response;I)V
    .locals 7

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 1
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    goto :goto_0

    :cond_0
    if-ne p1, v0, :cond_1

    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    :goto_0
    if-eqz p2, :cond_9

    .line 2
    invoke-virtual {p2}, Lcom/papa91/arc/bean/Response;->getCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_9

    .line 3
    invoke-virtual {p2}, Lcom/papa91/arc/bean/Response;->getData()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    .line 4
    invoke-virtual {p2}, Lcom/papa91/arc/bean/Response;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/papa91/arc/bean/AchievementBean;

    if-ne p3, v1, :cond_2

    .line 5
    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_2

    .line 6
    invoke-virtual {v2, v4}, Landroid/widget/ListView;->setVisibility(I)V

    .line 7
    iget-object v3, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ll_empty:Landroid/widget/LinearLayout;

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8
    :cond_2
    iget-object v3, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tvProgress:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u60a8\u5df2\u5b8c\u6210"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getDone()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getTarget()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v3, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getTarget()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 10
    iget-object v3, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getDone()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    if-ne p1, v1, :cond_3

    .line 11
    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    goto :goto_1

    :cond_3
    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    :goto_1
    if-eqz p1, :cond_5

    .line 12
    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->addDatas(Ljava/util/List;)V

    :cond_5
    if-le p3, v1, :cond_6

    .line 13
    invoke-virtual {v2}, Lcom/papa91/arc/widget/listview/ListViewFinal;->onLoadMoreComplete()V

    .line 14
    :cond_6
    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lcom/papa91/arc/bean/AchievementBean;->getAchievement_list()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_7

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v2, v1}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setHasLoadMore(Z)V

    goto :goto_3

    .line 15
    :cond_8
    invoke-virtual {v2, v4}, Lcom/papa91/arc/widget/listview/ListViewFinal;->setHasLoadMore(Z)V

    :cond_9
    :goto_3
    return-void
.end method

.method private synthetic lambda$getData$5(Lcom/papa91/arc/bean/Request;II)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/papa91/arc/http/HttpUtils;->getAchievements(Lcom/papa91/arc/bean/Request;)Lcom/papa91/arc/bean/Response;

    move-result-object p1

    .line 2
    new-instance v0, Lcom/papa91/arc/dialog/q;

    invoke-direct {v0, p0, p2, p1, p3}, Lcom/papa91/arc/dialog/q;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;ILcom/papa91/arc/bean/Response;I)V

    invoke-static {v0}, Lcom/papa91/arc/ext/ThreadManager;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 3
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private synthetic lambda$initData$0()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allPage:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allPage:I

    .line 2
    invoke-direct {p0, v1}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    return-void
.end method

.method private synthetic lambda$initData$1()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockPage:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockPage:I

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    return-void
.end method

.method private synthetic lambda$initData$2()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockPage:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockPage:I

    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->getData(I)V

    return-void
.end method

.method private synthetic lambda$refreshUserStatus$3(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->goLogin()V

    .line 3
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method private refreshUserStatus()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->context:Landroid/content/Context;

    const-string v1, "Papa_Stat_SharedPreferences"

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "userAvatarForSimulator"

    const-string v2, ""

    .line 2
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "userNameForSimulator"

    .line 3
    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/generic/a;

    sget v3, Lorg/ppsspp/ppsspp/R$drawable;->icon_noraml:I

    invoke-virtual {v2, v3}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 5
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/generic/a;

    invoke-virtual {v2, v3}, Lcom/facebook/drawee/generic/a;->B(I)V

    .line 6
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-boolean v4, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    if-eqz v4, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "res:///"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Landroid/net/Uri;)V

    .line 7
    iget-object v1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->tvUsername:Landroid/widget/TextView;

    iget-boolean v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    if-eqz v2, :cond_1

    const-string v0, "\u70b9\u51fb\u767b\u5f55"

    :cond_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->llUserInfo:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/papa91/arc/dialog/m;

    invoke-direct {v1, p0}, Lcom/papa91/arc/dialog/m;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setTab(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-ne p1, v1, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v0, v4}, Landroid/widget/ListView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    const/4 v4, 0x2

    if-ne p1, v4, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    :goto_1
    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    const/4 v5, 0x3

    if-ne p1, v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    const/16 v5, 0x8

    :goto_2
    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setVisibility(I)V

    if-ne p1, v1, :cond_3

    .line 4
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_all:Lcom/papa91/arc/widget/listview/ListViewFinal;

    goto :goto_3

    :cond_3
    if-ne p1, v4, :cond_4

    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_unlock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lv_achievement_lock:Lcom/papa91/arc/widget/listview/ListViewFinal;

    :goto_3
    if-ne p1, v1, :cond_5

    .line 5
    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    goto :goto_4

    :cond_5
    if-ne p1, v4, :cond_6

    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockAdapter:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    .line 6
    :goto_4
    invoke-virtual {p1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->getCount()I

    move-result v1

    if-nez v1, :cond_7

    const/16 v1, 0x8

    goto :goto_5

    :cond_7
    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ll_empty:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->getCount()I

    move-result p1

    if-nez p1, :cond_8

    goto :goto_6

    :cond_8
    const/16 v2, 0x8

    :goto_6
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method private updateListView(Lcom/papa91/arc/bean/AchievementBean;I)V
    .locals 0

    return-void
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lorg/ppsspp/ppsspp/R$layout;->dialog_setting_achievement:I

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lcom/papa91/arc/dialog/SettingDialog;->onClick(Landroid/view/View;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lorg/ppsspp/ppsspp/R$id;->tv_back_game:I

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->dismiss()V

    .line 4
    invoke-virtual {p0}, Lcom/papa91/arc/dialog/SettingDialog;->showAdVideo()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    sget v0, Lorg/ppsspp/ppsspp/R$id;->ivTips:I

    if-ne p1, v0, :cond_1

    .line 6
    new-instance p1, Lcom/papa91/arc/dialog/AchievmentTipsDialog;

    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->context:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/papa91/arc/dialog/AchievmentTipsDialog;-><init>(Landroid/content/Context;)V

    .line 7
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->ivTips:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lorg/ppsspp/ppsspp/R$dimen;->wdp336:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lorg/ppsspp/ppsspp/R$dimen;->wdp10:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    neg-float v2, v2

    float-to-int v2, v2

    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setTourist(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->isTourist:Z

    return-void
.end method

.method public show()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/papa91/arc/dialog/SettingDialog;->show()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->allPage:I

    .line 3
    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->unlockPage:I

    .line 4
    iput v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog;->lockPage:I

    .line 5
    invoke-direct {p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->initData()V

    return-void
.end method
