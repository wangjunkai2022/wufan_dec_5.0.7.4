.class Lcom/join/mgps/adapter/l5$c;
.super Ljava/lang/Object;
.source "SearchListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/l5;->k(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/adapter/l5;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/l5;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/l5$c;->c:Lcom/join/mgps/adapter/l5;

    iput p2, p0, Lcom/join/mgps/adapter/l5$c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/l5$c;->c:Lcom/join/mgps/adapter/l5;

    invoke-static {p1}, Lcom/join/mgps/adapter/l5;->f(Lcom/join/mgps/adapter/l5;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/SearchListActivity1;

    iget v0, p0, Lcom/join/mgps/adapter/l5$c;->b:I

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/SearchListActivity1;->L0(I)V

    return-void
.end method
