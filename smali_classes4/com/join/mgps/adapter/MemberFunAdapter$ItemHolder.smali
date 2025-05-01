.class public Lcom/join/mgps/adapter/MemberFunAdapter$ItemHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "MemberFunAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/MemberFunAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ItemHolder"
.end annotation


# instance fields
.field a:Landroid/widget/LinearLayout;

.field b:Lcom/facebook/drawee/view/SimpleDraweeView;

.field c:Landroid/widget/TextView;

.field final synthetic d:Lcom/join/mgps/adapter/MemberFunAdapter;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/MemberFunAdapter;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MemberFunAdapter$ItemHolder;->d:Lcom/join/mgps/adapter/MemberFunAdapter;

    .line 2
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    const p1, 0x7f0908b0

    .line 3
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/mgps/adapter/MemberFunAdapter$ItemHolder;->a:Landroid/widget/LinearLayout;

    const p1, 0x7f0908af

    .line 4
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p1, p0, Lcom/join/mgps/adapter/MemberFunAdapter$ItemHolder;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const p1, 0x7f0908b1

    .line 5
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/mgps/adapter/MemberFunAdapter$ItemHolder;->c:Landroid/widget/TextView;

    return-void
.end method
