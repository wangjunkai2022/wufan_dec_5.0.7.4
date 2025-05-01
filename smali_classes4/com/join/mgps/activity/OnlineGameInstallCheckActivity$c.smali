.class Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "OnlineGameInstallCheckActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Ljava/util/ArrayList;

    move-result-object p1

    const v0, 0x7f0c03eb

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;)V
    .locals 3
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->b()I

    move-result v0

    const v1, 0x7f0908e9

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->c()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f091573

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->a()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0914fe

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;->d()Z

    move-result p2

    const v1, 0x7f090714

    invoke-virtual {v0, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p2

    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->i0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const p1, 0x7f09044b

    invoke-virtual {p2, p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$c;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$d;)V

    return-void
.end method
