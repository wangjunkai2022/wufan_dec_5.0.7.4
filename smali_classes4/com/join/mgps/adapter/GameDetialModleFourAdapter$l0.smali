.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l0;
.super Ljava/lang/Object;
.source "GameDetialModleFourAdapter.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$f3;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;Lcom/join/mgps/adapter/GameDetialModleFourAdapter$f3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l0;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l0;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$f3;

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
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l0;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    iget-object v0, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$l0;->b:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$f3;

    iget-object v0, v0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$f3;->b:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-static {p1, v0}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->m(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;I)I

    return-void
.end method
