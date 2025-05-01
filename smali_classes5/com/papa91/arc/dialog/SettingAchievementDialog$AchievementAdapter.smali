.class Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;
.super Lcom/papa91/arc/adapter/SimpleBaseAdapter;
.source "SettingAchievementDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/dialog/SettingAchievementDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AchievementAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/papa91/arc/adapter/SimpleBaseAdapter<",
        "Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;


# direct methods
.method constructor <init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-direct {p0}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public convert(ILandroid/view/View;Landroid/view/ViewGroup;Z)V
    .locals 1

    if-eqz p4, :cond_0

    .line 1
    new-instance p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;

    invoke-direct {p3, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;)V

    .line 2
    sget p4, Lorg/ppsspp/ppsspp/R$id;->ivAchievement:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 3
    sget p4, Lorg/ppsspp/ppsspp/R$id;->tvAchievementName:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementName:Landroid/widget/TextView;

    .line 4
    sget p4, Lorg/ppsspp/ppsspp/R$id;->tvAchievementDesc:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementDesc:Landroid/widget/TextView;

    .line 5
    sget p4, Lorg/ppsspp/ppsspp/R$id;->tvAchievementUnlockPercent:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementUnlockPercent:Landroid/widget/TextView;

    .line 6
    sget p4, Lorg/ppsspp/ppsspp/R$id;->llProgress:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/LinearLayout;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->llProgress:Landroid/widget/LinearLayout;

    .line 7
    sget p4, Lorg/ppsspp/ppsspp/R$id;->tvProgress:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvProgress:Landroid/widget/TextView;

    .line 8
    sget p4, Lorg/ppsspp/ppsspp/R$id;->progressBar:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/ProgressBar;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->progressBar:Landroid/widget/ProgressBar;

    .line 9
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;

    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;

    .line 12
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object p2

    check-cast p2, Lcom/facebook/drawee/generic/a;

    sget p4, Lorg/ppsspp/ppsspp/R$drawable;->shape_placeholder:I

    invoke-virtual {p2, p4}, Lcom/facebook/drawee/generic/a;->H(I)V

    .line 13
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object p2

    check-cast p2, Lcom/facebook/drawee/generic/a;

    sget p4, Lorg/ppsspp/ppsspp/R$drawable;->wifi:I

    invoke-virtual {p2, p4}, Lcom/facebook/drawee/generic/a;->B(I)V

    .line 14
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getIcon()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p4

    invoke-virtual {p2, p4}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Landroid/net/Uri;)V

    .line 15
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementDesc:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getCondition()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementName:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvAchievementUnlockPercent:Landroid/widget/TextView;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "%\u73a9\u5bb6\u5df2\u89e3\u9501"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->llProgress:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getTarget()I

    move-result p4

    const/4 v0, 0x1

    if-le p4, v0, :cond_1

    const/4 p4, 0x0

    goto :goto_1

    :cond_1
    const/16 p4, 0x8

    :goto_1
    invoke-virtual {p2, p4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 19
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->tvProgress:Landroid/widget/TextView;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getDone()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getTarget()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getTarget()I

    move-result p4

    invoke-virtual {p2, p4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 21
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/AchievementBean$AchievementInfo;->getDone()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lorg/ppsspp/ppsspp/R$layout;->item_achievement:I

    return v0
.end method
