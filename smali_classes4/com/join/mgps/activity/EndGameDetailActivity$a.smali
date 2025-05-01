.class Lcom/join/mgps/activity/EndGameDetailActivity$a;
.super Ljava/lang/Object;
.source "EndGameDetailActivity.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameDetailActivity;->n0(Lcom/join/mgps/dto/EndGameDetailBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/EndGameDetailActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameDetailActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameDetailActivity$a;->b:Lcom/join/mgps/activity/EndGameDetailActivity;

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
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameDetailActivity$a;->b:Lcom/join/mgps/activity/EndGameDetailActivity;

    invoke-static {v0, p1}, Lcom/join/mgps/activity/EndGameDetailActivity;->g0(Lcom/join/mgps/activity/EndGameDetailActivity;I)V

    return-void
.end method
