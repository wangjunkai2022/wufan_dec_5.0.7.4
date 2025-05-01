.class public final synthetic Lcom/join/mgps/adapter/n4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

.field public final synthetic c:Lcom/join/mgps/dto/CommonGameInfoBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/n4;->b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/n4;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/n4;->b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/n4;->c:Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->o(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method
