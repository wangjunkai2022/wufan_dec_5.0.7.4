.class public final synthetic Lcom/join/mgps/adapter/h5;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/SearchGameListAdapter$h;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/SearchGameListAdapter$h;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/h5;->b:Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    iput-object p2, p0, Lcom/join/mgps/adapter/h5;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/join/mgps/adapter/h5;->d:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/adapter/h5;->b:Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    iget-object v1, p0, Lcom/join/mgps/adapter/h5;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/adapter/h5;->d:Landroid/view/View;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;->a(Lcom/join/mgps/adapter/SearchGameListAdapter$h;Landroid/content/Context;Landroid/view/View;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
