.class Lcom/join/mgps/activity/CreateEndGameActivity$g;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "CreateEndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/CreateEndGameActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/BossBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/CreateEndGameActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/CreateEndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CreateEndGameActivity$g;->a:Lcom/join/mgps/activity/CreateEndGameActivity;

    const p1, 0x7f0c0386

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/BossBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/BossBean;->getBoos()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f09169b

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/BossBean;->getLevel()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f09168f

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
    check-cast p2, Lcom/join/mgps/dto/BossBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/CreateEndGameActivity$g;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/BossBean;)V

    return-void
.end method
