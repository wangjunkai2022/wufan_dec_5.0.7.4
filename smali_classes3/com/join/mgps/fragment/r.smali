.class public final synthetic Lcom/join/mgps/fragment/r;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/EndGameListFragment$f;

.field public final synthetic c:Lcom/join/mgps/dto/EndGameBean;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/dto/EndGameBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/r;->b:Lcom/join/mgps/fragment/EndGameListFragment$f;

    iput-object p2, p0, Lcom/join/mgps/fragment/r;->c:Lcom/join/mgps/dto/EndGameBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/r;->b:Lcom/join/mgps/fragment/EndGameListFragment$f;

    iget-object v1, p0, Lcom/join/mgps/fragment/r;->c:Lcom/join/mgps/dto/EndGameBean;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/EndGameListFragment$f;->b(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V

    return-void
.end method
