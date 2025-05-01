.class public final Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$2;
.super Ljava/lang/Object;
.source "FindGameMainFragment.kt"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/ui/findgame/FindGameMainFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/ui/findgame/FindGameMainFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$2;->this$0:Lcom/join/kotlin/ui/findgame/FindGameMainFragment;

    .line 1
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
    iget-object v0, p0, Lcom/join/kotlin/ui/findgame/FindGameMainFragment$onCreateView$4$2;->this$0:Lcom/join/kotlin/ui/findgame/FindGameMainFragment;

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->getDisplayIndex(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/join/kotlin/ui/findgame/FindGameMainFragment;->setSelectedIndex(I)V

    return-void
.end method
