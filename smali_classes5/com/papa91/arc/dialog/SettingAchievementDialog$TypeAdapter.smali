.class Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;
.super Lcom/papa91/arc/adapter/SimpleBaseAdapter;
.source "SettingAchievementDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/dialog/SettingAchievementDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "TypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/papa91/arc/adapter/SimpleBaseAdapter<",
        "Lcom/papa91/arc/bean/TypeBean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;


# direct methods
.method constructor <init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-direct {p0}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public convert(ILandroid/view/View;Landroid/view/ViewGroup;Z)V
    .locals 1

    if-eqz p4, :cond_0

    .line 1
    new-instance p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;

    invoke-direct {p3, p0}, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;-><init>(Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;)V

    .line 2
    sget p4, Lorg/ppsspp/ppsspp/R$id;->ll_root:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/LinearLayout;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->ll_root:Landroid/widget/LinearLayout;

    .line 3
    sget p4, Lorg/ppsspp/ppsspp/R$id;->tv_type:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->tv_type:Landroid/widget/TextView;

    .line 4
    sget p4, Lorg/ppsspp/ppsspp/R$id;->iv_icon:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/ImageView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_slot_store:Landroid/widget/ImageView;

    .line 5
    sget p4, Lorg/ppsspp/ppsspp/R$id;->iv_arrow:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/ImageView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_arrow:Landroid/widget/ImageView;

    .line 6
    sget p4, Lorg/ppsspp/ppsspp/R$id;->iv_dot:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/ImageView;

    iput-object p4, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_dot:Landroid/widget/ImageView;

    .line 7
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lcom/papa91/arc/adapter/SimpleBaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/bean/TypeBean;

    .line 10
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_slot_store:Landroid/widget/ImageView;

    const/16 p4, 0x8

    invoke-virtual {p2, p4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object p2, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->tv_type:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/TypeBean;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    invoke-virtual {p1}, Lcom/papa91/arc/bean/TypeBean;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->tv_type:Landroid/widget/TextView;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->ll_root:Landroid/widget/LinearLayout;

    sget p2, Lorg/ppsspp/ppsspp/R$drawable;->bg_type_h:I

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 15
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_arrow:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 16
    :cond_1
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->tv_type:Landroid/widget/TextView;

    const p2, -0x6b2801

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 17
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->ll_root:Landroid/widget/LinearLayout;

    sget p2, Lorg/ppsspp/ppsspp/R$drawable;->bg_type_n:I

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 18
    iget-object p1, p3, Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter$ViewHolder;->iv_arrow:Landroid/widget/ImageView;

    invoke-virtual {p1, p4}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lorg/ppsspp/ppsspp/R$layout;->item_slot_type:I

    return v0
.end method
