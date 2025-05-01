.class Lcom/join/mgps/activity/EndGameReportActivity$a;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "EndGameReportActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/EndGameReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/EndGameReportTypeBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameReportTypeBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/join/mgps/activity/EndGameReportActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/EndGameReportActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/EndGameReportActivity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameReportTypeBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameReportActivity$a;->b:Lcom/join/mgps/activity/EndGameReportActivity;

    const p1, 0x7f0c03a2

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    .line 3
    iput-object p2, p0, Lcom/join/mgps/activity/EndGameReportActivity$a;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/activity/EndGameReportActivity$a;Lcom/join/mgps/dto/EndGameReportTypeBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/EndGameReportActivity$a;->c(Lcom/join/mgps/dto/EndGameReportTypeBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/EndGameReportTypeBean;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameReportActivity$a;->b:Lcom/join/mgps/activity/EndGameReportActivity;

    iput-object p1, p2, Lcom/join/mgps/activity/EndGameReportActivity;->g:Lcom/join/mgps/dto/EndGameReportTypeBean;

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameReportActivity$a;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameReportTypeBean;

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameReportTypeBean;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameReportTypeBean;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameReportTypeBean;->setSelected(Z)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameReportTypeBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f0908da

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameReportTypeBean;->isSelected()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameReportTypeBean;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f091553

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/activity/l;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/activity/l;-><init>(Lcom/join/mgps/activity/EndGameReportActivity$a;Lcom/join/mgps/dto/EndGameReportTypeBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/EndGameReportTypeBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/EndGameReportActivity$a;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameReportTypeBean;)V

    return-void
.end method
