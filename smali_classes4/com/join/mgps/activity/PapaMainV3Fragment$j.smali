.class Lcom/join/mgps/activity/PapaMainV3Fragment$j;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "PapaMainV3Fragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV3Fragment;->a1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV3Fragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV3Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$j;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$j;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$j;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV3Fragment$j;->a:Lcom/join/mgps/activity/PapaMainV3Fragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV3Fragment;->A0(Lcom/join/mgps/activity/PapaMainV3Fragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/MgpapaMainItemBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MgpapaMainItemBean;->getShowtype()I

    move-result p1

    const/16 v0, 0x1c

    if-eq p1, v0, :cond_0

    const/16 v0, 0x22

    if-eq p1, v0, :cond_0

    const/16 v0, 0x25

    if-eq p1, v0, :cond_0

    const/16 v0, 0x26

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x2

    return p1
.end method
