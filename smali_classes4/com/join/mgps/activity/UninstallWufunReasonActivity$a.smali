.class Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "UninstallWufunReasonActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/UninstallWufunReasonActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Ljava/lang/String;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/UninstallWufunReasonActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/UninstallWufunReasonActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/UninstallWufunReasonActivity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->a:Lcom/join/mgps/activity/UninstallWufunReasonActivity;

    const p1, 0x7f0c042e

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;Lcom/join/mgps/base/BaseViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->c(Lcom/join/mgps/base/BaseViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/base/BaseViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->a:Lcom/join/mgps/activity/UninstallWufunReasonActivity;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p2, p1}, Lcom/join/mgps/activity/UninstallWufunReasonActivity;->h0(Lcom/join/mgps/activity/UninstallWufunReasonActivity;I)I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f091553

    .line 1
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const p2, 0x7f0908da

    .line 2
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    iget-object v1, p0, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->a:Lcom/join/mgps/activity/UninstallWufunReasonActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/UninstallWufunReasonActivity;->g0(Lcom/join/mgps/activity/UninstallWufunReasonActivity;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/activity/g3;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/g3;-><init>(Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;Lcom/join/mgps/base/BaseViewHolder;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/UninstallWufunReasonActivity$a;->b(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V

    return-void
.end method
