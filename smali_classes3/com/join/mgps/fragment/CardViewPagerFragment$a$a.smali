.class Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;
.super Ljava/lang/Object;
.source "CardViewPagerFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/CardViewPagerFragment$a;->onSelected(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/fragment/CardViewPagerFragment$a;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/CardViewPagerFragment$a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;->c:Lcom/join/mgps/fragment/CardViewPagerFragment$a;

    iput p2, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;->c:Lcom/join/mgps/fragment/CardViewPagerFragment$a;

    iget-object v0, v0, Lcom/join/mgps/fragment/CardViewPagerFragment$a;->a:Lcom/join/mgps/fragment/CardViewPagerFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/CardViewPagerFragment;->X(Lcom/join/mgps/fragment/CardViewPagerFragment;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    iget v1, p0, Lcom/join/mgps/fragment/CardViewPagerFragment$a$a;->b:I

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    return-void
.end method
