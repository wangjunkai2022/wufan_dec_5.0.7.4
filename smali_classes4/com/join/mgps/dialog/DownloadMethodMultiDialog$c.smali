.class Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DownloadMethodMultiDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dialog/DownloadMethodMultiDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
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
.field final synthetic a:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;


# direct methods
.method public constructor <init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/dialog/DownloadMethodMultiDialog;
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
    iput-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->a:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    const p1, 0x7f0c051f

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->c(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Ljava/lang/String;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->a:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    iget-object v0, p2, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    if-nez v0, :cond_0

    const-string p1, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25"

    .line 2
    invoke-virtual {p2, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p2, p2, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->i:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/widget/ImageView;->isSelected()Z

    move-result p2

    if-nez p2, :cond_1

    .line 4
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->a:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    const-string p2, "\u8bf7\u5148\u540c\u610f\u7528\u6237\u534f\u8bae"

    invoke-virtual {p1, p2}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->h0(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V
    .locals 3
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->a:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    iget-object v0, v0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->t:Lcom/join/mgps/dto/QueryDownloadInfoResponseData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/QueryDownloadInfoResponseData;->getGameName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f09151e

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f091523

    .line 2
    invoke-virtual {v0, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-virtual {p0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const v0, 0x7f09044b

    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/dialog/j0;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/dialog/j0;-><init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;Ljava/lang/String;)V

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
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog$c;->b(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/String;)V

    return-void
.end method
