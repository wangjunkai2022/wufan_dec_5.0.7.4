.class public final synthetic Lcom/join/mgps/adapter/e5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/SearchGameListAdapter;

.field public final synthetic c:Lcom/join/mgps/dto/WxProgram;

.field public final synthetic d:Lcom/join/mgps/dto/DomainInfoBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/e5;->b:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/e5;->c:Lcom/join/mgps/dto/WxProgram;

    iput-object p3, p0, Lcom/join/mgps/adapter/e5;->d:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/adapter/e5;->b:Lcom/join/mgps/adapter/SearchGameListAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/e5;->c:Lcom/join/mgps/dto/WxProgram;

    iget-object v2, p0, Lcom/join/mgps/adapter/e5;->d:Lcom/join/mgps/dto/DomainInfoBean;

    invoke-static {v0, v1, v2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->i(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V

    return-void
.end method
