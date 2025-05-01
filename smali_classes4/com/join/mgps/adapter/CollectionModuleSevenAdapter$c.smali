.class Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;
.super Ljava/lang/Object;
.source "CollectionModuleSevenAdapter.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->z(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
