.class Lcom/papa91/arc/dialog/SettingAchievementDialog$1;
.super Ljava/lang/Object;
.source "SettingAchievementDialog.java"

# interfaces
.implements Lcom/papa91/arc/interfaces/IOnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/dialog/SettingAchievementDialog;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;


# direct methods
.method constructor <init>(Lcom/papa91/arc/dialog/SettingAchievementDialog;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$000(Lcom/papa91/arc/dialog/SettingAchievementDialog;)I

    move-result v0

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$100(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v2}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$100(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 3
    iget-object v2, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v2}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$100(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/papa91/arc/bean/TypeBean;

    if-ne v1, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/papa91/arc/bean/TypeBean;->setSelected(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v0, p1}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$002(Lcom/papa91/arc/dialog/SettingAchievementDialog;I)I

    .line 5
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$200(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Lcom/papa91/arc/dialog/SettingAchievementDialog$TypeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 6
    iget-object v0, p0, Lcom/papa91/arc/dialog/SettingAchievementDialog$1;->this$0:Lcom/papa91/arc/dialog/SettingAchievementDialog;

    invoke-static {v0}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$100(Lcom/papa91/arc/dialog/SettingAchievementDialog;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/papa91/arc/bean/TypeBean;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/TypeBean;->getType()I

    move-result p1

    invoke-static {v0, p1}, Lcom/papa91/arc/dialog/SettingAchievementDialog;->access$300(Lcom/papa91/arc/dialog/SettingAchievementDialog;I)V

    :cond_2
    return-void
.end method
