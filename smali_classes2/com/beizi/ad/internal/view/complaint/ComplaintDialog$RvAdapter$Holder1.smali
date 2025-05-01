.class public Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "ComplaintDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Holder1"
.end annotation


# instance fields
.field private Tvtitle:Landroid/widget/TextView;

.field private reasonItemDivider:Landroid/view/View;

.field final synthetic this$1:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;


# direct methods
.method public constructor <init>(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;Landroid/view/View;)V
    .locals 0
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->this$1:Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 3
    sget p1, Lcom/beizi/ad/R$id;->dislike_item_multi_one_title:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->Tvtitle:Landroid/widget/TextView;

    .line 4
    sget p1, Lcom/beizi/ad/R$id;->complaint_reason_item_divider:I

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->reasonItemDivider:Landroid/view/View;

    return-void
.end method

.method static synthetic access$1000(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->Tvtitle:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/internal/view/complaint/ComplaintDialog$RvAdapter$Holder1;->reasonItemDivider:Landroid/view/View;

    return-object p0
.end method
