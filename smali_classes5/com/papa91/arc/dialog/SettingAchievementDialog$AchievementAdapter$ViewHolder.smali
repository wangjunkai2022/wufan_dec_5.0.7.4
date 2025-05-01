.class Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "SettingAchievementDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field public ivAchievement:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public llProgress:Landroid/widget/LinearLayout;

.field public progressBar:Landroid/widget/ProgressBar;

.field final synthetic this$1:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

.field public tvAchievementDesc:Landroid/widget/TextView;

.field public tvAchievementName:Landroid/widget/TextView;

.field public tvAchievementUnlockPercent:Landroid/widget/TextView;

.field public tvProgress:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter$ViewHolder;->this$1:Lcom/papa91/arc/dialog/SettingAchievementDialog$AchievementAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
