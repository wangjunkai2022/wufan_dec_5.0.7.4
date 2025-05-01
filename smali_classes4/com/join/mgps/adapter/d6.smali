.class public final synthetic Lcom/join/mgps/adapter/d6;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/d6;->b:Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;

    iput-object p2, p0, Lcom/join/mgps/adapter/d6;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/join/mgps/adapter/d6;->d:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/adapter/d6;->b:Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;

    iget-object v1, p0, Lcom/join/mgps/adapter/d6;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/adapter/d6;->d:Landroid/view/View;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;->a(Lcom/join/mgps/adapter/UninstallGuessLikeAdapter$a;Landroid/content/Context;Landroid/view/View;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
