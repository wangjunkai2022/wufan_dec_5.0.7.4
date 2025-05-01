.class Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "SimulatorLaunchMomentFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;->a:Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment;

    const p1, 0x7f0c0522

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f0908d2

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0914ee

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;->getUnlockRate()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f091585

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/SimulatorLaunchMomentFragment$c;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;)V

    return-void
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method
