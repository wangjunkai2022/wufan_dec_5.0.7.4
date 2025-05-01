.class Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;
.super Lw1/p;
.source "CollectionModuleSevenAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->K(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CommonGameInfoBean;

.field final synthetic c:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->c:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-direct {p0}, Lw1/p;-><init>()V

    return-void
.end method


# virtual methods
.method public varargs onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lw1/p;->onClickBlank(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->c:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->j(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method public onClickCover()V
    .locals 3

    .line 1
    invoke-super {p0}, Lw1/p;->onClickCover()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->b:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;->c:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {v2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->u(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
