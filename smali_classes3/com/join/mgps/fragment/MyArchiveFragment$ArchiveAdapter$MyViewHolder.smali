.class public Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "MyArchiveFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyViewHolder"
.end annotation


# instance fields
.field a:Landroid/widget/ImageView;

.field b:Landroid/widget/ImageView;

.field c:Lcom/join/mgps/customview/ClouldItemView;

.field d:Landroid/widget/RelativeLayout;

.field final synthetic e:Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;->e:Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f090955

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;->a:Landroid/widget/ImageView;

    const p1, 0x7f090965

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;->b:Landroid/widget/ImageView;

    const p1, 0x7f0903b4

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/customview/ClouldItemView;

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;->c:Lcom/join/mgps/customview/ClouldItemView;

    const p1, 0x7f091173

    .line 6
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/join/mgps/fragment/MyArchiveFragment$ArchiveAdapter$MyViewHolder;->d:Landroid/widget/RelativeLayout;

    return-void
.end method
