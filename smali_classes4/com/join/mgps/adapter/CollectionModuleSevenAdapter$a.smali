.class Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;
.super Ljava/lang/Object;
.source "CollectionModuleSevenAdapter.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->J(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
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
    iput-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->i(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
