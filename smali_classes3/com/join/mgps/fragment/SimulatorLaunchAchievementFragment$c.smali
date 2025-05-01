.class Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "SimulatorLaunchAchievementFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$c;->a:Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment;

    const p1, 0x7f0c052b

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;)V
    .locals 3
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f0908d2

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0914f0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getCondition()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0914ef

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getUnlock_rate()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%\u73a9\u5bb6\u5df2\u89e3\u9501"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "\u8fd8\u6ca1\u4eba\u89e3\u9501,\u5feb\u6765\u6311\u6218"

    :goto_0
    const v1, 0x7f0914f2

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09154b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getDone()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f091056

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09104a

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getDone()I

    move-result v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;->getTarget()I

    move-result p2

    invoke-virtual {p1, v0, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(III)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/SimulatorLaunchAchievementFragment$c;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorAchievementBean$AchievementInfo;)V

    return-void
.end method
