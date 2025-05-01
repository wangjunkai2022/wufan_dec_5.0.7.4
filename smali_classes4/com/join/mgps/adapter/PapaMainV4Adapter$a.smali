.class Lcom/join/mgps/adapter/PapaMainV4Adapter$a;
.super Ljava/lang/Object;
.source "PapaMainV4Adapter.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/PapaMainV4Adapter;->x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/join/mgps/adapter/PapaMainV4Adapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;->b:Ljava/util/List;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;->c:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-interface {v0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->s(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_0
    return-void
.end method
