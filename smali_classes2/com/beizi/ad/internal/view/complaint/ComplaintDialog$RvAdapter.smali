.class Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "ComplaintDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RvAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;
    }
.end annotation


# instance fields
.field public mOnItemClickListener:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;

.field private mlist:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 2
    iput-object p3, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mlist:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mlist:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->this$0:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;

    invoke-static {p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;->access$900(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog;)I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mlist:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;

    invoke-virtual {v0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$DislikeBean;->getDislikeReason()Ljava/lang/String;

    move-result-object v0

    .line 2
    instance-of v1, p1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;

    if-eqz v1, :cond_0

    .line 3
    move-object v1, p1

    check-cast v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;

    .line 4
    invoke-static {v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->access$1000(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mlist:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mlist:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne p2, v2, :cond_0

    .line 6
    invoke-static {v1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->access$1100(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;)Landroid/view/View;

    move-result-object p2

    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 7
    :cond_0
    iget-object p2, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mOnItemClickListener:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;

    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;

    invoke-direct {v1, p0, p1, v0}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$1;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/beizi/ad/R$layout;->beizi_complaint_item_multi_one:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;

    invoke-direct {p2, p0, p1}, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;-><init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public setOnItemClickListener(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;->mOnItemClickListener:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$OnItemClickListener;

    return-void
.end method
