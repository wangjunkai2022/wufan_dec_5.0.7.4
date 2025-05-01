.class public final synthetic Lcom/join/mgps/adapter/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

.field public final synthetic c:Lcom/join/mgps/dto/CollectionSevenListBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/f;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/f;->c:Lcom/join/mgps/dto/CollectionSevenListBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/f;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/f;->c:Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->h(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CollectionSevenListBean;Landroid/view/View;)V

    return-void
.end method
