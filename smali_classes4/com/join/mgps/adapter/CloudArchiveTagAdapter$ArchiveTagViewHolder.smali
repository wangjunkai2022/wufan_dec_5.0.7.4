.class public Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "CloudArchiveTagAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/CloudArchiveTagAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ArchiveTagViewHolder"
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field final synthetic c:Lcom/join/mgps/adapter/CloudArchiveTagAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/CloudArchiveTagAdapter;Landroid/view/View;)V
    .locals 0
    .param p1    # Lcom/join/mgps/adapter/CloudArchiveTagAdapter;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;->c:Lcom/join/mgps/adapter/CloudArchiveTagAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f091582

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;->a:Landroid/widget/TextView;

    const p1, 0x7f091508

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;->b:Landroid/widget/TextView;

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;->a:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic b(Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/CloudArchiveTagAdapter$ArchiveTagViewHolder;->b:Landroid/widget/TextView;

    return-object p0
.end method
