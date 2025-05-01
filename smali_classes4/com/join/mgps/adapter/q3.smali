.class public final synthetic Lcom/join/mgps/adapter/q3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# instance fields
.field public final synthetic a:Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/q3;->a:Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/q3;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/q3;->a:Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/q3;->b:Ljava/util/List;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;->a(Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;Ljava/util/List;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method
