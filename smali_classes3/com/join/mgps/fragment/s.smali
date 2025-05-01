.class public final synthetic Lcom/join/mgps/fragment/s;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/fragment/EndGameListFragment$f;

.field public final synthetic c:Lcom/join/mgps/fragment/EndGameListFragment$g;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/fragment/EndGameListFragment$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/fragment/s;->b:Lcom/join/mgps/fragment/EndGameListFragment$f;

    iput-object p2, p0, Lcom/join/mgps/fragment/s;->c:Lcom/join/mgps/fragment/EndGameListFragment$g;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/fragment/s;->b:Lcom/join/mgps/fragment/EndGameListFragment$f;

    iget-object v1, p0, Lcom/join/mgps/fragment/s;->c:Lcom/join/mgps/fragment/EndGameListFragment$g;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/fragment/EndGameListFragment$f;->a(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/fragment/EndGameListFragment$g;Landroid/view/View;)V

    return-void
.end method
