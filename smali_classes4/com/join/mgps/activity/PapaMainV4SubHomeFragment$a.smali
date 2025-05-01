.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "PapaMainV4SubHomeFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->X(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Lcom/join/mgps/adapter/PapaMainV4Adapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    const/16 v1, 0xa

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$a;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->X(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Lcom/join/mgps/adapter/PapaMainV4Adapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonMultiItemBean;->getItemType()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x5

    return p1

    :cond_1
    return v0

    :cond_2
    return v1
.end method
