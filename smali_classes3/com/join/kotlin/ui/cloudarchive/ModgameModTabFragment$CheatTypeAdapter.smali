.class Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment$CheatTypeAdapter;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "ModgameModTabFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CheatTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/GoldFingerBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;


# direct methods
.method public constructor <init>(Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment$CheatTypeAdapter;->this$0:Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment;

    const p1, 0x7f0c03df

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected convert(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/GoldFingerBean;)V
    .locals 2

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GoldFingerBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f091635

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/GoldFingerBean;->isSelected()Z

    move-result p2

    const v0, 0x7f090943

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    .line 4
    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    :cond_0
    const-string p2, "#C1D0DD"

    .line 6
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_0
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/GoldFingerBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/kotlin/ui/cloudarchive/ModgameModTabFragment$CheatTypeAdapter;->convert(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/GoldFingerBean;)V

    return-void
.end method
