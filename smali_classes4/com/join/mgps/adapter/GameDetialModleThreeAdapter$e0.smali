.class Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$e0;
.super Ljava/lang/Object;
.source "GameDetialModleThreeAdapter.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l2;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$e0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$e0;->b:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$e0;->c:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;

    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$e0;->b:Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l2;

    iget-object v0, v0, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter$l2;->b:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-static {p1, v0}, Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;->m(Lcom/join/mgps/adapter/GameDetialModleThreeAdapter;I)I

    return-void
.end method
